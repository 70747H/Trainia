-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-06-26 22:31:24.056

-- tables
-- Table: ActivityLevel
CREATE Table ActivityLevel (
    id integer NOT NULL CONSTRAINT ActivityLevel_pk PRIMARY KEY,
    ActivityLevel_name text NOT NULL,
    value float NOT NULL,
    description text NOT NULL
);

-- Table: Level
CREATE Table "Level" (
    id integer NOT NULL CONSTRAINT Level_pk PRIMARY KEY,
    level_name text NOT NULL
);

-- Table: Log
CREATE TABLE Log (
    id integer NOT NULL CONSTRAINT Log_pk PRIMARY KEY ,
    trainee_id integer NOT NULL,
    Workouts_id integer NOT NULL,
    SumScore integer NOT NULL,
    SumCalorie integer NOT NULL,
    level_id integer NOT NULL,
    completionDate text NOT NULL,
    CONSTRAINT History_User FOREIGN KEY (trainee_id)
    REFERENCES "User" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT History_Workouts FOREIGN KEY (Workouts_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT Log_Level FOREIGN KEY (level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: ProgressDetails
CREATE TABLE ProgressDetails (
    id integer NOT NULL CONSTRAINT ProgressDetails_pk PRIMARY KEY ,
    Workouts_id integer NOT NULL,
    Sets_id integer NOT NULL,
    score integer NOT NULL,
    calorie integer NOT NULL,
    User_id integer NOT NULL,
    Level_id integer NOT NULL,
    dailyDate date NOT NULL,
    CONSTRAINT Progress_details_Workouts FOREIGN KEY (Workouts_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT Progress_details_Sets FOREIGN KEY (Sets_id)
    REFERENCES Sets (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT ProgressDetails_User FOREIGN KEY (User_id)
    REFERENCES "User" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT ProgressDetails_Level FOREIGN KEY (Level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: SetSum
CREATE Table SetSum (
    id integer NOT NULL CONSTRAINT SetSum_pk PRIMARY KEY,
    Workouts_id integer NOT NULL,
    Level_id integer NOT NULL,
    setSum integer NOT NULL,
    CONSTRAINT SetSum_Workouts FOREIGN KEY (Workouts_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT SetSum_Level FOREIGN KEY (Level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: Sets
CREATE TABLE Sets (
    id integer NOT NULL CONSTRAINT Sets_pk PRIMARY KEY ,
    level_id integer NOT NULL,
    Workouts_id integer NOT NULL,
    Sets text NOT NULL,
    setsSum integer NOT NULL,
    CONSTRAINT Sets_Workouts FOREIGN KEY (Workouts_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT Sets_level FOREIGN KEY (level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: User
CREATE TABLE "User" (
    id integer NOT NULL CONSTRAINT User_pk PRIMARY KEY ,
    name text NOT NULL,
    email text NOT NULL,
    age integer NOT NULL,
    password text NOT NULL,
    gender text NOT NULL,
    height float NOT NULL,
    weight float NOT NULL,
    goal text NOT NULL,
    ActivityLevel_id integer NOT NULL,
    dailyCalorie float NOT NULL,
    key text NULL,
    CONSTRAINT User_ActivityLevel FOREIGN KEY (ActivityLevel_id)
    REFERENCES ActivityLevel (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: Workouts
CREATE TABLE Workouts (
    id integer NOT NULL CONSTRAINT Workouts_pk PRIMARY KEY ,
    workout_name text NOT NULL
);

-- Table: notificationMessage
CREATE Table notificationMessage (
    id integer NOT NULL CONSTRAINT notificationMessage_pk PRIMARY KEY,
    message text NOT NULL,
    state boolean NOT NULL
);

-- Table: schedule
CREATE Table schedule (
    id integer NOT NULL CONSTRAINT schedule_pk PRIMARY KEY,
    schedule text NOT NULL
);

-- Table: walkingProgress
CREATE Table walkingProgress (
    id integer NOT NULL CONSTRAINT walkingProgress_pk PRIMARY KEY,
    stepsNo integer NOT NULL,
    calorie integer NOT NULL,
    wlakingSchedule_id integer NOT NULL,
    User_id integer NOT NULL,
    dayNo integer NOT NULL,
    CONSTRAINT walkingProgress_wlakingSchedule FOREIGN KEY (wlakingSchedule_id)
    REFERENCES wlakingSchedule (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT walkingProgress_User FOREIGN KEY (User_id)
    REFERENCES "User" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: wlakingSchedule
CREATE Table wlakingSchedule (
    id integer NOT NULL CONSTRAINT wlakingSchedule_pk PRIMARY KEY,
    weekNo integer NOT NULL,
    walksperWeek text NOT NULL,
    distance float NOT NULL,
    warmUp integer NOT NULL,
    minutesWalking integer NOT NULL,
    coolDown integer NOT NULL,
    Level_id integer NOT NULL,
    CONSTRAINT wlakingSchedule_Level FOREIGN KEY (Level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: workoutLevel
CREATE Table workoutLevel (
    id integer NOT NULL CONSTRAINT workoutLevel_pk PRIMARY KEY,
    Reps text NOT NULL,
    days integer NOT NULL,
    workout_id integer NOT NULL,
    level_id integer NOT NULL,
    schedule_id integer NOT NULL,
    CONSTRAINT workoutLevel_Workouts FOREIGN KEY (workout_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT workoutLevel_Level FOREIGN KEY (level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT workoutLevel_schedule FOREIGN KEY (schedule_id)
    REFERENCES schedule (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Table: workoutState
CREATE Table workoutState (
    id integer NOT NULL CONSTRAINT workoutState_pk PRIMARY KEY,
    workoutState integer NOT NULL,
    scheduleIndex integer NOT NULL,
    workout_id integer NOT NULL,
    level_id integer NOT NULL,
    trainee_id integer NOT NULL,
    CONSTRAINT workoutState_Workouts FOREIGN KEY (workout_id)
    REFERENCES Workouts (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT workoutState_Level FOREIGN KEY (level_id)
    REFERENCES "Level" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT workoutState_Trainee FOREIGN KEY (trainee_id)
    REFERENCES "User" (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- End of file.


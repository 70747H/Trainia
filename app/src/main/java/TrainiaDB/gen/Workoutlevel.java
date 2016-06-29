package TrainiaDB.gen;

/**
 * POJO representing table workoutLevel.
 */
public class Workoutlevel implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -8495432955674198445L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<WorkoutlevelDAO> DAO_INTERFACE_CLASS = WorkoutlevelDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column Reps
     */
    protected String reps;
    /**
     * Property representing column days
     */
    protected Integer days;
    /**
     * Property representing column workout_id
     */
    protected Integer workoutId;
    /**
     * Property representing column level_id
     */
    protected Integer levelId;
    /**
     * Property representing column schedule_id
     */
    protected Integer scheduleId;

    /**
     * Default constructor.
     */
    public Workoutlevel() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param reps value of column Reps.
     * @param days value of column days.
     * @param workoutId value of column workout_id.
     * @param levelId value of column level_id.
     * @param scheduleId value of column schedule_id.
     */
    public Workoutlevel(Integer id, String reps, Integer days, Integer workoutId, Integer levelId, Integer scheduleId) {
        setId(id);
        setReps(reps);
        setDays(days);
        setWorkoutId(workoutId);
        setLevelId(levelId);
        setScheduleId(scheduleId);
    }

    /**
     * Returns value of property {@link #id}.
     * @return value of property {@link #id}.
     */
    public Integer getId() {
        return this.id;
    }
    /**
     * Sets new value of property {@link #id}.
     * @param id new value of property {@link #id}.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Returns value of property {@link #reps}.
     * @return value of property {@link #reps}.
     */
    public String getReps() {
        return this.reps;
    }
    /**
     * Sets new value of property {@link #reps}.
     * @param reps new value of property {@link #reps}.
     */
    public void setReps(String reps) {
        this.reps = reps;
    }
    /**
     * Returns value of property {@link #days}.
     * @return value of property {@link #days}.
     */
    public Integer getDays() {
        return this.days;
    }
    /**
     * Sets new value of property {@link #days}.
     * @param days new value of property {@link #days}.
     */
    public void setDays(Integer days) {
        this.days = days;
    }
    /**
     * Returns value of property {@link #workoutId}.
     * @return value of property {@link #workoutId}.
     */
    public Integer getWorkoutId() {
        return this.workoutId;
    }
    /**
     * Sets new value of property {@link #workoutId}.
     * @param workoutId new value of property {@link #workoutId}.
     */
    public void setWorkoutId(Integer workoutId) {
        this.workoutId = workoutId;
    }
    /**
     * Returns value of property {@link #levelId}.
     * @return value of property {@link #levelId}.
     */
    public Integer getLevelId() {
        return this.levelId;
    }
    /**
     * Sets new value of property {@link #levelId}.
     * @param levelId new value of property {@link #levelId}.
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }
    /**
     * Returns value of property {@link #scheduleId}.
     * @return value of property {@link #scheduleId}.
     */
    public Integer getScheduleId() {
        return this.scheduleId;
    }
    /**
     * Sets new value of property {@link #scheduleId}.
     * @param scheduleId new value of property {@link #scheduleId}.
     */
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workoutlevel workoutlevel = (Workoutlevel) o;

        if (id != null ? !id.equals(workoutlevel.id) : workoutlevel.id != null) {
            return false;
        }
        if (reps != null ? !reps.equals(workoutlevel.reps) : workoutlevel.reps != null) {
            return false;
        }
        if (days != null ? !days.equals(workoutlevel.days) : workoutlevel.days != null) {
            return false;
        }
        if (workoutId != null ? !workoutId.equals(workoutlevel.workoutId) : workoutlevel.workoutId != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(workoutlevel.levelId) : workoutlevel.levelId != null) {
            return false;
        }
        if (scheduleId != null ? !scheduleId.equals(workoutlevel.scheduleId) : workoutlevel.scheduleId != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (reps != null ? reps.hashCode() : 0);
        result = 31 * result + (days != null ? days.hashCode() : 0);
        result = 31 * result + (workoutId != null ? workoutId.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (scheduleId != null ? scheduleId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Workoutlevel{"
                + "id='" + id + '\''
                + ", reps='" + reps + '\''
                + ", days='" + days + '\''
                + ", workoutId='" + workoutId + '\''
                + ", levelId='" + levelId + '\''
                + ", scheduleId='" + scheduleId + '\''
                + '}';
    }
}

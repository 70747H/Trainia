package TrainiaDB.gen;

public class DAOProvider {

    /**
     * Data source for this DAOProvider.
     */
    protected TrainiaDB.runtime.util.SQLiteDataSource dataSource;

    /**
     * DAOMonitor for this DAOProvider.
     */
    protected TrainiaDB.runtime.util.DAOMonitor daoMonitor;

    /**
     * DAO instance for tableUser
     */
    protected UserDAO userDAO = null;

    /**
     * DAO instance for tableWorkouts
     */
    protected WorkoutsDAO workoutsDAO = null;

    /**
     * DAO instance for tableSets
     */
    protected SetsDAO setsDAO = null;

    /**
     * DAO instance for tableProgressDetails
     */
    protected ProgressdetailsDAO progressdetailsDAO = null;

    /**
     * DAO instance for tableLog
     */
    protected LogDAO logDAO = null;

    /**
     * DAO instance for tableLevel
     */
    protected LevelDAO levelDAO = null;

    /**
     * DAO instance for tableActivityLevel
     */
    protected ActivitylevelDAO activitylevelDAO = null;

    /**
     * DAO instance for tableSetSum
     */
    protected SetsumDAO setsumDAO = null;

    /**
     * DAO instance for tableworkoutLevel
     */
    protected WorkoutlevelDAO workoutlevelDAO = null;

    /**
     * DAO instance for tableworkoutState
     */
    protected WorkoutstateDAO workoutstateDAO = null;

    /**
     * DAO instance for tableschedule
     */
    protected ScheduleDAO scheduleDAO = null;

    /**
     * DAO instance for tablewlakingSchedule
     */
    protected WlakingscheduleDAO wlakingscheduleDAO = null;

    /**
     * DAO instance for tablewalkingProgress
     */
    protected WalkingprogressDAO walkingprogressDAO = null;

    /**
     * DAO instance for tablenotificationMessage
     */
    protected NotificationmessageDAO notificationmessageDAO = null;

    /**
     * Constructor.
     * @param dataSource SQLiteDataSource implementation for DAOProvider
     */
    public DAOProvider(TrainiaDB.runtime.util.SQLiteDataSource dataSource) {
        this.dataSource = dataSource;
        this.daoMonitor = new TrainiaDB.runtime.util.monitors.EmptyDAOMonitor();
    }

    /**
     * Constructor.
     * @param dataSource SQLiteDataSource implementation for DAOProvider
     * @param daoMonitor DAOMonitor implementation for DAOProvider
     */
    public DAOProvider(TrainiaDB.runtime.util.SQLiteDataSource dataSource, 
            TrainiaDB.runtime.util.DAOMonitor daoMonitor) {
        this.dataSource = dataSource;
        this.daoMonitor = daoMonitor;
    }

    /**
     * Returns DAO implementation object for table User
     * @return DAO implementation object for table User
     */
    public UserDAO getUserDAO() {
        if (this.userDAO == null) {
            this.userDAO = new UserDAOImpl(dataSource, daoMonitor);
        }
        return this.userDAO;
    }

    /**
     * Returns DAO implementation object for table Workouts
     * @return DAO implementation object for table Workouts
     */
    public WorkoutsDAO getWorkoutsDAO() {
        if (this.workoutsDAO == null) {
            this.workoutsDAO = new WorkoutsDAOImpl(dataSource, daoMonitor);
        }
        return this.workoutsDAO;
    }

    /**
     * Returns DAO implementation object for table Sets
     * @return DAO implementation object for table Sets
     */
    public SetsDAO getSetsDAO() {
        if (this.setsDAO == null) {
            this.setsDAO = new SetsDAOImpl(dataSource, daoMonitor);
        }
        return this.setsDAO;
    }

    /**
     * Returns DAO implementation object for table ProgressDetails
     * @return DAO implementation object for table ProgressDetails
     */
    public ProgressdetailsDAO getProgressdetailsDAO() {
        if (this.progressdetailsDAO == null) {
            this.progressdetailsDAO = new ProgressdetailsDAOImpl(dataSource, daoMonitor);
        }
        return this.progressdetailsDAO;
    }

    /**
     * Returns DAO implementation object for table Log
     * @return DAO implementation object for table Log
     */
    public LogDAO getLogDAO() {
        if (this.logDAO == null) {
            this.logDAO = new LogDAOImpl(dataSource, daoMonitor);
        }
        return this.logDAO;
    }

    /**
     * Returns DAO implementation object for table Level
     * @return DAO implementation object for table Level
     */
    public LevelDAO getLevelDAO() {
        if (this.levelDAO == null) {
            this.levelDAO = new LevelDAOImpl(dataSource, daoMonitor);
        }
        return this.levelDAO;
    }

    /**
     * Returns DAO implementation object for table ActivityLevel
     * @return DAO implementation object for table ActivityLevel
     */
    public ActivitylevelDAO getActivitylevelDAO() {
        if (this.activitylevelDAO == null) {
            this.activitylevelDAO = new ActivitylevelDAOImpl(dataSource, daoMonitor);
        }
        return this.activitylevelDAO;
    }

    /**
     * Returns DAO implementation object for table SetSum
     * @return DAO implementation object for table SetSum
     */
    public SetsumDAO getSetsumDAO() {
        if (this.setsumDAO == null) {
            this.setsumDAO = new SetsumDAOImpl(dataSource, daoMonitor);
        }
        return this.setsumDAO;
    }

    /**
     * Returns DAO implementation object for table workoutLevel
     * @return DAO implementation object for table workoutLevel
     */
    public WorkoutlevelDAO getWorkoutlevelDAO() {
        if (this.workoutlevelDAO == null) {
            this.workoutlevelDAO = new WorkoutlevelDAOImpl(dataSource, daoMonitor);
        }
        return this.workoutlevelDAO;
    }

    /**
     * Returns DAO implementation object for table workoutState
     * @return DAO implementation object for table workoutState
     */
    public WorkoutstateDAO getWorkoutstateDAO() {
        if (this.workoutstateDAO == null) {
            this.workoutstateDAO = new WorkoutstateDAOImpl(dataSource, daoMonitor);
        }
        return this.workoutstateDAO;
    }

    /**
     * Returns DAO implementation object for table schedule
     * @return DAO implementation object for table schedule
     */
    public ScheduleDAO getScheduleDAO() {
        if (this.scheduleDAO == null) {
            this.scheduleDAO = new ScheduleDAOImpl(dataSource, daoMonitor);
        }
        return this.scheduleDAO;
    }

    /**
     * Returns DAO implementation object for table wlakingSchedule
     * @return DAO implementation object for table wlakingSchedule
     */
    public WlakingscheduleDAO getWlakingscheduleDAO() {
        if (this.wlakingscheduleDAO == null) {
            this.wlakingscheduleDAO = new WlakingscheduleDAOImpl(dataSource, daoMonitor);
        }
        return this.wlakingscheduleDAO;
    }

    /**
     * Returns DAO implementation object for table walkingProgress
     * @return DAO implementation object for table walkingProgress
     */
    public WalkingprogressDAO getWalkingprogressDAO() {
        if (this.walkingprogressDAO == null) {
            this.walkingprogressDAO = new WalkingprogressDAOImpl(dataSource, daoMonitor);
        }
        return this.walkingprogressDAO;
    }

    /**
     * Returns DAO implementation object for table notificationMessage
     * @return DAO implementation object for table notificationMessage
     */
    public NotificationmessageDAO getNotificationmessageDAO() {
        if (this.notificationmessageDAO == null) {
            this.notificationmessageDAO = new NotificationmessageDAOImpl(dataSource, daoMonitor);
        }
        return this.notificationmessageDAO;
    }

}

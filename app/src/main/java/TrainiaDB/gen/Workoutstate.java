package TrainiaDB.gen;

/**
 * POJO representing table workoutState.
 */
public class Workoutstate implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 5725386109856321281L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<WorkoutstateDAO> DAO_INTERFACE_CLASS = WorkoutstateDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column workoutState
     */
    protected Integer workoutstate;
    /**
     * Property representing column scheduleIndex
     */
    protected Integer scheduleindex;
    /**
     * Property representing column workout_id
     */
    protected Integer workoutId;
    /**
     * Property representing column level_id
     */
    protected Integer levelId;
    /**
     * Property representing column trainee_id
     */
    protected Integer traineeId;

    /**
     * Default constructor.
     */
    public Workoutstate() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param workoutstate value of column workoutState.
     * @param scheduleindex value of column scheduleIndex.
     * @param workoutId value of column workout_id.
     * @param levelId value of column level_id.
     * @param traineeId value of column trainee_id.
     */
    public Workoutstate(Integer id, Integer workoutstate, Integer scheduleindex, Integer workoutId, Integer levelId, Integer traineeId) {
        setId(id);
        setWorkoutstate(workoutstate);
        setScheduleindex(scheduleindex);
        setWorkoutId(workoutId);
        setLevelId(levelId);
        setTraineeId(traineeId);
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
     * Returns value of property {@link #workoutstate}.
     * @return value of property {@link #workoutstate}.
     */
    public Integer getWorkoutstate() {
        return this.workoutstate;
    }
    /**
     * Sets new value of property {@link #workoutstate}.
     * @param workoutstate new value of property {@link #workoutstate}.
     */
    public void setWorkoutstate(Integer workoutstate) {
        this.workoutstate = workoutstate;
    }
    /**
     * Returns value of property {@link #scheduleindex}.
     * @return value of property {@link #scheduleindex}.
     */
    public Integer getScheduleindex() {
        return this.scheduleindex;
    }
    /**
     * Sets new value of property {@link #scheduleindex}.
     * @param scheduleindex new value of property {@link #scheduleindex}.
     */
    public void setScheduleindex(Integer scheduleindex) {
        this.scheduleindex = scheduleindex;
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
     * Returns value of property {@link #traineeId}.
     * @return value of property {@link #traineeId}.
     */
    public Integer getTraineeId() {
        return this.traineeId;
    }
    /**
     * Sets new value of property {@link #traineeId}.
     * @param traineeId new value of property {@link #traineeId}.
     */
    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workoutstate workoutstate = (Workoutstate) o;

        if (id != null ? !id.equals(workoutstate.id) : workoutstate.id != null) {
            return false;
        }
        if (workoutstate != null ? !workoutstate.equals(workoutstate.workoutstate) : workoutstate.workoutstate != null) {
            return false;
        }
        if (scheduleindex != null ? !scheduleindex.equals(workoutstate.scheduleindex) : workoutstate.scheduleindex != null) {
            return false;
        }
        if (workoutId != null ? !workoutId.equals(workoutstate.workoutId) : workoutstate.workoutId != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(workoutstate.levelId) : workoutstate.levelId != null) {
            return false;
        }
        if (traineeId != null ? !traineeId.equals(workoutstate.traineeId) : workoutstate.traineeId != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (workoutstate != null ? workoutstate.hashCode() : 0);
        result = 31 * result + (scheduleindex != null ? scheduleindex.hashCode() : 0);
        result = 31 * result + (workoutId != null ? workoutId.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (traineeId != null ? traineeId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Workoutstate{"
                + "id='" + id + '\''
                + ", workoutstate='" + workoutstate + '\''
                + ", scheduleindex='" + scheduleindex + '\''
                + ", workoutId='" + workoutId + '\''
                + ", levelId='" + levelId + '\''
                + ", traineeId='" + traineeId + '\''
                + '}';
    }
}

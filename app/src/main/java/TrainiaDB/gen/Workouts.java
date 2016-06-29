package TrainiaDB.gen;

/**
 * POJO representing table Workouts.
 */
public class Workouts implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 5987451391379855111L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<WorkoutsDAO> DAO_INTERFACE_CLASS = WorkoutsDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column workout_name
     */
    protected String workoutName;

    /**
     * Default constructor.
     */
    public Workouts() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param workoutName value of column workout_name.
     */
    public Workouts(Integer id, String workoutName) {
        setId(id);
        setWorkoutName(workoutName);
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
     * Returns value of property {@link #workoutName}.
     * @return value of property {@link #workoutName}.
     */
    public String getWorkoutName() {
        return this.workoutName;
    }
    /**
     * Sets new value of property {@link #workoutName}.
     * @param workoutName new value of property {@link #workoutName}.
     */
    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workouts workouts = (Workouts) o;

        if (id != null ? !id.equals(workouts.id) : workouts.id != null) {
            return false;
        }
        if (workoutName != null ? !workoutName.equals(workouts.workoutName) : workouts.workoutName != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (workoutName != null ? workoutName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Workouts{"
                + "id='" + id + '\''
                + ", workoutName='" + workoutName + '\''
                + '}';
    }
}

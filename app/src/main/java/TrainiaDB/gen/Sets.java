package TrainiaDB.gen;

/**
 * POJO representing table Sets.
 */
public class Sets implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -7904928766281142092L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<SetsDAO> DAO_INTERFACE_CLASS = SetsDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column level_id
     */
    protected Integer levelId;
    /**
     * Property representing column Workouts_id
     */
    protected Integer workoutsId;
    /**
     * Property representing column Sets
     */
    protected String sets;
    /**
     * Property representing column setsSum
     */
    protected Integer setssum;

    /**
     * Default constructor.
     */
    public Sets() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param levelId value of column level_id.
     * @param workoutsId value of column Workouts_id.
     * @param sets value of column Sets.
     * @param setssum value of column setsSum.
     */
    public Sets(Integer id, Integer levelId, Integer workoutsId, String sets, Integer setssum) {
        setId(id);
        setLevelId(levelId);
        setWorkoutsId(workoutsId);
        setSets(sets);
        setSetssum(setssum);
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
     * Returns value of property {@link #workoutsId}.
     * @return value of property {@link #workoutsId}.
     */
    public Integer getWorkoutsId() {
        return this.workoutsId;
    }
    /**
     * Sets new value of property {@link #workoutsId}.
     * @param workoutsId new value of property {@link #workoutsId}.
     */
    public void setWorkoutsId(Integer workoutsId) {
        this.workoutsId = workoutsId;
    }
    /**
     * Returns value of property {@link #sets}.
     * @return value of property {@link #sets}.
     */
    public String getSets() {
        return this.sets;
    }
    /**
     * Sets new value of property {@link #sets}.
     * @param sets new value of property {@link #sets}.
     */
    public void setSets(String sets) {
        this.sets = sets;
    }
    /**
     * Returns value of property {@link #setssum}.
     * @return value of property {@link #setssum}.
     */
    public Integer getSetssum() {
        return this.setssum;
    }
    /**
     * Sets new value of property {@link #setssum}.
     * @param setssum new value of property {@link #setssum}.
     */
    public void setSetssum(Integer setssum) {
        this.setssum = setssum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sets sets = (Sets) o;

        if (id != null ? !id.equals(sets.id) : sets.id != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(sets.levelId) : sets.levelId != null) {
            return false;
        }
        if (workoutsId != null ? !workoutsId.equals(sets.workoutsId) : sets.workoutsId != null) {
            return false;
        }
        if (sets != null ? !sets.equals(sets.sets) : sets.sets != null) {
            return false;
        }
        if (setssum != null ? !setssum.equals(sets.setssum) : sets.setssum != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (workoutsId != null ? workoutsId.hashCode() : 0);
        result = 31 * result + (sets != null ? sets.hashCode() : 0);
        result = 31 * result + (setssum != null ? setssum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sets{"
                + "id='" + id + '\''
                + ", levelId='" + levelId + '\''
                + ", workoutsId='" + workoutsId + '\''
                + ", sets='" + sets + '\''
                + ", setssum='" + setssum + '\''
                + '}';
    }
}

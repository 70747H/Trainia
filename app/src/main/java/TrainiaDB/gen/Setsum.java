package TrainiaDB.gen;

/**
 * POJO representing table SetSum.
 */
public class Setsum implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 6299152965203623568L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<SetsumDAO> DAO_INTERFACE_CLASS = SetsumDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column Workouts_id
     */
    protected Integer workoutsId;
    /**
     * Property representing column Level_id
     */
    protected Integer levelId;
    /**
     * Property representing column setSum
     */
    protected Integer setsum;

    /**
     * Default constructor.
     */
    public Setsum() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param workoutsId value of column Workouts_id.
     * @param levelId value of column Level_id.
     * @param setsum value of column setSum.
     */
    public Setsum(Integer id, Integer workoutsId, Integer levelId, Integer setsum) {
        setId(id);
        setWorkoutsId(workoutsId);
        setLevelId(levelId);
        setSetsum(setsum);
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
     * Returns value of property {@link #setsum}.
     * @return value of property {@link #setsum}.
     */
    public Integer getSetsum() {
        return this.setsum;
    }
    /**
     * Sets new value of property {@link #setsum}.
     * @param setsum new value of property {@link #setsum}.
     */
    public void setSetsum(Integer setsum) {
        this.setsum = setsum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Setsum setsum = (Setsum) o;

        if (id != null ? !id.equals(setsum.id) : setsum.id != null) {
            return false;
        }
        if (workoutsId != null ? !workoutsId.equals(setsum.workoutsId) : setsum.workoutsId != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(setsum.levelId) : setsum.levelId != null) {
            return false;
        }
        if (setsum != null ? !setsum.equals(setsum.setsum) : setsum.setsum != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (workoutsId != null ? workoutsId.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (setsum != null ? setsum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Setsum{"
                + "id='" + id + '\''
                + ", workoutsId='" + workoutsId + '\''
                + ", levelId='" + levelId + '\''
                + ", setsum='" + setsum + '\''
                + '}';
    }
}

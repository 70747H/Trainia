package TrainiaDB.gen;

/**
 * POJO representing table Level.
 */
public class Level implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 2920094489101490278L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<LevelDAO> DAO_INTERFACE_CLASS = LevelDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column level_name
     */
    protected String levelName;

    /**
     * Default constructor.
     */
    public Level() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param levelName value of column level_name.
     */
    public Level(Integer id, String levelName) {
        setId(id);
        setLevelName(levelName);
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
     * Returns value of property {@link #levelName}.
     * @return value of property {@link #levelName}.
     */
    public String getLevelName() {
        return this.levelName;
    }
    /**
     * Sets new value of property {@link #levelName}.
     * @param levelName new value of property {@link #levelName}.
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Level level = (Level) o;

        if (id != null ? !id.equals(level.id) : level.id != null) {
            return false;
        }
        if (levelName != null ? !levelName.equals(level.levelName) : level.levelName != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Level{"
                + "id='" + id + '\''
                + ", levelName='" + levelName + '\''
                + '}';
    }
}

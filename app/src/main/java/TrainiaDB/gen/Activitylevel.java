package TrainiaDB.gen;

/**
 * POJO representing table ActivityLevel.
 */
public class Activitylevel implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 8134163412292881304L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<ActivitylevelDAO> DAO_INTERFACE_CLASS = ActivitylevelDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column ActivityLevel_name
     */
    protected String activitylevelName;
    /**
     * Property representing column value
     */
    protected Float value;
    /**
     * Property representing column description
     */
    protected String description;

    /**
     * Default constructor.
     */
    public Activitylevel() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param activitylevelName value of column ActivityLevel_name.
     * @param value value of column value.
     * @param description value of column description.
     */
    public Activitylevel(Integer id, String activitylevelName, Float value, String description) {
        setId(id);
        setActivitylevelName(activitylevelName);
        setValue(value);
        setDescription(description);
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
     * Returns value of property {@link #activitylevelName}.
     * @return value of property {@link #activitylevelName}.
     */
    public String getActivitylevelName() {
        return this.activitylevelName;
    }
    /**
     * Sets new value of property {@link #activitylevelName}.
     * @param activitylevelName new value of property {@link #activitylevelName}.
     */
    public void setActivitylevelName(String activitylevelName) {
        this.activitylevelName = activitylevelName;
    }
    /**
     * Returns value of property {@link #value}.
     * @return value of property {@link #value}.
     */
    public Float getValue() {
        return this.value;
    }
    /**
     * Sets new value of property {@link #value}.
     * @param value new value of property {@link #value}.
     */
    public void setValue(Float value) {
        this.value = value;
    }
    /**
     * Returns value of property {@link #description}.
     * @return value of property {@link #description}.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Sets new value of property {@link #description}.
     * @param description new value of property {@link #description}.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Activitylevel activitylevel = (Activitylevel) o;

        if (id != null ? !id.equals(activitylevel.id) : activitylevel.id != null) {
            return false;
        }
        if (activitylevelName != null ? !activitylevelName.equals(activitylevel.activitylevelName) : activitylevel.activitylevelName != null) {
            return false;
        }
        if (value != null ? !value.equals(activitylevel.value) : activitylevel.value != null) {
            return false;
        }
        if (description != null ? !description.equals(activitylevel.description) : activitylevel.description != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (activitylevelName != null ? activitylevelName.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Activitylevel{"
                + "id='" + id + '\''
                + ", activitylevelName='" + activitylevelName + '\''
                + ", value='" + value + '\''
                + ", description='" + description + '\''
                + '}';
    }
}

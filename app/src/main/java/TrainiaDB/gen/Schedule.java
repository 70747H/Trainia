package TrainiaDB.gen;

/**
 * POJO representing table schedule.
 */
public class Schedule implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -2539832280266535817L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<ScheduleDAO> DAO_INTERFACE_CLASS = ScheduleDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column schedule
     */
    protected String schedule;

    /**
     * Default constructor.
     */
    public Schedule() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param schedule value of column schedule.
     */
    public Schedule(Integer id, String schedule) {
        setId(id);
        setSchedule(schedule);
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
     * Returns value of property {@link #schedule}.
     * @return value of property {@link #schedule}.
     */
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * Sets new value of property {@link #schedule}.
     * @param schedule new value of property {@link #schedule}.
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Schedule schedule = (Schedule) o;

        if (id != null ? !id.equals(schedule.id) : schedule.id != null) {
            return false;
        }
        if (schedule != null ? !schedule.equals(schedule.schedule) : schedule.schedule != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Schedule{"
                + "id='" + id + '\''
                + ", schedule='" + schedule + '\''
                + '}';
    }
}

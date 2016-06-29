package TrainiaDB.gen;

/**
 * POJO representing table walkingProgress.
 */
public class Walkingprogress implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -4814545154298873360L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<WalkingprogressDAO> DAO_INTERFACE_CLASS = WalkingprogressDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column stepsNo
     */
    protected Integer stepsno;
    /**
     * Property representing column calorie
     */
    protected Integer calorie;
    /**
     * Property representing column wlakingSchedule_id
     */
    protected Integer wlakingscheduleId;
    /**
     * Property representing column User_id
     */
    protected Integer userId;
    /**
     * Property representing column dayNo
     */
    protected Integer dayno;

    /**
     * Default constructor.
     */
    public Walkingprogress() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param stepsno value of column stepsNo.
     * @param calorie value of column calorie.
     * @param wlakingscheduleId value of column wlakingSchedule_id.
     * @param userId value of column User_id.
     * @param dayno value of column dayNo.
     */
    public Walkingprogress(Integer id, Integer stepsno, Integer calorie, Integer wlakingscheduleId, Integer userId, Integer dayno) {
        setId(id);
        setStepsno(stepsno);
        setCalorie(calorie);
        setWlakingscheduleId(wlakingscheduleId);
        setUserId(userId);
        setDayno(dayno);
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
     * Returns value of property {@link #stepsno}.
     * @return value of property {@link #stepsno}.
     */
    public Integer getStepsno() {
        return this.stepsno;
    }
    /**
     * Sets new value of property {@link #stepsno}.
     * @param stepsno new value of property {@link #stepsno}.
     */
    public void setStepsno(Integer stepsno) {
        this.stepsno = stepsno;
    }
    /**
     * Returns value of property {@link #calorie}.
     * @return value of property {@link #calorie}.
     */
    public Integer getCalorie() {
        return this.calorie;
    }
    /**
     * Sets new value of property {@link #calorie}.
     * @param calorie new value of property {@link #calorie}.
     */
    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }
    /**
     * Returns value of property {@link #wlakingscheduleId}.
     * @return value of property {@link #wlakingscheduleId}.
     */
    public Integer getWlakingscheduleId() {
        return this.wlakingscheduleId;
    }
    /**
     * Sets new value of property {@link #wlakingscheduleId}.
     * @param wlakingscheduleId new value of property {@link #wlakingscheduleId}.
     */
    public void setWlakingscheduleId(Integer wlakingscheduleId) {
        this.wlakingscheduleId = wlakingscheduleId;
    }
    /**
     * Returns value of property {@link #userId}.
     * @return value of property {@link #userId}.
     */
    public Integer getUserId() {
        return this.userId;
    }
    /**
     * Sets new value of property {@link #userId}.
     * @param userId new value of property {@link #userId}.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    /**
     * Returns value of property {@link #dayno}.
     * @return value of property {@link #dayno}.
     */
    public Integer getDayno() {
        return this.dayno;
    }
    /**
     * Sets new value of property {@link #dayno}.
     * @param dayno new value of property {@link #dayno}.
     */
    public void setDayno(Integer dayno) {
        this.dayno = dayno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Walkingprogress walkingprogress = (Walkingprogress) o;

        if (id != null ? !id.equals(walkingprogress.id) : walkingprogress.id != null) {
            return false;
        }
        if (stepsno != null ? !stepsno.equals(walkingprogress.stepsno) : walkingprogress.stepsno != null) {
            return false;
        }
        if (calorie != null ? !calorie.equals(walkingprogress.calorie) : walkingprogress.calorie != null) {
            return false;
        }
        if (wlakingscheduleId != null ? !wlakingscheduleId.equals(walkingprogress.wlakingscheduleId) : walkingprogress.wlakingscheduleId != null) {
            return false;
        }
        if (userId != null ? !userId.equals(walkingprogress.userId) : walkingprogress.userId != null) {
            return false;
        }
        if (dayno != null ? !dayno.equals(walkingprogress.dayno) : walkingprogress.dayno != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (stepsno != null ? stepsno.hashCode() : 0);
        result = 31 * result + (calorie != null ? calorie.hashCode() : 0);
        result = 31 * result + (wlakingscheduleId != null ? wlakingscheduleId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (dayno != null ? dayno.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Walkingprogress{"
                + "id='" + id + '\''
                + ", stepsno='" + stepsno + '\''
                + ", calorie='" + calorie + '\''
                + ", wlakingscheduleId='" + wlakingscheduleId + '\''
                + ", userId='" + userId + '\''
                + ", dayno='" + dayno + '\''
                + '}';
    }
}

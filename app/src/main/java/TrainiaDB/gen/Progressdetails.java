package TrainiaDB.gen;

/**
 * POJO representing table ProgressDetails.
 */
public class Progressdetails implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 537187692302301798L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<ProgressdetailsDAO> DAO_INTERFACE_CLASS = ProgressdetailsDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column Workouts_id
     */
    protected Integer workoutsId;
    /**
     * Property representing column Sets_id
     */
    protected Integer setsId;
    /**
     * Property representing column score
     */
    protected Integer score;
    /**
     * Property representing column calorie
     */
    protected Integer calorie;
    /**
     * Property representing column User_id
     */
    protected Integer userId;
    /**
     * Property representing column Level_id
     */
    protected Integer levelId;
    /**
     * Property representing column dailyDate
     */
    protected java.sql.Date dailydate;

    /**
     * Default constructor.
     */
    public Progressdetails() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param workoutsId value of column Workouts_id.
     * @param setsId value of column Sets_id.
     * @param score value of column score.
     * @param calorie value of column calorie.
     * @param userId value of column User_id.
     * @param levelId value of column Level_id.
     * @param dailydate value of column dailyDate.
     */
    public Progressdetails(Integer id, Integer workoutsId, Integer setsId, Integer score, Integer calorie, Integer userId, Integer levelId, java.sql.Date dailydate) {
        setId(id);
        setWorkoutsId(workoutsId);
        setSetsId(setsId);
        setScore(score);
        setCalorie(calorie);
        setUserId(userId);
        setLevelId(levelId);
        setDailydate(dailydate);
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
     * Returns value of property {@link #setsId}.
     * @return value of property {@link #setsId}.
     */
    public Integer getSetsId() {
        return this.setsId;
    }
    /**
     * Sets new value of property {@link #setsId}.
     * @param setsId new value of property {@link #setsId}.
     */
    public void setSetsId(Integer setsId) {
        this.setsId = setsId;
    }
    /**
     * Returns value of property {@link #score}.
     * @return value of property {@link #score}.
     */
    public Integer getScore() {
        return this.score;
    }
    /**
     * Sets new value of property {@link #score}.
     * @param score new value of property {@link #score}.
     */
    public void setScore(Integer score) {
        this.score = score;
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
     * Returns value of property {@link #dailydate}.
     * @return value of property {@link #dailydate}.
     */
    public java.sql.Date getDailydate() {
        return this.dailydate;
    }
    /**
     * Sets new value of property {@link #dailydate}.
     * @param dailydate new value of property {@link #dailydate}.
     */
    public void setDailydate(java.sql.Date dailydate) {
        this.dailydate = dailydate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Progressdetails progressdetails = (Progressdetails) o;

        if (id != null ? !id.equals(progressdetails.id) : progressdetails.id != null) {
            return false;
        }
        if (workoutsId != null ? !workoutsId.equals(progressdetails.workoutsId) : progressdetails.workoutsId != null) {
            return false;
        }
        if (setsId != null ? !setsId.equals(progressdetails.setsId) : progressdetails.setsId != null) {
            return false;
        }
        if (score != null ? !score.equals(progressdetails.score) : progressdetails.score != null) {
            return false;
        }
        if (calorie != null ? !calorie.equals(progressdetails.calorie) : progressdetails.calorie != null) {
            return false;
        }
        if (userId != null ? !userId.equals(progressdetails.userId) : progressdetails.userId != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(progressdetails.levelId) : progressdetails.levelId != null) {
            return false;
        }
        if (dailydate != null ? !dailydate.equals(progressdetails.dailydate) : progressdetails.dailydate != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (workoutsId != null ? workoutsId.hashCode() : 0);
        result = 31 * result + (setsId != null ? setsId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (calorie != null ? calorie.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (dailydate != null ? dailydate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Progressdetails{"
                + "id='" + id + '\''
                + ", workoutsId='" + workoutsId + '\''
                + ", setsId='" + setsId + '\''
                + ", score='" + score + '\''
                + ", calorie='" + calorie + '\''
                + ", userId='" + userId + '\''
                + ", levelId='" + levelId + '\''
                + ", dailydate='" + dailydate + '\''
                + '}';
    }
}

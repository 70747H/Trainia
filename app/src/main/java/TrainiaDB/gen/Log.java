package TrainiaDB.gen;

/**
 * POJO representing table Log.
 */
public class Log implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 7629146361191664513L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<LogDAO> DAO_INTERFACE_CLASS = LogDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column trainee_id
     */
    protected Integer traineeId;
    /**
     * Property representing column Workouts_id
     */
    protected Integer workoutsId;
    /**
     * Property representing column SumScore
     */
    protected Integer sumscore;
    /**
     * Property representing column SumCalorie
     */
    protected Integer sumcalorie;
    /**
     * Property representing column level_id
     */
    protected Integer levelId;
    /**
     * Property representing column completionDate
     */
    protected java.sql.Date completiondate;

    /**
     * Default constructor.
     */
    public Log() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param traineeId value of column trainee_id.
     * @param workoutsId value of column Workouts_id.
     * @param sumscore value of column SumScore.
     * @param sumcalorie value of column SumCalorie.
     * @param levelId value of column level_id.
     * @param completiondate value of column completionDate.
     */
    public Log(Integer id, Integer traineeId, Integer workoutsId, Integer sumscore, Integer sumcalorie, Integer levelId, java.sql.Date completiondate) {
        setId(id);
        setTraineeId(traineeId);
        setWorkoutsId(workoutsId);
        setSumscore(sumscore);
        setSumcalorie(sumcalorie);
        setLevelId(levelId);
        setCompletiondate(completiondate);
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
     * Returns value of property {@link #sumscore}.
     * @return value of property {@link #sumscore}.
     */
    public Integer getSumscore() {
        return this.sumscore;
    }
    /**
     * Sets new value of property {@link #sumscore}.
     * @param sumscore new value of property {@link #sumscore}.
     */
    public void setSumscore(Integer sumscore) {
        this.sumscore = sumscore;
    }
    /**
     * Returns value of property {@link #sumcalorie}.
     * @return value of property {@link #sumcalorie}.
     */
    public Integer getSumcalorie() {
        return this.sumcalorie;
    }
    /**
     * Sets new value of property {@link #sumcalorie}.
     * @param sumcalorie new value of property {@link #sumcalorie}.
     */
    public void setSumcalorie(Integer sumcalorie) {
        this.sumcalorie = sumcalorie;
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
     * Returns value of property {@link #completiondate}.
     * @return value of property {@link #completiondate}.
     */
    public java.sql.Date getCompletiondate() {
        return this.completiondate;
    }
    /**
     * Sets new value of property {@link #completiondate}.
     * @param completiondate new value of property {@link #completiondate}.
     */
    public void setCompletiondate(java.sql.Date completiondate) {
        this.completiondate = completiondate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Log log = (Log) o;

        if (id != null ? !id.equals(log.id) : log.id != null) {
            return false;
        }
        if (traineeId != null ? !traineeId.equals(log.traineeId) : log.traineeId != null) {
            return false;
        }
        if (workoutsId != null ? !workoutsId.equals(log.workoutsId) : log.workoutsId != null) {
            return false;
        }
        if (sumscore != null ? !sumscore.equals(log.sumscore) : log.sumscore != null) {
            return false;
        }
        if (sumcalorie != null ? !sumcalorie.equals(log.sumcalorie) : log.sumcalorie != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(log.levelId) : log.levelId != null) {
            return false;
        }
        if (completiondate != null ? !completiondate.equals(log.completiondate) : log.completiondate != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (traineeId != null ? traineeId.hashCode() : 0);
        result = 31 * result + (workoutsId != null ? workoutsId.hashCode() : 0);
        result = 31 * result + (sumscore != null ? sumscore.hashCode() : 0);
        result = 31 * result + (sumcalorie != null ? sumcalorie.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + (completiondate != null ? completiondate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Log{"
                + "id='" + id + '\''
                + ", traineeId='" + traineeId + '\''
                + ", workoutsId='" + workoutsId + '\''
                + ", sumscore='" + sumscore + '\''
                + ", sumcalorie='" + sumcalorie + '\''
                + ", levelId='" + levelId + '\''
                + ", completiondate='" + completiondate + '\''
                + '}';
    }
}

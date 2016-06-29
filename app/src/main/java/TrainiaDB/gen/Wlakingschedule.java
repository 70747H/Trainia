package TrainiaDB.gen;

/**
 * POJO representing table wlakingSchedule.
 */
public class Wlakingschedule implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = 2061786258359760867L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<WlakingscheduleDAO> DAO_INTERFACE_CLASS = WlakingscheduleDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column weekNo
     */
    protected Integer weekno;
    /**
     * Property representing column walksperWeek
     */
    protected String walksperweek;
    /**
     * Property representing column distance
     */
    protected Float distance;
    /**
     * Property representing column warmUp
     */
    protected Integer warmup;
    /**
     * Property representing column minutesWalking
     */
    protected Integer minuteswalking;
    /**
     * Property representing column coolDown
     */
    protected Integer cooldown;
    /**
     * Property representing column Level_id
     */
    protected Integer levelId;

    /**
     * Default constructor.
     */
    public Wlakingschedule() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param weekno value of column weekNo.
     * @param walksperweek value of column walksperWeek.
     * @param distance value of column distance.
     * @param warmup value of column warmUp.
     * @param minuteswalking value of column minutesWalking.
     * @param cooldown value of column coolDown.
     * @param levelId value of column Level_id.
     */
    public Wlakingschedule(Integer id, Integer weekno, String walksperweek, Float distance, Integer warmup, Integer minuteswalking, Integer cooldown, Integer levelId) {
        setId(id);
        setWeekno(weekno);
        setWalksperweek(walksperweek);
        setDistance(distance);
        setWarmup(warmup);
        setMinuteswalking(minuteswalking);
        setCooldown(cooldown);
        setLevelId(levelId);
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
     * Returns value of property {@link #weekno}.
     * @return value of property {@link #weekno}.
     */
    public Integer getWeekno() {
        return this.weekno;
    }
    /**
     * Sets new value of property {@link #weekno}.
     * @param weekno new value of property {@link #weekno}.
     */
    public void setWeekno(Integer weekno) {
        this.weekno = weekno;
    }
    /**
     * Returns value of property {@link #walksperweek}.
     * @return value of property {@link #walksperweek}.
     */
    public String getWalksperweek() {
        return this.walksperweek;
    }
    /**
     * Sets new value of property {@link #walksperweek}.
     * @param walksperweek new value of property {@link #walksperweek}.
     */
    public void setWalksperweek(String walksperweek) {
        this.walksperweek = walksperweek;
    }
    /**
     * Returns value of property {@link #distance}.
     * @return value of property {@link #distance}.
     */
    public Float getDistance() {
        return this.distance;
    }
    /**
     * Sets new value of property {@link #distance}.
     * @param distance new value of property {@link #distance}.
     */
    public void setDistance(Float distance) {
        this.distance = distance;
    }
    /**
     * Returns value of property {@link #warmup}.
     * @return value of property {@link #warmup}.
     */
    public Integer getWarmup() {
        return this.warmup;
    }
    /**
     * Sets new value of property {@link #warmup}.
     * @param warmup new value of property {@link #warmup}.
     */
    public void setWarmup(Integer warmup) {
        this.warmup = warmup;
    }
    /**
     * Returns value of property {@link #minuteswalking}.
     * @return value of property {@link #minuteswalking}.
     */
    public Integer getMinuteswalking() {
        return this.minuteswalking;
    }
    /**
     * Sets new value of property {@link #minuteswalking}.
     * @param minuteswalking new value of property {@link #minuteswalking}.
     */
    public void setMinuteswalking(Integer minuteswalking) {
        this.minuteswalking = minuteswalking;
    }
    /**
     * Returns value of property {@link #cooldown}.
     * @return value of property {@link #cooldown}.
     */
    public Integer getCooldown() {
        return this.cooldown;
    }
    /**
     * Sets new value of property {@link #cooldown}.
     * @param cooldown new value of property {@link #cooldown}.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wlakingschedule wlakingschedule = (Wlakingschedule) o;

        if (id != null ? !id.equals(wlakingschedule.id) : wlakingschedule.id != null) {
            return false;
        }
        if (weekno != null ? !weekno.equals(wlakingschedule.weekno) : wlakingschedule.weekno != null) {
            return false;
        }
        if (walksperweek != null ? !walksperweek.equals(wlakingschedule.walksperweek) : wlakingschedule.walksperweek != null) {
            return false;
        }
        if (distance != null ? !distance.equals(wlakingschedule.distance) : wlakingschedule.distance != null) {
            return false;
        }
        if (warmup != null ? !warmup.equals(wlakingschedule.warmup) : wlakingschedule.warmup != null) {
            return false;
        }
        if (minuteswalking != null ? !minuteswalking.equals(wlakingschedule.minuteswalking) : wlakingschedule.minuteswalking != null) {
            return false;
        }
        if (cooldown != null ? !cooldown.equals(wlakingschedule.cooldown) : wlakingschedule.cooldown != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(wlakingschedule.levelId) : wlakingschedule.levelId != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (weekno != null ? weekno.hashCode() : 0);
        result = 31 * result + (walksperweek != null ? walksperweek.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (warmup != null ? warmup.hashCode() : 0);
        result = 31 * result + (minuteswalking != null ? minuteswalking.hashCode() : 0);
        result = 31 * result + (cooldown != null ? cooldown.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wlakingschedule{"
                + "id='" + id + '\''
                + ", weekno='" + weekno + '\''
                + ", walksperweek='" + walksperweek + '\''
                + ", distance='" + distance + '\''
                + ", warmup='" + warmup + '\''
                + ", minuteswalking='" + minuteswalking + '\''
                + ", cooldown='" + cooldown + '\''
                + ", levelId='" + levelId + '\''
                + '}';
    }
}

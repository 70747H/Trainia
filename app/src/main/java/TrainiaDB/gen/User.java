package TrainiaDB.gen;

/**
 * POJO representing table User.
 */
public class User implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -2132986551966878476L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<UserDAO> DAO_INTERFACE_CLASS = UserDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column name
     */
    protected String name;
    /**
     * Property representing column email
     */
    protected String email;
    /**
     * Property representing column age
     */
    protected Integer age;
    /**
     * Property representing column password
     */
    protected String password;
    /**
     * Property representing column gender
     */
    protected String gender;
    /**
     * Property representing column height
     */
    protected Float height;
    /**
     * Property representing column weight
     */
    protected Float weight;
    /**
     * Property representing column goal
     */
    protected String goal;
    /**
     * Property representing column ActivityLevel_id
     */
    protected Integer activitylevelId;
    /**
     * Property representing column dailyCalorie
     */
    protected Float dailycalorie;
    /**
     * Property representing column key
     */
    protected String key;

    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param name value of column name.
     * @param email value of column email.
     * @param age value of column age.
     * @param password value of column password.
     * @param gender value of column gender.
     * @param height value of column height.
     * @param weight value of column weight.
     * @param goal value of column goal.
     * @param activitylevelId value of column ActivityLevel_id.
     * @param dailycalorie value of column dailyCalorie.
     * @param key value of column key.
     */
    public User(Integer id, String name, String email, Integer age, String password, String gender, Float height, Float weight, String goal, Integer activitylevelId, Float dailycalorie, String key) {
        setId(id);
        setName(name);
        setEmail(email);
        setAge(age);
        setPassword(password);
        setGender(gender);
        setHeight(height);
        setWeight(weight);
        setGoal(goal);
        setActivitylevelId(activitylevelId);
        setDailycalorie(dailycalorie);
        setKey(key);
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
     * Returns value of property {@link #name}.
     * @return value of property {@link #name}.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Sets new value of property {@link #name}.
     * @param name new value of property {@link #name}.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns value of property {@link #email}.
     * @return value of property {@link #email}.
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * Sets new value of property {@link #email}.
     * @param email new value of property {@link #email}.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Returns value of property {@link #age}.
     * @return value of property {@link #age}.
     */
    public Integer getAge() {
        return this.age;
    }
    /**
     * Sets new value of property {@link #age}.
     * @param age new value of property {@link #age}.
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * Returns value of property {@link #password}.
     * @return value of property {@link #password}.
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * Sets new value of property {@link #password}.
     * @param password new value of property {@link #password}.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Returns value of property {@link #gender}.
     * @return value of property {@link #gender}.
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Sets new value of property {@link #gender}.
     * @param gender new value of property {@link #gender}.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Returns value of property {@link #height}.
     * @return value of property {@link #height}.
     */
    public Float getHeight() {
        return this.height;
    }
    /**
     * Sets new value of property {@link #height}.
     * @param height new value of property {@link #height}.
     */
    public void setHeight(Float height) {
        this.height = height;
    }
    /**
     * Returns value of property {@link #weight}.
     * @return value of property {@link #weight}.
     */
    public Float getWeight() {
        return this.weight;
    }
    /**
     * Sets new value of property {@link #weight}.
     * @param weight new value of property {@link #weight}.
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    /**
     * Returns value of property {@link #goal}.
     * @return value of property {@link #goal}.
     */
    public String getGoal() {
        return this.goal;
    }
    /**
     * Sets new value of property {@link #goal}.
     * @param goal new value of property {@link #goal}.
     */
    public void setGoal(String goal) {
        this.goal = goal;
    }
    /**
     * Returns value of property {@link #activitylevelId}.
     * @return value of property {@link #activitylevelId}.
     */
    public Integer getActivitylevelId() {
        return this.activitylevelId;
    }
    /**
     * Sets new value of property {@link #activitylevelId}.
     * @param activitylevelId new value of property {@link #activitylevelId}.
     */
    public void setActivitylevelId(Integer activitylevelId) {
        this.activitylevelId = activitylevelId;
    }
    /**
     * Returns value of property {@link #dailycalorie}.
     * @return value of property {@link #dailycalorie}.
     */
    public Float getDailycalorie() {
        return this.dailycalorie;
    }
    /**
     * Sets new value of property {@link #dailycalorie}.
     * @param dailycalorie new value of property {@link #dailycalorie}.
     */
    public void setDailycalorie(Float dailycalorie) {
        this.dailycalorie = dailycalorie;
    }
    /**
     * Returns value of property {@link #key}.
     * @return value of property {@link #key}.
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Sets new value of property {@link #key}.
     * @param key new value of property {@link #key}.
     */
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) {
            return false;
        }
        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        if (email != null ? !email.equals(user.email) : user.email != null) {
            return false;
        }
        if (age != null ? !age.equals(user.age) : user.age != null) {
            return false;
        }
        if (password != null ? !password.equals(user.password) : user.password != null) {
            return false;
        }
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) {
            return false;
        }
        if (height != null ? !height.equals(user.height) : user.height != null) {
            return false;
        }
        if (weight != null ? !weight.equals(user.weight) : user.weight != null) {
            return false;
        }
        if (goal != null ? !goal.equals(user.goal) : user.goal != null) {
            return false;
        }
        if (activitylevelId != null ? !activitylevelId.equals(user.activitylevelId) : user.activitylevelId != null) {
            return false;
        }
        if (dailycalorie != null ? !dailycalorie.equals(user.dailycalorie) : user.dailycalorie != null) {
            return false;
        }
        if (key != null ? !key.equals(user.key) : user.key != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (goal != null ? goal.hashCode() : 0);
        result = 31 * result + (activitylevelId != null ? activitylevelId.hashCode() : 0);
        result = 31 * result + (dailycalorie != null ? dailycalorie.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", email='" + email + '\''
                + ", age='" + age + '\''
                + ", password='" + password + '\''
                + ", gender='" + gender + '\''
                + ", height='" + height + '\''
                + ", weight='" + weight + '\''
                + ", goal='" + goal + '\''
                + ", activitylevelId='" + activitylevelId + '\''
                + ", dailycalorie='" + dailycalorie + '\''
                + ", key='" + key + '\''
                + '}';
    }
}

package TrainiaDB.gen;

/**
 * POJO representing table notificationMessage.
 */
public class Notificationmessage implements java.io.Serializable {

    /**
     * Serial verion UID
     */
    static final long serialVerionUID = -5845119629162603555L;
    /**
     * Corresponding DAO interface class.
     */
    public static final Class<NotificationmessageDAO> DAO_INTERFACE_CLASS = NotificationmessageDAO.class;
    /**
     * Property representing column id
     */
    protected Integer id;
    /**
     * Property representing column message
     */
    protected String message;
    /**
     * Property representing column state
     */
    protected Boolean state;

    /**
     * Default constructor.
     */
    public Notificationmessage() {
    }

    /**
     * All columns constructor.
     * @param id value of column id.
     * @param message value of column message.
     * @param state value of column state.
     */
    public Notificationmessage(Integer id, String message, Boolean state) {
        setId(id);
        setMessage(message);
        setState(state);
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
     * Returns value of property {@link #message}.
     * @return value of property {@link #message}.
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * Sets new value of property {@link #message}.
     * @param message new value of property {@link #message}.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * Returns value of property {@link #state}.
     * @return value of property {@link #state}.
     */
    public Boolean getState() {
        return this.state;
    }
    /**
     * Sets new value of property {@link #state}.
     * @param state new value of property {@link #state}.
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notificationmessage notificationmessage = (Notificationmessage) o;

        if (id != null ? !id.equals(notificationmessage.id) : notificationmessage.id != null) {
            return false;
        }
        if (message != null ? !message.equals(notificationmessage.message) : notificationmessage.message != null) {
            return false;
        }
        if (state != null ? !state.equals(notificationmessage.state) : notificationmessage.state != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Notificationmessage{"
                + "id='" + id + '\''
                + ", message='" + message + '\''
                + ", state='" + state + '\''
                + '}';
    }
}

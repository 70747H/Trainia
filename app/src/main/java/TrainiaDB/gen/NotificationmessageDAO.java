package TrainiaDB.gen;

public interface NotificationmessageDAO extends
        TrainiaDB.runtime.dao.DAO<Notificationmessage> {

    /**
     * Table expression class representing table notificationMessage
     */
    class NotificationmessageTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        NotificationmessageTableExpression() {
            super("notificationMessage");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("message", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("state", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table notificationMessage
     */
    class NotificationmessageResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Notificationmessage> {
        @Override
        public java.util.List<Notificationmessage>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Notificationmessage> ret = new java.util.LinkedList<Notificationmessage>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Notificationmessage obj = new Notificationmessage();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setMessage(cursor.getString(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setState(cursor.getLong(2)==1);
                }
                ret.add(obj);
                cursor.moveToNext();
            }
            return ret;
        }
    }

    /**
     * Corresponding POJO class.
     */
    Class<Notificationmessage> POJO_CLASS = Notificationmessage.class;
    /**
     * Table expression for the table.
     */
    NotificationmessageTableExpression TABLE_EXPRESSION = new NotificationmessageTableExpression();
    /**
     * Result set handler for the table.
     */
    NotificationmessageResultSetHandler RESULT_SET_HANDLER = new NotificationmessageResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column message
     */
    TrainiaDB.runtime.query.Column MESSAGE = TABLE_EXPRESSION.getColumn("message");
    /**
     * Column object representing column state
     */
    TrainiaDB.runtime.query.Column STATE = TABLE_EXPRESSION.getColumn("state");

    /**
     * Returns all rows from table notificationMessage
     * @return all rows from table funkcja.
     */
    java.util.List<Notificationmessage> getNotificationmessageList();

    /**
     * Returns all rows from table notificationMessage
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Notificationmessage> getNotificationmessageList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table notificationMessage
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Notificationmessage> getNotificationmessageList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table notificationMessage matching given where clause
     * @param where where clause
     * @return all rows from table notificationMessage matching given where clause
     */
    java.util.List<Notificationmessage> getNotificationmessageList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table notificationMessage matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table notificationMessage matching given where clause
     */
    java.util.List<Notificationmessage> getNotificationmessageList(TrainiaDB.runtime.query.LExp where,
                                                                   TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table notificationMessage matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table notificationMessage matching given where clause
     */
    java.util.List<Notificationmessage> getNotificationmessageList(TrainiaDB.runtime.query.LExp where,
                                                                   TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table notificationMessage based on value of primary key
     * @return row from table notificationMessage
     */
    Notificationmessage getById(Integer id);

    /**
     * Returns number of all rows in table.
     * @return number of all rows in table
     */
    Long getCount();

    /**
     * Returns number of rows according to given WHERE query.
     * @param where where query
     * @return number of rows
     */
    Long getCount(TrainiaDB.runtime.query.LExp where);

    /**
     * Inserts row into table notificationMessage
     * @param notificationmessage notificationmessage to be inserted.
     * @return id number of new row
     */
    long insert(Notificationmessage notificationmessage);

    /**
     * Inserts collection of rows into table notificationMessage
     * @param notificationmessages rows to be inserted
     */
    void insert(java.util.Collection<Notificationmessage> notificationmessages);

    /**
     * Updates row in table notificationMessage
     * @param notificationmessage notificationmessage to be updated.
     */
    void update(Notificationmessage notificationmessage);

    /**
     * Updates collection of rows in table notificationMessage
     * @param notificationmessages rows to be update
     */
    void update(java.util.Collection<Notificationmessage> notificationmessages);

    /**
     * Deletes row from table notificationMessage
     * @param notificationmessage notificationmessage to be deleted.
     */
    void delete(Notificationmessage notificationmessage);

    /**
     * Deletes row from table notificationMessage based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table notificationMessage
     * @param notificationmessages rows to be deleted
     */
    void delete(java.util.Collection<Notificationmessage> notificationmessages);

    /**
     * Deletes all rows from table notificationMessage matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

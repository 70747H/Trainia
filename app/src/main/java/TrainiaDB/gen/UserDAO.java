package TrainiaDB.gen;

public interface UserDAO extends
        TrainiaDB.runtime.dao.DAO<User> {

    /**
     * Table expression class representing table User
     */
    class UserTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        UserTableExpression() {
            super("User");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("name", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("email", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("age", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("password", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("gender", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("height", TrainiaDB.runtime.util.SQLiteType.NUMERIC, true);
            addColumn("weight", TrainiaDB.runtime.util.SQLiteType.NUMERIC, true);
            addColumn("goal", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("ActivityLevel_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("dailyCalorie", TrainiaDB.runtime.util.SQLiteType.NUMERIC, true);
            addColumn("key", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
        }
    }

    /**
     * Result set handler class for table User
     */
    class UserResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<User> {
        @Override
        public java.util.List<User>
                getObjects(android.database.Cursor cursor) {
            java.util.List<User> ret = new java.util.LinkedList<User>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                User obj = new User();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setName(cursor.getString(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setEmail(cursor.getString(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setAge(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setPassword(cursor.getString(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setGender(cursor.getString(5));
                }
                if (!cursor.isNull(6)) {
                    obj.setHeight(cursor.getFloat(6));
                }
                if (!cursor.isNull(7)) {
                    obj.setWeight(cursor.getFloat(7));
                }
                if (!cursor.isNull(8)) {
                    obj.setGoal(cursor.getString(8));
                }
                if (!cursor.isNull(9)) {
                    obj.setActivitylevelId(cursor.getInt(9));
                }
                if (!cursor.isNull(10)) {
                    obj.setDailycalorie(cursor.getFloat(10));
                }
                if (!cursor.isNull(11)) {
                    obj.setKey(cursor.getString(11));
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
    Class<User> POJO_CLASS = User.class;
    /**
     * Table expression for the table.
     */
    UserTableExpression TABLE_EXPRESSION = new UserTableExpression();
    /**
     * Result set handler for the table.
     */
    UserResultSetHandler RESULT_SET_HANDLER = new UserResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column name
     */
    TrainiaDB.runtime.query.Column NAME = TABLE_EXPRESSION.getColumn("name");
    /**
     * Column object representing column email
     */
    TrainiaDB.runtime.query.Column EMAIL = TABLE_EXPRESSION.getColumn("email");
    /**
     * Column object representing column age
     */
    TrainiaDB.runtime.query.Column AGE = TABLE_EXPRESSION.getColumn("age");
    /**
     * Column object representing column password
     */
    TrainiaDB.runtime.query.Column PASSWORD = TABLE_EXPRESSION.getColumn("password");
    /**
     * Column object representing column gender
     */
    TrainiaDB.runtime.query.Column GENDER = TABLE_EXPRESSION.getColumn("gender");
    /**
     * Column object representing column height
     */
    TrainiaDB.runtime.query.Column HEIGHT = TABLE_EXPRESSION.getColumn("height");
    /**
     * Column object representing column weight
     */
    TrainiaDB.runtime.query.Column WEIGHT = TABLE_EXPRESSION.getColumn("weight");
    /**
     * Column object representing column goal
     */
    TrainiaDB.runtime.query.Column GOAL = TABLE_EXPRESSION.getColumn("goal");
    /**
     * Column object representing column ActivityLevel_id
     */
    TrainiaDB.runtime.query.Column ACTIVITYLEVEL_ID = TABLE_EXPRESSION.getColumn("ActivityLevel_id");
    /**
     * Column object representing column dailyCalorie
     */
    TrainiaDB.runtime.query.Column DAILYCALORIE = TABLE_EXPRESSION.getColumn("dailyCalorie");
    /**
     * Column object representing column key
     */
    TrainiaDB.runtime.query.Column KEY = TABLE_EXPRESSION.getColumn("key");

    /**
     * Returns all rows from table User
     * @return all rows from table funkcja.
     */
    java.util.List<User> getUserList();

    /**
     * Returns all rows from table User
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<User> getUserList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table User
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<User> getUserList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table User matching given where clause
     * @param where where clause
     * @return all rows from table User matching given where clause
     */
    java.util.List<User> getUserList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table User matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table User matching given where clause
     */
    java.util.List<User> getUserList(TrainiaDB.runtime.query.LExp where,
                                     TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table User matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table User matching given where clause
     */
    java.util.List<User> getUserList(TrainiaDB.runtime.query.LExp where,
                                     TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table User based on value of primary key
     * @return row from table User
     */
    User getById(Integer id);

    /**
     * Returns list of rows from table User referencing given row from table ActivityLevel
     * @param activitylevel object representing row from referenced by rows from table User
     * @return list of rows from table User referencing given row from table ActivityLevel
     */
    java.util.List<User> getUserList(Activitylevel activitylevel);

    /**
     * Returns list of rows from table User referencing given row from table ActivityLevel
     * @param activitylevel object representing row from referenced by rows from table User
     * @param orderBy column to sort by
     * @return list of rows from table User referencing given row from table ActivityLevel
     */
    java.util.List<User> getUserList(Activitylevel activitylevel, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table User referencing given row from table ActivityLevel
     * @param activitylevel object representing row from referenced by rows from table User
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table User referencing given row from table ActivityLevel
     */
    java.util.List<User> getUserList(Activitylevel activitylevel, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table User referenced by given row from table Log
     * @param log object representing row referencing row from table Log
     * @return row from table User referenced by given row from table Log
     */
    User getUser(Log log);

    /**
     * Returns row from table User referenced by given row from table workoutState
     * @param workoutstate object representing row referencing row from table workoutState
     * @return row from table User referenced by given row from table workoutState
     */
    User getUser(Workoutstate workoutstate);

    /**
     * Returns row from table User referenced by given row from table ProgressDetails
     * @param progressdetails object representing row referencing row from table ProgressDetails
     * @return row from table User referenced by given row from table ProgressDetails
     */
    User getUser(Progressdetails progressdetails);

    /**
     * Returns row from table User referenced by given row from table walkingProgress
     * @param walkingprogress object representing row referencing row from table walkingProgress
     * @return row from table User referenced by given row from table walkingProgress
     */
    User getUser(Walkingprogress walkingprogress);

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
     * Inserts row into table User
     * @param user user to be inserted.
     * @return id number of new row
     */
    long insert(User user);

    /**
     * Inserts collection of rows into table User
     * @param users rows to be inserted
     */
    void insert(java.util.Collection<User> users);

    /**
     * Updates row in table User
     * @param user user to be updated.
     */
    void update(User user);

    /**
     * Updates collection of rows in table User
     * @param users rows to be update
     */
    void update(java.util.Collection<User> users);

    /**
     * Deletes row from table User
     * @param user user to be deleted.
     */
    void delete(User user);

    /**
     * Deletes row from table User based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table User
     * @param users rows to be deleted
     */
    void delete(java.util.Collection<User> users);

    /**
     * Deletes all rows from table User matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

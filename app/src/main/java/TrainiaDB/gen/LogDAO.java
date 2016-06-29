package TrainiaDB.gen;

public interface LogDAO extends
        TrainiaDB.runtime.dao.DAO<Log> {

    /**
     * Table expression class representing table Log
     */
    class LogTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        LogTableExpression() {
            super("Log");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("trainee_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Workouts_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("SumScore", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("SumCalorie", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("completionDate", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table Log
     */
    class LogResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Log> {
        @Override
        public java.util.List<Log>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Log> ret = new java.util.LinkedList<Log>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Log obj = new Log();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setTraineeId(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setWorkoutsId(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setSumscore(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setSumcalorie(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setLevelId(cursor.getInt(5));
                }
                if (!cursor.isNull(6)) {
                    obj.setCompletiondate(new java.sql.Date(cursor.getLong(6)));
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
    Class<Log> POJO_CLASS = Log.class;
    /**
     * Table expression for the table.
     */
    LogTableExpression TABLE_EXPRESSION = new LogTableExpression();
    /**
     * Result set handler for the table.
     */
    LogResultSetHandler RESULT_SET_HANDLER = new LogResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column trainee_id
     */
    TrainiaDB.runtime.query.Column TRAINEE_ID = TABLE_EXPRESSION.getColumn("trainee_id");
    /**
     * Column object representing column Workouts_id
     */
    TrainiaDB.runtime.query.Column WORKOUTS_ID = TABLE_EXPRESSION.getColumn("Workouts_id");
    /**
     * Column object representing column SumScore
     */
    TrainiaDB.runtime.query.Column SUMSCORE = TABLE_EXPRESSION.getColumn("SumScore");
    /**
     * Column object representing column SumCalorie
     */
    TrainiaDB.runtime.query.Column SUMCALORIE = TABLE_EXPRESSION.getColumn("SumCalorie");
    /**
     * Column object representing column level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("level_id");
    /**
     * Column object representing column completionDate
     */
    TrainiaDB.runtime.query.Column COMPLETIONDATE = TABLE_EXPRESSION.getColumn("completionDate");

    /**
     * Returns all rows from table Log
     * @return all rows from table funkcja.
     */
    java.util.List<Log> getLogList();

    /**
     * Returns all rows from table Log
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Log> getLogList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Log
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Log> getLogList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table Log matching given where clause
     * @param where where clause
     * @return all rows from table Log matching given where clause
     */
    java.util.List<Log> getLogList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table Log matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table Log matching given where clause
     */
    java.util.List<Log> getLogList(TrainiaDB.runtime.query.LExp where,
                                   TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Log matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table Log matching given where clause
     */
    java.util.List<Log> getLogList(TrainiaDB.runtime.query.LExp where,
                                   TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table Log based on value of primary key
     * @return row from table Log
     */
    Log getById(Integer id);

    /**
     * Returns list of rows from table Log referencing given row from table User
     * @param user object representing row from referenced by rows from table Log
     * @return list of rows from table Log referencing given row from table User
     */
    java.util.List<Log> getLogList(User user);

    /**
     * Returns list of rows from table Log referencing given row from table User
     * @param user object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @return list of rows from table Log referencing given row from table User
     */
    java.util.List<Log> getLogList(User user, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table Log referencing given row from table User
     * @param user object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table Log referencing given row from table User
     */
    java.util.List<Log> getLogList(User user, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table Log referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Log
     * @return list of rows from table Log referencing given row from table Workouts
     */
    java.util.List<Log> getLogList(Workouts workouts);

    /**
     * Returns list of rows from table Log referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @return list of rows from table Log referencing given row from table Workouts
     */
    java.util.List<Log> getLogList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table Log referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table Log referencing given row from table Workouts
     */
    java.util.List<Log> getLogList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table Log referencing given row from table Level
     * @param level object representing row from referenced by rows from table Log
     * @return list of rows from table Log referencing given row from table Level
     */
    java.util.List<Log> getLogList(Level level);

    /**
     * Returns list of rows from table Log referencing given row from table Level
     * @param level object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @return list of rows from table Log referencing given row from table Level
     */
    java.util.List<Log> getLogList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table Log referencing given row from table Level
     * @param level object representing row from referenced by rows from table Log
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table Log referencing given row from table Level
     */
    java.util.List<Log> getLogList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table Log
     * @param log log to be inserted.
     * @return id number of new row
     */
    long insert(Log log);

    /**
     * Inserts collection of rows into table Log
     * @param logs rows to be inserted
     */
    void insert(java.util.Collection<Log> logs);

    /**
     * Updates row in table Log
     * @param log log to be updated.
     */
    void update(Log log);

    /**
     * Updates collection of rows in table Log
     * @param logs rows to be update
     */
    void update(java.util.Collection<Log> logs);

    /**
     * Deletes row from table Log
     * @param log log to be deleted.
     */
    void delete(Log log);

    /**
     * Deletes row from table Log based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table Log
     * @param logs rows to be deleted
     */
    void delete(java.util.Collection<Log> logs);

    /**
     * Deletes all rows from table Log matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

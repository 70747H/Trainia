package TrainiaDB.gen;

public interface ScheduleDAO extends
        TrainiaDB.runtime.dao.DAO<Schedule> {

    /**
     * Table expression class representing table schedule
     */
    class ScheduleTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        ScheduleTableExpression() {
            super("schedule");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("schedule", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
        }
    }

    /**
     * Result set handler class for table schedule
     */
    class ScheduleResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Schedule> {
        @Override
        public java.util.List<Schedule>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Schedule> ret = new java.util.LinkedList<Schedule>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Schedule obj = new Schedule();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setSchedule(cursor.getString(1));
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
    Class<Schedule> POJO_CLASS = Schedule.class;
    /**
     * Table expression for the table.
     */
    ScheduleTableExpression TABLE_EXPRESSION = new ScheduleTableExpression();
    /**
     * Result set handler for the table.
     */
    ScheduleResultSetHandler RESULT_SET_HANDLER = new ScheduleResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column schedule
     */
    TrainiaDB.runtime.query.Column SCHEDULE = TABLE_EXPRESSION.getColumn("schedule");

    /**
     * Returns all rows from table schedule
     * @return all rows from table funkcja.
     */
    java.util.List<Schedule> getScheduleList();

    /**
     * Returns all rows from table schedule
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Schedule> getScheduleList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table schedule
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Schedule> getScheduleList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table schedule matching given where clause
     * @param where where clause
     * @return all rows from table schedule matching given where clause
     */
    java.util.List<Schedule> getScheduleList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table schedule matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table schedule matching given where clause
     */
    java.util.List<Schedule> getScheduleList(TrainiaDB.runtime.query.LExp where,
                                             TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table schedule matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table schedule matching given where clause
     */
    java.util.List<Schedule> getScheduleList(TrainiaDB.runtime.query.LExp where,
                                             TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table schedule based on value of primary key
     * @return row from table schedule
     */
    Schedule getById(Integer id);

    /**
     * Returns row from table schedule referenced by given row from table workoutLevel
     * @param workoutlevel object representing row referencing row from table workoutLevel
     * @return row from table schedule referenced by given row from table workoutLevel
     */
    Schedule getSchedule(Workoutlevel workoutlevel);

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
     * Inserts row into table schedule
     * @param schedule schedule to be inserted.
     * @return id number of new row
     */
    long insert(Schedule schedule);

    /**
     * Inserts collection of rows into table schedule
     * @param schedules rows to be inserted
     */
    void insert(java.util.Collection<Schedule> schedules);

    /**
     * Updates row in table schedule
     * @param schedule schedule to be updated.
     */
    void update(Schedule schedule);

    /**
     * Updates collection of rows in table schedule
     * @param schedules rows to be update
     */
    void update(java.util.Collection<Schedule> schedules);

    /**
     * Deletes row from table schedule
     * @param schedule schedule to be deleted.
     */
    void delete(Schedule schedule);

    /**
     * Deletes row from table schedule based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table schedule
     * @param schedules rows to be deleted
     */
    void delete(java.util.Collection<Schedule> schedules);

    /**
     * Deletes all rows from table schedule matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

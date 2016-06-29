package TrainiaDB.gen;

public interface WorkoutstateDAO extends
        TrainiaDB.runtime.dao.DAO<Workoutstate> {

    /**
     * Table expression class representing table workoutState
     */
    class WorkoutstateTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        WorkoutstateTableExpression() {
            super("workoutState");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("workoutState", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("scheduleIndex", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("workout_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("trainee_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table workoutState
     */
    class WorkoutstateResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Workoutstate> {
        @Override
        public java.util.List<Workoutstate>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Workoutstate> ret = new java.util.LinkedList<Workoutstate>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Workoutstate obj = new Workoutstate();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setWorkoutstate(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setScheduleindex(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setWorkoutId(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setLevelId(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setTraineeId(cursor.getInt(5));
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
    Class<Workoutstate> POJO_CLASS = Workoutstate.class;
    /**
     * Table expression for the table.
     */
    WorkoutstateTableExpression TABLE_EXPRESSION = new WorkoutstateTableExpression();
    /**
     * Result set handler for the table.
     */
    WorkoutstateResultSetHandler RESULT_SET_HANDLER = new WorkoutstateResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column workoutState
     */
    TrainiaDB.runtime.query.Column WORKOUTSTATE = TABLE_EXPRESSION.getColumn("workoutState");
    /**
     * Column object representing column scheduleIndex
     */
    TrainiaDB.runtime.query.Column SCHEDULEINDEX = TABLE_EXPRESSION.getColumn("scheduleIndex");
    /**
     * Column object representing column workout_id
     */
    TrainiaDB.runtime.query.Column WORKOUT_ID = TABLE_EXPRESSION.getColumn("workout_id");
    /**
     * Column object representing column level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("level_id");
    /**
     * Column object representing column trainee_id
     */
    TrainiaDB.runtime.query.Column TRAINEE_ID = TABLE_EXPRESSION.getColumn("trainee_id");

    /**
     * Returns all rows from table workoutState
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutstate> getWorkoutstateList();

    /**
     * Returns all rows from table workoutState
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutstate> getWorkoutstateList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table workoutState
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutstate> getWorkoutstateList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table workoutState matching given where clause
     * @param where where clause
     * @return all rows from table workoutState matching given where clause
     */
    java.util.List<Workoutstate> getWorkoutstateList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table workoutState matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table workoutState matching given where clause
     */
    java.util.List<Workoutstate> getWorkoutstateList(TrainiaDB.runtime.query.LExp where,
                                                     TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table workoutState matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table workoutState matching given where clause
     */
    java.util.List<Workoutstate> getWorkoutstateList(TrainiaDB.runtime.query.LExp where,
                                                     TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table workoutState based on value of primary key
     * @return row from table workoutState
     */
    Workoutstate getById(Integer id);

    /**
     * Returns list of rows from table workoutState referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutState
     * @return list of rows from table workoutState referencing given row from table Workouts
     */
    java.util.List<Workoutstate> getWorkoutstateList(Workouts workouts);

    /**
     * Returns list of rows from table workoutState referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @return list of rows from table workoutState referencing given row from table Workouts
     */
    java.util.List<Workoutstate> getWorkoutstateList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutState referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutState referencing given row from table Workouts
     */
    java.util.List<Workoutstate> getWorkoutstateList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table workoutState referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutState
     * @return list of rows from table workoutState referencing given row from table Level
     */
    java.util.List<Workoutstate> getWorkoutstateList(Level level);

    /**
     * Returns list of rows from table workoutState referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @return list of rows from table workoutState referencing given row from table Level
     */
    java.util.List<Workoutstate> getWorkoutstateList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutState referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutState referencing given row from table Level
     */
    java.util.List<Workoutstate> getWorkoutstateList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table workoutState referencing given row from table User
     * @param user object representing row from referenced by rows from table workoutState
     * @return list of rows from table workoutState referencing given row from table User
     */
    java.util.List<Workoutstate> getWorkoutstateList(User user);

    /**
     * Returns list of rows from table workoutState referencing given row from table User
     * @param user object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @return list of rows from table workoutState referencing given row from table User
     */
    java.util.List<Workoutstate> getWorkoutstateList(User user, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutState referencing given row from table User
     * @param user object representing row from referenced by rows from table workoutState
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutState referencing given row from table User
     */
    java.util.List<Workoutstate> getWorkoutstateList(User user, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table workoutState
     * @param workoutstate workoutstate to be inserted.
     * @return id number of new row
     */
    long insert(Workoutstate workoutstate);

    /**
     * Inserts collection of rows into table workoutState
     * @param workoutstates rows to be inserted
     */
    void insert(java.util.Collection<Workoutstate> workoutstates);

    /**
     * Updates row in table workoutState
     * @param workoutstate workoutstate to be updated.
     */
    void update(Workoutstate workoutstate);

    /**
     * Updates collection of rows in table workoutState
     * @param workoutstates rows to be update
     */
    void update(java.util.Collection<Workoutstate> workoutstates);

    /**
     * Deletes row from table workoutState
     * @param workoutstate workoutstate to be deleted.
     */
    void delete(Workoutstate workoutstate);

    /**
     * Deletes row from table workoutState based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table workoutState
     * @param workoutstates rows to be deleted
     */
    void delete(java.util.Collection<Workoutstate> workoutstates);

    /**
     * Deletes all rows from table workoutState matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

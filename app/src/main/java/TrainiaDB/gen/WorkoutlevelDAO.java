package TrainiaDB.gen;

public interface WorkoutlevelDAO extends
        TrainiaDB.runtime.dao.DAO<Workoutlevel> {

    /**
     * Table expression class representing table workoutLevel
     */
    class WorkoutlevelTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        WorkoutlevelTableExpression() {
            super("workoutLevel");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Reps", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("days", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("workout_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("schedule_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table workoutLevel
     */
    class WorkoutlevelResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Workoutlevel> {
        @Override
        public java.util.List<Workoutlevel>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Workoutlevel> ret = new java.util.LinkedList<Workoutlevel>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Workoutlevel obj = new Workoutlevel();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setReps(cursor.getString(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setDays(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setWorkoutId(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setLevelId(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setScheduleId(cursor.getInt(5));
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
    Class<Workoutlevel> POJO_CLASS = Workoutlevel.class;
    /**
     * Table expression for the table.
     */
    WorkoutlevelTableExpression TABLE_EXPRESSION = new WorkoutlevelTableExpression();
    /**
     * Result set handler for the table.
     */
    WorkoutlevelResultSetHandler RESULT_SET_HANDLER = new WorkoutlevelResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column Reps
     */
    TrainiaDB.runtime.query.Column REPS = TABLE_EXPRESSION.getColumn("Reps");
    /**
     * Column object representing column days
     */
    TrainiaDB.runtime.query.Column DAYS = TABLE_EXPRESSION.getColumn("days");
    /**
     * Column object representing column workout_id
     */
    TrainiaDB.runtime.query.Column WORKOUT_ID = TABLE_EXPRESSION.getColumn("workout_id");
    /**
     * Column object representing column level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("level_id");
    /**
     * Column object representing column schedule_id
     */
    TrainiaDB.runtime.query.Column SCHEDULE_ID = TABLE_EXPRESSION.getColumn("schedule_id");

    /**
     * Returns all rows from table workoutLevel
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutlevel> getWorkoutlevelList();

    /**
     * Returns all rows from table workoutLevel
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table workoutLevel
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table workoutLevel matching given where clause
     * @param where where clause
     * @return all rows from table workoutLevel matching given where clause
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table workoutLevel matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table workoutLevel matching given where clause
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where,
                                                     TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table workoutLevel matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table workoutLevel matching given where clause
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where,
                                                     TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table workoutLevel based on value of primary key
     * @return row from table workoutLevel
     */
    Workoutlevel getById(Integer id);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutLevel
     * @return list of rows from table workoutLevel referencing given row from table Workouts
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @return list of rows from table workoutLevel referencing given row from table Workouts
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutLevel referencing given row from table Workouts
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutLevel
     * @return list of rows from table workoutLevel referencing given row from table Level
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Level level);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @return list of rows from table workoutLevel referencing given row from table Level
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table Level
     * @param level object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutLevel referencing given row from table Level
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table schedule
     * @param schedule object representing row from referenced by rows from table workoutLevel
     * @return list of rows from table workoutLevel referencing given row from table schedule
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table schedule
     * @param schedule object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @return list of rows from table workoutLevel referencing given row from table schedule
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table workoutLevel referencing given row from table schedule
     * @param schedule object representing row from referenced by rows from table workoutLevel
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table workoutLevel referencing given row from table schedule
     */
    java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table workoutLevel
     * @param workoutlevel workoutlevel to be inserted.
     * @return id number of new row
     */
    long insert(Workoutlevel workoutlevel);

    /**
     * Inserts collection of rows into table workoutLevel
     * @param workoutlevels rows to be inserted
     */
    void insert(java.util.Collection<Workoutlevel> workoutlevels);

    /**
     * Updates row in table workoutLevel
     * @param workoutlevel workoutlevel to be updated.
     */
    void update(Workoutlevel workoutlevel);

    /**
     * Updates collection of rows in table workoutLevel
     * @param workoutlevels rows to be update
     */
    void update(java.util.Collection<Workoutlevel> workoutlevels);

    /**
     * Deletes row from table workoutLevel
     * @param workoutlevel workoutlevel to be deleted.
     */
    void delete(Workoutlevel workoutlevel);

    /**
     * Deletes row from table workoutLevel based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table workoutLevel
     * @param workoutlevels rows to be deleted
     */
    void delete(java.util.Collection<Workoutlevel> workoutlevels);

    /**
     * Deletes all rows from table workoutLevel matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

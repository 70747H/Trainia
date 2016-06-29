package TrainiaDB.gen;

public interface WorkoutsDAO extends
        TrainiaDB.runtime.dao.DAO<Workouts> {

    /**
     * Table expression class representing table Workouts
     */
    class WorkoutsTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        WorkoutsTableExpression() {
            super("Workouts");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("workout_name", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
        }
    }

    /**
     * Result set handler class for table Workouts
     */
    class WorkoutsResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Workouts> {
        @Override
        public java.util.List<Workouts>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Workouts> ret = new java.util.LinkedList<Workouts>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Workouts obj = new Workouts();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setWorkoutName(cursor.getString(1));
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
    Class<Workouts> POJO_CLASS = Workouts.class;
    /**
     * Table expression for the table.
     */
    WorkoutsTableExpression TABLE_EXPRESSION = new WorkoutsTableExpression();
    /**
     * Result set handler for the table.
     */
    WorkoutsResultSetHandler RESULT_SET_HANDLER = new WorkoutsResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column workout_name
     */
    TrainiaDB.runtime.query.Column WORKOUT_NAME = TABLE_EXPRESSION.getColumn("workout_name");

    /**
     * Returns all rows from table Workouts
     * @return all rows from table funkcja.
     */
    java.util.List<Workouts> getWorkoutsList();

    /**
     * Returns all rows from table Workouts
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Workouts> getWorkoutsList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Workouts
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Workouts> getWorkoutsList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table Workouts matching given where clause
     * @param where where clause
     * @return all rows from table Workouts matching given where clause
     */
    java.util.List<Workouts> getWorkoutsList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table Workouts matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table Workouts matching given where clause
     */
    java.util.List<Workouts> getWorkoutsList(TrainiaDB.runtime.query.LExp where,
                                             TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Workouts matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table Workouts matching given where clause
     */
    java.util.List<Workouts> getWorkoutsList(TrainiaDB.runtime.query.LExp where,
                                             TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table Workouts based on value of primary key
     * @return row from table Workouts
     */
    Workouts getById(Integer id);

    /**
     * Returns row from table Workouts referenced by given row from table Sets
     * @param sets object representing row referencing row from table Sets
     * @return row from table Workouts referenced by given row from table Sets
     */
    Workouts getWorkouts(Sets sets);

    /**
     * Returns row from table Workouts referenced by given row from table ProgressDetails
     * @param progressdetails object representing row referencing row from table ProgressDetails
     * @return row from table Workouts referenced by given row from table ProgressDetails
     */
    Workouts getWorkouts(Progressdetails progressdetails);

    /**
     * Returns row from table Workouts referenced by given row from table Log
     * @param log object representing row referencing row from table Log
     * @return row from table Workouts referenced by given row from table Log
     */
    Workouts getWorkouts(Log log);

    /**
     * Returns row from table Workouts referenced by given row from table SetSum
     * @param setsum object representing row referencing row from table SetSum
     * @return row from table Workouts referenced by given row from table SetSum
     */
    Workouts getWorkouts(Setsum setsum);

    /**
     * Returns row from table Workouts referenced by given row from table workoutLevel
     * @param workoutlevel object representing row referencing row from table workoutLevel
     * @return row from table Workouts referenced by given row from table workoutLevel
     */
    Workouts getWorkouts(Workoutlevel workoutlevel);

    /**
     * Returns row from table Workouts referenced by given row from table workoutState
     * @param workoutstate object representing row referencing row from table workoutState
     * @return row from table Workouts referenced by given row from table workoutState
     */
    Workouts getWorkouts(Workoutstate workoutstate);

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
     * Inserts row into table Workouts
     * @param workouts workouts to be inserted.
     * @return id number of new row
     */
    long insert(Workouts workouts);

    /**
     * Inserts collection of rows into table Workouts
     * @param workoutss rows to be inserted
     */
    void insert(java.util.Collection<Workouts> workoutss);

    /**
     * Updates row in table Workouts
     * @param workouts workouts to be updated.
     */
    void update(Workouts workouts);

    /**
     * Updates collection of rows in table Workouts
     * @param workoutss rows to be update
     */
    void update(java.util.Collection<Workouts> workoutss);

    /**
     * Deletes row from table Workouts
     * @param workouts workouts to be deleted.
     */
    void delete(Workouts workouts);

    /**
     * Deletes row from table Workouts based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table Workouts
     * @param workoutss rows to be deleted
     */
    void delete(java.util.Collection<Workouts> workoutss);

    /**
     * Deletes all rows from table Workouts matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

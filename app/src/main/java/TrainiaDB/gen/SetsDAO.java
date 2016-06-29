package TrainiaDB.gen;

public interface SetsDAO extends
        TrainiaDB.runtime.dao.DAO<Sets> {

    /**
     * Table expression class representing table Sets
     */
    class SetsTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        SetsTableExpression() {
            super("Sets");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Workouts_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Sets", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("setsSum", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table Sets
     */
    class SetsResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Sets> {
        @Override
        public java.util.List<Sets>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Sets> ret = new java.util.LinkedList<Sets>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Sets obj = new Sets();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setLevelId(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setWorkoutsId(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setSets(cursor.getString(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setSetssum(cursor.getInt(4));
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
    Class<Sets> POJO_CLASS = Sets.class;
    /**
     * Table expression for the table.
     */
    SetsTableExpression TABLE_EXPRESSION = new SetsTableExpression();
    /**
     * Result set handler for the table.
     */
    SetsResultSetHandler RESULT_SET_HANDLER = new SetsResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("level_id");
    /**
     * Column object representing column Workouts_id
     */
    TrainiaDB.runtime.query.Column WORKOUTS_ID = TABLE_EXPRESSION.getColumn("Workouts_id");
    /**
     * Column object representing column Sets
     */
    TrainiaDB.runtime.query.Column SETS = TABLE_EXPRESSION.getColumn("Sets");
    /**
     * Column object representing column setsSum
     */
    TrainiaDB.runtime.query.Column SETSSUM = TABLE_EXPRESSION.getColumn("setsSum");

    /**
     * Returns all rows from table Sets
     * @return all rows from table funkcja.
     */
    java.util.List<Sets> getSetsList();

    /**
     * Returns all rows from table Sets
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Sets> getSetsList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Sets
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Sets> getSetsList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table Sets matching given where clause
     * @param where where clause
     * @return all rows from table Sets matching given where clause
     */
    java.util.List<Sets> getSetsList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table Sets matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table Sets matching given where clause
     */
    java.util.List<Sets> getSetsList(TrainiaDB.runtime.query.LExp where,
                                     TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Sets matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table Sets matching given where clause
     */
    java.util.List<Sets> getSetsList(TrainiaDB.runtime.query.LExp where,
                                     TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table Sets based on value of primary key
     * @return row from table Sets
     */
    Sets getById(Integer id);

    /**
     * Returns list of rows from table Sets referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Sets
     * @return list of rows from table Sets referencing given row from table Workouts
     */
    java.util.List<Sets> getSetsList(Workouts workouts);

    /**
     * Returns list of rows from table Sets referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Sets
     * @param orderBy column to sort by
     * @return list of rows from table Sets referencing given row from table Workouts
     */
    java.util.List<Sets> getSetsList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table Sets referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table Sets
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table Sets referencing given row from table Workouts
     */
    java.util.List<Sets> getSetsList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table Sets referencing given row from table Level
     * @param level object representing row from referenced by rows from table Sets
     * @return list of rows from table Sets referencing given row from table Level
     */
    java.util.List<Sets> getSetsList(Level level);

    /**
     * Returns list of rows from table Sets referencing given row from table Level
     * @param level object representing row from referenced by rows from table Sets
     * @param orderBy column to sort by
     * @return list of rows from table Sets referencing given row from table Level
     */
    java.util.List<Sets> getSetsList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table Sets referencing given row from table Level
     * @param level object representing row from referenced by rows from table Sets
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table Sets referencing given row from table Level
     */
    java.util.List<Sets> getSetsList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table Sets referenced by given row from table ProgressDetails
     * @param progressdetails object representing row referencing row from table ProgressDetails
     * @return row from table Sets referenced by given row from table ProgressDetails
     */
    Sets getSets(Progressdetails progressdetails);

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
     * Inserts row into table Sets
     * @param sets sets to be inserted.
     * @return id number of new row
     */
    long insert(Sets sets);

    /**
     * Inserts collection of rows into table Sets
     * @param setss rows to be inserted
     */
    void insert(java.util.Collection<Sets> setss);

    /**
     * Updates row in table Sets
     * @param sets sets to be updated.
     */
    void update(Sets sets);

    /**
     * Updates collection of rows in table Sets
     * @param setss rows to be update
     */
    void update(java.util.Collection<Sets> setss);

    /**
     * Deletes row from table Sets
     * @param sets sets to be deleted.
     */
    void delete(Sets sets);

    /**
     * Deletes row from table Sets based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table Sets
     * @param setss rows to be deleted
     */
    void delete(java.util.Collection<Sets> setss);

    /**
     * Deletes all rows from table Sets matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

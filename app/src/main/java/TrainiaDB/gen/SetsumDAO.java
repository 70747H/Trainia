package TrainiaDB.gen;

public interface SetsumDAO extends
        TrainiaDB.runtime.dao.DAO<Setsum> {

    /**
     * Table expression class representing table SetSum
     */
    class SetsumTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        SetsumTableExpression() {
            super("SetSum");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Workouts_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("setSum", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table SetSum
     */
    class SetsumResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Setsum> {
        @Override
        public java.util.List<Setsum>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Setsum> ret = new java.util.LinkedList<Setsum>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Setsum obj = new Setsum();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setWorkoutsId(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setLevelId(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setSetsum(cursor.getInt(3));
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
    Class<Setsum> POJO_CLASS = Setsum.class;
    /**
     * Table expression for the table.
     */
    SetsumTableExpression TABLE_EXPRESSION = new SetsumTableExpression();
    /**
     * Result set handler for the table.
     */
    SetsumResultSetHandler RESULT_SET_HANDLER = new SetsumResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column Workouts_id
     */
    TrainiaDB.runtime.query.Column WORKOUTS_ID = TABLE_EXPRESSION.getColumn("Workouts_id");
    /**
     * Column object representing column Level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("Level_id");
    /**
     * Column object representing column setSum
     */
    TrainiaDB.runtime.query.Column SETSUM = TABLE_EXPRESSION.getColumn("setSum");

    /**
     * Returns all rows from table SetSum
     * @return all rows from table funkcja.
     */
    java.util.List<Setsum> getSetsumList();

    /**
     * Returns all rows from table SetSum
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Setsum> getSetsumList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table SetSum
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Setsum> getSetsumList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table SetSum matching given where clause
     * @param where where clause
     * @return all rows from table SetSum matching given where clause
     */
    java.util.List<Setsum> getSetsumList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table SetSum matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table SetSum matching given where clause
     */
    java.util.List<Setsum> getSetsumList(TrainiaDB.runtime.query.LExp where,
                                         TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table SetSum matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table SetSum matching given where clause
     */
    java.util.List<Setsum> getSetsumList(TrainiaDB.runtime.query.LExp where,
                                         TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table SetSum based on value of primary key
     * @return row from table SetSum
     */
    Setsum getById(Integer id);

    /**
     * Returns list of rows from table SetSum referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table SetSum
     * @return list of rows from table SetSum referencing given row from table Workouts
     */
    java.util.List<Setsum> getSetsumList(Workouts workouts);

    /**
     * Returns list of rows from table SetSum referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table SetSum
     * @param orderBy column to sort by
     * @return list of rows from table SetSum referencing given row from table Workouts
     */
    java.util.List<Setsum> getSetsumList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table SetSum referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table SetSum
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table SetSum referencing given row from table Workouts
     */
    java.util.List<Setsum> getSetsumList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table SetSum referencing given row from table Level
     * @param level object representing row from referenced by rows from table SetSum
     * @return list of rows from table SetSum referencing given row from table Level
     */
    java.util.List<Setsum> getSetsumList(Level level);

    /**
     * Returns list of rows from table SetSum referencing given row from table Level
     * @param level object representing row from referenced by rows from table SetSum
     * @param orderBy column to sort by
     * @return list of rows from table SetSum referencing given row from table Level
     */
    java.util.List<Setsum> getSetsumList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table SetSum referencing given row from table Level
     * @param level object representing row from referenced by rows from table SetSum
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table SetSum referencing given row from table Level
     */
    java.util.List<Setsum> getSetsumList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table SetSum
     * @param setsum setsum to be inserted.
     * @return id number of new row
     */
    long insert(Setsum setsum);

    /**
     * Inserts collection of rows into table SetSum
     * @param setsums rows to be inserted
     */
    void insert(java.util.Collection<Setsum> setsums);

    /**
     * Updates row in table SetSum
     * @param setsum setsum to be updated.
     */
    void update(Setsum setsum);

    /**
     * Updates collection of rows in table SetSum
     * @param setsums rows to be update
     */
    void update(java.util.Collection<Setsum> setsums);

    /**
     * Deletes row from table SetSum
     * @param setsum setsum to be deleted.
     */
    void delete(Setsum setsum);

    /**
     * Deletes row from table SetSum based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table SetSum
     * @param setsums rows to be deleted
     */
    void delete(java.util.Collection<Setsum> setsums);

    /**
     * Deletes all rows from table SetSum matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

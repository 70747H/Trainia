package TrainiaDB.gen;

public interface LevelDAO extends
        TrainiaDB.runtime.dao.DAO<Level> {

    /**
     * Table expression class representing table Level
     */
    class LevelTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        LevelTableExpression() {
            super("Level");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("level_name", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
        }
    }

    /**
     * Result set handler class for table Level
     */
    class LevelResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Level> {
        @Override
        public java.util.List<Level>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Level> ret = new java.util.LinkedList<Level>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Level obj = new Level();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setLevelName(cursor.getString(1));
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
    Class<Level> POJO_CLASS = Level.class;
    /**
     * Table expression for the table.
     */
    LevelTableExpression TABLE_EXPRESSION = new LevelTableExpression();
    /**
     * Result set handler for the table.
     */
    LevelResultSetHandler RESULT_SET_HANDLER = new LevelResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column level_name
     */
    TrainiaDB.runtime.query.Column LEVEL_NAME = TABLE_EXPRESSION.getColumn("level_name");

    /**
     * Returns all rows from table Level
     * @return all rows from table funkcja.
     */
    java.util.List<Level> getLevelList();

    /**
     * Returns all rows from table Level
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Level> getLevelList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Level
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Level> getLevelList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table Level matching given where clause
     * @param where where clause
     * @return all rows from table Level matching given where clause
     */
    java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table Level matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table Level matching given where clause
     */
    java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where,
                                       TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table Level matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table Level matching given where clause
     */
    java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where,
                                       TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table Level based on value of primary key
     * @return row from table Level
     */
    Level getById(Integer id);

    /**
     * Returns row from table Level referenced by given row from table Sets
     * @param sets object representing row referencing row from table Sets
     * @return row from table Level referenced by given row from table Sets
     */
    Level getLevel(Sets sets);

    /**
     * Returns row from table Level referenced by given row from table SetSum
     * @param setsum object representing row referencing row from table SetSum
     * @return row from table Level referenced by given row from table SetSum
     */
    Level getLevel(Setsum setsum);

    /**
     * Returns row from table Level referenced by given row from table workoutLevel
     * @param workoutlevel object representing row referencing row from table workoutLevel
     * @return row from table Level referenced by given row from table workoutLevel
     */
    Level getLevel(Workoutlevel workoutlevel);

    /**
     * Returns row from table Level referenced by given row from table workoutState
     * @param workoutstate object representing row referencing row from table workoutState
     * @return row from table Level referenced by given row from table workoutState
     */
    Level getLevel(Workoutstate workoutstate);

    /**
     * Returns row from table Level referenced by given row from table Log
     * @param log object representing row referencing row from table Log
     * @return row from table Level referenced by given row from table Log
     */
    Level getLevel(Log log);

    /**
     * Returns row from table Level referenced by given row from table ProgressDetails
     * @param progressdetails object representing row referencing row from table ProgressDetails
     * @return row from table Level referenced by given row from table ProgressDetails
     */
    Level getLevel(Progressdetails progressdetails);

    /**
     * Returns row from table Level referenced by given row from table wlakingSchedule
     * @param wlakingschedule object representing row referencing row from table wlakingSchedule
     * @return row from table Level referenced by given row from table wlakingSchedule
     */
    Level getLevel(Wlakingschedule wlakingschedule);

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
     * Inserts row into table Level
     * @param level level to be inserted.
     * @return id number of new row
     */
    long insert(Level level);

    /**
     * Inserts collection of rows into table Level
     * @param levels rows to be inserted
     */
    void insert(java.util.Collection<Level> levels);

    /**
     * Updates row in table Level
     * @param level level to be updated.
     */
    void update(Level level);

    /**
     * Updates collection of rows in table Level
     * @param levels rows to be update
     */
    void update(java.util.Collection<Level> levels);

    /**
     * Deletes row from table Level
     * @param level level to be deleted.
     */
    void delete(Level level);

    /**
     * Deletes row from table Level based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table Level
     * @param levels rows to be deleted
     */
    void delete(java.util.Collection<Level> levels);

    /**
     * Deletes all rows from table Level matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

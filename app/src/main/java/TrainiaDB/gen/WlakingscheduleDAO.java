package TrainiaDB.gen;

public interface WlakingscheduleDAO extends
        TrainiaDB.runtime.dao.DAO<Wlakingschedule> {

    /**
     * Table expression class representing table wlakingSchedule
     */
    class WlakingscheduleTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        WlakingscheduleTableExpression() {
            super("wlakingSchedule");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("weekNo", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("walksperWeek", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("distance", TrainiaDB.runtime.util.SQLiteType.NUMERIC, true);
            addColumn("warmUp", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("minutesWalking", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("coolDown", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table wlakingSchedule
     */
    class WlakingscheduleResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Wlakingschedule> {
        @Override
        public java.util.List<Wlakingschedule>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Wlakingschedule> ret = new java.util.LinkedList<Wlakingschedule>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Wlakingschedule obj = new Wlakingschedule();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setWeekno(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setWalksperweek(cursor.getString(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setDistance(cursor.getFloat(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setWarmup(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setMinuteswalking(cursor.getInt(5));
                }
                if (!cursor.isNull(6)) {
                    obj.setCooldown(cursor.getInt(6));
                }
                if (!cursor.isNull(7)) {
                    obj.setLevelId(cursor.getInt(7));
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
    Class<Wlakingschedule> POJO_CLASS = Wlakingschedule.class;
    /**
     * Table expression for the table.
     */
    WlakingscheduleTableExpression TABLE_EXPRESSION = new WlakingscheduleTableExpression();
    /**
     * Result set handler for the table.
     */
    WlakingscheduleResultSetHandler RESULT_SET_HANDLER = new WlakingscheduleResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column weekNo
     */
    TrainiaDB.runtime.query.Column WEEKNO = TABLE_EXPRESSION.getColumn("weekNo");
    /**
     * Column object representing column walksperWeek
     */
    TrainiaDB.runtime.query.Column WALKSPERWEEK = TABLE_EXPRESSION.getColumn("walksperWeek");
    /**
     * Column object representing column distance
     */
    TrainiaDB.runtime.query.Column DISTANCE = TABLE_EXPRESSION.getColumn("distance");
    /**
     * Column object representing column warmUp
     */
    TrainiaDB.runtime.query.Column WARMUP = TABLE_EXPRESSION.getColumn("warmUp");
    /**
     * Column object representing column minutesWalking
     */
    TrainiaDB.runtime.query.Column MINUTESWALKING = TABLE_EXPRESSION.getColumn("minutesWalking");
    /**
     * Column object representing column coolDown
     */
    TrainiaDB.runtime.query.Column COOLDOWN = TABLE_EXPRESSION.getColumn("coolDown");
    /**
     * Column object representing column Level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("Level_id");

    /**
     * Returns all rows from table wlakingSchedule
     * @return all rows from table funkcja.
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList();

    /**
     * Returns all rows from table wlakingSchedule
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table wlakingSchedule
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table wlakingSchedule matching given where clause
     * @param where where clause
     * @return all rows from table wlakingSchedule matching given where clause
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table wlakingSchedule matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table wlakingSchedule matching given where clause
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table wlakingSchedule matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table wlakingSchedule matching given where clause
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table wlakingSchedule based on value of primary key
     * @return row from table wlakingSchedule
     */
    Wlakingschedule getById(Integer id);

    /**
     * Returns list of rows from table wlakingSchedule referencing given row from table Level
     * @param level object representing row from referenced by rows from table wlakingSchedule
     * @return list of rows from table wlakingSchedule referencing given row from table Level
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(Level level);

    /**
     * Returns list of rows from table wlakingSchedule referencing given row from table Level
     * @param level object representing row from referenced by rows from table wlakingSchedule
     * @param orderBy column to sort by
     * @return list of rows from table wlakingSchedule referencing given row from table Level
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table wlakingSchedule referencing given row from table Level
     * @param level object representing row from referenced by rows from table wlakingSchedule
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table wlakingSchedule referencing given row from table Level
     */
    java.util.List<Wlakingschedule> getWlakingscheduleList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table wlakingSchedule referenced by given row from table walkingProgress
     * @param walkingprogress object representing row referencing row from table walkingProgress
     * @return row from table wlakingSchedule referenced by given row from table walkingProgress
     */
    Wlakingschedule getWlakingschedule(Walkingprogress walkingprogress);

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
     * Inserts row into table wlakingSchedule
     * @param wlakingschedule wlakingschedule to be inserted.
     * @return id number of new row
     */
    long insert(Wlakingschedule wlakingschedule);

    /**
     * Inserts collection of rows into table wlakingSchedule
     * @param wlakingschedules rows to be inserted
     */
    void insert(java.util.Collection<Wlakingschedule> wlakingschedules);

    /**
     * Updates row in table wlakingSchedule
     * @param wlakingschedule wlakingschedule to be updated.
     */
    void update(Wlakingschedule wlakingschedule);

    /**
     * Updates collection of rows in table wlakingSchedule
     * @param wlakingschedules rows to be update
     */
    void update(java.util.Collection<Wlakingschedule> wlakingschedules);

    /**
     * Deletes row from table wlakingSchedule
     * @param wlakingschedule wlakingschedule to be deleted.
     */
    void delete(Wlakingschedule wlakingschedule);

    /**
     * Deletes row from table wlakingSchedule based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table wlakingSchedule
     * @param wlakingschedules rows to be deleted
     */
    void delete(java.util.Collection<Wlakingschedule> wlakingschedules);

    /**
     * Deletes all rows from table wlakingSchedule matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

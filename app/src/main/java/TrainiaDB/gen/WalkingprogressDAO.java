package TrainiaDB.gen;

public interface WalkingprogressDAO extends
        TrainiaDB.runtime.dao.DAO<Walkingprogress> {

    /**
     * Table expression class representing table walkingProgress
     */
    class WalkingprogressTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        WalkingprogressTableExpression() {
            super("walkingProgress");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("stepsNo", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("calorie", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("wlakingSchedule_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("User_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("dayNo", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table walkingProgress
     */
    class WalkingprogressResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Walkingprogress> {
        @Override
        public java.util.List<Walkingprogress>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Walkingprogress> ret = new java.util.LinkedList<Walkingprogress>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Walkingprogress obj = new Walkingprogress();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setStepsno(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setCalorie(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setWlakingscheduleId(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setUserId(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setDayno(cursor.getInt(5));
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
    Class<Walkingprogress> POJO_CLASS = Walkingprogress.class;
    /**
     * Table expression for the table.
     */
    WalkingprogressTableExpression TABLE_EXPRESSION = new WalkingprogressTableExpression();
    /**
     * Result set handler for the table.
     */
    WalkingprogressResultSetHandler RESULT_SET_HANDLER = new WalkingprogressResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column stepsNo
     */
    TrainiaDB.runtime.query.Column STEPSNO = TABLE_EXPRESSION.getColumn("stepsNo");
    /**
     * Column object representing column calorie
     */
    TrainiaDB.runtime.query.Column CALORIE = TABLE_EXPRESSION.getColumn("calorie");
    /**
     * Column object representing column wlakingSchedule_id
     */
    TrainiaDB.runtime.query.Column WLAKINGSCHEDULE_ID = TABLE_EXPRESSION.getColumn("wlakingSchedule_id");
    /**
     * Column object representing column User_id
     */
    TrainiaDB.runtime.query.Column USER_ID = TABLE_EXPRESSION.getColumn("User_id");
    /**
     * Column object representing column dayNo
     */
    TrainiaDB.runtime.query.Column DAYNO = TABLE_EXPRESSION.getColumn("dayNo");

    /**
     * Returns all rows from table walkingProgress
     * @return all rows from table funkcja.
     */
    java.util.List<Walkingprogress> getWalkingprogressList();

    /**
     * Returns all rows from table walkingProgress
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table walkingProgress
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table walkingProgress matching given where clause
     * @param where where clause
     * @return all rows from table walkingProgress matching given where clause
     */
    java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table walkingProgress matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table walkingProgress matching given where clause
     */
    java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table walkingProgress matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table walkingProgress matching given where clause
     */
    java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table walkingProgress based on value of primary key
     * @return row from table walkingProgress
     */
    Walkingprogress getById(Integer id);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table wlakingSchedule
     * @param wlakingschedule object representing row from referenced by rows from table walkingProgress
     * @return list of rows from table walkingProgress referencing given row from table wlakingSchedule
     */
    java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table wlakingSchedule
     * @param wlakingschedule object representing row from referenced by rows from table walkingProgress
     * @param orderBy column to sort by
     * @return list of rows from table walkingProgress referencing given row from table wlakingSchedule
     */
    java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table wlakingSchedule
     * @param wlakingschedule object representing row from referenced by rows from table walkingProgress
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table walkingProgress referencing given row from table wlakingSchedule
     */
    java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table User
     * @param user object representing row from referenced by rows from table walkingProgress
     * @return list of rows from table walkingProgress referencing given row from table User
     */
    java.util.List<Walkingprogress> getWalkingprogressList(User user);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table User
     * @param user object representing row from referenced by rows from table walkingProgress
     * @param orderBy column to sort by
     * @return list of rows from table walkingProgress referencing given row from table User
     */
    java.util.List<Walkingprogress> getWalkingprogressList(User user, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table walkingProgress referencing given row from table User
     * @param user object representing row from referenced by rows from table walkingProgress
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table walkingProgress referencing given row from table User
     */
    java.util.List<Walkingprogress> getWalkingprogressList(User user, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table walkingProgress
     * @param walkingprogress walkingprogress to be inserted.
     * @return id number of new row
     */
    long insert(Walkingprogress walkingprogress);

    /**
     * Inserts collection of rows into table walkingProgress
     * @param walkingprogresss rows to be inserted
     */
    void insert(java.util.Collection<Walkingprogress> walkingprogresss);

    /**
     * Updates row in table walkingProgress
     * @param walkingprogress walkingprogress to be updated.
     */
    void update(Walkingprogress walkingprogress);

    /**
     * Updates collection of rows in table walkingProgress
     * @param walkingprogresss rows to be update
     */
    void update(java.util.Collection<Walkingprogress> walkingprogresss);

    /**
     * Deletes row from table walkingProgress
     * @param walkingprogress walkingprogress to be deleted.
     */
    void delete(Walkingprogress walkingprogress);

    /**
     * Deletes row from table walkingProgress based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table walkingProgress
     * @param walkingprogresss rows to be deleted
     */
    void delete(java.util.Collection<Walkingprogress> walkingprogresss);

    /**
     * Deletes all rows from table walkingProgress matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

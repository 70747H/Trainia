package TrainiaDB.gen;

public interface ProgressdetailsDAO extends
        TrainiaDB.runtime.dao.DAO<Progressdetails> {

    /**
     * Table expression class representing table ProgressDetails
     */
    class ProgressdetailsTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        ProgressdetailsTableExpression() {
            super("ProgressDetails");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Workouts_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Sets_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("score", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("calorie", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("User_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("Level_id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("dailyDate", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
        }
    }

    /**
     * Result set handler class for table ProgressDetails
     */
    class ProgressdetailsResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Progressdetails> {
        @Override
        public java.util.List<Progressdetails>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Progressdetails> ret = new java.util.LinkedList<Progressdetails>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Progressdetails obj = new Progressdetails();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setWorkoutsId(cursor.getInt(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setSetsId(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setScore(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setCalorie(cursor.getInt(4));
                }
                if (!cursor.isNull(5)) {
                    obj.setUserId(cursor.getInt(5));
                }
                if (!cursor.isNull(6)) {
                    obj.setLevelId(cursor.getInt(6));
                }
                if (!cursor.isNull(7)) {
                    obj.setDailydate(new java.sql.Date(cursor.getLong(7)));
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
    Class<Progressdetails> POJO_CLASS = Progressdetails.class;
    /**
     * Table expression for the table.
     */
    ProgressdetailsTableExpression TABLE_EXPRESSION = new ProgressdetailsTableExpression();
    /**
     * Result set handler for the table.
     */
    ProgressdetailsResultSetHandler RESULT_SET_HANDLER = new ProgressdetailsResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column Workouts_id
     */
    TrainiaDB.runtime.query.Column WORKOUTS_ID = TABLE_EXPRESSION.getColumn("Workouts_id");
    /**
     * Column object representing column Sets_id
     */
    TrainiaDB.runtime.query.Column SETS_ID = TABLE_EXPRESSION.getColumn("Sets_id");
    /**
     * Column object representing column score
     */
    TrainiaDB.runtime.query.Column SCORE = TABLE_EXPRESSION.getColumn("score");
    /**
     * Column object representing column calorie
     */
    TrainiaDB.runtime.query.Column CALORIE = TABLE_EXPRESSION.getColumn("calorie");
    /**
     * Column object representing column User_id
     */
    TrainiaDB.runtime.query.Column USER_ID = TABLE_EXPRESSION.getColumn("User_id");
    /**
     * Column object representing column Level_id
     */
    TrainiaDB.runtime.query.Column LEVEL_ID = TABLE_EXPRESSION.getColumn("Level_id");
    /**
     * Column object representing column dailyDate
     */
    TrainiaDB.runtime.query.Column DAILYDATE = TABLE_EXPRESSION.getColumn("dailyDate");

    /**
     * Returns all rows from table ProgressDetails
     * @return all rows from table funkcja.
     */
    java.util.List<Progressdetails> getProgressdetailsList();

    /**
     * Returns all rows from table ProgressDetails
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Progressdetails> getProgressdetailsList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table ProgressDetails
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Progressdetails> getProgressdetailsList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table ProgressDetails matching given where clause
     * @param where where clause
     * @return all rows from table ProgressDetails matching given where clause
     */
    java.util.List<Progressdetails> getProgressdetailsList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table ProgressDetails matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table ProgressDetails matching given where clause
     */
    java.util.List<Progressdetails> getProgressdetailsList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table ProgressDetails matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table ProgressDetails matching given where clause
     */
    java.util.List<Progressdetails> getProgressdetailsList(TrainiaDB.runtime.query.LExp where,
                                                           TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table ProgressDetails based on value of primary key
     * @return row from table ProgressDetails
     */
    Progressdetails getById(Integer id);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table ProgressDetails
     * @return list of rows from table ProgressDetails referencing given row from table Workouts
     */
    java.util.List<Progressdetails> getProgressdetailsList(Workouts workouts);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @return list of rows from table ProgressDetails referencing given row from table Workouts
     */
    java.util.List<Progressdetails> getProgressdetailsList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Workouts
     * @param workouts object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table ProgressDetails referencing given row from table Workouts
     */
    java.util.List<Progressdetails> getProgressdetailsList(Workouts workouts, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Sets
     * @param sets object representing row from referenced by rows from table ProgressDetails
     * @return list of rows from table ProgressDetails referencing given row from table Sets
     */
    java.util.List<Progressdetails> getProgressdetailsList(Sets sets);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Sets
     * @param sets object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @return list of rows from table ProgressDetails referencing given row from table Sets
     */
    java.util.List<Progressdetails> getProgressdetailsList(Sets sets, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Sets
     * @param sets object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table ProgressDetails referencing given row from table Sets
     */
    java.util.List<Progressdetails> getProgressdetailsList(Sets sets, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table User
     * @param user object representing row from referenced by rows from table ProgressDetails
     * @return list of rows from table ProgressDetails referencing given row from table User
     */
    java.util.List<Progressdetails> getProgressdetailsList(User user);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table User
     * @param user object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @return list of rows from table ProgressDetails referencing given row from table User
     */
    java.util.List<Progressdetails> getProgressdetailsList(User user, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table User
     * @param user object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table ProgressDetails referencing given row from table User
     */
    java.util.List<Progressdetails> getProgressdetailsList(User user, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Level
     * @param level object representing row from referenced by rows from table ProgressDetails
     * @return list of rows from table ProgressDetails referencing given row from table Level
     */
    java.util.List<Progressdetails> getProgressdetailsList(Level level);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Level
     * @param level object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @return list of rows from table ProgressDetails referencing given row from table Level
     */
    java.util.List<Progressdetails> getProgressdetailsList(Level level, TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns list of rows from table ProgressDetails referencing given row from table Level
     * @param level object representing row from referenced by rows from table ProgressDetails
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return list of rows from table ProgressDetails referencing given row from table Level
     */
    java.util.List<Progressdetails> getProgressdetailsList(Level level, TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

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
     * Inserts row into table ProgressDetails
     * @param progressdetails progressdetails to be inserted.
     * @return id number of new row
     */
    long insert(Progressdetails progressdetails);

    /**
     * Inserts collection of rows into table ProgressDetails
     * @param progressdetailss rows to be inserted
     */
    void insert(java.util.Collection<Progressdetails> progressdetailss);

    /**
     * Updates row in table ProgressDetails
     * @param progressdetails progressdetails to be updated.
     */
    void update(Progressdetails progressdetails);

    /**
     * Updates collection of rows in table ProgressDetails
     * @param progressdetailss rows to be update
     */
    void update(java.util.Collection<Progressdetails> progressdetailss);

    /**
     * Deletes row from table ProgressDetails
     * @param progressdetails progressdetails to be deleted.
     */
    void delete(Progressdetails progressdetails);

    /**
     * Deletes row from table ProgressDetails based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table ProgressDetails
     * @param progressdetailss rows to be deleted
     */
    void delete(java.util.Collection<Progressdetails> progressdetailss);

    /**
     * Deletes all rows from table ProgressDetails matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

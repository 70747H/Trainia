package TrainiaDB.gen;

public interface ActivitylevelDAO extends
        TrainiaDB.runtime.dao.DAO<Activitylevel> {

    /**
     * Table expression class representing table ActivityLevel
     */
    class ActivitylevelTableExpression extends TrainiaDB.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        ActivitylevelTableExpression() {
            super("ActivityLevel");
            addColumn("id", TrainiaDB.runtime.util.SQLiteType.INTEGER, true);
            addColumn("ActivityLevel_name", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
            addColumn("value", TrainiaDB.runtime.util.SQLiteType.NUMERIC, true);
            addColumn("description", TrainiaDB.runtime.util.SQLiteType.TEXT, true);
        }
    }

    /**
     * Result set handler class for table ActivityLevel
     */
    class ActivitylevelResultSetHandler implements
            TrainiaDB.runtime.util.ResultSetHandler<Activitylevel> {
        @Override
        public java.util.List<Activitylevel>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Activitylevel> ret = new java.util.LinkedList<Activitylevel>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Activitylevel obj = new Activitylevel();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setActivitylevelName(cursor.getString(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setValue(cursor.getFloat(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setDescription(cursor.getString(3));
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
    Class<Activitylevel> POJO_CLASS = Activitylevel.class;
    /**
     * Table expression for the table.
     */
    ActivitylevelTableExpression TABLE_EXPRESSION = new ActivitylevelTableExpression();
    /**
     * Result set handler for the table.
     */
    ActivitylevelResultSetHandler RESULT_SET_HANDLER = new ActivitylevelResultSetHandler();
    /**
     * Column object representing column id
     */
    TrainiaDB.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column ActivityLevel_name
     */
    TrainiaDB.runtime.query.Column ACTIVITYLEVEL_NAME = TABLE_EXPRESSION.getColumn("ActivityLevel_name");
    /**
     * Column object representing column value
     */
    TrainiaDB.runtime.query.Column VALUE = TABLE_EXPRESSION.getColumn("value");
    /**
     * Column object representing column description
     */
    TrainiaDB.runtime.query.Column DESCRIPTION = TABLE_EXPRESSION.getColumn("description");

    /**
     * Returns all rows from table ActivityLevel
     * @return all rows from table funkcja.
     */
    java.util.List<Activitylevel> getActivitylevelList();

    /**
     * Returns all rows from table ActivityLevel
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Activitylevel> getActivitylevelList(TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table ActivityLevel
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Activitylevel> getActivitylevelList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table ActivityLevel matching given where clause
     * @param where where clause
     * @return all rows from table ActivityLevel matching given where clause
     */
    java.util.List<Activitylevel> getActivitylevelList(TrainiaDB.runtime.query.LExp where);

    /**
     * Returns all rows from table ActivityLevel matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table ActivityLevel matching given where clause
     */
    java.util.List<Activitylevel> getActivitylevelList(TrainiaDB.runtime.query.LExp where,
                                                       TrainiaDB.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table ActivityLevel matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table ActivityLevel matching given where clause
     */
    java.util.List<Activitylevel> getActivitylevelList(TrainiaDB.runtime.query.LExp where,
                                                       TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table ActivityLevel based on value of primary key
     * @return row from table ActivityLevel
     */
    Activitylevel getById(Integer id);

    /**
     * Returns row from table ActivityLevel referenced by given row from table User
     * @param user object representing row referencing row from table User
     * @return row from table ActivityLevel referenced by given row from table User
     */
    Activitylevel getActivitylevel(User user);

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
     * Inserts row into table ActivityLevel
     * @param activitylevel activitylevel to be inserted.
     * @return id number of new row
     */
    long insert(Activitylevel activitylevel);

    /**
     * Inserts collection of rows into table ActivityLevel
     * @param activitylevels rows to be inserted
     */
    void insert(java.util.Collection<Activitylevel> activitylevels);

    /**
     * Updates row in table ActivityLevel
     * @param activitylevel activitylevel to be updated.
     */
    void update(Activitylevel activitylevel);

    /**
     * Updates collection of rows in table ActivityLevel
     * @param activitylevels rows to be update
     */
    void update(java.util.Collection<Activitylevel> activitylevels);

    /**
     * Deletes row from table ActivityLevel
     * @param activitylevel activitylevel to be deleted.
     */
    void delete(Activitylevel activitylevel);

    /**
     * Deletes row from table ActivityLevel based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table ActivityLevel
     * @param activitylevels rows to be deleted
     */
    void delete(java.util.Collection<Activitylevel> activitylevels);

    /**
     * Deletes all rows from table ActivityLevel matching given where clause
     * @param where where clause
     */
    void delete(TrainiaDB.runtime.query.LExp where);
}

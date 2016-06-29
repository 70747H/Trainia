package TrainiaDB.gen;

public class WalkingprogressDAOImpl
        extends TrainiaDB.runtime.dao.BaseDAO<Walkingprogress>
        implements WalkingprogressDAO {

    public WalkingprogressDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public WalkingprogressDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource,
            TrainiaDB.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Walkingprogress> getPojoClass() {
        return POJO_CLASS;
    }

    @Override
    public TrainiaDB.runtime.query.TableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    @Override
    public TrainiaDB.runtime.util.ResultSetHandler getResultSetHandler() {
        return RESULT_SET_HANDLER;
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList() {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Walkingprogress getById(Integer id) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(id));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Walkingprogress> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WLAKINGSCHEDULE_ID.eq(wlakingschedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WLAKINGSCHEDULE_ID.eq(wlakingschedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(Wlakingschedule wlakingschedule,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WLAKINGSCHEDULE_ID.eq(wlakingschedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(User user) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(USER_ID.eq(user.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(User user,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(USER_ID.eq(user.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(User user,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(USER_ID.eq(user.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Walkingprogress> getWalkingprogressList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Walkingprogress>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Long getCount() {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION,
                TrainiaDB.runtime.query.AExp.fun("COUNT",
                        TrainiaDB.runtime.query.AExp.ASTERISK));
        java.util.List<Long> list = select(query, new TrainiaDB.runtime.util.handlers.LongResultSetHandler()).getObjectList();
        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            throw new RuntimeException("Cannot retrieve count() method result");
        }
    }

    @Override
    public Long getCount(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION,
                TrainiaDB.runtime.query.AExp.fun("COUNT",
                        TrainiaDB.runtime.query.AExp.ASTERISK));
        query.setWhere(where);
        java.util.List<Long> list = select(query, new TrainiaDB.runtime.util.handlers.LongResultSetHandler()).getObjectList();
        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            throw new RuntimeException("Cannot retrieve count() method result");
        }
    }

    @Override
    public long insert(Walkingprogress walkingprogress) {
        TrainiaDB.runtime.query.InsertStatement query =
                new TrainiaDB.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, walkingprogress.getId());
        values.put(STEPSNO, walkingprogress.getStepsno());
        values.put(CALORIE, walkingprogress.getCalorie());
        values.put(WLAKINGSCHEDULE_ID, walkingprogress.getWlakingscheduleId());
        values.put(USER_ID, walkingprogress.getUserId());
        values.put(DAYNO, walkingprogress.getDayno());

        query.setValues(values);

        long id = insert(query);

        walkingprogress.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<Walkingprogress> walkingprogresss) {
        for(Walkingprogress obj : walkingprogresss) {
            insert(obj);
        }
    }

    @Override
    public void update(Walkingprogress walkingprogress) {
        TrainiaDB.runtime.query.UpdateStatement query =
                new TrainiaDB.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, walkingprogress.getId());
        values.put(STEPSNO, walkingprogress.getStepsno());
        values.put(CALORIE, walkingprogress.getCalorie());
        values.put(WLAKINGSCHEDULE_ID, walkingprogress.getWlakingscheduleId());
        values.put(USER_ID, walkingprogress.getUserId());
        values.put(DAYNO, walkingprogress.getDayno());

        query.setValues(values);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WalkingprogressDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(walkingprogress.getId())));
        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Walkingprogress> walkingprogresss) {
        for(Walkingprogress obj : walkingprogresss) {
            update(obj);
        }
    }

    @Override
    public void delete(Walkingprogress walkingprogress) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WalkingprogressDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(walkingprogress.getId())));
        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        delete(query);
    }

    @Override
    public void delete(Integer id) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(id));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);
        delete(query);
    }

    @Override
    public void delete(java.util.Collection<Walkingprogress> walkingprogresss) {
        for(Walkingprogress obj : walkingprogresss) {
            delete(obj);
        }
    }

    @Override
    public void delete(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        query.setWhere(where);

        delete(query);
    }
}

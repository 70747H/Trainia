package TrainiaDB.gen;

public class WlakingscheduleDAOImpl
        extends TrainiaDB.runtime.dao.BaseDAO<Wlakingschedule>
        implements WlakingscheduleDAO {

    public WlakingscheduleDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public WlakingscheduleDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource,
            TrainiaDB.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Wlakingschedule> getPojoClass() {
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
    public java.util.List<Wlakingschedule> getWlakingscheduleList() {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Wlakingschedule getById(Integer id) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(id));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Wlakingschedule> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Wlakingschedule getWlakingschedule(Walkingprogress walkingprogress) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(walkingprogress.getWlakingscheduleId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Wlakingschedule> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(Level level) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(Level level,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(Level level,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Wlakingschedule> getWlakingscheduleList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Wlakingschedule>
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
    public long insert(Wlakingschedule wlakingschedule) {
        TrainiaDB.runtime.query.InsertStatement query =
                new TrainiaDB.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, wlakingschedule.getId());
        values.put(WEEKNO, wlakingschedule.getWeekno());
        values.put(WALKSPERWEEK, wlakingschedule.getWalksperweek());
        values.put(DISTANCE, wlakingschedule.getDistance());
        values.put(WARMUP, wlakingschedule.getWarmup());
        values.put(MINUTESWALKING, wlakingschedule.getMinuteswalking());
        values.put(COOLDOWN, wlakingschedule.getCooldown());
        values.put(LEVEL_ID, wlakingschedule.getLevelId());

        query.setValues(values);

        long id = insert(query);

        wlakingschedule.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<Wlakingschedule> wlakingschedules) {
        for(Wlakingschedule obj : wlakingschedules) {
            insert(obj);
        }
    }

    @Override
    public void update(Wlakingschedule wlakingschedule) {
        TrainiaDB.runtime.query.UpdateStatement query =
                new TrainiaDB.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, wlakingschedule.getId());
        values.put(WEEKNO, wlakingschedule.getWeekno());
        values.put(WALKSPERWEEK, wlakingschedule.getWalksperweek());
        values.put(DISTANCE, wlakingschedule.getDistance());
        values.put(WARMUP, wlakingschedule.getWarmup());
        values.put(MINUTESWALKING, wlakingschedule.getMinuteswalking());
        values.put(COOLDOWN, wlakingschedule.getCooldown());
        values.put(LEVEL_ID, wlakingschedule.getLevelId());

        query.setValues(values);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WlakingscheduleDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(wlakingschedule.getId())));
        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Wlakingschedule> wlakingschedules) {
        for(Wlakingschedule obj : wlakingschedules) {
            update(obj);
        }
    }

    @Override
    public void delete(Wlakingschedule wlakingschedule) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WlakingscheduleDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(wlakingschedule.getId())));
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
    public void delete(java.util.Collection<Wlakingschedule> wlakingschedules) {
        for(Wlakingschedule obj : wlakingschedules) {
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

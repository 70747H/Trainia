package TrainiaDB.gen;

public class LevelDAOImpl
        extends TrainiaDB.runtime.dao.BaseDAO<Level>
        implements LevelDAO {

    public LevelDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public LevelDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource,
            TrainiaDB.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Level> getPojoClass() {
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
    public java.util.List<Level> getLevelList() {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Level> getLevelList(TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Level> getLevelList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Level getById(Integer id) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(id));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Sets sets) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(sets.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Setsum setsum) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(setsum.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Workoutlevel workoutlevel) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(workoutlevel.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Workoutstate workoutstate) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(workoutstate.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Log log) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(log.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Progressdetails progressdetails) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(progressdetails.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Level getLevel(Wlakingschedule wlakingschedule) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(wlakingschedule.getLevelId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Level> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Level> getLevelList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Level>
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
    public long insert(Level level) {
        TrainiaDB.runtime.query.InsertStatement query =
                new TrainiaDB.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, level.getId());
        values.put(LEVEL_NAME, level.getLevelName());

        query.setValues(values);

        long id = insert(query);

        level.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<Level> levels) {
        for(Level obj : levels) {
            insert(obj);
        }
    }

    @Override
    public void update(Level level) {
        TrainiaDB.runtime.query.UpdateStatement query =
                new TrainiaDB.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, level.getId());
        values.put(LEVEL_NAME, level.getLevelName());

        query.setValues(values);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(LevelDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(level.getId())));
        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Level> levels) {
        for(Level obj : levels) {
            update(obj);
        }
    }

    @Override
    public void delete(Level level) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(LevelDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(level.getId())));
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
    public void delete(java.util.Collection<Level> levels) {
        for(Level obj : levels) {
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

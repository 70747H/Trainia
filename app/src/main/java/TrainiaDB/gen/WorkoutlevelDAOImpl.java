package TrainiaDB.gen;

public class WorkoutlevelDAOImpl
        extends TrainiaDB.runtime.dao.BaseDAO<Workoutlevel>
        implements WorkoutlevelDAO {

    public WorkoutlevelDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public WorkoutlevelDAOImpl(TrainiaDB.runtime.util.SQLiteDataSource dataSource,
            TrainiaDB.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Workoutlevel> getPojoClass() {
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
    public java.util.List<Workoutlevel> getWorkoutlevelList() {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Workoutlevel getById(Integer id) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(ID.eq(id));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Workoutlevel> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WORKOUT_ID.eq(workouts.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WORKOUT_ID.eq(workouts.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Workouts workouts,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(WORKOUT_ID.eq(workouts.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Level level) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Level level,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Level level,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(LEVEL_ID.eq(level.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(SCHEDULE_ID.eq(schedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(SCHEDULE_ID.eq(schedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(Schedule schedule,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(SCHEDULE_ID.eq(schedule.getId()));

        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Workoutlevel> getWorkoutlevelList(TrainiaDB.runtime.query.LExp where,
            TrainiaDB.runtime.query.AExp orderBy, TrainiaDB.runtime.query.OrderByDirection asc) {
        TrainiaDB.runtime.query.SelectQuery query =
                new TrainiaDB.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

        TrainiaDB.runtime.dao.SelectObjectListResult<Workoutlevel>
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
    public long insert(Workoutlevel workoutlevel) {
        TrainiaDB.runtime.query.InsertStatement query =
                new TrainiaDB.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, workoutlevel.getId());
        values.put(REPS, workoutlevel.getReps());
        values.put(DAYS, workoutlevel.getDays());
        values.put(WORKOUT_ID, workoutlevel.getWorkoutId());
        values.put(LEVEL_ID, workoutlevel.getLevelId());
        values.put(SCHEDULE_ID, workoutlevel.getScheduleId());

        query.setValues(values);

        long id = insert(query);

        workoutlevel.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<Workoutlevel> workoutlevels) {
        for(Workoutlevel obj : workoutlevels) {
            insert(obj);
        }
    }

    @Override
    public void update(Workoutlevel workoutlevel) {
        TrainiaDB.runtime.query.UpdateStatement query =
                new TrainiaDB.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map<TrainiaDB.runtime.query.Column, Object> values =
                new java.util.HashMap<TrainiaDB.runtime.query.Column, Object>();

        values.put(ID, workoutlevel.getId());
        values.put(REPS, workoutlevel.getReps());
        values.put(DAYS, workoutlevel.getDays());
        values.put(WORKOUT_ID, workoutlevel.getWorkoutId());
        values.put(LEVEL_ID, workoutlevel.getLevelId());
        values.put(SCHEDULE_ID, workoutlevel.getScheduleId());

        query.setValues(values);

        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WorkoutlevelDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(workoutlevel.getId())));
        TrainiaDB.runtime.query.LExp where = TrainiaDB.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Workoutlevel> workoutlevels) {
        for(Workoutlevel obj : workoutlevels) {
            update(obj);
        }
    }

    @Override
    public void delete(Workoutlevel workoutlevel) {
        TrainiaDB.runtime.query.DeleteStatement query =
                new TrainiaDB.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List<TrainiaDB.runtime.query.LExp> lExps =
                new java.util.LinkedList<TrainiaDB.runtime.query.LExp>();

        lExps.add(TrainiaDB.runtime.query.LExp.eq(WorkoutlevelDAO.ID,
                TrainiaDB.runtime.query.AExp.exp(workoutlevel.getId())));
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
    public void delete(java.util.Collection<Workoutlevel> workoutlevels) {
        for(Workoutlevel obj : workoutlevels) {
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

package TrainiaDB.runtime.util.monitors;

import TrainiaDB.runtime.dao.DAO;
import TrainiaDB.runtime.query.Value;
import TrainiaDB.runtime.util.DAOMonitor;

import java.util.List;

/**
 * DAO monitor which does not log any information.
 */
public class EmptyDAOMonitor implements DAOMonitor {

    /**
     * Constructor.
     */
    public EmptyDAOMonitor() { }

    @Override
    public void delete(DAO<?> dao, String deleteStatement, List<Value> parameters) {
    }

    @Override
    public void insert(DAO<?> dao, String insertStatement, List<Value> parameters) {
    }

    @Override
    public void selectObjectList(DAO<?> dao, String queryString, List<Value> parameters) {
    }

    @Override
    public void update(DAO<?> dao, String updateStatement, List<Value> parameters) {
    }

}

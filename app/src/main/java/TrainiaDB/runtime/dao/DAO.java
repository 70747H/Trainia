package TrainiaDB.runtime.dao;


import android.database.Cursor;
import android.database.SQLException;
import TrainiaDB.runtime.query.DeleteStatement;
import TrainiaDB.runtime.query.InsertStatement;
import TrainiaDB.runtime.query.SelectQuery;
import TrainiaDB.runtime.query.TableExpression;
import TrainiaDB.runtime.query.UpdateStatement;
import TrainiaDB.runtime.util.DAOMonitor;
import TrainiaDB.runtime.util.ResultSetHandler;
import TrainiaDB.runtime.util.SQLiteDataSource;


/**
 * An interface of DAO objects.
 * @param <T> the type of objects this DAO is handling
 */
public interface DAO<T> {

    /**
     * Returns the table expression which represents this DAO's table.
     *
     * @return the table expression which represents this DAO's table.
     */
    TableExpression getTableExpression();

    /**
     * Returns the class of POJO objects this DAO is handling.
     * @return the class of POJO objects this DAO is handling.
     */
    Class<T> getPojoClass();

    /**
     * Returns the {@link ResultSetHandler} object this DAO is using while generating POJO objects.
     *
     * @return the {@link ResultSetHandler} object this DAO is using while generating POJO objects.
     */
    ResultSetHandler<T> getResultSetHandler();

    /**
     * Executes the specified <code>SELECT</code> query and returns a list of objects generated from
     * query results by the specified {@link ResultSetHandler} object.
     *
     * @param query SQL query
     * @param resultSetHandler object generating Java objects from SQL result
     * @return an object containing query result
     */
    <U> SelectObjectListResult<U> select(SelectQuery query, ResultSetHandler<U> resultSetHandler) throws SQLException;

    /**
     * Executes the specified <code>SELECT</code> query and returns Cursor.
     *
     * @param query SQL query
     * @return cursor returned by database
     */
    Cursor select(SelectQuery query);

    /**
     * Executes the specified <code>INSERT</code> statement. The method
     * logs the statement in the right way.
     *
     * @param insertStatement <code>INSERT</code> statement to execute.
     * @return number of rows which have been modified by the statement.
     */
    long insert(InsertStatement insertStatement) throws SQLException;

    /**
     * Executes the specified <code>UPDATE</code> statement. The method
     * logs the statement in the right way.
     *
     * @param updateStatement <code>UPDATE</code> statement to execute.
     * @return number of rows which have been modified by the statement.
     */
    int update(UpdateStatement updateStatement);

    /**
     * Executes the specified <code>DELETE</code> statement. The method
     * logs the statement in the right way.
     *
     * @param deleteStatement <code>DELETE</code> statement to execute.
     * @return number of rows which have been modified by the statement.
     */
    int delete(DeleteStatement deleteStatement);

    /**
     * Returns the data source used by this DAO object.
     * @return the data source used by this DAO object.
     */
    SQLiteDataSource getDataSource();

    /**
     * Returns the DAO monitor used by this DAO object.
     * @return the DAO monitor used by this DAO object.
     */
    DAOMonitor getDAOMonitor();

    /**
     * Sets the monitor used by this DAO object.
     * @param daoMonitor the  monitor used by this DAO object.
     */
    void setDAOMonitor(DAOMonitor daoMonitor);

}

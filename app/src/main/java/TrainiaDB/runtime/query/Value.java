package TrainiaDB.runtime.query;

import java.util.List;

/**
 * Represents literal arithmetical expression.
 */
public class Value extends AExp {

    /**
     * Value of the expression
     */
    private Object value;

    /**
     * SQLite type of the value
     */
    private TrainiaDB.runtime.util.SQLiteType type;

    public Value(Object value, TrainiaDB.runtime.util.SQLiteType type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public void build(StringBuilder sb, List<Value> objects) {
        sb.append(QUESTION_MARK);
        objects.add(this);
    }

    public Object getValue() {
        return value;
    }

    public TrainiaDB.runtime.util.SQLiteType getType() {
        return type;
    }
}

import java.sql.*;

public class BankTransaction {
    public void transfer(Connection conn, int fromId, int toId, int amount) throws SQLException {
        conn.setAutoCommit(false);
        try {
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debit.setInt(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();
                credit.setInt(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();
                conn.commit();
            }
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
}

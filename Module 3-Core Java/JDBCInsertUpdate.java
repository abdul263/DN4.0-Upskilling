import java.sql.*;
public class JDBCInsertUpdate {
    public static void main(String[] args) {
        String url = " ";//<-insert your database url here

        try (Connection conn = DriverManager.getConnection(url)) {
            // Insert
            String insertSQL = "INSERT INTO students(id, name) VALUES (?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(insertSQL);
            psInsert.setInt(1, 1);
            psInsert.setString(2, "John Doe");
            psInsert.executeUpdate();

            // Update
            String updateSQL = "UPDATE students SET name=? WHERE id=?";
            PreparedStatement psUpdate = conn.prepareStatement(updateSQL);
            psUpdate.setString(1, "Jane Doe");
            psUpdate.setInt(2, 1);
            psUpdate.executeUpdate();

            System.out.println("Insert and Update completed.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
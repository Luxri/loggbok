
import java.util.Date;

public class LogEntry {
    Date createdAt;
    Date updatedAt;
    String message;
    // Optional: ArrayList<>
    public LogEntry(String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public String getMessage() {
        return message;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "\n LogEntry{" + "\n Inlägg skapades = " + createdAt + ", \n Inlägget uppdaterades = " + updatedAt + ", \n Medelande = '" + message + '\'' + '}';
    }
    // Optional: add old version to history
    public void update(String newMessage) {

    }
}

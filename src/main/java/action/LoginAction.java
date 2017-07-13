package action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by xuqipei on 17-7-5.
 */
public class LoginAction implements Action{
    private String username;
    private String password;
    private String haha;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Object getValue(String key) {
        return null;
    }

    public void putValue(String key, Object value) {

    }

    public void setEnabled(boolean b) {

    }

    public boolean isEnabled() {
        return false;
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }

    public void actionPerformed(ActionEvent e) {

    }


}

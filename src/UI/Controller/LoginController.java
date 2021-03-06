package UI.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import UI.View.LoginView;
import BLL.Authentication.Authentication;
/**
 * Created by Lenovo on 2017/3/12.
 */
public class LoginController {
    private LoginView view;
    private Authentication model;

    public LoginController(LoginView userLoginView, Authentication userAuthentication) {
        this.view = userLoginView;
        this.model = userAuthentication;
        this.view.SubmitListener(new SubListener());
    }

     class SubListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String userName;
            char[] passWord;

                userName = view.getUserName();
                passWord = view.getPassWord();

                model.check(userName, passWord);
        }

    }

}

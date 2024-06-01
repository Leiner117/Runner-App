/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tec.runnerapp;

import tec.runnerapp.UI.Login;
import tec.runnerapp.UI.RegisterRunner;
import tec.runnerapp.UI.RegisterTime;
import tec.runnerapp.UI.RegistrationRunner;

/**
 *
 * @author leine
 */
public class RunnerApp {

    public static void main(String[] args) {
        //abrir ventana registerRunner
        //RegisterRunner registerRunner = new RegisterRunner();
        //registerRunner.setVisible(true);
        //abrir ventana de RegistrationRunner
        //RegistrationRunner registration = new RegistrationRunner();
        //registration.setVisible(true);

        //abrir ventana de registerTime
        //RegisterTime registerTime = new RegisterTime();
        //registerTime.setVisible(true);
        //registrar admin
        Administrator admin = new Administrator("admin", "admin@admin.com", "12345678", "admin");
        Runner runner = new Runner("Leiner", "leiner@gmail.com", "leiner117", "123456", "A+");
        AdministratorList.addAdministrator(admin);
        RunnerList.addRunner(runner);
        Login login = new Login();
        login.setVisible(true);
        

    }
}

package rmi.remotingclient;

import rmi.model.PersonEntity;
import rmi.service.PersonService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ClientProgram {
    public static void main(String[] args) {
        PersonService personService = null;
        try {
            personService = (PersonService) Naming.lookup("rmi://127.0.0.1:6600/PersonService");
            personService.setName("Shawn");
            personService.sayHello();

            List<PersonEntity> personList = personService.GetList();
            for (PersonEntity person : personList) {
                System.out.println("name " + person.getName() + "   age: " + person.getAge());
            }
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException URL");
        } catch (RemoteException e) {
            System.out.println("Naming.lookup ");
        } catch (NotBoundException e) {
            System.out.println("NotBoundException ");
        }
    }
}

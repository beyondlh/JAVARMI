package rmi.remotingservice;

import rmi.model.PersonEntity;
import rmi.service.PersonService;
import rmi.serviceImpl.PersonServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerProgram {
    public static void main(String[] args) {
        try {
            PersonService personService = new PersonServiceImpl();

            PersonEntity person1 = new PersonEntity();
            person1.setAge(20);
            person1.setName("Test1");
            personService.addAPerson(person1);

            PersonEntity person2 = new PersonEntity();
            person2.setAge(22);
            person2.setName("Test2");
            personService.addAPerson(person2);

            LocateRegistry.createRegistry(6600);// ע��ͨѶ�˿�
            Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService); // ע��ͨѶ·��

            System.out.println("ServerProgram sucess");

        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("RemoteException");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException URL");
        }
    }
}
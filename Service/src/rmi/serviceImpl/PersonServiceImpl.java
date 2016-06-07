package rmi.serviceImpl;

import rmi.model.PersonEntity;
import rmi.service.PersonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {
    private static final long serialVersionUID = 1L;
    private static String nameString = null;
    List<PersonEntity> personList = null;

    public PersonServiceImpl() throws RemoteException {
        super();
        personList = new LinkedList<PersonEntity>();
    }

    @Override
    public List<PersonEntity> GetList() throws RemoteException {
        System.out.println("GetList");
        return personList;
    }

    @Override
    public void sayHello() throws RemoteException {
        System.out.println("Hello, " + nameString);
    }

    @Override
    public void setName(String name) throws RemoteException {
        nameString = name;
    }

    @Override
    public void addAPerson(PersonEntity personEntity) throws RemoteException {
        personList.add(personEntity);
    }
}

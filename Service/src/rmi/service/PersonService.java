package rmi.service;

import rmi.model.PersonEntity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PersonService extends Remote {
    
    public List<PersonEntity> GetList() throws RemoteException;

    public void addAPerson(PersonEntity personEntity) throws RemoteException;

    public void sayHello() throws RemoteException;

    public void setName(String name) throws RemoteException;
}
/**
 * IBoDService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IBoDService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO newGuest() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.MapDTO joinGame(java.lang.Integer clientPlayerId, java.lang.Integer clientPort) throws java.rmi.RemoteException;
    public void quitGame(java.lang.Integer clientPlayerId) throws java.rmi.RemoteException;
}

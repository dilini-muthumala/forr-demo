/**
 * AndroidAppServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wso2.android.app;

public class AndroidAppServiceLocator extends org.apache.axis.client.Service implements com.wso2.android.app.AndroidAppService {

    public AndroidAppServiceLocator() {
    }


    public AndroidAppServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AndroidAppServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AndroidAppServiceHttpSoap11Endpoint
    private java.lang.String AndroidAppServiceHttpSoap11Endpoint_address = "http://localhost:8080/axis2/services/AndroidAppService";

    public java.lang.String getAndroidAppServiceHttpSoap11EndpointAddress() {
        return AndroidAppServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AndroidAppServiceHttpSoap11EndpointWSDDServiceName = "AndroidAppServiceHttpSoap11Endpoint";

    public java.lang.String getAndroidAppServiceHttpSoap11EndpointWSDDServiceName() {
        return AndroidAppServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setAndroidAppServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        AndroidAppServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.wso2.android.app.AndroidAppServicePortType getAndroidAppServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AndroidAppServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAndroidAppServiceHttpSoap11Endpoint(endpoint);
    }

    public com.wso2.android.app.AndroidAppServicePortType getAndroidAppServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wso2.android.app.AndroidAppServiceSoap11BindingStub _stub = new com.wso2.android.app.AndroidAppServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getAndroidAppServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAndroidAppServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        AndroidAppServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wso2.android.app.AndroidAppServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wso2.android.app.AndroidAppServiceSoap11BindingStub _stub = new com.wso2.android.app.AndroidAppServiceSoap11BindingStub(new java.net.URL(AndroidAppServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getAndroidAppServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AndroidAppServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getAndroidAppServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.android.wso2.com", "AndroidAppService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.android.wso2.com", "AndroidAppServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AndroidAppServiceHttpSoap11Endpoint".equals(portName)) {
            setAndroidAppServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

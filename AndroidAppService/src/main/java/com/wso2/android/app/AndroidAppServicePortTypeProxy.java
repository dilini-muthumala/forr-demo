package com.wso2.android.app;

public class AndroidAppServicePortTypeProxy implements com.wso2.android.app.AndroidAppServicePortType {
  private String _endpoint = null;
  private com.wso2.android.app.AndroidAppServicePortType androidAppServicePortType = null;
  
  public AndroidAppServicePortTypeProxy() {
    _initAndroidAppServicePortTypeProxy();
  }
  
  public AndroidAppServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAndroidAppServicePortTypeProxy();
  }
  
  private void _initAndroidAppServicePortTypeProxy() {
    try {
      androidAppServicePortType = (new com.wso2.android.app.AndroidAppServiceLocator()).getAndroidAppServiceHttpSoap11Endpoint();
      if (androidAppServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)androidAppServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)androidAppServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (androidAppServicePortType != null)
      ((javax.xml.rpc.Stub)androidAppServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wso2.android.app.AndroidAppServicePortType getAndroidAppServicePortType() {
    if (androidAppServicePortType == null)
      _initAndroidAppServicePortTypeProxy();
    return androidAppServicePortType;
  }
  
  public java.lang.String getLastMessage() throws java.rmi.RemoteException{
    if (androidAppServicePortType == null)
      _initAndroidAppServicePortTypeProxy();
    return androidAppServicePortType.getLastMessage();
  }
  
  public void putMessage(java.lang.String message) throws java.rmi.RemoteException{
    if (androidAppServicePortType == null)
      _initAndroidAppServicePortTypeProxy();
    androidAppServicePortType.putMessage(message);
  }
  
  
}
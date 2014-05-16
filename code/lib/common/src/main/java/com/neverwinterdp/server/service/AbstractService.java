package com.neverwinterdp.server.service;

import com.neverwinterdp.server.Server;


abstract public class AbstractService implements Service {
  private ServiceConfig config ;
  private ServiceDescriptor descriptor = new ServiceDescriptor();
  
  public ServiceConfig getServiceConfig() {
    return config ;
  }
  
  public void setServiceConfig(ServiceConfig config) {
    this.config = config ;
    descriptor.init(config) ;
  }

  public ServiceDescriptor getServiceDescriptor() { return descriptor ; }
  
  public void onInit(Server server) {
    
  }
  
  public void onDestroy(Server server) {
    
  }
}

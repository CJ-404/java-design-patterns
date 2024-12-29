package proxy;

import common.PatternDemo;

public class ProxyPatternDemo implements PatternDemo {
    @Override
    public void run() {
        ResourceHandlerProxy userProxy = new ResourceHandlerProxy(UserType.Owner,ResourceType.User);
        try {
            userProxy.createResource("w001","data");
            userProxy.getResource("w001");
            userProxy.updateResource("w001","new data");
            userProxy.deleteResource("woo2");
        } catch (Exception e) {
            System.out.println(e);
        }

        ResourceHandlerProxy editorProxy = new ResourceHandlerProxy(UserType.Editor,ResourceType.Company);
        try {
            editorProxy.getResource("w001");
            editorProxy.updateResource("w001","new data");
            editorProxy.deleteResource("woo2");
            editorProxy.createResource("w001","data");
        } catch (Exception e) {
            System.out.println(e);
        }

        ResourceHandlerProxy viewProxy = new ResourceHandlerProxy(UserType.Viewer,ResourceType.Company);
        try {
            viewProxy.getResource("w001");
            viewProxy.updateResource("w001","new data");
            viewProxy.deleteResource("woo2");
            viewProxy.createResource("w001","data");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

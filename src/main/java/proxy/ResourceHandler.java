package proxy;

public interface ResourceHandler {
    String getResource(String id) throws Exception;
    String updateResource(String id, String data) throws Exception;
    String createResource(String id, String data) throws Exception;
    Boolean deleteResource(String id) throws Exception;
}

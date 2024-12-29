package proxy;

public class ResourceHandlerProxy implements ResourceHandler{

    private final UserType userType;
    private final ResourceHandler resourceHandler;

    public ResourceHandlerProxy(UserType userType, ResourceType resourceType) {

        this.userType = userType;
        this.resourceHandler = (resourceType == ResourceType.User)?
                new UserResourceHandler()
                :
                (resourceType == ResourceType.Company)?
                        new CompanyResourceHandler()
                        :
                        null;
    }

    @Override
    public String getResource(String id) throws Exception {
        if(resourceHandler != null)
        {
            if(userType == UserType.Owner || userType == UserType.Editor || userType == UserType.Viewer)
            {
                //granted
                return resourceHandler.getResource(id);
            }
            else{
                // denied
                throw new Exception(userType + " don't have permission to get resource");
            }
        }
        else
        {
            throw new Exception("Resource handler is not defined properly");
        }
    }

    @Override
    public String updateResource(String id, String data) throws Exception {
        if(resourceHandler != null)
        {
            if(userType == UserType.Owner || userType == UserType.Editor)
            {
                //granted
                return resourceHandler.updateResource(id,data);
            }
            else{
                // denied
                throw new Exception(userType + " don't have permission to update resource");
            }
        }
        else
        {
            throw new Exception("Resource handler is not defined properly");
        }
    }

    @Override
    public String createResource(String id, String data) throws Exception {
        if(resourceHandler != null)
        {
            if(userType == UserType.Owner)
            {
                //granted
                return resourceHandler.createResource(id,data);
            }
            else{
                // denied
                throw new Exception(userType + " don't have permission to create resource");
            }
        }
        else
        {
            throw new Exception("Resource handler is not defined properly");
        }
    }

    @Override
    public Boolean deleteResource(String id) throws Exception {
        if(resourceHandler != null)
        {
            if(userType == UserType.Owner)
            {
                //granted
                return resourceHandler.deleteResource(id);
            }
            else{
                // denied
                throw new Exception(userType + " don't have permission to delete resource");
            }
        }
        else
        {
            throw new Exception("Resource handler is not defined properly");
        }
    }
}

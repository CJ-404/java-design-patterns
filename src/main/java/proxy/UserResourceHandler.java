package proxy;

class UserResourceHandler implements ResourceHandler{
    @Override
    public String getResource(String id) {
        System.out.printf("get User with id %s%n", id);
        // get data
        return id;
    }

    @Override
    public String updateResource(String id, String data) {
        System.out.printf("update User with id %s%n", id);
        // update data
        return data;
    }

    @Override
    public String createResource(String id, String data) {
        System.out.printf("Create User with id %s%n", id);
        // create data
        return data;
    }

    @Override
    public Boolean deleteResource(String id) {
        System.out.printf("Delete User with id %s%n", id);
        // create data
        return true;
    }
}

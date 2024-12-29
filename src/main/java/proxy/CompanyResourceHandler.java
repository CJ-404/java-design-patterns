package proxy;

class CompanyResourceHandler implements ResourceHandler{
    @Override
    public String getResource(String id) {
        System.out.printf("get Company with id %s%n", id);
        // get data
        return id;
    }

    @Override
    public String updateResource(String id, String data) {
        System.out.printf("update Company with id %s%n", id);
        // update data
        return data;
    }

    @Override
    public String createResource(String id, String data) {
        System.out.printf("Create Company with id %s%n", id);
        // create data
        return data;
    }

    @Override
    public Boolean deleteResource(String id) {
        System.out.printf("Delete Company with id %s%n", id);
        // create data
        return true;
    }
}

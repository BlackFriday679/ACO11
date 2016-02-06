package ua.artcode.design_patterns.proxy;

class Service implements IService {

    private VkApi vkApi;

    public Service(VkApi vkApi) {
        this.vkApi = vkApi;
    }


    @Override
    public String login(String name, String pass) {
        if(name == null || name.isEmpty() || pass == null || pass.isEmpty()){
            return "Validation error";
        }

        if(vkApi.checkLoginPass(name,pass)){
            return "your key is superkey";
        }

        return "";
    }
}





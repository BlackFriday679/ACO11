package ua.artcode.design_patterns.factory_method;

class VkApi {

    private Host host;

    public VkApi(Host host) {
        this.host = host;
    }

    public boolean checkLoginPass(String login, String pass){
        String res = host.connect();

        if("connection".equals(res)){
            // some logic
            return true;
        }

        return false;


    }
}

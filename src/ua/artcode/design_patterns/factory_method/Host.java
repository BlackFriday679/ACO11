package ua.artcode.design_patterns.factory_method;

class Host {

    private String ip;

    public Host(String desc) {
        this.ip = desc;
    }

    public String connect(){
        return "connection";
    }

}

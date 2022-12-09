package org.example;

public class Provider {
    String name;
    String phone;

    public void setName(String name){
        this.name=name;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String toSting(){
        return "Provider{" +
                "name="+name+
                "phone,"+phone+
                "}";
    }

    public static class Builder {
        private  Provider provider;
            private String name;
            private String phone;

            public Builder( String name, String phone) {
                provider.name = name;
                provider.phone=phone;
            }
            public Provider build () {
                return provider;
            }
        }
        public Provider(Builder builder){
            name= builder.name;
            phone= builder.phone;
        }
}

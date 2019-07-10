package com.design.mode;


public class JianZao {

    private String name;
    private String phone;
    private String gradle;
    private String momey;
    private String hello;
    private String haha;




    public JianZao(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.gradle = builder.gradle;
        this.momey = builder.momey;
        this.hello = builder.hello;
        this.haha = builder.haha;
    }

    public static class Builder {

        private String name;
        private String phone;
        private String gradle;
        private String momey;
        private String hello;
        private String haha;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;

        }

        public String getGradle() {
            return gradle;
        }

        public Builder setGradle(String gradle) {
            this.gradle = gradle;
            return this;

        }

        public String getMomey() {
            return momey;
        }

        public Builder setMomey(String momey) {
            this.momey = momey;
            return this;

        }

        // todo 输出赋值是否成功
        public Builder print(){
            LogUtil.e("2333"+getHaha()+getGradle()+getHello()+getName()+getPhone());

            return this;
        }

        public String getHello() {
            return hello;
        }

        public Builder setHello(String hello) {
            this.hello = hello;
            return this;

        }

        public String getHaha() {
            return haha;
        }

        public Builder setHaha(String haha) {
            this.haha = haha;
            return this;

        }


        public  JianZao build(){
            return  new JianZao(this);
        }
    }


}

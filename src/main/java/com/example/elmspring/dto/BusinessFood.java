package com.example.elmspring.dto;

public class BusinessFood  {
        public Long id;
        public String name;
        public String explain;
        public String img;
        public double price;
        private Long num;
        private String display;
        private double tPrice;
        private double AllPrice;

        public double getAllPrice() {
                return AllPrice;
        }

        public void setAllPrice(double allPrice) {
                AllPrice = allPrice;
        }

        public double gettPrice() {
                return tPrice;
        }

        public void settPrice(double tPrice) {
                this.tPrice = tPrice;
        }

        @Override
        public String toString() {
                return "BusinessFood{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", explain='" + explain + '\'' +
                        ", img='" + img + '\'' +
                        ", price=" + price +
                        ", num=" + num +
                        ", display='" + display + '\'' +
                        '}';
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getExplain() {
                return explain;
        }

        public void setExplain(String explain) {
                this.explain = explain;
        }

        public String getImg() {
                return img;
        }

        public void setImg(String img) {
                this.img = img;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public Long getNum() {
                return num;
        }

        public void setNum(Long num) {
                this.num = num;
        }

        public String getDisplay() {
                return display;
        }

        public void setDisplay(String display) {
                this.display = display;
        }
}

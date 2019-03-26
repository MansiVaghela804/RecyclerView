package com.example.recyclerview;

public class Models {
    private int imagelist;
    private String data;

    public Models(int imagelist, String data) {
        this.imagelist = imagelist;
        this.data = data;
    }

    public int getImagelist() {
        return imagelist;
    }

    public void setImagelist(int imagelist) {
        this.imagelist = imagelist;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

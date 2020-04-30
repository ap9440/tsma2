package com.tsma.worstone.tsma;

public class card {

    String mtitle;
    int micon;
    int mback;

    public card(String mtitle, int micon, int mback) {
        this.mtitle = mtitle;
        this.micon = micon;
        this.mback = mback;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public int getMicon() {
        return micon;
    }

    public void setMicon(int micon) {
        this.micon = micon;
    }

    public int getMback() {
        return mback;
    }

    public void setMback(int mback) {
        this.mback = mback;
    }
}

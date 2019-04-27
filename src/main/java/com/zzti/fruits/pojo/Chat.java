package com.zzti.fruits.pojo;

public class Chat {
    private Integer id;

    private String memberid;

    private String content;

    private String hfcontent;

    private String savetime;

    private String hfsavetime;

    private String hfstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHfcontent() {
        return hfcontent;
    }

    public void setHfcontent(String hfcontent) {
        this.hfcontent = hfcontent == null ? null : hfcontent.trim();
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime == null ? null : savetime.trim();
    }

    public String getHfsavetime() {
        return hfsavetime;
    }

    public void setHfsavetime(String hfsavetime) {
        this.hfsavetime = hfsavetime == null ? null : hfsavetime.trim();
    }

    public String getHfstate() {
        return hfstate;
    }

    public void setHfstate(String hfstate) {
        this.hfstate = hfstate == null ? null : hfstate.trim();
    }
}
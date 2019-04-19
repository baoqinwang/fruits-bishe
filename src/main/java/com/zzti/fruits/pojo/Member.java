package com.zzti.fruits.pojo;

public class Member {
    private String id;

    private String username;

    private String userpassword;

    private String realname;

    private String sex;

    private String tel;

    private String brithtime;

    private String addr;

    private String email;

    private String savetime;

    private String delstatus;

    private String filename;

    private Integer loginerronum;

    private String lockstatus;

    private String isgjhy;

    private String sheng;

    private String shi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBrithtime() {
        return brithtime;
    }

    public void setBrithtime(String brithtime) {
        this.brithtime = brithtime == null ? null : brithtime.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime == null ? null : savetime.trim();
    }

    public String getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(String delstatus) {
        this.delstatus = delstatus == null ? null : delstatus.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getLoginerronum() {
        return loginerronum;
    }

    public void setLoginerronum(Integer loginerronum) {
        this.loginerronum = loginerronum;
    }

    public String getLockstatus() {
        return lockstatus;
    }

    public void setLockstatus(String lockstatus) {
        this.lockstatus = lockstatus == null ? null : lockstatus.trim();
    }

    public String getIsgjhy() {
        return isgjhy;
    }

    public void setIsgjhy(String isgjhy) {
        this.isgjhy = isgjhy == null ? null : isgjhy.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }
}
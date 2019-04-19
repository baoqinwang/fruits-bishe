package com.zzti.fruits.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andBrithtimeIsNull() {
            addCriterion("brithtime is null");
            return (Criteria) this;
        }

        public Criteria andBrithtimeIsNotNull() {
            addCriterion("brithtime is not null");
            return (Criteria) this;
        }

        public Criteria andBrithtimeEqualTo(String value) {
            addCriterion("brithtime =", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeNotEqualTo(String value) {
            addCriterion("brithtime <>", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeGreaterThan(String value) {
            addCriterion("brithtime >", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeGreaterThanOrEqualTo(String value) {
            addCriterion("brithtime >=", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeLessThan(String value) {
            addCriterion("brithtime <", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeLessThanOrEqualTo(String value) {
            addCriterion("brithtime <=", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeLike(String value) {
            addCriterion("brithtime like", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeNotLike(String value) {
            addCriterion("brithtime not like", value, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeIn(List<String> values) {
            addCriterion("brithtime in", values, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeNotIn(List<String> values) {
            addCriterion("brithtime not in", values, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeBetween(String value1, String value2) {
            addCriterion("brithtime between", value1, value2, "brithtime");
            return (Criteria) this;
        }

        public Criteria andBrithtimeNotBetween(String value1, String value2) {
            addCriterion("brithtime not between", value1, value2, "brithtime");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNull() {
            addCriterion("savetime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("savetime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(String value) {
            addCriterion("savetime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(String value) {
            addCriterion("savetime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(String value) {
            addCriterion("savetime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("savetime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(String value) {
            addCriterion("savetime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(String value) {
            addCriterion("savetime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLike(String value) {
            addCriterion("savetime like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotLike(String value) {
            addCriterion("savetime not like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<String> values) {
            addCriterion("savetime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<String> values) {
            addCriterion("savetime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(String value1, String value2) {
            addCriterion("savetime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(String value1, String value2) {
            addCriterion("savetime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andDelstatusIsNull() {
            addCriterion("delstatus is null");
            return (Criteria) this;
        }

        public Criteria andDelstatusIsNotNull() {
            addCriterion("delstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDelstatusEqualTo(String value) {
            addCriterion("delstatus =", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotEqualTo(String value) {
            addCriterion("delstatus <>", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusGreaterThan(String value) {
            addCriterion("delstatus >", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusGreaterThanOrEqualTo(String value) {
            addCriterion("delstatus >=", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusLessThan(String value) {
            addCriterion("delstatus <", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusLessThanOrEqualTo(String value) {
            addCriterion("delstatus <=", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusLike(String value) {
            addCriterion("delstatus like", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotLike(String value) {
            addCriterion("delstatus not like", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusIn(List<String> values) {
            addCriterion("delstatus in", values, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotIn(List<String> values) {
            addCriterion("delstatus not in", values, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusBetween(String value1, String value2) {
            addCriterion("delstatus between", value1, value2, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotBetween(String value1, String value2) {
            addCriterion("delstatus not between", value1, value2, "delstatus");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andLoginerronumIsNull() {
            addCriterion("loginerronum is null");
            return (Criteria) this;
        }

        public Criteria andLoginerronumIsNotNull() {
            addCriterion("loginerronum is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerronumEqualTo(Integer value) {
            addCriterion("loginerronum =", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumNotEqualTo(Integer value) {
            addCriterion("loginerronum <>", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumGreaterThan(Integer value) {
            addCriterion("loginerronum >", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginerronum >=", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumLessThan(Integer value) {
            addCriterion("loginerronum <", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumLessThanOrEqualTo(Integer value) {
            addCriterion("loginerronum <=", value, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumIn(List<Integer> values) {
            addCriterion("loginerronum in", values, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumNotIn(List<Integer> values) {
            addCriterion("loginerronum not in", values, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumBetween(Integer value1, Integer value2) {
            addCriterion("loginerronum between", value1, value2, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLoginerronumNotBetween(Integer value1, Integer value2) {
            addCriterion("loginerronum not between", value1, value2, "loginerronum");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNull() {
            addCriterion("lockstatus is null");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNotNull() {
            addCriterion("lockstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLockstatusEqualTo(String value) {
            addCriterion("lockstatus =", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotEqualTo(String value) {
            addCriterion("lockstatus <>", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThan(String value) {
            addCriterion("lockstatus >", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThanOrEqualTo(String value) {
            addCriterion("lockstatus >=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThan(String value) {
            addCriterion("lockstatus <", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThanOrEqualTo(String value) {
            addCriterion("lockstatus <=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLike(String value) {
            addCriterion("lockstatus like", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotLike(String value) {
            addCriterion("lockstatus not like", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusIn(List<String> values) {
            addCriterion("lockstatus in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotIn(List<String> values) {
            addCriterion("lockstatus not in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusBetween(String value1, String value2) {
            addCriterion("lockstatus between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotBetween(String value1, String value2) {
            addCriterion("lockstatus not between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andIsgjhyIsNull() {
            addCriterion("isgjhy is null");
            return (Criteria) this;
        }

        public Criteria andIsgjhyIsNotNull() {
            addCriterion("isgjhy is not null");
            return (Criteria) this;
        }

        public Criteria andIsgjhyEqualTo(String value) {
            addCriterion("isgjhy =", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyNotEqualTo(String value) {
            addCriterion("isgjhy <>", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyGreaterThan(String value) {
            addCriterion("isgjhy >", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyGreaterThanOrEqualTo(String value) {
            addCriterion("isgjhy >=", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyLessThan(String value) {
            addCriterion("isgjhy <", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyLessThanOrEqualTo(String value) {
            addCriterion("isgjhy <=", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyLike(String value) {
            addCriterion("isgjhy like", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyNotLike(String value) {
            addCriterion("isgjhy not like", value, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyIn(List<String> values) {
            addCriterion("isgjhy in", values, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyNotIn(List<String> values) {
            addCriterion("isgjhy not in", values, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyBetween(String value1, String value2) {
            addCriterion("isgjhy between", value1, value2, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andIsgjhyNotBetween(String value1, String value2) {
            addCriterion("isgjhy not between", value1, value2, "isgjhy");
            return (Criteria) this;
        }

        public Criteria andShengIsNull() {
            addCriterion("sheng is null");
            return (Criteria) this;
        }

        public Criteria andShengIsNotNull() {
            addCriterion("sheng is not null");
            return (Criteria) this;
        }

        public Criteria andShengEqualTo(String value) {
            addCriterion("sheng =", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotEqualTo(String value) {
            addCriterion("sheng <>", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThan(String value) {
            addCriterion("sheng >", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThanOrEqualTo(String value) {
            addCriterion("sheng >=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThan(String value) {
            addCriterion("sheng <", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThanOrEqualTo(String value) {
            addCriterion("sheng <=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLike(String value) {
            addCriterion("sheng like", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotLike(String value) {
            addCriterion("sheng not like", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengIn(List<String> values) {
            addCriterion("sheng in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotIn(List<String> values) {
            addCriterion("sheng not in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengBetween(String value1, String value2) {
            addCriterion("sheng between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotBetween(String value1, String value2) {
            addCriterion("sheng not between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShiIsNull() {
            addCriterion("shi is null");
            return (Criteria) this;
        }

        public Criteria andShiIsNotNull() {
            addCriterion("shi is not null");
            return (Criteria) this;
        }

        public Criteria andShiEqualTo(String value) {
            addCriterion("shi =", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotEqualTo(String value) {
            addCriterion("shi <>", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThan(String value) {
            addCriterion("shi >", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThanOrEqualTo(String value) {
            addCriterion("shi >=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThan(String value) {
            addCriterion("shi <", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThanOrEqualTo(String value) {
            addCriterion("shi <=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLike(String value) {
            addCriterion("shi like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotLike(String value) {
            addCriterion("shi not like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiIn(List<String> values) {
            addCriterion("shi in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotIn(List<String> values) {
            addCriterion("shi not in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiBetween(String value1, String value2) {
            addCriterion("shi between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotBetween(String value1, String value2) {
            addCriterion("shi not between", value1, value2, "shi");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
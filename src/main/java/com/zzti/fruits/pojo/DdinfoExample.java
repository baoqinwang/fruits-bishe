package com.zzti.fruits.pojo;

import java.util.ArrayList;
import java.util.List;

public class DdinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DdinfoExample() {
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

        public Criteria andDdnoIsNull() {
            addCriterion("ddno is null");
            return (Criteria) this;
        }

        public Criteria andDdnoIsNotNull() {
            addCriterion("ddno is not null");
            return (Criteria) this;
        }

        public Criteria andDdnoEqualTo(String value) {
            addCriterion("ddno =", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotEqualTo(String value) {
            addCriterion("ddno <>", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoGreaterThan(String value) {
            addCriterion("ddno >", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoGreaterThanOrEqualTo(String value) {
            addCriterion("ddno >=", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLessThan(String value) {
            addCriterion("ddno <", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLessThanOrEqualTo(String value) {
            addCriterion("ddno <=", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLike(String value) {
            addCriterion("ddno like", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotLike(String value) {
            addCriterion("ddno not like", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoIn(List<String> values) {
            addCriterion("ddno in", values, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotIn(List<String> values) {
            addCriterion("ddno not in", values, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoBetween(String value1, String value2) {
            addCriterion("ddno between", value1, value2, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotBetween(String value1, String value2) {
            addCriterion("ddno not between", value1, value2, "ddno");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andDdtotalIsNull() {
            addCriterion("ddtotal is null");
            return (Criteria) this;
        }

        public Criteria andDdtotalIsNotNull() {
            addCriterion("ddtotal is not null");
            return (Criteria) this;
        }

        public Criteria andDdtotalEqualTo(String value) {
            addCriterion("ddtotal =", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalNotEqualTo(String value) {
            addCriterion("ddtotal <>", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalGreaterThan(String value) {
            addCriterion("ddtotal >", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalGreaterThanOrEqualTo(String value) {
            addCriterion("ddtotal >=", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalLessThan(String value) {
            addCriterion("ddtotal <", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalLessThanOrEqualTo(String value) {
            addCriterion("ddtotal <=", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalLike(String value) {
            addCriterion("ddtotal like", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalNotLike(String value) {
            addCriterion("ddtotal not like", value, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalIn(List<String> values) {
            addCriterion("ddtotal in", values, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalNotIn(List<String> values) {
            addCriterion("ddtotal not in", values, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalBetween(String value1, String value2) {
            addCriterion("ddtotal between", value1, value2, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andDdtotalNotBetween(String value1, String value2) {
            addCriterion("ddtotal not between", value1, value2, "ddtotal");
            return (Criteria) this;
        }

        public Criteria andFkstatusIsNull() {
            addCriterion("fkstatus is null");
            return (Criteria) this;
        }

        public Criteria andFkstatusIsNotNull() {
            addCriterion("fkstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFkstatusEqualTo(String value) {
            addCriterion("fkstatus =", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusNotEqualTo(String value) {
            addCriterion("fkstatus <>", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusGreaterThan(String value) {
            addCriterion("fkstatus >", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fkstatus >=", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusLessThan(String value) {
            addCriterion("fkstatus <", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusLessThanOrEqualTo(String value) {
            addCriterion("fkstatus <=", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusLike(String value) {
            addCriterion("fkstatus like", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusNotLike(String value) {
            addCriterion("fkstatus not like", value, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusIn(List<String> values) {
            addCriterion("fkstatus in", values, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusNotIn(List<String> values) {
            addCriterion("fkstatus not in", values, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusBetween(String value1, String value2) {
            addCriterion("fkstatus between", value1, value2, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andFkstatusNotBetween(String value1, String value2) {
            addCriterion("fkstatus not between", value1, value2, "fkstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusIsNull() {
            addCriterion("shstatus is null");
            return (Criteria) this;
        }

        public Criteria andShstatusIsNotNull() {
            addCriterion("shstatus is not null");
            return (Criteria) this;
        }

        public Criteria andShstatusEqualTo(String value) {
            addCriterion("shstatus =", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusNotEqualTo(String value) {
            addCriterion("shstatus <>", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusGreaterThan(String value) {
            addCriterion("shstatus >", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusGreaterThanOrEqualTo(String value) {
            addCriterion("shstatus >=", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusLessThan(String value) {
            addCriterion("shstatus <", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusLessThanOrEqualTo(String value) {
            addCriterion("shstatus <=", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusLike(String value) {
            addCriterion("shstatus like", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusNotLike(String value) {
            addCriterion("shstatus not like", value, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusIn(List<String> values) {
            addCriterion("shstatus in", values, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusNotIn(List<String> values) {
            addCriterion("shstatus not in", values, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusBetween(String value1, String value2) {
            addCriterion("shstatus between", value1, value2, "shstatus");
            return (Criteria) this;
        }

        public Criteria andShstatusNotBetween(String value1, String value2) {
            addCriterion("shstatus not between", value1, value2, "shstatus");
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

        public Criteria andLxfsIsNull() {
            addCriterion("lxfs is null");
            return (Criteria) this;
        }

        public Criteria andLxfsIsNotNull() {
            addCriterion("lxfs is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsEqualTo(String value) {
            addCriterion("lxfs =", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotEqualTo(String value) {
            addCriterion("lxfs <>", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsGreaterThan(String value) {
            addCriterion("lxfs >", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsGreaterThanOrEqualTo(String value) {
            addCriterion("lxfs >=", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLessThan(String value) {
            addCriterion("lxfs <", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLessThanOrEqualTo(String value) {
            addCriterion("lxfs <=", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLike(String value) {
            addCriterion("lxfs like", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotLike(String value) {
            addCriterion("lxfs not like", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsIn(List<String> values) {
            addCriterion("lxfs in", values, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotIn(List<String> values) {
            addCriterion("lxfs not in", values, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsBetween(String value1, String value2) {
            addCriterion("lxfs between", value1, value2, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotBetween(String value1, String value2) {
            addCriterion("lxfs not between", value1, value2, "lxfs");
            return (Criteria) this;
        }

        public Criteria andFhstatusIsNull() {
            addCriterion("fhstatus is null");
            return (Criteria) this;
        }

        public Criteria andFhstatusIsNotNull() {
            addCriterion("fhstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFhstatusEqualTo(String value) {
            addCriterion("fhstatus =", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusNotEqualTo(String value) {
            addCriterion("fhstatus <>", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusGreaterThan(String value) {
            addCriterion("fhstatus >", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fhstatus >=", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusLessThan(String value) {
            addCriterion("fhstatus <", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusLessThanOrEqualTo(String value) {
            addCriterion("fhstatus <=", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusLike(String value) {
            addCriterion("fhstatus like", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusNotLike(String value) {
            addCriterion("fhstatus not like", value, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusIn(List<String> values) {
            addCriterion("fhstatus in", values, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusNotIn(List<String> values) {
            addCriterion("fhstatus not in", values, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusBetween(String value1, String value2) {
            addCriterion("fhstatus between", value1, value2, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andFhstatusNotBetween(String value1, String value2) {
            addCriterion("fhstatus not between", value1, value2, "fhstatus");
            return (Criteria) this;
        }

        public Criteria andWlinfoIsNull() {
            addCriterion("wlinfo is null");
            return (Criteria) this;
        }

        public Criteria andWlinfoIsNotNull() {
            addCriterion("wlinfo is not null");
            return (Criteria) this;
        }

        public Criteria andWlinfoEqualTo(String value) {
            addCriterion("wlinfo =", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoNotEqualTo(String value) {
            addCriterion("wlinfo <>", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoGreaterThan(String value) {
            addCriterion("wlinfo >", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoGreaterThanOrEqualTo(String value) {
            addCriterion("wlinfo >=", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoLessThan(String value) {
            addCriterion("wlinfo <", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoLessThanOrEqualTo(String value) {
            addCriterion("wlinfo <=", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoLike(String value) {
            addCriterion("wlinfo like", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoNotLike(String value) {
            addCriterion("wlinfo not like", value, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoIn(List<String> values) {
            addCriterion("wlinfo in", values, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoNotIn(List<String> values) {
            addCriterion("wlinfo not in", values, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoBetween(String value1, String value2) {
            addCriterion("wlinfo between", value1, value2, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andWlinfoNotBetween(String value1, String value2) {
            addCriterion("wlinfo not between", value1, value2, "wlinfo");
            return (Criteria) this;
        }

        public Criteria andDdstateIsNull() {
            addCriterion("ddstate is null");
            return (Criteria) this;
        }

        public Criteria andDdstateIsNotNull() {
            addCriterion("ddstate is not null");
            return (Criteria) this;
        }

        public Criteria andDdstateEqualTo(String value) {
            addCriterion("ddstate =", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateNotEqualTo(String value) {
            addCriterion("ddstate <>", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateGreaterThan(String value) {
            addCriterion("ddstate >", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateGreaterThanOrEqualTo(String value) {
            addCriterion("ddstate >=", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateLessThan(String value) {
            addCriterion("ddstate <", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateLessThanOrEqualTo(String value) {
            addCriterion("ddstate <=", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateLike(String value) {
            addCriterion("ddstate like", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateNotLike(String value) {
            addCriterion("ddstate not like", value, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateIn(List<String> values) {
            addCriterion("ddstate in", values, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateNotIn(List<String> values) {
            addCriterion("ddstate not in", values, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateBetween(String value1, String value2) {
            addCriterion("ddstate between", value1, value2, "ddstate");
            return (Criteria) this;
        }

        public Criteria andDdstateNotBetween(String value1, String value2) {
            addCriterion("ddstate not between", value1, value2, "ddstate");
            return (Criteria) this;
        }

        public Criteria andWltypeIsNull() {
            addCriterion("wltype is null");
            return (Criteria) this;
        }

        public Criteria andWltypeIsNotNull() {
            addCriterion("wltype is not null");
            return (Criteria) this;
        }

        public Criteria andWltypeEqualTo(String value) {
            addCriterion("wltype =", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeNotEqualTo(String value) {
            addCriterion("wltype <>", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeGreaterThan(String value) {
            addCriterion("wltype >", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeGreaterThanOrEqualTo(String value) {
            addCriterion("wltype >=", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeLessThan(String value) {
            addCriterion("wltype <", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeLessThanOrEqualTo(String value) {
            addCriterion("wltype <=", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeLike(String value) {
            addCriterion("wltype like", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeNotLike(String value) {
            addCriterion("wltype not like", value, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeIn(List<String> values) {
            addCriterion("wltype in", values, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeNotIn(List<String> values) {
            addCriterion("wltype not in", values, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeBetween(String value1, String value2) {
            addCriterion("wltype between", value1, value2, "wltype");
            return (Criteria) this;
        }

        public Criteria andWltypeNotBetween(String value1, String value2) {
            addCriterion("wltype not between", value1, value2, "wltype");
            return (Criteria) this;
        }

        public Criteria andNewaddIsNull() {
            addCriterion("newadd is null");
            return (Criteria) this;
        }

        public Criteria andNewaddIsNotNull() {
            addCriterion("newadd is not null");
            return (Criteria) this;
        }

        public Criteria andNewaddEqualTo(String value) {
            addCriterion("newadd =", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddNotEqualTo(String value) {
            addCriterion("newadd <>", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddGreaterThan(String value) {
            addCriterion("newadd >", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddGreaterThanOrEqualTo(String value) {
            addCriterion("newadd >=", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddLessThan(String value) {
            addCriterion("newadd <", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddLessThanOrEqualTo(String value) {
            addCriterion("newadd <=", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddLike(String value) {
            addCriterion("newadd like", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddNotLike(String value) {
            addCriterion("newadd not like", value, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddIn(List<String> values) {
            addCriterion("newadd in", values, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddNotIn(List<String> values) {
            addCriterion("newadd not in", values, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddBetween(String value1, String value2) {
            addCriterion("newadd between", value1, value2, "newadd");
            return (Criteria) this;
        }

        public Criteria andNewaddNotBetween(String value1, String value2) {
            addCriterion("newadd not between", value1, value2, "newadd");
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
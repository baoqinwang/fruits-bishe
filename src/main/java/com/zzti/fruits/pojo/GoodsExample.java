package com.zzti.fruits.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodnoIsNull() {
            addCriterion("goodno is null");
            return (Criteria) this;
        }

        public Criteria andGoodnoIsNotNull() {
            addCriterion("goodno is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnoEqualTo(String value) {
            addCriterion("goodno =", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotEqualTo(String value) {
            addCriterion("goodno <>", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoGreaterThan(String value) {
            addCriterion("goodno >", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoGreaterThanOrEqualTo(String value) {
            addCriterion("goodno >=", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLessThan(String value) {
            addCriterion("goodno <", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLessThanOrEqualTo(String value) {
            addCriterion("goodno <=", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLike(String value) {
            addCriterion("goodno like", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotLike(String value) {
            addCriterion("goodno not like", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoIn(List<String> values) {
            addCriterion("goodno in", values, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotIn(List<String> values) {
            addCriterion("goodno not in", values, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoBetween(String value1, String value2) {
            addCriterion("goodno between", value1, value2, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotBetween(String value1, String value2) {
            addCriterion("goodno not between", value1, value2, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andGoodppIsNull() {
            addCriterion("goodpp is null");
            return (Criteria) this;
        }

        public Criteria andGoodppIsNotNull() {
            addCriterion("goodpp is not null");
            return (Criteria) this;
        }

        public Criteria andGoodppEqualTo(String value) {
            addCriterion("goodpp =", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppNotEqualTo(String value) {
            addCriterion("goodpp <>", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppGreaterThan(String value) {
            addCriterion("goodpp >", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppGreaterThanOrEqualTo(String value) {
            addCriterion("goodpp >=", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppLessThan(String value) {
            addCriterion("goodpp <", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppLessThanOrEqualTo(String value) {
            addCriterion("goodpp <=", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppLike(String value) {
            addCriterion("goodpp like", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppNotLike(String value) {
            addCriterion("goodpp not like", value, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppIn(List<String> values) {
            addCriterion("goodpp in", values, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppNotIn(List<String> values) {
            addCriterion("goodpp not in", values, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppBetween(String value1, String value2) {
            addCriterion("goodpp between", value1, value2, "goodpp");
            return (Criteria) this;
        }

        public Criteria andGoodppNotBetween(String value1, String value2) {
            addCriterion("goodpp not between", value1, value2, "goodpp");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTpriceIsNull() {
            addCriterion("tprice is null");
            return (Criteria) this;
        }

        public Criteria andTpriceIsNotNull() {
            addCriterion("tprice is not null");
            return (Criteria) this;
        }

        public Criteria andTpriceEqualTo(String value) {
            addCriterion("tprice =", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotEqualTo(String value) {
            addCriterion("tprice <>", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceGreaterThan(String value) {
            addCriterion("tprice >", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceGreaterThanOrEqualTo(String value) {
            addCriterion("tprice >=", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceLessThan(String value) {
            addCriterion("tprice <", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceLessThanOrEqualTo(String value) {
            addCriterion("tprice <=", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceLike(String value) {
            addCriterion("tprice like", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotLike(String value) {
            addCriterion("tprice not like", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceIn(List<String> values) {
            addCriterion("tprice in", values, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotIn(List<String> values) {
            addCriterion("tprice not in", values, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceBetween(String value1, String value2) {
            addCriterion("tprice between", value1, value2, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotBetween(String value1, String value2) {
            addCriterion("tprice not between", value1, value2, "tprice");
            return (Criteria) this;
        }

        public Criteria andIstjIsNull() {
            addCriterion("istj is null");
            return (Criteria) this;
        }

        public Criteria andIstjIsNotNull() {
            addCriterion("istj is not null");
            return (Criteria) this;
        }

        public Criteria andIstjEqualTo(String value) {
            addCriterion("istj =", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjNotEqualTo(String value) {
            addCriterion("istj <>", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjGreaterThan(String value) {
            addCriterion("istj >", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjGreaterThanOrEqualTo(String value) {
            addCriterion("istj >=", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjLessThan(String value) {
            addCriterion("istj <", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjLessThanOrEqualTo(String value) {
            addCriterion("istj <=", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjLike(String value) {
            addCriterion("istj like", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjNotLike(String value) {
            addCriterion("istj not like", value, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjIn(List<String> values) {
            addCriterion("istj in", values, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjNotIn(List<String> values) {
            addCriterion("istj not in", values, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjBetween(String value1, String value2) {
            addCriterion("istj between", value1, value2, "istj");
            return (Criteria) this;
        }

        public Criteria andIstjNotBetween(String value1, String value2) {
            addCriterion("istj not between", value1, value2, "istj");
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

        public Criteria andFilename1IsNull() {
            addCriterion("filename1 is null");
            return (Criteria) this;
        }

        public Criteria andFilename1IsNotNull() {
            addCriterion("filename1 is not null");
            return (Criteria) this;
        }

        public Criteria andFilename1EqualTo(String value) {
            addCriterion("filename1 =", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1NotEqualTo(String value) {
            addCriterion("filename1 <>", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1GreaterThan(String value) {
            addCriterion("filename1 >", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1GreaterThanOrEqualTo(String value) {
            addCriterion("filename1 >=", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1LessThan(String value) {
            addCriterion("filename1 <", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1LessThanOrEqualTo(String value) {
            addCriterion("filename1 <=", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1Like(String value) {
            addCriterion("filename1 like", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1NotLike(String value) {
            addCriterion("filename1 not like", value, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1In(List<String> values) {
            addCriterion("filename1 in", values, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1NotIn(List<String> values) {
            addCriterion("filename1 not in", values, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1Between(String value1, String value2) {
            addCriterion("filename1 between", value1, value2, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename1NotBetween(String value1, String value2) {
            addCriterion("filename1 not between", value1, value2, "filename1");
            return (Criteria) this;
        }

        public Criteria andFilename2IsNull() {
            addCriterion("filename2 is null");
            return (Criteria) this;
        }

        public Criteria andFilename2IsNotNull() {
            addCriterion("filename2 is not null");
            return (Criteria) this;
        }

        public Criteria andFilename2EqualTo(String value) {
            addCriterion("filename2 =", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2NotEqualTo(String value) {
            addCriterion("filename2 <>", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2GreaterThan(String value) {
            addCriterion("filename2 >", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2GreaterThanOrEqualTo(String value) {
            addCriterion("filename2 >=", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2LessThan(String value) {
            addCriterion("filename2 <", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2LessThanOrEqualTo(String value) {
            addCriterion("filename2 <=", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2Like(String value) {
            addCriterion("filename2 like", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2NotLike(String value) {
            addCriterion("filename2 not like", value, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2In(List<String> values) {
            addCriterion("filename2 in", values, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2NotIn(List<String> values) {
            addCriterion("filename2 not in", values, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2Between(String value1, String value2) {
            addCriterion("filename2 between", value1, value2, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename2NotBetween(String value1, String value2) {
            addCriterion("filename2 not between", value1, value2, "filename2");
            return (Criteria) this;
        }

        public Criteria andFilename3IsNull() {
            addCriterion("filename3 is null");
            return (Criteria) this;
        }

        public Criteria andFilename3IsNotNull() {
            addCriterion("filename3 is not null");
            return (Criteria) this;
        }

        public Criteria andFilename3EqualTo(String value) {
            addCriterion("filename3 =", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3NotEqualTo(String value) {
            addCriterion("filename3 <>", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3GreaterThan(String value) {
            addCriterion("filename3 >", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3GreaterThanOrEqualTo(String value) {
            addCriterion("filename3 >=", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3LessThan(String value) {
            addCriterion("filename3 <", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3LessThanOrEqualTo(String value) {
            addCriterion("filename3 <=", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3Like(String value) {
            addCriterion("filename3 like", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3NotLike(String value) {
            addCriterion("filename3 not like", value, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3In(List<String> values) {
            addCriterion("filename3 in", values, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3NotIn(List<String> values) {
            addCriterion("filename3 not in", values, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3Between(String value1, String value2) {
            addCriterion("filename3 between", value1, value2, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename3NotBetween(String value1, String value2) {
            addCriterion("filename3 not between", value1, value2, "filename3");
            return (Criteria) this;
        }

        public Criteria andFilename4IsNull() {
            addCriterion("filename4 is null");
            return (Criteria) this;
        }

        public Criteria andFilename4IsNotNull() {
            addCriterion("filename4 is not null");
            return (Criteria) this;
        }

        public Criteria andFilename4EqualTo(String value) {
            addCriterion("filename4 =", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4NotEqualTo(String value) {
            addCriterion("filename4 <>", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4GreaterThan(String value) {
            addCriterion("filename4 >", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4GreaterThanOrEqualTo(String value) {
            addCriterion("filename4 >=", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4LessThan(String value) {
            addCriterion("filename4 <", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4LessThanOrEqualTo(String value) {
            addCriterion("filename4 <=", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4Like(String value) {
            addCriterion("filename4 like", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4NotLike(String value) {
            addCriterion("filename4 not like", value, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4In(List<String> values) {
            addCriterion("filename4 in", values, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4NotIn(List<String> values) {
            addCriterion("filename4 not in", values, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4Between(String value1, String value2) {
            addCriterion("filename4 between", value1, value2, "filename4");
            return (Criteria) this;
        }

        public Criteria andFilename4NotBetween(String value1, String value2) {
            addCriterion("filename4 not between", value1, value2, "filename4");
            return (Criteria) this;
        }

        public Criteria andIsshelfIsNull() {
            addCriterion("isshelf is null");
            return (Criteria) this;
        }

        public Criteria andIsshelfIsNotNull() {
            addCriterion("isshelf is not null");
            return (Criteria) this;
        }

        public Criteria andIsshelfEqualTo(String value) {
            addCriterion("isshelf =", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfNotEqualTo(String value) {
            addCriterion("isshelf <>", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfGreaterThan(String value) {
            addCriterion("isshelf >", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfGreaterThanOrEqualTo(String value) {
            addCriterion("isshelf >=", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfLessThan(String value) {
            addCriterion("isshelf <", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfLessThanOrEqualTo(String value) {
            addCriterion("isshelf <=", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfLike(String value) {
            addCriterion("isshelf like", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfNotLike(String value) {
            addCriterion("isshelf not like", value, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfIn(List<String> values) {
            addCriterion("isshelf in", values, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfNotIn(List<String> values) {
            addCriterion("isshelf not in", values, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfBetween(String value1, String value2) {
            addCriterion("isshelf between", value1, value2, "isshelf");
            return (Criteria) this;
        }

        public Criteria andIsshelfNotBetween(String value1, String value2) {
            addCriterion("isshelf not between", value1, value2, "isshelf");
            return (Criteria) this;
        }

        public Criteria andShelfbeginIsNull() {
            addCriterion("shelfbegin is null");
            return (Criteria) this;
        }

        public Criteria andShelfbeginIsNotNull() {
            addCriterion("shelfbegin is not null");
            return (Criteria) this;
        }

        public Criteria andShelfbeginEqualTo(String value) {
            addCriterion("shelfbegin =", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginNotEqualTo(String value) {
            addCriterion("shelfbegin <>", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginGreaterThan(String value) {
            addCriterion("shelfbegin >", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginGreaterThanOrEqualTo(String value) {
            addCriterion("shelfbegin >=", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginLessThan(String value) {
            addCriterion("shelfbegin <", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginLessThanOrEqualTo(String value) {
            addCriterion("shelfbegin <=", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginLike(String value) {
            addCriterion("shelfbegin like", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginNotLike(String value) {
            addCriterion("shelfbegin not like", value, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginIn(List<String> values) {
            addCriterion("shelfbegin in", values, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginNotIn(List<String> values) {
            addCriterion("shelfbegin not in", values, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginBetween(String value1, String value2) {
            addCriterion("shelfbegin between", value1, value2, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfbeginNotBetween(String value1, String value2) {
            addCriterion("shelfbegin not between", value1, value2, "shelfbegin");
            return (Criteria) this;
        }

        public Criteria andShelfendIsNull() {
            addCriterion("shelfend is null");
            return (Criteria) this;
        }

        public Criteria andShelfendIsNotNull() {
            addCriterion("shelfend is not null");
            return (Criteria) this;
        }

        public Criteria andShelfendEqualTo(String value) {
            addCriterion("shelfend =", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendNotEqualTo(String value) {
            addCriterion("shelfend <>", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendGreaterThan(String value) {
            addCriterion("shelfend >", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendGreaterThanOrEqualTo(String value) {
            addCriterion("shelfend >=", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendLessThan(String value) {
            addCriterion("shelfend <", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendLessThanOrEqualTo(String value) {
            addCriterion("shelfend <=", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendLike(String value) {
            addCriterion("shelfend like", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendNotLike(String value) {
            addCriterion("shelfend not like", value, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendIn(List<String> values) {
            addCriterion("shelfend in", values, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendNotIn(List<String> values) {
            addCriterion("shelfend not in", values, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendBetween(String value1, String value2) {
            addCriterion("shelfend between", value1, value2, "shelfend");
            return (Criteria) this;
        }

        public Criteria andShelfendNotBetween(String value1, String value2) {
            addCriterion("shelfend not between", value1, value2, "shelfend");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNull() {
            addCriterion("stockcount is null");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNotNull() {
            addCriterion("stockcount is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountEqualTo(Double value) {
            addCriterion("stockcount =", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotEqualTo(Double value) {
            addCriterion("stockcount <>", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThan(Double value) {
            addCriterion("stockcount >", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThanOrEqualTo(Double value) {
            addCriterion("stockcount >=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThan(Double value) {
            addCriterion("stockcount <", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThanOrEqualTo(Double value) {
            addCriterion("stockcount <=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountIn(List<Double> values) {
            addCriterion("stockcount in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotIn(List<Double> values) {
            addCriterion("stockcount not in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountBetween(Double value1, Double value2) {
            addCriterion("stockcount between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotBetween(Double value1, Double value2) {
            addCriterion("stockcount not between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andCrtTlrIsNull() {
            addCriterion("CRT_TLR is null");
            return (Criteria) this;
        }

        public Criteria andCrtTlrIsNotNull() {
            addCriterion("CRT_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTlrEqualTo(String value) {
            addCriterion("CRT_TLR =", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrNotEqualTo(String value) {
            addCriterion("CRT_TLR <>", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrGreaterThan(String value) {
            addCriterion("CRT_TLR >", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_TLR >=", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrLessThan(String value) {
            addCriterion("CRT_TLR <", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrLessThanOrEqualTo(String value) {
            addCriterion("CRT_TLR <=", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrLike(String value) {
            addCriterion("CRT_TLR like", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrNotLike(String value) {
            addCriterion("CRT_TLR not like", value, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrIn(List<String> values) {
            addCriterion("CRT_TLR in", values, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrNotIn(List<String> values) {
            addCriterion("CRT_TLR not in", values, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrBetween(String value1, String value2) {
            addCriterion("CRT_TLR between", value1, value2, "crtTlr");
            return (Criteria) this;
        }

        public Criteria andCrtTlrNotBetween(String value1, String value2) {
            addCriterion("CRT_TLR not between", value1, value2, "crtTlr");
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
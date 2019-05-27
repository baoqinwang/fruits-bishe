package com.zzti.fruits.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockInfoExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("GOODS_ID like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("GOODS_ID not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNull() {
            addCriterion("STOCK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNotNull() {
            addCriterion("STOCK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStockCountEqualTo(Double value) {
            addCriterion("STOCK_COUNT =", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotEqualTo(Double value) {
            addCriterion("STOCK_COUNT <>", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThan(Double value) {
            addCriterion("STOCK_COUNT >", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThanOrEqualTo(Double value) {
            addCriterion("STOCK_COUNT >=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThan(Double value) {
            addCriterion("STOCK_COUNT <", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThanOrEqualTo(Double value) {
            addCriterion("STOCK_COUNT <=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountIn(List<Double> values) {
            addCriterion("STOCK_COUNT in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotIn(List<Double> values) {
            addCriterion("STOCK_COUNT not in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountBetween(Double value1, Double value2) {
            addCriterion("STOCK_COUNT between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotBetween(Double value1, Double value2) {
            addCriterion("STOCK_COUNT not between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountIsNull() {
            addCriterion("MIN_STOCK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMinStockCountIsNotNull() {
            addCriterion("MIN_STOCK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMinStockCountEqualTo(Double value) {
            addCriterion("MIN_STOCK_COUNT =", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountNotEqualTo(Double value) {
            addCriterion("MIN_STOCK_COUNT <>", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountGreaterThan(Double value) {
            addCriterion("MIN_STOCK_COUNT >", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountGreaterThanOrEqualTo(Double value) {
            addCriterion("MIN_STOCK_COUNT >=", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountLessThan(Double value) {
            addCriterion("MIN_STOCK_COUNT <", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountLessThanOrEqualTo(Double value) {
            addCriterion("MIN_STOCK_COUNT <=", value, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountIn(List<Double> values) {
            addCriterion("MIN_STOCK_COUNT in", values, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountNotIn(List<Double> values) {
            addCriterion("MIN_STOCK_COUNT not in", values, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountBetween(Double value1, Double value2) {
            addCriterion("MIN_STOCK_COUNT between", value1, value2, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andMinStockCountNotBetween(Double value1, Double value2) {
            addCriterion("MIN_STOCK_COUNT not between", value1, value2, "minStockCount");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNull() {
            addCriterion("STORAGE_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNotNull() {
            addCriterion("STORAGE_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationEqualTo(String value) {
            addCriterion("STORAGE_LOCATION =", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION <>", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION >", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION >=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThan(String value) {
            addCriterion("STORAGE_LOCATION <", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION <=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLike(String value) {
            addCriterion("STORAGE_LOCATION like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotLike(String value) {
            addCriterion("STORAGE_LOCATION not like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIn(List<String> values) {
            addCriterion("STORAGE_LOCATION in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION not in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION not between", value1, value2, "storageLocation");
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

        public Criteria andCrtTmIsNull() {
            addCriterion("CRT_TM is null");
            return (Criteria) this;
        }

        public Criteria andCrtTmIsNotNull() {
            addCriterion("CRT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTmEqualTo(Date value) {
            addCriterion("CRT_TM =", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmNotEqualTo(Date value) {
            addCriterion("CRT_TM <>", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmGreaterThan(Date value) {
            addCriterion("CRT_TM >", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TM >=", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmLessThan(Date value) {
            addCriterion("CRT_TM <", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TM <=", value, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmIn(List<Date> values) {
            addCriterion("CRT_TM in", values, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmNotIn(List<Date> values) {
            addCriterion("CRT_TM not in", values, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmBetween(Date value1, Date value2) {
            addCriterion("CRT_TM between", value1, value2, "crtTm");
            return (Criteria) this;
        }

        public Criteria andCrtTmNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TM not between", value1, value2, "crtTm");
            return (Criteria) this;
        }

        public Criteria andUpTlrIsNull() {
            addCriterion("UP_TLR is null");
            return (Criteria) this;
        }

        public Criteria andUpTlrIsNotNull() {
            addCriterion("UP_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andUpTlrEqualTo(String value) {
            addCriterion("UP_TLR =", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrNotEqualTo(String value) {
            addCriterion("UP_TLR <>", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrGreaterThan(String value) {
            addCriterion("UP_TLR >", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TLR >=", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrLessThan(String value) {
            addCriterion("UP_TLR <", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrLessThanOrEqualTo(String value) {
            addCriterion("UP_TLR <=", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrLike(String value) {
            addCriterion("UP_TLR like", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrNotLike(String value) {
            addCriterion("UP_TLR not like", value, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrIn(List<String> values) {
            addCriterion("UP_TLR in", values, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrNotIn(List<String> values) {
            addCriterion("UP_TLR not in", values, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrBetween(String value1, String value2) {
            addCriterion("UP_TLR between", value1, value2, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTlrNotBetween(String value1, String value2) {
            addCriterion("UP_TLR not between", value1, value2, "upTlr");
            return (Criteria) this;
        }

        public Criteria andUpTmIsNull() {
            addCriterion("UP_TM is null");
            return (Criteria) this;
        }

        public Criteria andUpTmIsNotNull() {
            addCriterion("UP_TM is not null");
            return (Criteria) this;
        }

        public Criteria andUpTmEqualTo(Date value) {
            addCriterion("UP_TM =", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmNotEqualTo(Date value) {
            addCriterion("UP_TM <>", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmGreaterThan(Date value) {
            addCriterion("UP_TM >", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_TM >=", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmLessThan(Date value) {
            addCriterion("UP_TM <", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmLessThanOrEqualTo(Date value) {
            addCriterion("UP_TM <=", value, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmIn(List<Date> values) {
            addCriterion("UP_TM in", values, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmNotIn(List<Date> values) {
            addCriterion("UP_TM not in", values, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmBetween(Date value1, Date value2) {
            addCriterion("UP_TM between", value1, value2, "upTm");
            return (Criteria) this;
        }

        public Criteria andUpTmNotBetween(Date value1, Date value2) {
            addCriterion("UP_TM not between", value1, value2, "upTm");
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
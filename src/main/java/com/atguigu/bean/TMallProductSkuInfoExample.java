package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallProductSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallProductSkuInfoExample() {
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

        public Criteria andShpYsIsNull() {
            addCriterion("shp_ys is null");
            return (Criteria) this;
        }

        public Criteria andShpYsIsNotNull() {
            addCriterion("shp_ys is not null");
            return (Criteria) this;
        }

        public Criteria andShpYsEqualTo(Integer value) {
            addCriterion("shp_ys =", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotEqualTo(Integer value) {
            addCriterion("shp_ys <>", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsGreaterThan(Integer value) {
            addCriterion("shp_ys >", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsGreaterThanOrEqualTo(Integer value) {
            addCriterion("shp_ys >=", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsLessThan(Integer value) {
            addCriterion("shp_ys <", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsLessThanOrEqualTo(Integer value) {
            addCriterion("shp_ys <=", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsIn(List<Integer> values) {
            addCriterion("shp_ys in", values, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotIn(List<Integer> values) {
            addCriterion("shp_ys not in", values, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsBetween(Integer value1, Integer value2) {
            addCriterion("shp_ys between", value1, value2, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotBetween(Integer value1, Integer value2) {
            addCriterion("shp_ys not between", value1, value2, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpBbIsNull() {
            addCriterion("shp_bb is null");
            return (Criteria) this;
        }

        public Criteria andShpBbIsNotNull() {
            addCriterion("shp_bb is not null");
            return (Criteria) this;
        }

        public Criteria andShpBbEqualTo(Integer value) {
            addCriterion("shp_bb =", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbNotEqualTo(Integer value) {
            addCriterion("shp_bb <>", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbGreaterThan(Integer value) {
            addCriterion("shp_bb >", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbGreaterThanOrEqualTo(Integer value) {
            addCriterion("shp_bb >=", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbLessThan(Integer value) {
            addCriterion("shp_bb <", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbLessThanOrEqualTo(Integer value) {
            addCriterion("shp_bb <=", value, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbIn(List<Integer> values) {
            addCriterion("shp_bb in", values, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbNotIn(List<Integer> values) {
            addCriterion("shp_bb not in", values, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbBetween(Integer value1, Integer value2) {
            addCriterion("shp_bb between", value1, value2, "shpBb");
            return (Criteria) this;
        }

        public Criteria andShpBbNotBetween(Integer value1, Integer value2) {
            addCriterion("shp_bb not between", value1, value2, "shpBb");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andShpMshIsNull() {
            addCriterion("shp_msh is null");
            return (Criteria) this;
        }

        public Criteria andShpMshIsNotNull() {
            addCriterion("shp_msh is not null");
            return (Criteria) this;
        }

        public Criteria andShpMshEqualTo(String value) {
            addCriterion("shp_msh =", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshNotEqualTo(String value) {
            addCriterion("shp_msh <>", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshGreaterThan(String value) {
            addCriterion("shp_msh >", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshGreaterThanOrEqualTo(String value) {
            addCriterion("shp_msh >=", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshLessThan(String value) {
            addCriterion("shp_msh <", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshLessThanOrEqualTo(String value) {
            addCriterion("shp_msh <=", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshLike(String value) {
            addCriterion("shp_msh like", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshNotLike(String value) {
            addCriterion("shp_msh not like", value, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshIn(List<String> values) {
            addCriterion("shp_msh in", values, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshNotIn(List<String> values) {
            addCriterion("shp_msh not in", values, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshBetween(String value1, String value2) {
            addCriterion("shp_msh between", value1, value2, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpMshNotBetween(String value1, String value2) {
            addCriterion("shp_msh not between", value1, value2, "shpMsh");
            return (Criteria) this;
        }

        public Criteria andShpLbIsNull() {
            addCriterion("shp_lb is null");
            return (Criteria) this;
        }

        public Criteria andShpLbIsNotNull() {
            addCriterion("shp_lb is not null");
            return (Criteria) this;
        }

        public Criteria andShpLbEqualTo(String value) {
            addCriterion("shp_lb =", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbNotEqualTo(String value) {
            addCriterion("shp_lb <>", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbGreaterThan(String value) {
            addCriterion("shp_lb >", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbGreaterThanOrEqualTo(String value) {
            addCriterion("shp_lb >=", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbLessThan(String value) {
            addCriterion("shp_lb <", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbLessThanOrEqualTo(String value) {
            addCriterion("shp_lb <=", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbLike(String value) {
            addCriterion("shp_lb like", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbNotLike(String value) {
            addCriterion("shp_lb not like", value, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbIn(List<String> values) {
            addCriterion("shp_lb in", values, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbNotIn(List<String> values) {
            addCriterion("shp_lb not in", values, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbBetween(String value1, String value2) {
            addCriterion("shp_lb between", value1, value2, "shpLb");
            return (Criteria) this;
        }

        public Criteria andShpLbNotBetween(String value1, String value2) {
            addCriterion("shp_lb not between", value1, value2, "shpLb");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNull() {
            addCriterion("pp_id is null");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNotNull() {
            addCriterion("pp_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpIdEqualTo(Integer value) {
            addCriterion("pp_id =", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotEqualTo(Integer value) {
            addCriterion("pp_id <>", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThan(Integer value) {
            addCriterion("pp_id >", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_id >=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThan(Integer value) {
            addCriterion("pp_id <", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_id <=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdIn(List<Integer> values) {
            addCriterion("pp_id in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotIn(List<Integer> values) {
            addCriterion("pp_id not in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_id between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_id not between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andShpzZhlIsNull() {
            addCriterion("shpz_zhl is null");
            return (Criteria) this;
        }

        public Criteria andShpzZhlIsNotNull() {
            addCriterion("shpz_zhl is not null");
            return (Criteria) this;
        }

        public Criteria andShpzZhlEqualTo(Double value) {
            addCriterion("shpz_zhl =", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlNotEqualTo(Double value) {
            addCriterion("shpz_zhl <>", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlGreaterThan(Double value) {
            addCriterion("shpz_zhl >", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlGreaterThanOrEqualTo(Double value) {
            addCriterion("shpz_zhl >=", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlLessThan(Double value) {
            addCriterion("shpz_zhl <", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlLessThanOrEqualTo(Double value) {
            addCriterion("shpz_zhl <=", value, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlIn(List<Double> values) {
            addCriterion("shpz_zhl in", values, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlNotIn(List<Double> values) {
            addCriterion("shpz_zhl not in", values, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlBetween(Double value1, Double value2) {
            addCriterion("shpz_zhl between", value1, value2, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpzZhlNotBetween(Double value1, Double value2) {
            addCriterion("shpz_zhl not between", value1, value2, "shpzZhl");
            return (Criteria) this;
        }

        public Criteria andShpChcIsNull() {
            addCriterion("shp_chc is null");
            return (Criteria) this;
        }

        public Criteria andShpChcIsNotNull() {
            addCriterion("shp_chc is not null");
            return (Criteria) this;
        }

        public Criteria andShpChcEqualTo(Double value) {
            addCriterion("shp_chc =", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcNotEqualTo(Double value) {
            addCriterion("shp_chc <>", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcGreaterThan(Double value) {
            addCriterion("shp_chc >", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcGreaterThanOrEqualTo(Double value) {
            addCriterion("shp_chc >=", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcLessThan(Double value) {
            addCriterion("shp_chc <", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcLessThanOrEqualTo(Double value) {
            addCriterion("shp_chc <=", value, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcIn(List<Double> values) {
            addCriterion("shp_chc in", values, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcNotIn(List<Double> values) {
            addCriterion("shp_chc not in", values, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcBetween(Double value1, Double value2) {
            addCriterion("shp_chc between", value1, value2, "shpChc");
            return (Criteria) this;
        }

        public Criteria andShpChcNotBetween(Double value1, Double value2) {
            addCriterion("shp_chc not between", value1, value2, "shpChc");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNull() {
            addCriterion("chjshj is null");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNotNull() {
            addCriterion("chjshj is not null");
            return (Criteria) this;
        }

        public Criteria andChjshjEqualTo(Date value) {
            addCriterion("chjshj =", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotEqualTo(Date value) {
            addCriterion("chjshj <>", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThan(Date value) {
            addCriterion("chjshj >", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThanOrEqualTo(Date value) {
            addCriterion("chjshj >=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThan(Date value) {
            addCriterion("chjshj <", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThanOrEqualTo(Date value) {
            addCriterion("chjshj <=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjIn(List<Date> values) {
            addCriterion("chjshj in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotIn(List<Date> values) {
            addCriterion("chjshj not in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjBetween(Date value1, Date value2) {
            addCriterion("chjshj between", value1, value2, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotBetween(Date value1, Date value2) {
            addCriterion("chjshj not between", value1, value2, "chjshj");
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
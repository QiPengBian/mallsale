package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallSkuExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShpIdIsNull() {
            addCriterion("shp_id is null");
            return (Criteria) this;
        }

        public Criteria andShpIdIsNotNull() {
            addCriterion("shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpIdEqualTo(Integer value) {
            addCriterion("shp_id =", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotEqualTo(Integer value) {
            addCriterion("shp_id <>", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThan(Integer value) {
            addCriterion("shp_id >", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shp_id >=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThan(Integer value) {
            addCriterion("shp_id <", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThanOrEqualTo(Integer value) {
            addCriterion("shp_id <=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdIn(List<Integer> values) {
            addCriterion("shp_id in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotIn(List<Integer> values) {
            addCriterion("shp_id not in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdBetween(Integer value1, Integer value2) {
            addCriterion("shp_id between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shp_id not between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andKcIsNull() {
            addCriterion("kc is null");
            return (Criteria) this;
        }

        public Criteria andKcIsNotNull() {
            addCriterion("kc is not null");
            return (Criteria) this;
        }

        public Criteria andKcEqualTo(Integer value) {
            addCriterion("kc =", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotEqualTo(Integer value) {
            addCriterion("kc <>", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcGreaterThan(Integer value) {
            addCriterion("kc >", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcGreaterThanOrEqualTo(Integer value) {
            addCriterion("kc >=", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcLessThan(Integer value) {
            addCriterion("kc <", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcLessThanOrEqualTo(Integer value) {
            addCriterion("kc <=", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcIn(List<Integer> values) {
            addCriterion("kc in", values, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotIn(List<Integer> values) {
            addCriterion("kc not in", values, "kc");
            return (Criteria) this;
        }

        public Criteria andKcBetween(Integer value1, Integer value2) {
            addCriterion("kc between", value1, value2, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotBetween(Integer value1, Integer value2) {
            addCriterion("kc not between", value1, value2, "kc");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(Double value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(Double value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(Double value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(Double value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(Double value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(Double value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<Double> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<Double> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(Double value1, Double value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(Double value1, Double value2) {
            addCriterion("jg not between", value1, value2, "jg");
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

        public Criteria andSkuMchIsNull() {
            addCriterion("sku_mch is null");
            return (Criteria) this;
        }

        public Criteria andSkuMchIsNotNull() {
            addCriterion("sku_mch is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMchEqualTo(String value) {
            addCriterion("sku_mch =", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchNotEqualTo(String value) {
            addCriterion("sku_mch <>", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchGreaterThan(String value) {
            addCriterion("sku_mch >", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchGreaterThanOrEqualTo(String value) {
            addCriterion("sku_mch >=", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchLessThan(String value) {
            addCriterion("sku_mch <", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchLessThanOrEqualTo(String value) {
            addCriterion("sku_mch <=", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchLike(String value) {
            addCriterion("sku_mch like", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchNotLike(String value) {
            addCriterion("sku_mch not like", value, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchIn(List<String> values) {
            addCriterion("sku_mch in", values, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchNotIn(List<String> values) {
            addCriterion("sku_mch not in", values, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchBetween(String value1, String value2) {
            addCriterion("sku_mch between", value1, value2, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuMchNotBetween(String value1, String value2) {
            addCriterion("sku_mch not between", value1, value2, "skuMch");
            return (Criteria) this;
        }

        public Criteria andSkuXlIsNull() {
            addCriterion("sku_xl is null");
            return (Criteria) this;
        }

        public Criteria andSkuXlIsNotNull() {
            addCriterion("sku_xl is not null");
            return (Criteria) this;
        }

        public Criteria andSkuXlEqualTo(Integer value) {
            addCriterion("sku_xl =", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlNotEqualTo(Integer value) {
            addCriterion("sku_xl <>", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlGreaterThan(Integer value) {
            addCriterion("sku_xl >", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_xl >=", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlLessThan(Integer value) {
            addCriterion("sku_xl <", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlLessThanOrEqualTo(Integer value) {
            addCriterion("sku_xl <=", value, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlIn(List<Integer> values) {
            addCriterion("sku_xl in", values, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlNotIn(List<Integer> values) {
            addCriterion("sku_xl not in", values, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlBetween(Integer value1, Integer value2) {
            addCriterion("sku_xl between", value1, value2, "skuXl");
            return (Criteria) this;
        }

        public Criteria andSkuXlNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_xl not between", value1, value2, "skuXl");
            return (Criteria) this;
        }

        public Criteria andKcdzIsNull() {
            addCriterion("kcdz is null");
            return (Criteria) this;
        }

        public Criteria andKcdzIsNotNull() {
            addCriterion("kcdz is not null");
            return (Criteria) this;
        }

        public Criteria andKcdzEqualTo(String value) {
            addCriterion("kcdz =", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzNotEqualTo(String value) {
            addCriterion("kcdz <>", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzGreaterThan(String value) {
            addCriterion("kcdz >", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzGreaterThanOrEqualTo(String value) {
            addCriterion("kcdz >=", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzLessThan(String value) {
            addCriterion("kcdz <", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzLessThanOrEqualTo(String value) {
            addCriterion("kcdz <=", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzLike(String value) {
            addCriterion("kcdz like", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzNotLike(String value) {
            addCriterion("kcdz not like", value, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzIn(List<String> values) {
            addCriterion("kcdz in", values, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzNotIn(List<String> values) {
            addCriterion("kcdz not in", values, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzBetween(String value1, String value2) {
            addCriterion("kcdz between", value1, value2, "kcdz");
            return (Criteria) this;
        }

        public Criteria andKcdzNotBetween(String value1, String value2) {
            addCriterion("kcdz not between", value1, value2, "kcdz");
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
package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallProductColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallProductColorExample() {
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

        public Criteria andShpYsIsNull() {
            addCriterion("shp_ys is null");
            return (Criteria) this;
        }

        public Criteria andShpYsIsNotNull() {
            addCriterion("shp_ys is not null");
            return (Criteria) this;
        }

        public Criteria andShpYsEqualTo(String value) {
            addCriterion("shp_ys =", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotEqualTo(String value) {
            addCriterion("shp_ys <>", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsGreaterThan(String value) {
            addCriterion("shp_ys >", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsGreaterThanOrEqualTo(String value) {
            addCriterion("shp_ys >=", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsLessThan(String value) {
            addCriterion("shp_ys <", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsLessThanOrEqualTo(String value) {
            addCriterion("shp_ys <=", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsLike(String value) {
            addCriterion("shp_ys like", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotLike(String value) {
            addCriterion("shp_ys not like", value, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsIn(List<String> values) {
            addCriterion("shp_ys in", values, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotIn(List<String> values) {
            addCriterion("shp_ys not in", values, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsBetween(String value1, String value2) {
            addCriterion("shp_ys between", value1, value2, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShpYsNotBetween(String value1, String value2) {
            addCriterion("shp_ys not between", value1, value2, "shpYs");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNull() {
            addCriterion("shfqy is null");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNotNull() {
            addCriterion("shfqy is not null");
            return (Criteria) this;
        }

        public Criteria andShfqyEqualTo(Integer value) {
            addCriterion("shfqy =", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotEqualTo(Integer value) {
            addCriterion("shfqy <>", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThan(Integer value) {
            addCriterion("shfqy >", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThanOrEqualTo(Integer value) {
            addCriterion("shfqy >=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThan(Integer value) {
            addCriterion("shfqy <", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThanOrEqualTo(Integer value) {
            addCriterion("shfqy <=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyIn(List<Integer> values) {
            addCriterion("shfqy in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotIn(List<Integer> values) {
            addCriterion("shfqy not in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyBetween(Integer value1, Integer value2) {
            addCriterion("shfqy between", value1, value2, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotBetween(Integer value1, Integer value2) {
            addCriterion("shfqy not between", value1, value2, "shfqy");
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
package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallProductExample() {
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

        public Criteria andShpMchIsNull() {
            addCriterion("shp_mch is null");
            return (Criteria) this;
        }

        public Criteria andShpMchIsNotNull() {
            addCriterion("shp_mch is not null");
            return (Criteria) this;
        }

        public Criteria andShpMchEqualTo(String value) {
            addCriterion("shp_mch =", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchNotEqualTo(String value) {
            addCriterion("shp_mch <>", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchGreaterThan(String value) {
            addCriterion("shp_mch >", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchGreaterThanOrEqualTo(String value) {
            addCriterion("shp_mch >=", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchLessThan(String value) {
            addCriterion("shp_mch <", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchLessThanOrEqualTo(String value) {
            addCriterion("shp_mch <=", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchLike(String value) {
            addCriterion("shp_mch like", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchNotLike(String value) {
            addCriterion("shp_mch not like", value, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchIn(List<String> values) {
            addCriterion("shp_mch in", values, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchNotIn(List<String> values) {
            addCriterion("shp_mch not in", values, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchBetween(String value1, String value2) {
            addCriterion("shp_mch between", value1, value2, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpMchNotBetween(String value1, String value2) {
            addCriterion("shp_mch not between", value1, value2, "shpMch");
            return (Criteria) this;
        }

        public Criteria andShpTpIsNull() {
            addCriterion("shp_tp is null");
            return (Criteria) this;
        }

        public Criteria andShpTpIsNotNull() {
            addCriterion("shp_tp is not null");
            return (Criteria) this;
        }

        public Criteria andShpTpEqualTo(String value) {
            addCriterion("shp_tp =", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpNotEqualTo(String value) {
            addCriterion("shp_tp <>", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpGreaterThan(String value) {
            addCriterion("shp_tp >", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpGreaterThanOrEqualTo(String value) {
            addCriterion("shp_tp >=", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpLessThan(String value) {
            addCriterion("shp_tp <", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpLessThanOrEqualTo(String value) {
            addCriterion("shp_tp <=", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpLike(String value) {
            addCriterion("shp_tp like", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpNotLike(String value) {
            addCriterion("shp_tp not like", value, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpIn(List<String> values) {
            addCriterion("shp_tp in", values, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpNotIn(List<String> values) {
            addCriterion("shp_tp not in", values, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpBetween(String value1, String value2) {
            addCriterion("shp_tp between", value1, value2, "shpTp");
            return (Criteria) this;
        }

        public Criteria andShpTpNotBetween(String value1, String value2) {
            addCriterion("shp_tp not between", value1, value2, "shpTp");
            return (Criteria) this;
        }

        public Criteria andFlbh1IsNull() {
            addCriterion("flbh1 is null");
            return (Criteria) this;
        }

        public Criteria andFlbh1IsNotNull() {
            addCriterion("flbh1 is not null");
            return (Criteria) this;
        }

        public Criteria andFlbh1EqualTo(Integer value) {
            addCriterion("flbh1 =", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1NotEqualTo(Integer value) {
            addCriterion("flbh1 <>", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1GreaterThan(Integer value) {
            addCriterion("flbh1 >", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1GreaterThanOrEqualTo(Integer value) {
            addCriterion("flbh1 >=", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1LessThan(Integer value) {
            addCriterion("flbh1 <", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1LessThanOrEqualTo(Integer value) {
            addCriterion("flbh1 <=", value, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1In(List<Integer> values) {
            addCriterion("flbh1 in", values, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1NotIn(List<Integer> values) {
            addCriterion("flbh1 not in", values, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1Between(Integer value1, Integer value2) {
            addCriterion("flbh1 between", value1, value2, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh1NotBetween(Integer value1, Integer value2) {
            addCriterion("flbh1 not between", value1, value2, "flbh1");
            return (Criteria) this;
        }

        public Criteria andFlbh2IsNull() {
            addCriterion("flbh2 is null");
            return (Criteria) this;
        }

        public Criteria andFlbh2IsNotNull() {
            addCriterion("flbh2 is not null");
            return (Criteria) this;
        }

        public Criteria andFlbh2EqualTo(Integer value) {
            addCriterion("flbh2 =", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2NotEqualTo(Integer value) {
            addCriterion("flbh2 <>", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2GreaterThan(Integer value) {
            addCriterion("flbh2 >", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2GreaterThanOrEqualTo(Integer value) {
            addCriterion("flbh2 >=", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2LessThan(Integer value) {
            addCriterion("flbh2 <", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2LessThanOrEqualTo(Integer value) {
            addCriterion("flbh2 <=", value, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2In(List<Integer> values) {
            addCriterion("flbh2 in", values, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2NotIn(List<Integer> values) {
            addCriterion("flbh2 not in", values, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2Between(Integer value1, Integer value2) {
            addCriterion("flbh2 between", value1, value2, "flbh2");
            return (Criteria) this;
        }

        public Criteria andFlbh2NotBetween(Integer value1, Integer value2) {
            addCriterion("flbh2 not between", value1, value2, "flbh2");
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
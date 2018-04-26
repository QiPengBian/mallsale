package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallFlowExample() {
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

        public Criteria andPsfshIsNull() {
            addCriterion("psfsh is null");
            return (Criteria) this;
        }

        public Criteria andPsfshIsNotNull() {
            addCriterion("psfsh is not null");
            return (Criteria) this;
        }

        public Criteria andPsfshEqualTo(String value) {
            addCriterion("psfsh =", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshNotEqualTo(String value) {
            addCriterion("psfsh <>", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshGreaterThan(String value) {
            addCriterion("psfsh >", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshGreaterThanOrEqualTo(String value) {
            addCriterion("psfsh >=", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshLessThan(String value) {
            addCriterion("psfsh <", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshLessThanOrEqualTo(String value) {
            addCriterion("psfsh <=", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshLike(String value) {
            addCriterion("psfsh like", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshNotLike(String value) {
            addCriterion("psfsh not like", value, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshIn(List<String> values) {
            addCriterion("psfsh in", values, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshNotIn(List<String> values) {
            addCriterion("psfsh not in", values, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshBetween(String value1, String value2) {
            addCriterion("psfsh between", value1, value2, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsfshNotBetween(String value1, String value2) {
            addCriterion("psfsh not between", value1, value2, "psfsh");
            return (Criteria) this;
        }

        public Criteria andPsshjIsNull() {
            addCriterion("psshj is null");
            return (Criteria) this;
        }

        public Criteria andPsshjIsNotNull() {
            addCriterion("psshj is not null");
            return (Criteria) this;
        }

        public Criteria andPsshjEqualTo(Date value) {
            addCriterion("psshj =", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjNotEqualTo(Date value) {
            addCriterion("psshj <>", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjGreaterThan(Date value) {
            addCriterion("psshj >", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjGreaterThanOrEqualTo(Date value) {
            addCriterion("psshj >=", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjLessThan(Date value) {
            addCriterion("psshj <", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjLessThanOrEqualTo(Date value) {
            addCriterion("psshj <=", value, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjIn(List<Date> values) {
            addCriterion("psshj in", values, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjNotIn(List<Date> values) {
            addCriterion("psshj not in", values, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjBetween(Date value1, Date value2) {
            addCriterion("psshj between", value1, value2, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsshjNotBetween(Date value1, Date value2) {
            addCriterion("psshj not between", value1, value2, "psshj");
            return (Criteria) this;
        }

        public Criteria andPsmshIsNull() {
            addCriterion("psmsh is null");
            return (Criteria) this;
        }

        public Criteria andPsmshIsNotNull() {
            addCriterion("psmsh is not null");
            return (Criteria) this;
        }

        public Criteria andPsmshEqualTo(String value) {
            addCriterion("psmsh =", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshNotEqualTo(String value) {
            addCriterion("psmsh <>", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshGreaterThan(String value) {
            addCriterion("psmsh >", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshGreaterThanOrEqualTo(String value) {
            addCriterion("psmsh >=", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshLessThan(String value) {
            addCriterion("psmsh <", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshLessThanOrEqualTo(String value) {
            addCriterion("psmsh <=", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshLike(String value) {
            addCriterion("psmsh like", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshNotLike(String value) {
            addCriterion("psmsh not like", value, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshIn(List<String> values) {
            addCriterion("psmsh in", values, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshNotIn(List<String> values) {
            addCriterion("psmsh not in", values, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshBetween(String value1, String value2) {
            addCriterion("psmsh between", value1, value2, "psmsh");
            return (Criteria) this;
        }

        public Criteria andPsmshNotBetween(String value1, String value2) {
            addCriterion("psmsh not between", value1, value2, "psmsh");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNull() {
            addCriterion("yh_id is null");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNotNull() {
            addCriterion("yh_id is not null");
            return (Criteria) this;
        }

        public Criteria andYhIdEqualTo(Integer value) {
            addCriterion("yh_id =", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotEqualTo(Integer value) {
            addCriterion("yh_id <>", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThan(Integer value) {
            addCriterion("yh_id >", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yh_id >=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThan(Integer value) {
            addCriterion("yh_id <", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThanOrEqualTo(Integer value) {
            addCriterion("yh_id <=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdIn(List<Integer> values) {
            addCriterion("yh_id in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotIn(List<Integer> values) {
            addCriterion("yh_id not in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdBetween(Integer value1, Integer value2) {
            addCriterion("yh_id between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yh_id not between", value1, value2, "yhId");
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

        public Criteria andDdIdIsNull() {
            addCriterion("dd_id is null");
            return (Criteria) this;
        }

        public Criteria andDdIdIsNotNull() {
            addCriterion("dd_id is not null");
            return (Criteria) this;
        }

        public Criteria andDdIdEqualTo(Integer value) {
            addCriterion("dd_id =", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotEqualTo(Integer value) {
            addCriterion("dd_id <>", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThan(Integer value) {
            addCriterion("dd_id >", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_id >=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThan(Integer value) {
            addCriterion("dd_id <", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThanOrEqualTo(Integer value) {
            addCriterion("dd_id <=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdIn(List<Integer> values) {
            addCriterion("dd_id in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotIn(List<Integer> values) {
            addCriterion("dd_id not in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdBetween(Integer value1, Integer value2) {
            addCriterion("dd_id between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_id not between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andMqddIsNull() {
            addCriterion("mqdd is null");
            return (Criteria) this;
        }

        public Criteria andMqddIsNotNull() {
            addCriterion("mqdd is not null");
            return (Criteria) this;
        }

        public Criteria andMqddEqualTo(String value) {
            addCriterion("mqdd =", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotEqualTo(String value) {
            addCriterion("mqdd <>", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddGreaterThan(String value) {
            addCriterion("mqdd >", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddGreaterThanOrEqualTo(String value) {
            addCriterion("mqdd >=", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLessThan(String value) {
            addCriterion("mqdd <", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLessThanOrEqualTo(String value) {
            addCriterion("mqdd <=", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLike(String value) {
            addCriterion("mqdd like", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotLike(String value) {
            addCriterion("mqdd not like", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddIn(List<String> values) {
            addCriterion("mqdd in", values, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotIn(List<String> values) {
            addCriterion("mqdd not in", values, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddBetween(String value1, String value2) {
            addCriterion("mqdd between", value1, value2, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotBetween(String value1, String value2) {
            addCriterion("mqdd not between", value1, value2, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMddIsNull() {
            addCriterion("mdd is null");
            return (Criteria) this;
        }

        public Criteria andMddIsNotNull() {
            addCriterion("mdd is not null");
            return (Criteria) this;
        }

        public Criteria andMddEqualTo(String value) {
            addCriterion("mdd =", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotEqualTo(String value) {
            addCriterion("mdd <>", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddGreaterThan(String value) {
            addCriterion("mdd >", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddGreaterThanOrEqualTo(String value) {
            addCriterion("mdd >=", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLessThan(String value) {
            addCriterion("mdd <", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLessThanOrEqualTo(String value) {
            addCriterion("mdd <=", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLike(String value) {
            addCriterion("mdd like", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotLike(String value) {
            addCriterion("mdd not like", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddIn(List<String> values) {
            addCriterion("mdd in", values, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotIn(List<String> values) {
            addCriterion("mdd not in", values, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddBetween(String value1, String value2) {
            addCriterion("mdd between", value1, value2, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotBetween(String value1, String value2) {
            addCriterion("mdd not between", value1, value2, "mdd");
            return (Criteria) this;
        }

        public Criteria andYwyIsNull() {
            addCriterion("ywy is null");
            return (Criteria) this;
        }

        public Criteria andYwyIsNotNull() {
            addCriterion("ywy is not null");
            return (Criteria) this;
        }

        public Criteria andYwyEqualTo(String value) {
            addCriterion("ywy =", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotEqualTo(String value) {
            addCriterion("ywy <>", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyGreaterThan(String value) {
            addCriterion("ywy >", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyGreaterThanOrEqualTo(String value) {
            addCriterion("ywy >=", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLessThan(String value) {
            addCriterion("ywy <", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLessThanOrEqualTo(String value) {
            addCriterion("ywy <=", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLike(String value) {
            addCriterion("ywy like", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotLike(String value) {
            addCriterion("ywy not like", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyIn(List<String> values) {
            addCriterion("ywy in", values, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotIn(List<String> values) {
            addCriterion("ywy not in", values, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyBetween(String value1, String value2) {
            addCriterion("ywy between", value1, value2, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotBetween(String value1, String value2) {
            addCriterion("ywy not between", value1, value2, "ywy");
            return (Criteria) this;
        }

        public Criteria andLxfshIsNull() {
            addCriterion("lxfsh is null");
            return (Criteria) this;
        }

        public Criteria andLxfshIsNotNull() {
            addCriterion("lxfsh is not null");
            return (Criteria) this;
        }

        public Criteria andLxfshEqualTo(String value) {
            addCriterion("lxfsh =", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshNotEqualTo(String value) {
            addCriterion("lxfsh <>", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshGreaterThan(String value) {
            addCriterion("lxfsh >", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshGreaterThanOrEqualTo(String value) {
            addCriterion("lxfsh >=", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshLessThan(String value) {
            addCriterion("lxfsh <", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshLessThanOrEqualTo(String value) {
            addCriterion("lxfsh <=", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshLike(String value) {
            addCriterion("lxfsh like", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshNotLike(String value) {
            addCriterion("lxfsh not like", value, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshIn(List<String> values) {
            addCriterion("lxfsh in", values, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshNotIn(List<String> values) {
            addCriterion("lxfsh not in", values, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshBetween(String value1, String value2) {
            addCriterion("lxfsh between", value1, value2, "lxfsh");
            return (Criteria) this;
        }

        public Criteria andLxfshNotBetween(String value1, String value2) {
            addCriterion("lxfsh not between", value1, value2, "lxfsh");
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
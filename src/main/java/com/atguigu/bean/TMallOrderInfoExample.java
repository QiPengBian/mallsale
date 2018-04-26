package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallOrderInfoExample() {
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

        public Criteria andSkuJgIsNull() {
            addCriterion("sku_jg is null");
            return (Criteria) this;
        }

        public Criteria andSkuJgIsNotNull() {
            addCriterion("sku_jg is not null");
            return (Criteria) this;
        }

        public Criteria andSkuJgEqualTo(Long value) {
            addCriterion("sku_jg =", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgNotEqualTo(Long value) {
            addCriterion("sku_jg <>", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgGreaterThan(Long value) {
            addCriterion("sku_jg >", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_jg >=", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgLessThan(Long value) {
            addCriterion("sku_jg <", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgLessThanOrEqualTo(Long value) {
            addCriterion("sku_jg <=", value, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgIn(List<Long> values) {
            addCriterion("sku_jg in", values, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgNotIn(List<Long> values) {
            addCriterion("sku_jg not in", values, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgBetween(Long value1, Long value2) {
            addCriterion("sku_jg between", value1, value2, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuJgNotBetween(Long value1, Long value2) {
            addCriterion("sku_jg not between", value1, value2, "skuJg");
            return (Criteria) this;
        }

        public Criteria andSkuShlIsNull() {
            addCriterion("sku_shl is null");
            return (Criteria) this;
        }

        public Criteria andSkuShlIsNotNull() {
            addCriterion("sku_shl is not null");
            return (Criteria) this;
        }

        public Criteria andSkuShlEqualTo(Integer value) {
            addCriterion("sku_shl =", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlNotEqualTo(Integer value) {
            addCriterion("sku_shl <>", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlGreaterThan(Integer value) {
            addCriterion("sku_shl >", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_shl >=", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlLessThan(Integer value) {
            addCriterion("sku_shl <", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlLessThanOrEqualTo(Integer value) {
            addCriterion("sku_shl <=", value, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlIn(List<Integer> values) {
            addCriterion("sku_shl in", values, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlNotIn(List<Integer> values) {
            addCriterion("sku_shl not in", values, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlBetween(Integer value1, Integer value2) {
            addCriterion("sku_shl between", value1, value2, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuShlNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_shl not between", value1, value2, "skuShl");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzIsNull() {
            addCriterion("sku_kcdz is null");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzIsNotNull() {
            addCriterion("sku_kcdz is not null");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzEqualTo(String value) {
            addCriterion("sku_kcdz =", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzNotEqualTo(String value) {
            addCriterion("sku_kcdz <>", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzGreaterThan(String value) {
            addCriterion("sku_kcdz >", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzGreaterThanOrEqualTo(String value) {
            addCriterion("sku_kcdz >=", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzLessThan(String value) {
            addCriterion("sku_kcdz <", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzLessThanOrEqualTo(String value) {
            addCriterion("sku_kcdz <=", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzLike(String value) {
            addCriterion("sku_kcdz like", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzNotLike(String value) {
            addCriterion("sku_kcdz not like", value, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzIn(List<String> values) {
            addCriterion("sku_kcdz in", values, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzNotIn(List<String> values) {
            addCriterion("sku_kcdz not in", values, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzBetween(String value1, String value2) {
            addCriterion("sku_kcdz between", value1, value2, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andSkuKcdzNotBetween(String value1, String value2) {
            addCriterion("sku_kcdz not between", value1, value2, "skuKcdz");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Integer value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Integer value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Integer value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Integer value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Integer> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Integer> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andGwchIdIsNull() {
            addCriterion("gwch_id is null");
            return (Criteria) this;
        }

        public Criteria andGwchIdIsNotNull() {
            addCriterion("gwch_id is not null");
            return (Criteria) this;
        }

        public Criteria andGwchIdEqualTo(Integer value) {
            addCriterion("gwch_id =", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdNotEqualTo(Integer value) {
            addCriterion("gwch_id <>", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdGreaterThan(Integer value) {
            addCriterion("gwch_id >", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gwch_id >=", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdLessThan(Integer value) {
            addCriterion("gwch_id <", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdLessThanOrEqualTo(Integer value) {
            addCriterion("gwch_id <=", value, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdIn(List<Integer> values) {
            addCriterion("gwch_id in", values, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdNotIn(List<Integer> values) {
            addCriterion("gwch_id not in", values, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdBetween(Integer value1, Integer value2) {
            addCriterion("gwch_id between", value1, value2, "gwchId");
            return (Criteria) this;
        }

        public Criteria andGwchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gwch_id not between", value1, value2, "gwchId");
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
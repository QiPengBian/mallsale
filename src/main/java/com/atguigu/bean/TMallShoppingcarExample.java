package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallShoppingcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallShoppingcarExample() {
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

        public Criteria andTjshlIsNull() {
            addCriterion("tjshl is null");
            return (Criteria) this;
        }

        public Criteria andTjshlIsNotNull() {
            addCriterion("tjshl is not null");
            return (Criteria) this;
        }

        public Criteria andTjshlEqualTo(Integer value) {
            addCriterion("tjshl =", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlNotEqualTo(Integer value) {
            addCriterion("tjshl <>", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlGreaterThan(Integer value) {
            addCriterion("tjshl >", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjshl >=", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlLessThan(Integer value) {
            addCriterion("tjshl <", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlLessThanOrEqualTo(Integer value) {
            addCriterion("tjshl <=", value, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlIn(List<Integer> values) {
            addCriterion("tjshl in", values, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlNotIn(List<Integer> values) {
            addCriterion("tjshl not in", values, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlBetween(Integer value1, Integer value2) {
            addCriterion("tjshl between", value1, value2, "tjshl");
            return (Criteria) this;
        }

        public Criteria andTjshlNotBetween(Integer value1, Integer value2) {
            addCriterion("tjshl not between", value1, value2, "tjshl");
            return (Criteria) this;
        }

        public Criteria andHjIsNull() {
            addCriterion("hj is null");
            return (Criteria) this;
        }

        public Criteria andHjIsNotNull() {
            addCriterion("hj is not null");
            return (Criteria) this;
        }

        public Criteria andHjEqualTo(Long value) {
            addCriterion("hj =", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotEqualTo(Long value) {
            addCriterion("hj <>", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThan(Long value) {
            addCriterion("hj >", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThanOrEqualTo(Long value) {
            addCriterion("hj >=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThan(Long value) {
            addCriterion("hj <", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThanOrEqualTo(Long value) {
            addCriterion("hj <=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjIn(List<Long> values) {
            addCriterion("hj in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotIn(List<Long> values) {
            addCriterion("hj not in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjBetween(Long value1, Long value2) {
            addCriterion("hj between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotBetween(Long value1, Long value2) {
            addCriterion("hj not between", value1, value2, "hj");
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

        public Criteria andShfxzIsNull() {
            addCriterion("shfxz is null");
            return (Criteria) this;
        }

        public Criteria andShfxzIsNotNull() {
            addCriterion("shfxz is not null");
            return (Criteria) this;
        }

        public Criteria andShfxzEqualTo(String value) {
            addCriterion("shfxz =", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzNotEqualTo(String value) {
            addCriterion("shfxz <>", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzGreaterThan(String value) {
            addCriterion("shfxz >", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzGreaterThanOrEqualTo(String value) {
            addCriterion("shfxz >=", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzLessThan(String value) {
            addCriterion("shfxz <", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzLessThanOrEqualTo(String value) {
            addCriterion("shfxz <=", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzLike(String value) {
            addCriterion("shfxz like", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzNotLike(String value) {
            addCriterion("shfxz not like", value, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzIn(List<String> values) {
            addCriterion("shfxz in", values, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzNotIn(List<String> values) {
            addCriterion("shfxz not in", values, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzBetween(String value1, String value2) {
            addCriterion("shfxz between", value1, value2, "shfxz");
            return (Criteria) this;
        }

        public Criteria andShfxzNotBetween(String value1, String value2) {
            addCriterion("shfxz not between", value1, value2, "shfxz");
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
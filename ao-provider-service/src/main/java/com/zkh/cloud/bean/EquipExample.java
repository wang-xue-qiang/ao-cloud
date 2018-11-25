package com.zkh.cloud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNoIsNull() {
            addCriterion("equip_no is null");
            return (Criteria) this;
        }

        public Criteria andEquipNoIsNotNull() {
            addCriterion("equip_no is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNoEqualTo(String value) {
            addCriterion("equip_no =", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotEqualTo(String value) {
            addCriterion("equip_no <>", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoGreaterThan(String value) {
            addCriterion("equip_no >", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoGreaterThanOrEqualTo(String value) {
            addCriterion("equip_no >=", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLessThan(String value) {
            addCriterion("equip_no <", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLessThanOrEqualTo(String value) {
            addCriterion("equip_no <=", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLike(String value) {
            addCriterion("equip_no like", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotLike(String value) {
            addCriterion("equip_no not like", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoIn(List<String> values) {
            addCriterion("equip_no in", values, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotIn(List<String> values) {
            addCriterion("equip_no not in", values, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoBetween(String value1, String value2) {
            addCriterion("equip_no between", value1, value2, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotBetween(String value1, String value2) {
            addCriterion("equip_no not between", value1, value2, "equipNo");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(String value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(String value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(String value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(String value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(String value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(String value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLike(String value) {
            addCriterion("cus_id like", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotLike(String value) {
            addCriterion("cus_id not like", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<String> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<String> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(String value1, String value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(String value1, String value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(String value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(String value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(String value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(String value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(String value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(String value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(String value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<String> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<String> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(String value1, String value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(String value1, String value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNull() {
            addCriterion("equip_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNotNull() {
            addCriterion("equip_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeEqualTo(String value) {
            addCriterion("equip_type =", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotEqualTo(String value) {
            addCriterion("equip_type <>", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThan(String value) {
            addCriterion("equip_type >", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equip_type >=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThan(String value) {
            addCriterion("equip_type <", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThanOrEqualTo(String value) {
            addCriterion("equip_type <=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLike(String value) {
            addCriterion("equip_type like", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotLike(String value) {
            addCriterion("equip_type not like", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIn(List<String> values) {
            addCriterion("equip_type in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotIn(List<String> values) {
            addCriterion("equip_type not in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeBetween(String value1, String value2) {
            addCriterion("equip_type between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotBetween(String value1, String value2) {
            addCriterion("equip_type not between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andTermiSeqIsNull() {
            addCriterion("termi_seq is null");
            return (Criteria) this;
        }

        public Criteria andTermiSeqIsNotNull() {
            addCriterion("termi_seq is not null");
            return (Criteria) this;
        }

        public Criteria andTermiSeqEqualTo(String value) {
            addCriterion("termi_seq =", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqNotEqualTo(String value) {
            addCriterion("termi_seq <>", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqGreaterThan(String value) {
            addCriterion("termi_seq >", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("termi_seq >=", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqLessThan(String value) {
            addCriterion("termi_seq <", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqLessThanOrEqualTo(String value) {
            addCriterion("termi_seq <=", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqLike(String value) {
            addCriterion("termi_seq like", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqNotLike(String value) {
            addCriterion("termi_seq not like", value, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqIn(List<String> values) {
            addCriterion("termi_seq in", values, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqNotIn(List<String> values) {
            addCriterion("termi_seq not in", values, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqBetween(String value1, String value2) {
            addCriterion("termi_seq between", value1, value2, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiSeqNotBetween(String value1, String value2) {
            addCriterion("termi_seq not between", value1, value2, "termiSeq");
            return (Criteria) this;
        }

        public Criteria andTermiMacIsNull() {
            addCriterion("termi_mac is null");
            return (Criteria) this;
        }

        public Criteria andTermiMacIsNotNull() {
            addCriterion("termi_mac is not null");
            return (Criteria) this;
        }

        public Criteria andTermiMacEqualTo(String value) {
            addCriterion("termi_mac =", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacNotEqualTo(String value) {
            addCriterion("termi_mac <>", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacGreaterThan(String value) {
            addCriterion("termi_mac >", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacGreaterThanOrEqualTo(String value) {
            addCriterion("termi_mac >=", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacLessThan(String value) {
            addCriterion("termi_mac <", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacLessThanOrEqualTo(String value) {
            addCriterion("termi_mac <=", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacLike(String value) {
            addCriterion("termi_mac like", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacNotLike(String value) {
            addCriterion("termi_mac not like", value, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacIn(List<String> values) {
            addCriterion("termi_mac in", values, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacNotIn(List<String> values) {
            addCriterion("termi_mac not in", values, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacBetween(String value1, String value2) {
            addCriterion("termi_mac between", value1, value2, "termiMac");
            return (Criteria) this;
        }

        public Criteria andTermiMacNotBetween(String value1, String value2) {
            addCriterion("termi_mac not between", value1, value2, "termiMac");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNull() {
            addCriterion("ownership is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNotNull() {
            addCriterion("ownership is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipEqualTo(Integer value) {
            addCriterion("ownership =", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotEqualTo(Integer value) {
            addCriterion("ownership <>", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThan(Integer value) {
            addCriterion("ownership >", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownership >=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThan(Integer value) {
            addCriterion("ownership <", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThanOrEqualTo(Integer value) {
            addCriterion("ownership <=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipIn(List<Integer> values) {
            addCriterion("ownership in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotIn(List<Integer> values) {
            addCriterion("ownership not in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipBetween(Integer value1, Integer value2) {
            addCriterion("ownership between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotBetween(Integer value1, Integer value2) {
            addCriterion("ownership not between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andUsageshipIsNull() {
            addCriterion("usageship is null");
            return (Criteria) this;
        }

        public Criteria andUsageshipIsNotNull() {
            addCriterion("usageship is not null");
            return (Criteria) this;
        }

        public Criteria andUsageshipEqualTo(Integer value) {
            addCriterion("usageship =", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipNotEqualTo(Integer value) {
            addCriterion("usageship <>", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipGreaterThan(Integer value) {
            addCriterion("usageship >", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("usageship >=", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipLessThan(Integer value) {
            addCriterion("usageship <", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipLessThanOrEqualTo(Integer value) {
            addCriterion("usageship <=", value, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipIn(List<Integer> values) {
            addCriterion("usageship in", values, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipNotIn(List<Integer> values) {
            addCriterion("usageship not in", values, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipBetween(Integer value1, Integer value2) {
            addCriterion("usageship between", value1, value2, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageshipNotBetween(Integer value1, Integer value2) {
            addCriterion("usageship not between", value1, value2, "usageship");
            return (Criteria) this;
        }

        public Criteria andUsageNameIsNull() {
            addCriterion("usage_name is null");
            return (Criteria) this;
        }

        public Criteria andUsageNameIsNotNull() {
            addCriterion("usage_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsageNameEqualTo(String value) {
            addCriterion("usage_name =", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameNotEqualTo(String value) {
            addCriterion("usage_name <>", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameGreaterThan(String value) {
            addCriterion("usage_name >", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameGreaterThanOrEqualTo(String value) {
            addCriterion("usage_name >=", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameLessThan(String value) {
            addCriterion("usage_name <", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameLessThanOrEqualTo(String value) {
            addCriterion("usage_name <=", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameLike(String value) {
            addCriterion("usage_name like", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameNotLike(String value) {
            addCriterion("usage_name not like", value, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameIn(List<String> values) {
            addCriterion("usage_name in", values, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameNotIn(List<String> values) {
            addCriterion("usage_name not in", values, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameBetween(String value1, String value2) {
            addCriterion("usage_name between", value1, value2, "usageName");
            return (Criteria) this;
        }

        public Criteria andUsageNameNotBetween(String value1, String value2) {
            addCriterion("usage_name not between", value1, value2, "usageName");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNull() {
            addCriterion("model_no is null");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNotNull() {
            addCriterion("model_no is not null");
            return (Criteria) this;
        }

        public Criteria andModelNoEqualTo(String value) {
            addCriterion("model_no =", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotEqualTo(String value) {
            addCriterion("model_no <>", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThan(String value) {
            addCriterion("model_no >", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("model_no >=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThan(String value) {
            addCriterion("model_no <", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThanOrEqualTo(String value) {
            addCriterion("model_no <=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLike(String value) {
            addCriterion("model_no like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotLike(String value) {
            addCriterion("model_no not like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoIn(List<String> values) {
            addCriterion("model_no in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotIn(List<String> values) {
            addCriterion("model_no not in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoBetween(String value1, String value2) {
            addCriterion("model_no between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotBetween(String value1, String value2) {
            addCriterion("model_no not between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNull() {
            addCriterion("use_rate is null");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNotNull() {
            addCriterion("use_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUseRateEqualTo(String value) {
            addCriterion("use_rate =", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotEqualTo(String value) {
            addCriterion("use_rate <>", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThan(String value) {
            addCriterion("use_rate >", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThanOrEqualTo(String value) {
            addCriterion("use_rate >=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThan(String value) {
            addCriterion("use_rate <", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThanOrEqualTo(String value) {
            addCriterion("use_rate <=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLike(String value) {
            addCriterion("use_rate like", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotLike(String value) {
            addCriterion("use_rate not like", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateIn(List<String> values) {
            addCriterion("use_rate in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotIn(List<String> values) {
            addCriterion("use_rate not in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateBetween(String value1, String value2) {
            addCriterion("use_rate between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotBetween(String value1, String value2) {
            addCriterion("use_rate not between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateIsNull() {
            addCriterion("power_rate is null");
            return (Criteria) this;
        }

        public Criteria andPowerRateIsNotNull() {
            addCriterion("power_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPowerRateEqualTo(String value) {
            addCriterion("power_rate =", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotEqualTo(String value) {
            addCriterion("power_rate <>", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateGreaterThan(String value) {
            addCriterion("power_rate >", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateGreaterThanOrEqualTo(String value) {
            addCriterion("power_rate >=", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateLessThan(String value) {
            addCriterion("power_rate <", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateLessThanOrEqualTo(String value) {
            addCriterion("power_rate <=", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateLike(String value) {
            addCriterion("power_rate like", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotLike(String value) {
            addCriterion("power_rate not like", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateIn(List<String> values) {
            addCriterion("power_rate in", values, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotIn(List<String> values) {
            addCriterion("power_rate not in", values, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateBetween(String value1, String value2) {
            addCriterion("power_rate between", value1, value2, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotBetween(String value1, String value2) {
            addCriterion("power_rate not between", value1, value2, "powerRate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIsNull() {
            addCriterion("factory_date is null");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIsNotNull() {
            addCriterion("factory_date is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryDateEqualTo(Date value) {
            addCriterion("factory_date =", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotEqualTo(Date value) {
            addCriterion("factory_date <>", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateGreaterThan(Date value) {
            addCriterion("factory_date >", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("factory_date >=", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateLessThan(Date value) {
            addCriterion("factory_date <", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateLessThanOrEqualTo(Date value) {
            addCriterion("factory_date <=", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIn(List<Date> values) {
            addCriterion("factory_date in", values, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotIn(List<Date> values) {
            addCriterion("factory_date not in", values, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateBetween(Date value1, Date value2) {
            addCriterion("factory_date between", value1, value2, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotBetween(Date value1, Date value2) {
            addCriterion("factory_date not between", value1, value2, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andEquipSizeIsNull() {
            addCriterion("equip_size is null");
            return (Criteria) this;
        }

        public Criteria andEquipSizeIsNotNull() {
            addCriterion("equip_size is not null");
            return (Criteria) this;
        }

        public Criteria andEquipSizeEqualTo(String value) {
            addCriterion("equip_size =", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeNotEqualTo(String value) {
            addCriterion("equip_size <>", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeGreaterThan(String value) {
            addCriterion("equip_size >", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeGreaterThanOrEqualTo(String value) {
            addCriterion("equip_size >=", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeLessThan(String value) {
            addCriterion("equip_size <", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeLessThanOrEqualTo(String value) {
            addCriterion("equip_size <=", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeLike(String value) {
            addCriterion("equip_size like", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeNotLike(String value) {
            addCriterion("equip_size not like", value, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeIn(List<String> values) {
            addCriterion("equip_size in", values, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeNotIn(List<String> values) {
            addCriterion("equip_size not in", values, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeBetween(String value1, String value2) {
            addCriterion("equip_size between", value1, value2, "equipSize");
            return (Criteria) this;
        }

        public Criteria andEquipSizeNotBetween(String value1, String value2) {
            addCriterion("equip_size not between", value1, value2, "equipSize");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("cont_name is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("cont_name is not null");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("cont_name =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("cont_name <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("cont_name >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("cont_name >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("cont_name <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("cont_name <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("cont_name like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("cont_name not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("cont_name in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("cont_name not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("cont_name between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("cont_name not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNull() {
            addCriterion("cont_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNotNull() {
            addCriterion("cont_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContMobileEqualTo(String value) {
            addCriterion("cont_mobile =", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotEqualTo(String value) {
            addCriterion("cont_mobile <>", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThan(String value) {
            addCriterion("cont_mobile >", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cont_mobile >=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThan(String value) {
            addCriterion("cont_mobile <", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThanOrEqualTo(String value) {
            addCriterion("cont_mobile <=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLike(String value) {
            addCriterion("cont_mobile like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotLike(String value) {
            addCriterion("cont_mobile not like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileIn(List<String> values) {
            addCriterion("cont_mobile in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotIn(List<String> values) {
            addCriterion("cont_mobile not in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileBetween(String value1, String value2) {
            addCriterion("cont_mobile between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotBetween(String value1, String value2) {
            addCriterion("cont_mobile not between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andRunningStateIsNull() {
            addCriterion("running_state is null");
            return (Criteria) this;
        }

        public Criteria andRunningStateIsNotNull() {
            addCriterion("running_state is not null");
            return (Criteria) this;
        }

        public Criteria andRunningStateEqualTo(String value) {
            addCriterion("running_state =", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateNotEqualTo(String value) {
            addCriterion("running_state <>", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateGreaterThan(String value) {
            addCriterion("running_state >", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateGreaterThanOrEqualTo(String value) {
            addCriterion("running_state >=", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateLessThan(String value) {
            addCriterion("running_state <", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateLessThanOrEqualTo(String value) {
            addCriterion("running_state <=", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateLike(String value) {
            addCriterion("running_state like", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateNotLike(String value) {
            addCriterion("running_state not like", value, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateIn(List<String> values) {
            addCriterion("running_state in", values, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateNotIn(List<String> values) {
            addCriterion("running_state not in", values, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateBetween(String value1, String value2) {
            addCriterion("running_state between", value1, value2, "runningState");
            return (Criteria) this;
        }

        public Criteria andRunningStateNotBetween(String value1, String value2) {
            addCriterion("running_state not between", value1, value2, "runningState");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNull() {
            addCriterion("repair_state is null");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNotNull() {
            addCriterion("repair_state is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStateEqualTo(String value) {
            addCriterion("repair_state =", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotEqualTo(String value) {
            addCriterion("repair_state <>", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThan(String value) {
            addCriterion("repair_state >", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThanOrEqualTo(String value) {
            addCriterion("repair_state >=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThan(String value) {
            addCriterion("repair_state <", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThanOrEqualTo(String value) {
            addCriterion("repair_state <=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLike(String value) {
            addCriterion("repair_state like", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotLike(String value) {
            addCriterion("repair_state not like", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateIn(List<String> values) {
            addCriterion("repair_state in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotIn(List<String> values) {
            addCriterion("repair_state not in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateBetween(String value1, String value2) {
            addCriterion("repair_state between", value1, value2, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotBetween(String value1, String value2) {
            addCriterion("repair_state not between", value1, value2, "repairState");
            return (Criteria) this;
        }

        public Criteria andMaintStateIsNull() {
            addCriterion("maint_state is null");
            return (Criteria) this;
        }

        public Criteria andMaintStateIsNotNull() {
            addCriterion("maint_state is not null");
            return (Criteria) this;
        }

        public Criteria andMaintStateEqualTo(String value) {
            addCriterion("maint_state =", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateNotEqualTo(String value) {
            addCriterion("maint_state <>", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateGreaterThan(String value) {
            addCriterion("maint_state >", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateGreaterThanOrEqualTo(String value) {
            addCriterion("maint_state >=", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateLessThan(String value) {
            addCriterion("maint_state <", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateLessThanOrEqualTo(String value) {
            addCriterion("maint_state <=", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateLike(String value) {
            addCriterion("maint_state like", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateNotLike(String value) {
            addCriterion("maint_state not like", value, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateIn(List<String> values) {
            addCriterion("maint_state in", values, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateNotIn(List<String> values) {
            addCriterion("maint_state not in", values, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateBetween(String value1, String value2) {
            addCriterion("maint_state between", value1, value2, "maintState");
            return (Criteria) this;
        }

        public Criteria andMaintStateNotBetween(String value1, String value2) {
            addCriterion("maint_state not between", value1, value2, "maintState");
            return (Criteria) this;
        }

        public Criteria andExhaustIsNull() {
            addCriterion("exhaust is null");
            return (Criteria) this;
        }

        public Criteria andExhaustIsNotNull() {
            addCriterion("exhaust is not null");
            return (Criteria) this;
        }

        public Criteria andExhaustEqualTo(String value) {
            addCriterion("exhaust =", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotEqualTo(String value) {
            addCriterion("exhaust <>", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustGreaterThan(String value) {
            addCriterion("exhaust >", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustGreaterThanOrEqualTo(String value) {
            addCriterion("exhaust >=", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLessThan(String value) {
            addCriterion("exhaust <", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLessThanOrEqualTo(String value) {
            addCriterion("exhaust <=", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLike(String value) {
            addCriterion("exhaust like", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotLike(String value) {
            addCriterion("exhaust not like", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustIn(List<String> values) {
            addCriterion("exhaust in", values, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotIn(List<String> values) {
            addCriterion("exhaust not in", values, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustBetween(String value1, String value2) {
            addCriterion("exhaust between", value1, value2, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotBetween(String value1, String value2) {
            addCriterion("exhaust not between", value1, value2, "exhaust");
            return (Criteria) this;
        }

        public Criteria andPressLevelIsNull() {
            addCriterion("press_level is null");
            return (Criteria) this;
        }

        public Criteria andPressLevelIsNotNull() {
            addCriterion("press_level is not null");
            return (Criteria) this;
        }

        public Criteria andPressLevelEqualTo(String value) {
            addCriterion("press_level =", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelNotEqualTo(String value) {
            addCriterion("press_level <>", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelGreaterThan(String value) {
            addCriterion("press_level >", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelGreaterThanOrEqualTo(String value) {
            addCriterion("press_level >=", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelLessThan(String value) {
            addCriterion("press_level <", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelLessThanOrEqualTo(String value) {
            addCriterion("press_level <=", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelLike(String value) {
            addCriterion("press_level like", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelNotLike(String value) {
            addCriterion("press_level not like", value, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelIn(List<String> values) {
            addCriterion("press_level in", values, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelNotIn(List<String> values) {
            addCriterion("press_level not in", values, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelBetween(String value1, String value2) {
            addCriterion("press_level between", value1, value2, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andPressLevelNotBetween(String value1, String value2) {
            addCriterion("press_level not between", value1, value2, "pressLevel");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNull() {
            addCriterion("comp_type is null");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNotNull() {
            addCriterion("comp_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompTypeEqualTo(String value) {
            addCriterion("comp_type =", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotEqualTo(String value) {
            addCriterion("comp_type <>", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThan(String value) {
            addCriterion("comp_type >", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_type >=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThan(String value) {
            addCriterion("comp_type <", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThanOrEqualTo(String value) {
            addCriterion("comp_type <=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLike(String value) {
            addCriterion("comp_type like", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotLike(String value) {
            addCriterion("comp_type not like", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeIn(List<String> values) {
            addCriterion("comp_type in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotIn(List<String> values) {
            addCriterion("comp_type not in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeBetween(String value1, String value2) {
            addCriterion("comp_type between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotBetween(String value1, String value2) {
            addCriterion("comp_type not between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andCompNoIsNull() {
            addCriterion("comp_no is null");
            return (Criteria) this;
        }

        public Criteria andCompNoIsNotNull() {
            addCriterion("comp_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompNoEqualTo(String value) {
            addCriterion("comp_no =", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoNotEqualTo(String value) {
            addCriterion("comp_no <>", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoGreaterThan(String value) {
            addCriterion("comp_no >", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoGreaterThanOrEqualTo(String value) {
            addCriterion("comp_no >=", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoLessThan(String value) {
            addCriterion("comp_no <", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoLessThanOrEqualTo(String value) {
            addCriterion("comp_no <=", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoLike(String value) {
            addCriterion("comp_no like", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoNotLike(String value) {
            addCriterion("comp_no not like", value, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoIn(List<String> values) {
            addCriterion("comp_no in", values, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoNotIn(List<String> values) {
            addCriterion("comp_no not in", values, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoBetween(String value1, String value2) {
            addCriterion("comp_no between", value1, value2, "compNo");
            return (Criteria) this;
        }

        public Criteria andCompNoNotBetween(String value1, String value2) {
            addCriterion("comp_no not between", value1, value2, "compNo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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
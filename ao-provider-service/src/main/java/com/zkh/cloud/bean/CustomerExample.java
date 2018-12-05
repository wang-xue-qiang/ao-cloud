package com.zkh.cloud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("cus_no is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("cus_no is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("cus_no =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("cus_no <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("cus_no >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("cus_no >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("cus_no <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("cus_no <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("cus_no like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("cus_no not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("cus_no in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("cus_no not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("cus_no between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("cus_no not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(Long value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(Long value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(Long value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(Long value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(Long value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(Long value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<Long> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<Long> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(Long value1, Long value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(Long value1, Long value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIsNull() {
            addCriterion("cus_province is null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIsNotNull() {
            addCriterion("cus_province is not null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceEqualTo(String value) {
            addCriterion("cus_province =", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotEqualTo(String value) {
            addCriterion("cus_province <>", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceGreaterThan(String value) {
            addCriterion("cus_province >", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("cus_province >=", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLessThan(String value) {
            addCriterion("cus_province <", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLessThanOrEqualTo(String value) {
            addCriterion("cus_province <=", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLike(String value) {
            addCriterion("cus_province like", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotLike(String value) {
            addCriterion("cus_province not like", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIn(List<String> values) {
            addCriterion("cus_province in", values, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotIn(List<String> values) {
            addCriterion("cus_province not in", values, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceBetween(String value1, String value2) {
            addCriterion("cus_province between", value1, value2, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotBetween(String value1, String value2) {
            addCriterion("cus_province not between", value1, value2, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNull() {
            addCriterion("cus_city is null");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNotNull() {
            addCriterion("cus_city is not null");
            return (Criteria) this;
        }

        public Criteria andCusCityEqualTo(String value) {
            addCriterion("cus_city =", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotEqualTo(String value) {
            addCriterion("cus_city <>", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThan(String value) {
            addCriterion("cus_city >", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThanOrEqualTo(String value) {
            addCriterion("cus_city >=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThan(String value) {
            addCriterion("cus_city <", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThanOrEqualTo(String value) {
            addCriterion("cus_city <=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLike(String value) {
            addCriterion("cus_city like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotLike(String value) {
            addCriterion("cus_city not like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityIn(List<String> values) {
            addCriterion("cus_city in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotIn(List<String> values) {
            addCriterion("cus_city not in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityBetween(String value1, String value2) {
            addCriterion("cus_city between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotBetween(String value1, String value2) {
            addCriterion("cus_city not between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusDistrictIsNull() {
            addCriterion("cus_district is null");
            return (Criteria) this;
        }

        public Criteria andCusDistrictIsNotNull() {
            addCriterion("cus_district is not null");
            return (Criteria) this;
        }

        public Criteria andCusDistrictEqualTo(String value) {
            addCriterion("cus_district =", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictNotEqualTo(String value) {
            addCriterion("cus_district <>", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictGreaterThan(String value) {
            addCriterion("cus_district >", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("cus_district >=", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictLessThan(String value) {
            addCriterion("cus_district <", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictLessThanOrEqualTo(String value) {
            addCriterion("cus_district <=", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictLike(String value) {
            addCriterion("cus_district like", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictNotLike(String value) {
            addCriterion("cus_district not like", value, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictIn(List<String> values) {
            addCriterion("cus_district in", values, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictNotIn(List<String> values) {
            addCriterion("cus_district not in", values, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictBetween(String value1, String value2) {
            addCriterion("cus_district between", value1, value2, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusDistrictNotBetween(String value1, String value2) {
            addCriterion("cus_district not between", value1, value2, "cusDistrict");
            return (Criteria) this;
        }

        public Criteria andCusRoadIsNull() {
            addCriterion("cus_road is null");
            return (Criteria) this;
        }

        public Criteria andCusRoadIsNotNull() {
            addCriterion("cus_road is not null");
            return (Criteria) this;
        }

        public Criteria andCusRoadEqualTo(String value) {
            addCriterion("cus_road =", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadNotEqualTo(String value) {
            addCriterion("cus_road <>", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadGreaterThan(String value) {
            addCriterion("cus_road >", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadGreaterThanOrEqualTo(String value) {
            addCriterion("cus_road >=", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadLessThan(String value) {
            addCriterion("cus_road <", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadLessThanOrEqualTo(String value) {
            addCriterion("cus_road <=", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadLike(String value) {
            addCriterion("cus_road like", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadNotLike(String value) {
            addCriterion("cus_road not like", value, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadIn(List<String> values) {
            addCriterion("cus_road in", values, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadNotIn(List<String> values) {
            addCriterion("cus_road not in", values, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadBetween(String value1, String value2) {
            addCriterion("cus_road between", value1, value2, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andCusRoadNotBetween(String value1, String value2) {
            addCriterion("cus_road not between", value1, value2, "cusRoad");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Long value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Long value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Long value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Long value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Long value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Long> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Long> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Long value1, Long value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Long value1, Long value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Long value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Long value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Long value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Long value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Long value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Long value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Long> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Long> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Long value1, Long value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Long value1, Long value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Long value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Long value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Long value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Long value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Long value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Long> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Long> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Long value1, Long value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Long value1, Long value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNull() {
            addCriterion("staff_tel is null");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNotNull() {
            addCriterion("staff_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTelEqualTo(String value) {
            addCriterion("staff_tel =", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotEqualTo(String value) {
            addCriterion("staff_tel <>", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThan(String value) {
            addCriterion("staff_tel >", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_tel >=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThan(String value) {
            addCriterion("staff_tel <", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThanOrEqualTo(String value) {
            addCriterion("staff_tel <=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLike(String value) {
            addCriterion("staff_tel like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotLike(String value) {
            addCriterion("staff_tel not like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelIn(List<String> values) {
            addCriterion("staff_tel in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotIn(List<String> values) {
            addCriterion("staff_tel not in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelBetween(String value1, String value2) {
            addCriterion("staff_tel between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotBetween(String value1, String value2) {
            addCriterion("staff_tel not between", value1, value2, "staffTel");
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
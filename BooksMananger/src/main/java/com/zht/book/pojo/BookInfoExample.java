package com.zht.book.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Long value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Long value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Long value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Long value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Long value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Long> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Long> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Long value1, Long value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Long value1, Long value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNull() {
            addCriterion("book_code is null");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNotNull() {
            addCriterion("book_code is not null");
            return (Criteria) this;
        }

        public Criteria andBookCodeEqualTo(String value) {
            addCriterion("book_code =", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotEqualTo(String value) {
            addCriterion("book_code <>", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThan(String value) {
            addCriterion("book_code >", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThanOrEqualTo(String value) {
            addCriterion("book_code >=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThan(String value) {
            addCriterion("book_code <", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThanOrEqualTo(String value) {
            addCriterion("book_code <=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLike(String value) {
            addCriterion("book_code like", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotLike(String value) {
            addCriterion("book_code not like", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeIn(List<String> values) {
            addCriterion("book_code in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotIn(List<String> values) {
            addCriterion("book_code not in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeBetween(String value1, String value2) {
            addCriterion("book_code between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotBetween(String value1, String value2) {
            addCriterion("book_code not between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNull() {
            addCriterion("book_type is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNotNull() {
            addCriterion("book_type is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeEqualTo(Integer value) {
            addCriterion("book_type =", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotEqualTo(Integer value) {
            addCriterion("book_type <>", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThan(Integer value) {
            addCriterion("book_type >", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_type >=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThan(Integer value) {
            addCriterion("book_type <", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThanOrEqualTo(Integer value) {
            addCriterion("book_type <=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIn(List<Integer> values) {
            addCriterion("book_type in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotIn(List<Integer> values) {
            addCriterion("book_type not in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeBetween(Integer value1, Integer value2) {
            addCriterion("book_type between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("book_type not between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorIsNull() {
            addCriterion("book_atuthor is null");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorIsNotNull() {
            addCriterion("book_atuthor is not null");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorEqualTo(String value) {
            addCriterion("book_atuthor =", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorNotEqualTo(String value) {
            addCriterion("book_atuthor <>", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorGreaterThan(String value) {
            addCriterion("book_atuthor >", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_atuthor >=", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorLessThan(String value) {
            addCriterion("book_atuthor <", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorLessThanOrEqualTo(String value) {
            addCriterion("book_atuthor <=", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorLike(String value) {
            addCriterion("book_atuthor like", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorNotLike(String value) {
            addCriterion("book_atuthor not like", value, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorIn(List<String> values) {
            addCriterion("book_atuthor in", values, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorNotIn(List<String> values) {
            addCriterion("book_atuthor not in", values, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorBetween(String value1, String value2) {
            addCriterion("book_atuthor between", value1, value2, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andBookAtuthorNotBetween(String value1, String value2) {
            addCriterion("book_atuthor not between", value1, value2, "bookAtuthor");
            return (Criteria) this;
        }

        public Criteria andPublishPressIsNull() {
            addCriterion("publish_press is null");
            return (Criteria) this;
        }

        public Criteria andPublishPressIsNotNull() {
            addCriterion("publish_press is not null");
            return (Criteria) this;
        }

        public Criteria andPublishPressEqualTo(String value) {
            addCriterion("publish_press =", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressNotEqualTo(String value) {
            addCriterion("publish_press <>", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressGreaterThan(String value) {
            addCriterion("publish_press >", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressGreaterThanOrEqualTo(String value) {
            addCriterion("publish_press >=", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressLessThan(String value) {
            addCriterion("publish_press <", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressLessThanOrEqualTo(String value) {
            addCriterion("publish_press <=", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressLike(String value) {
            addCriterion("publish_press like", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressNotLike(String value) {
            addCriterion("publish_press not like", value, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressIn(List<String> values) {
            addCriterion("publish_press in", values, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressNotIn(List<String> values) {
            addCriterion("publish_press not in", values, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressBetween(String value1, String value2) {
            addCriterion("publish_press between", value1, value2, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishPressNotBetween(String value1, String value2) {
            addCriterion("publish_press not between", value1, value2, "publishPress");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andIsBorrowIsNull() {
            addCriterion("is_borrow is null");
            return (Criteria) this;
        }

        public Criteria andIsBorrowIsNotNull() {
            addCriterion("is_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andIsBorrowEqualTo(Integer value) {
            addCriterion("is_borrow =", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowNotEqualTo(Integer value) {
            addCriterion("is_borrow <>", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowGreaterThan(Integer value) {
            addCriterion("is_borrow >", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_borrow >=", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowLessThan(Integer value) {
            addCriterion("is_borrow <", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowLessThanOrEqualTo(Integer value) {
            addCriterion("is_borrow <=", value, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowIn(List<Integer> values) {
            addCriterion("is_borrow in", values, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowNotIn(List<Integer> values) {
            addCriterion("is_borrow not in", values, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowBetween(Integer value1, Integer value2) {
            addCriterion("is_borrow between", value1, value2, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andIsBorrowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_borrow not between", value1, value2, "isBorrow");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("createdBy like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("createdBy not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterionForJDBCDate("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIsNull() {
            addCriterion("last_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIsNotNull() {
            addCriterion("last_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("last_updatetime =", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_updatetime <>", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_updatetime >", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_updatetime >=", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("last_updatetime <", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_updatetime <=", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("last_updatetime in", values, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_updatetime not in", values, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_updatetime between", value1, value2, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_updatetime not between", value1, value2, "lastUpdatetime");
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
package cn.mask.mask.user.biz.service.sys.sysrole.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserRolePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserRolePOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andValiFlagIsNull() {
            addCriterion("VALI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValiFlagIsNotNull() {
            addCriterion("VALI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValiFlagEqualTo(Boolean value) {
            addCriterion("VALI_FLAG =", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagNotEqualTo(Boolean value) {
            addCriterion("VALI_FLAG <>", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagGreaterThan(Boolean value) {
            addCriterion("VALI_FLAG >", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("VALI_FLAG >=", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagLessThan(Boolean value) {
            addCriterion("VALI_FLAG <", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("VALI_FLAG <=", value, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagIn(List<Boolean> values) {
            addCriterion("VALI_FLAG in", values, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagNotIn(List<Boolean> values) {
            addCriterion("VALI_FLAG not in", values, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("VALI_FLAG between", value1, value2, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andValiFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("VALI_FLAG not between", value1, value2, "valiFlag");
            return (Criteria) this;
        }

        public Criteria andUpdterIdIsNull() {
            addCriterion("UPDTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdterIdIsNotNull() {
            addCriterion("UPDTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdterIdEqualTo(String value) {
            addCriterion("UPDTER_ID =", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdNotEqualTo(String value) {
            addCriterion("UPDTER_ID <>", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdGreaterThan(String value) {
            addCriterion("UPDTER_ID >", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDTER_ID >=", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdLessThan(String value) {
            addCriterion("UPDTER_ID <", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdLessThanOrEqualTo(String value) {
            addCriterion("UPDTER_ID <=", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdLike(String value) {
            addCriterion("UPDTER_ID like", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdNotLike(String value) {
            addCriterion("UPDTER_ID not like", value, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdIn(List<String> values) {
            addCriterion("UPDTER_ID in", values, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdNotIn(List<String> values) {
            addCriterion("UPDTER_ID not in", values, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdBetween(String value1, String value2) {
            addCriterion("UPDTER_ID between", value1, value2, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterIdNotBetween(String value1, String value2) {
            addCriterion("UPDTER_ID not between", value1, value2, "updterId");
            return (Criteria) this;
        }

        public Criteria andUpdterNameIsNull() {
            addCriterion("UPDTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdterNameIsNotNull() {
            addCriterion("UPDTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdterNameEqualTo(String value) {
            addCriterion("UPDTER_NAME =", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameNotEqualTo(String value) {
            addCriterion("UPDTER_NAME <>", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameGreaterThan(String value) {
            addCriterion("UPDTER_NAME >", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDTER_NAME >=", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameLessThan(String value) {
            addCriterion("UPDTER_NAME <", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameLessThanOrEqualTo(String value) {
            addCriterion("UPDTER_NAME <=", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameLike(String value) {
            addCriterion("UPDTER_NAME like", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameNotLike(String value) {
            addCriterion("UPDTER_NAME not like", value, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameIn(List<String> values) {
            addCriterion("UPDTER_NAME in", values, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameNotIn(List<String> values) {
            addCriterion("UPDTER_NAME not in", values, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameBetween(String value1, String value2) {
            addCriterion("UPDTER_NAME between", value1, value2, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdterNameNotBetween(String value1, String value2) {
            addCriterion("UPDTER_NAME not between", value1, value2, "updterName");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeIsNull() {
            addCriterion("UPDT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeIsNotNull() {
            addCriterion("UPDT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeEqualTo(Date value) {
            addCriterion("UPDT_TIME =", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeNotEqualTo(Date value) {
            addCriterion("UPDT_TIME <>", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeGreaterThan(Date value) {
            addCriterion("UPDT_TIME >", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_TIME >=", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeLessThan(Date value) {
            addCriterion("UPDT_TIME <", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDT_TIME <=", value, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeIn(List<Date> values) {
            addCriterion("UPDT_TIME in", values, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeNotIn(List<Date> values) {
            addCriterion("UPDT_TIME not in", values, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeBetween(Date value1, Date value2) {
            addCriterion("UPDT_TIME between", value1, value2, "updtTime");
            return (Criteria) this;
        }

        public Criteria andUpdtTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDT_TIME not between", value1, value2, "updtTime");
            return (Criteria) this;
        }

        public Criteria andCrtorIdIsNull() {
            addCriterion("CRTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrtorIdIsNotNull() {
            addCriterion("CRTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrtorIdEqualTo(String value) {
            addCriterion("CRTOR_ID =", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdNotEqualTo(String value) {
            addCriterion("CRTOR_ID <>", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdGreaterThan(String value) {
            addCriterion("CRTOR_ID >", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CRTOR_ID >=", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdLessThan(String value) {
            addCriterion("CRTOR_ID <", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdLessThanOrEqualTo(String value) {
            addCriterion("CRTOR_ID <=", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdLike(String value) {
            addCriterion("CRTOR_ID like", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdNotLike(String value) {
            addCriterion("CRTOR_ID not like", value, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdIn(List<String> values) {
            addCriterion("CRTOR_ID in", values, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdNotIn(List<String> values) {
            addCriterion("CRTOR_ID not in", values, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdBetween(String value1, String value2) {
            addCriterion("CRTOR_ID between", value1, value2, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorIdNotBetween(String value1, String value2) {
            addCriterion("CRTOR_ID not between", value1, value2, "crtorId");
            return (Criteria) this;
        }

        public Criteria andCrtorNameIsNull() {
            addCriterion("CRTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtorNameIsNotNull() {
            addCriterion("CRTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtorNameEqualTo(String value) {
            addCriterion("CRTOR_NAME =", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameNotEqualTo(String value) {
            addCriterion("CRTOR_NAME <>", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameGreaterThan(String value) {
            addCriterion("CRTOR_NAME >", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRTOR_NAME >=", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameLessThan(String value) {
            addCriterion("CRTOR_NAME <", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameLessThanOrEqualTo(String value) {
            addCriterion("CRTOR_NAME <=", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameLike(String value) {
            addCriterion("CRTOR_NAME like", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameNotLike(String value) {
            addCriterion("CRTOR_NAME not like", value, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameIn(List<String> values) {
            addCriterion("CRTOR_NAME in", values, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameNotIn(List<String> values) {
            addCriterion("CRTOR_NAME not in", values, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameBetween(String value1, String value2) {
            addCriterion("CRTOR_NAME between", value1, value2, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCrtorNameNotBetween(String value1, String value2) {
            addCriterion("CRTOR_NAME not between", value1, value2, "crtorName");
            return (Criteria) this;
        }

        public Criteria andCretTimeIsNull() {
            addCriterion("CRET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCretTimeIsNotNull() {
            addCriterion("CRET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCretTimeEqualTo(Date value) {
            addCriterion("CRET_TIME =", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeNotEqualTo(Date value) {
            addCriterion("CRET_TIME <>", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeGreaterThan(Date value) {
            addCriterion("CRET_TIME >", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRET_TIME >=", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeLessThan(Date value) {
            addCriterion("CRET_TIME <", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRET_TIME <=", value, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeIn(List<Date> values) {
            addCriterion("CRET_TIME in", values, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeNotIn(List<Date> values) {
            addCriterion("CRET_TIME not in", values, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeBetween(Date value1, Date value2) {
            addCriterion("CRET_TIME between", value1, value2, "cretTime");
            return (Criteria) this;
        }

        public Criteria andCretTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRET_TIME not between", value1, value2, "cretTime");
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
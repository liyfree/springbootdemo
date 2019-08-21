package com.ly.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ag_student")
public class AgStudent implements Serializable {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 学生名称
     */
    @Column(name = "STU_NAME")
    private String stuName;

    /**
     * 学生性别
     */
    @Column(name = "STU_SEX")
    private Integer stuSex;

    /**
     * 学生类别
     */
    @Column(name = "STU_TYPE")
    private Integer stuType;

    /**
     * 就读城市
     */
    @Column(name = "STUDY_CITY")
    private String studyCity;

    @Column(name = "STUDY_SCHOOL")
    private String studySchool;

    /**
     * 毕业时间
     */
    @Column(name = "GRADUATE_DT")
    private Date graduateDt;

    /**
     * 联系人姓名
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    @Column(name = "CONTACT_TYPE")
    private Integer contactType;

    /**
     * 联系人电话
     */
    @Column(name = "CONTACT_PHONE")
    private String contactPhone;

    /**
     * 联系人姓名2
     */
    @Column(name = "CONTACT_NAME2")
    private String contactName2;

    /**
     * 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    @Column(name = "CONTACT_TYPE2")
    private Integer contactType2;

    /**
     * 联系人2电话
     */
    @Column(name = "CONTACT_PHONE2")
    private String contactPhone2;

    /**
     * 用户来源
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @Column(name = "CREATE_DT")
    private Date createDt;

    /**
     * 被分到的小组ID
     */
    @Column(name = "GROUP_ID")
    private Integer groupId;

    /**
     * 被分到的员工ID
     */
    @Column(name = "SYS_USER_ID")
    private String sysUserId;

    /**
     * 最后一次访问时间（冗余数据）
     */
    @Column(name = "LAST_VISIT_DT")
    private Date lastVisitDt;

    /**
     * 最后一次访问记录的记录时间（冗余数据）
     */
    @Column(name = "LAST_VISIT_RECORD_DT")
    private Date lastVisitRecordDt;

    /**
     * 学生状态（1-有效，2-冻结）
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 最新购买意向（1-A,2-B,3-C,4-D,5-E）
     */
    @Column(name = "LATEST_INTENT")
    private Integer latestIntent;

    /**
     * 服务商ID
     */
    @Column(name = "AGENCY_ID")
    private String agencyId;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取学生名称
     *
     * @return STU_NAME - 学生名称
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置学生名称
     *
     * @param stuName 学生名称
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * 获取学生性别
     *
     * @return STU_SEX - 学生性别
     */
    public Integer getStuSex() {
        return stuSex;
    }

    /**
     * 设置学生性别
     *
     * @param stuSex 学生性别
     */
    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    /**
     * 获取学生类别
     *
     * @return STU_TYPE - 学生类别
     */
    public Integer getStuType() {
        return stuType;
    }

    /**
     * 设置学生类别
     *
     * @param stuType 学生类别
     */
    public void setStuType(Integer stuType) {
        this.stuType = stuType;
    }

    /**
     * 获取就读城市
     *
     * @return STUDY_CITY - 就读城市
     */
    public String getStudyCity() {
        return studyCity;
    }

    /**
     * 设置就读城市
     *
     * @param studyCity 就读城市
     */
    public void setStudyCity(String studyCity) {
        this.studyCity = studyCity == null ? null : studyCity.trim();
    }

    /**
     * @return STUDY_SCHOOL
     */
    public String getStudySchool() {
        return studySchool;
    }

    /**
     * @param studySchool
     */
    public void setStudySchool(String studySchool) {
        this.studySchool = studySchool == null ? null : studySchool.trim();
    }

    /**
     * 获取毕业时间
     *
     * @return GRADUATE_DT - 毕业时间
     */
    public Date getGraduateDt() {
        return graduateDt;
    }

    /**
     * 设置毕业时间
     *
     * @param graduateDt 毕业时间
     */
    public void setGraduateDt(Date graduateDt) {
        this.graduateDt = graduateDt;
    }

    /**
     * 获取联系人姓名
     *
     * @return CONTACT_NAME - 联系人姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名
     *
     * @param contactName 联系人姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人类型（1-父母，2-学生，3-亲属，4-其它）
     *
     * @return CONTACT_TYPE - 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    public Integer getContactType() {
        return contactType;
    }

    /**
     * 设置联系人类型（1-父母，2-学生，3-亲属，4-其它）
     *
     * @param contactType 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    /**
     * 获取联系人电话
     *
     * @return CONTACT_PHONE - 联系人电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系人电话
     *
     * @param contactPhone 联系人电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取联系人姓名2
     *
     * @return CONTACT_NAME2 - 联系人姓名2
     */
    public String getContactName2() {
        return contactName2;
    }

    /**
     * 设置联系人姓名2
     *
     * @param contactName2 联系人姓名2
     */
    public void setContactName2(String contactName2) {
        this.contactName2 = contactName2 == null ? null : contactName2.trim();
    }

    /**
     * 获取联系人类型（1-父母，2-学生，3-亲属，4-其它）
     *
     * @return CONTACT_TYPE2 - 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    public Integer getContactType2() {
        return contactType2;
    }

    /**
     * 设置联系人类型（1-父母，2-学生，3-亲属，4-其它）
     *
     * @param contactType2 联系人类型（1-父母，2-学生，3-亲属，4-其它）
     */
    public void setContactType2(Integer contactType2) {
        this.contactType2 = contactType2;
    }

    /**
     * 获取联系人2电话
     *
     * @return CONTACT_PHONE2 - 联系人2电话
     */
    public String getContactPhone2() {
        return contactPhone2;
    }

    /**
     * 设置联系人2电话
     *
     * @param contactPhone2 联系人2电话
     */
    public void setContactPhone2(String contactPhone2) {
        this.contactPhone2 = contactPhone2 == null ? null : contactPhone2.trim();
    }

    /**
     * 获取用户来源
     *
     * @return SOURCE - 用户来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置用户来源
     *
     * @param source 用户来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DT - 创建时间
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 设置创建时间
     *
     * @param createDt 创建时间
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 获取被分到的小组ID
     *
     * @return GROUP_ID - 被分到的小组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置被分到的小组ID
     *
     * @param groupId 被分到的小组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取被分到的员工ID
     *
     * @return SYS_USER_ID - 被分到的员工ID
     */
    public String getSysUserId() {
        return sysUserId;
    }

    /**
     * 设置被分到的员工ID
     *
     * @param sysUserId 被分到的员工ID
     */
    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId == null ? null : sysUserId.trim();
    }

    /**
     * 获取最后一次访问时间（冗余数据）
     *
     * @return LAST_VISIT_DT - 最后一次访问时间（冗余数据）
     */
    public Date getLastVisitDt() {
        return lastVisitDt;
    }

    /**
     * 设置最后一次访问时间（冗余数据）
     *
     * @param lastVisitDt 最后一次访问时间（冗余数据）
     */
    public void setLastVisitDt(Date lastVisitDt) {
        this.lastVisitDt = lastVisitDt;
    }

    /**
     * 获取最后一次访问记录的记录时间（冗余数据）
     *
     * @return LAST_VISIT_RECORD_DT - 最后一次访问记录的记录时间（冗余数据）
     */
    public Date getLastVisitRecordDt() {
        return lastVisitRecordDt;
    }

    /**
     * 设置最后一次访问记录的记录时间（冗余数据）
     *
     * @param lastVisitRecordDt 最后一次访问记录的记录时间（冗余数据）
     */
    public void setLastVisitRecordDt(Date lastVisitRecordDt) {
        this.lastVisitRecordDt = lastVisitRecordDt;
    }

    /**
     * 获取学生状态（1-有效，2-冻结）
     *
     * @return STATUS - 学生状态（1-有效，2-冻结）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置学生状态（1-有效，2-冻结）
     *
     * @param status 学生状态（1-有效，2-冻结）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取最新购买意向（1-A,2-B,3-C,4-D,5-E）
     *
     * @return LATEST_INTENT - 最新购买意向（1-A,2-B,3-C,4-D,5-E）
     */
    public Integer getLatestIntent() {
        return latestIntent;
    }

    /**
     * 设置最新购买意向（1-A,2-B,3-C,4-D,5-E）
     *
     * @param latestIntent 最新购买意向（1-A,2-B,3-C,4-D,5-E）
     */
    public void setLatestIntent(Integer latestIntent) {
        this.latestIntent = latestIntent;
    }

    /**
     * 获取服务商ID
     *
     * @return AGENCY_ID - 服务商ID
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * 设置服务商ID
     *
     * @param agencyId 服务商ID
     */
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId == null ? null : agencyId.trim();
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AgStudent other = (AgStudent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getStuSex() == null ? other.getStuSex() == null : this.getStuSex().equals(other.getStuSex()))
            && (this.getStuType() == null ? other.getStuType() == null : this.getStuType().equals(other.getStuType()))
            && (this.getStudyCity() == null ? other.getStudyCity() == null : this.getStudyCity().equals(other.getStudyCity()))
            && (this.getStudySchool() == null ? other.getStudySchool() == null : this.getStudySchool().equals(other.getStudySchool()))
            && (this.getGraduateDt() == null ? other.getGraduateDt() == null : this.getGraduateDt().equals(other.getGraduateDt()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactType() == null ? other.getContactType() == null : this.getContactType().equals(other.getContactType()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getContactName2() == null ? other.getContactName2() == null : this.getContactName2().equals(other.getContactName2()))
            && (this.getContactType2() == null ? other.getContactType2() == null : this.getContactType2().equals(other.getContactType2()))
            && (this.getContactPhone2() == null ? other.getContactPhone2() == null : this.getContactPhone2().equals(other.getContactPhone2()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getSysUserId() == null ? other.getSysUserId() == null : this.getSysUserId().equals(other.getSysUserId()))
            && (this.getLastVisitDt() == null ? other.getLastVisitDt() == null : this.getLastVisitDt().equals(other.getLastVisitDt()))
            && (this.getLastVisitRecordDt() == null ? other.getLastVisitRecordDt() == null : this.getLastVisitRecordDt().equals(other.getLastVisitRecordDt()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLatestIntent() == null ? other.getLatestIntent() == null : this.getLatestIntent().equals(other.getLatestIntent()))
            && (this.getAgencyId() == null ? other.getAgencyId() == null : this.getAgencyId().equals(other.getAgencyId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getStuSex() == null) ? 0 : getStuSex().hashCode());
        result = prime * result + ((getStuType() == null) ? 0 : getStuType().hashCode());
        result = prime * result + ((getStudyCity() == null) ? 0 : getStudyCity().hashCode());
        result = prime * result + ((getStudySchool() == null) ? 0 : getStudySchool().hashCode());
        result = prime * result + ((getGraduateDt() == null) ? 0 : getGraduateDt().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactType() == null) ? 0 : getContactType().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
        result = prime * result + ((getContactName2() == null) ? 0 : getContactName2().hashCode());
        result = prime * result + ((getContactType2() == null) ? 0 : getContactType2().hashCode());
        result = prime * result + ((getContactPhone2() == null) ? 0 : getContactPhone2().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getSysUserId() == null) ? 0 : getSysUserId().hashCode());
        result = prime * result + ((getLastVisitDt() == null) ? 0 : getLastVisitDt().hashCode());
        result = prime * result + ((getLastVisitRecordDt() == null) ? 0 : getLastVisitRecordDt().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLatestIntent() == null) ? 0 : getLatestIntent().hashCode());
        result = prime * result + ((getAgencyId() == null) ? 0 : getAgencyId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuName=").append(stuName);
        sb.append(", stuSex=").append(stuSex);
        sb.append(", stuType=").append(stuType);
        sb.append(", studyCity=").append(studyCity);
        sb.append(", studySchool=").append(studySchool);
        sb.append(", graduateDt=").append(graduateDt);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactType=").append(contactType);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", contactName2=").append(contactName2);
        sb.append(", contactType2=").append(contactType2);
        sb.append(", contactPhone2=").append(contactPhone2);
        sb.append(", source=").append(source);
        sb.append(", createDt=").append(createDt);
        sb.append(", groupId=").append(groupId);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", lastVisitDt=").append(lastVisitDt);
        sb.append(", lastVisitRecordDt=").append(lastVisitRecordDt);
        sb.append(", status=").append(status);
        sb.append(", latestIntent=").append(latestIntent);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
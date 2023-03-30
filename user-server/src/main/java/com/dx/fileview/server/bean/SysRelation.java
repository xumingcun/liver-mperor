package com.dx.fileview.server.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 关联表
 * </p>
 *
 * @author xmc
 * @since 2023-03-25
 */
@TableName("sys_relation")
public class SysRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 被关联id
     */
    private String frontId;

    /**
     * 关联id
     */
    private String rearId;

    /**
     * 关联类型
     */
    private String relationType;

    /**
     * 全id
     */
    private String fullId;

    /**
     * 全名称
     */
    private String fullName;

    /**
     * 排序
     */
    private Integer sortNo;

    /**
     * 创建人ID
     */
    private String createUserId;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人ID
     */
    private String updateUserId;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 0-失效 1-有效 -1-删除 2-锁定
     */
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrontId() {
        return frontId;
    }

    public void setFrontId(String frontId) {
        this.frontId = frontId;
    }

    public String getRearId() {
        return rearId;
    }

    public void setRearId(String rearId) {
        this.rearId = rearId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysRelation{" +
            "id = " + id +
            ", frontId = " + frontId +
            ", rearId = " + rearId +
            ", relationType = " + relationType +
            ", fullId = " + fullId +
            ", fullName = " + fullName +
            ", sortNo = " + sortNo +
            ", createUserId = " + createUserId +
            ", createUser = " + createUser +
            ", createTime = " + createTime +
            ", updateUserId = " + updateUserId +
            ", updateUser = " + updateUser +
            ", updateTime = " + updateTime +
            ", status = " + status +
        "}";
    }
}

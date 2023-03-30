package com.dx.fileview.server.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 辈分表
 * </p>
 *
 * @author xmc
 * @since 2023-03-25
 */
@TableName("sys_hierarchy")
public class SysHierarchy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 辈分名称
     */
    private String hierarchyName;

    /**
     * 辈分编码
     */
    private String hierarchyCode;

    /**
     * 族谱ID
     */
    private String genealogId;

    /**
     * 标签
     */
    private String tag;

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

    public String getHierarchyName() {
        return hierarchyName;
    }

    public void setHierarchyName(String hierarchyName) {
        this.hierarchyName = hierarchyName;
    }

    public String getHierarchyCode() {
        return hierarchyCode;
    }

    public void setHierarchyCode(String hierarchyCode) {
        this.hierarchyCode = hierarchyCode;
    }

    public String getGenealogId() {
        return genealogId;
    }

    public void setGenealogId(String genealogId) {
        this.genealogId = genealogId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        return "SysHierarchy{" +
            "id = " + id +
            ", hierarchyName = " + hierarchyName +
            ", hierarchyCode = " + hierarchyCode +
            ", genealogId = " + genealogId +
            ", tag = " + tag +
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

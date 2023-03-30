package com.dx.fileview.server.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 家庭表
 * </p>
 *
 * @author xmc
 * @since 2023-03-25
 */
@TableName("sys_home")
public class SysHome implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 家庭名称
     */
    private String homeName;

    /**
     * 家长ID
     */
    private String patriarchId;

    /**
     * 家长名称
     */
    private String patriarchName;

    /**
     * 行政区编码
     */
    private String cantonCode;

    /**
     * 家庭详细地址
     */
    private String address;

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

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getPatriarchId() {
        return patriarchId;
    }

    public void setPatriarchId(String patriarchId) {
        this.patriarchId = patriarchId;
    }

    public String getPatriarchName() {
        return patriarchName;
    }

    public void setPatriarchName(String patriarchName) {
        this.patriarchName = patriarchName;
    }

    public String getCantonCode() {
        return cantonCode;
    }

    public void setCantonCode(String cantonCode) {
        this.cantonCode = cantonCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "SysHome{" +
            "id = " + id +
            ", homeName = " + homeName +
            ", patriarchId = " + patriarchId +
            ", patriarchName = " + patriarchName +
            ", cantonCode = " + cantonCode +
            ", address = " + address +
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

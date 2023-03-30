package com.dx.fileview.server.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 宗族表
 * </p>
 *
 * @author xmc
 * @since 2023-03-25
 */
@TableName("sys_clan")
public class SysClan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 宗族名称
     */
    private String clanName;

    /**
     * 宗族编码
     */
    private String clanCode;

    /**
     * 族长ID
     */
    private String clanElderId;

    /**
     * 族长名称
     */
    private String clanElderName;

    /**
     * 祠堂详细地址
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

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public String getClanCode() {
        return clanCode;
    }

    public void setClanCode(String clanCode) {
        this.clanCode = clanCode;
    }

    public String getClanElderId() {
        return clanElderId;
    }

    public void setClanElderId(String clanElderId) {
        this.clanElderId = clanElderId;
    }

    public String getClanElderName() {
        return clanElderName;
    }

    public void setClanElderName(String clanElderName) {
        this.clanElderName = clanElderName;
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
        return "SysClan{" +
            "id = " + id +
            ", clanName = " + clanName +
            ", clanCode = " + clanCode +
            ", clanElderId = " + clanElderId +
            ", clanElderName = " + clanElderName +
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

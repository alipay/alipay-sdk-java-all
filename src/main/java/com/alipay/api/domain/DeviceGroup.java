package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备分组模型
 *
 * @author auto create
 * @since 1.0, 2019-11-29 10:50:45
 */
public class DeviceGroup extends AlipayObject {

	private static final long serialVersionUID = 4362335596186525395L;

	/**
	 * 业务类型-代表不同的业务场景 distribution表示服务分发
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 该分组的设备数
	 */
	@ApiField("device_count")
	private Long deviceCount;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 分组id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDeviceCount() {
		return this.deviceCount;
	}
	public void setDeviceCount(Long deviceCount) {
		this.deviceCount = deviceCount;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}

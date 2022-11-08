package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户渠道信息
 *
 * @author auto create
 * @since 1.0, 2022-07-21 17:04:22
 */
public class TenantChannelDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 5555723739936243293L;

	/**
	 * 渠道code + 唯一 + 渠道列表查询 + 数据库
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 渠道描述 + 不唯一 + 渠道列表查询 + 数据库
	 */
	@ApiField("channel_desc")
	private String channelDesc;

	/**
	 * 渠道id+唯一+渠道列表查询+数据库
	 */
	@ApiField("channel_id")
	private Long channelId;

	/**
	 * 渠道名称 + 不唯一 + 渠道列表查询 + 数据库
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 渠道状态+不唯一+（ENABLE-启用、DISABLE-停用）+渠道列表查询+从数据库获取
	 */
	@ApiField("channel_status")
	private String channelStatus;

	/**
	 * 租户类型+不唯一+渠道列表查询+EMAIL-邮件、MESSAGE-短信、PUSH-推送、AD-广告）+从数据库获取
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 表单模板id+唯一+渠道列表查询+数据库
	 */
	@ApiField("form_template_id")
	private Long formTemplateId;

	/**
	 * 渠道图片+不唯一+渠道列表查询+数据库
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 备注+不唯一+渠道列表查询+从数据库获取
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 租户渠道授权状态+不唯一+渠道列表查询+（ENABLE-启用、DISABLE-停用）+从数据库获取
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户code+唯一+渠道列表查询+从数据库获取
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelDesc() {
		return this.channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelStatus() {
		return this.channelStatus;
	}
	public void setChannelStatus(String channelStatus) {
		this.channelStatus = channelStatus;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Long getFormTemplateId() {
		return this.formTemplateId;
	}
	public void setFormTemplateId(Long formTemplateId) {
		this.formTemplateId = formTemplateId;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}

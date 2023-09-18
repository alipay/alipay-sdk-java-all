package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板批量查询响应
 *
 * @author auto create
 * @since 1.0, 2017-03-28 22:18:14
 */
public class VoucherTemplateLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 8812939451628791671L;

	/**
	 * 模板激活时间。草稿状态的模板该项为空
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/**
	 * 模板创建时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券模板发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public Date getActivateTime() {
		return this.activateTime;
	}
	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}

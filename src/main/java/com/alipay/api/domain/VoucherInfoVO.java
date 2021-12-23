package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户团油劵明细
 *
 * @author auto create
 * @since 1.0, 2020-11-03 21:49:00
 */
public class VoucherInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4617947147468526911L;

	/**
	 * 生效时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 劵创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 团油劵名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 劵模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 劵面额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 劵实例ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * ENABLED:可用；DISABLED:不可用;DELETE:删除状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}

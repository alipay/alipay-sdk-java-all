package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发奖明细列表
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:43
 */
public class PrizeReceiveDetail extends AlipayObject {

	private static final long serialVersionUID = 4161884287331449452L;

	/**
	 * 发奖单据号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 券创建时间
	 */
	@ApiField("voucher_gmt_create")
	private Date voucherGmtCreate;

	/**
	 * 券过期时间
	 */
	@ApiField("voucher_gmt_expired")
	private Date voucherGmtExpired;

	/**
	 * 券变更时间
	 */
	@ApiField("voucher_gmt_modified")
	private Date voucherGmtModified;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券模板id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public Date getVoucherGmtCreate() {
		return this.voucherGmtCreate;
	}
	public void setVoucherGmtCreate(Date voucherGmtCreate) {
		this.voucherGmtCreate = voucherGmtCreate;
	}

	public Date getVoucherGmtExpired() {
		return this.voucherGmtExpired;
	}
	public void setVoucherGmtExpired(Date voucherGmtExpired) {
		this.voucherGmtExpired = voucherGmtExpired;
	}

	public Date getVoucherGmtModified() {
		return this.voucherGmtModified;
	}
	public void setVoucherGmtModified(Date voucherGmtModified) {
		this.voucherGmtModified = voucherGmtModified;
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

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}

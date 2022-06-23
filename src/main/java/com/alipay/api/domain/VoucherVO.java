package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示模型
 *
 * @author auto create
 * @since 1.0, 2019-06-11 22:32:46
 */
public class VoucherVO extends AlipayObject {

	private static final long serialVersionUID = 3388811898371762153L;

	/**
	 * 券生效时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 券失效时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 券门槛金额，单位分
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 券面额，单位分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 券实例id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券模板id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	public String getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
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

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}

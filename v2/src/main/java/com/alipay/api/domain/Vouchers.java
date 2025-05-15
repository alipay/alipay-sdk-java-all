package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询用户可用优惠卷列表信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:51:30
 */
public class Vouchers extends AlipayObject {

	private static final long serialVersionUID = 4279543531753338662L;

	/**
	 * 优惠券可用面额(单位元)
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 营销卷的生效时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 优惠卷的到期时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 使用门槛(无门槛，则为空，存在使用门槛值，如满5减4，则使用门槛就是5.00，满10减1，则使用门槛就是10.00，单位元)
	 */
	@ApiField("use_threshold")
	private String useThreshold;

	/**
	 * 营销卷的ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 营销卷的名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getUseThreshold() {
		return this.useThreshold;
	}
	public void setUseThreshold(String useThreshold) {
		this.useThreshold = useThreshold;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}

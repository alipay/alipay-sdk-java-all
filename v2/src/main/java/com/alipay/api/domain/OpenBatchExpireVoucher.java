package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量过期券信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 20:12:55
 */
public class OpenBatchExpireVoucher extends AlipayObject {

	private static final long serialVersionUID = 1753729249987487484L;

	/**
	 * 可用金额（废弃）
	 */
	@ApiField("available_aount")
	private Long availableAount;

	/**
	 * 可用次数
	 */
	@ApiField("available_count")
	private Long availableCount;

	/**
	 * 总金额（面额）
	 */
	@ApiField("expire_amount")
	private String expireAmount;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getAvailableAount() {
		return this.availableAount;
	}
	public void setAvailableAount(Long availableAount) {
		this.availableAount = availableAount;
	}

	public Long getAvailableCount() {
		return this.availableCount;
	}
	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

	public String getExpireAmount() {
		return this.expireAmount;
	}
	public void setExpireAmount(String expireAmount) {
		this.expireAmount = expireAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}

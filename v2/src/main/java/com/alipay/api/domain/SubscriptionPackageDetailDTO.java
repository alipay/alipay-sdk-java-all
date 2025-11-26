package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅套餐明显
 *
 * @author auto create
 * @since 1.0, 2025-11-11 11:36:06
 */
public class SubscriptionPackageDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2361954192539286982L;

	/**
	 * 套餐金额
	 */
	@ApiField("package_amount")
	private String packageAmount;

	/**
	 * 套餐id
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 套餐类型
	 */
	@ApiField("package_type")
	private String packageType;

	/**
	 * 套餐单位
	 */
	@ApiField("package_unit")
	private String packageUnit;

	/**
	 * 套餐值
	 */
	@ApiField("package_value")
	private String packageValue;

	public String getPackageAmount() {
		return this.packageAmount;
	}
	public void setPackageAmount(String packageAmount) {
		this.packageAmount = packageAmount;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPackageType() {
		return this.packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getPackageUnit() {
		return this.packageUnit;
	}
	public void setPackageUnit(String packageUnit) {
		this.packageUnit = packageUnit;
	}

	public String getPackageValue() {
		return this.packageValue;
	}
	public void setPackageValue(String packageValue) {
		this.packageValue = packageValue;
	}

}

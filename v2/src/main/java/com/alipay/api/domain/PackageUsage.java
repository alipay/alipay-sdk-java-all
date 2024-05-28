package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 各计费项用量
 *
 * @author auto create
 * @since 1.0, 2023-10-16 20:20:24
 */
public class PackageUsage extends AlipayObject {

	private static final long serialVersionUID = 8251468539972547689L;

	/**
	 * 按量付费用量
	 */
	@ApiField("excess_usage")
	private String excessUsage;

	/**
	 * 计费项编码
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 计费项名称
	 */
	@ApiField("fee_item_name")
	private String feeItemName;

	/**
	 * 计费项单位（万次，GB秒，GB天，GB）
	 */
	@ApiField("fee_item_unit")
	private String feeItemUnit;

	/**
	 * 免费额度用量
	 */
	@ApiField("free_usage")
	private String freeUsage;

	/**
	 * 资源包内用量
	 */
	@ApiField("resource_package_usage")
	private String resourcePackageUsage;

	/**
	 * 总用量
总用量 = 免费额度用量 + 资源包内用量 + 按量付费用量
	 */
	@ApiField("total_usage")
	private String totalUsage;

	public String getExcessUsage() {
		return this.excessUsage;
	}
	public void setExcessUsage(String excessUsage) {
		this.excessUsage = excessUsage;
	}

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public String getFeeItemName() {
		return this.feeItemName;
	}
	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}

	public String getFeeItemUnit() {
		return this.feeItemUnit;
	}
	public void setFeeItemUnit(String feeItemUnit) {
		this.feeItemUnit = feeItemUnit;
	}

	public String getFreeUsage() {
		return this.freeUsage;
	}
	public void setFreeUsage(String freeUsage) {
		this.freeUsage = freeUsage;
	}

	public String getResourcePackageUsage() {
		return this.resourcePackageUsage;
	}
	public void setResourcePackageUsage(String resourcePackageUsage) {
		this.resourcePackageUsage = resourcePackageUsage;
	}

	public String getTotalUsage() {
		return this.totalUsage;
	}
	public void setTotalUsage(String totalUsage) {
		this.totalUsage = totalUsage;
	}

}

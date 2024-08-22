package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度指标列表
 *
 * @author auto create
 * @since 1.0, 2023-09-19 14:23:08
 */
public class QuotaControlMetric extends AlipayObject {

	private static final long serialVersionUID = 6862861755727715465L;

	/**
	 * 额度指标
 - Function_Counts
 - Function_Resource_Usage
 - Function_Data
 - Database_Storage
 - Read_Counts
 - Write_Counts
 - Oss_Capacity
 - Oss_Data
 - Oss_Download
 - Oss_Upload
 - Oss_Reverse_Data
 - Staticsite_Capacity
 - Staticsite_Data
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 计费项名称
	 */
	@ApiField("fee_item_name")
	private String feeItemName;

	/**
	 * 套餐额度
	 */
	@ApiField("package_quota")
	private String packageQuota;

	/**
	 * 单位名称
	 */
	@ApiField("unit_name")
	private String unitName;

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

	public String getPackageQuota() {
		return this.packageQuota;
	}
	public void setPackageQuota(String packageQuota) {
		this.packageQuota = packageQuota;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}

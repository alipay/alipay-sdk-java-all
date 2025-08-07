package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.rule.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:31:43
 */
public class AlipayCloudCloudbaseQuotacontrolRuleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2466246557447512674L;

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
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/** 
	 * 阈值（比例）
	 */
	@ApiField("threshold")
	private Long threshold;

	/** 
	 * 单位名称
	 */
	@ApiField("unit_name")
	private String unitName;

	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}
	public String getFeeItemCode( ) {
		return this.feeItemCode;
	}

	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}
	public String getFeeItemName( ) {
		return this.feeItemName;
	}

	public void setPackageQuota(String packageQuota) {
		this.packageQuota = packageQuota;
	}
	public String getPackageQuota( ) {
		return this.packageQuota;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleId( ) {
		return this.ruleId;
	}

	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}
	public Long getThreshold( ) {
		return this.threshold;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitName( ) {
		return this.unitName;
	}

}

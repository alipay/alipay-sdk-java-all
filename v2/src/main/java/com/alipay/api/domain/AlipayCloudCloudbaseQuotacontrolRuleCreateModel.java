package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建额度防控规则
 *
 * @author auto create
 * @since 1.0, 2023-10-10 17:03:15
 */
public class AlipayCloudCloudbaseQuotacontrolRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4769566934556832746L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

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
	 * 阈值（比例）
	 */
	@ApiField("threshold")
	private Long threshold;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public Long getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

}

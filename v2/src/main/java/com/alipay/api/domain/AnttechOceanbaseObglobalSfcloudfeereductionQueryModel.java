package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce查询券审批接口
 *
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3375281625524462566L;

	/**
	 * 券申请id
	 */
	@ApiField("cloud_fee_reduction_id")
	private String cloudFeeReductionId;

	/**
	 * salesforce唯一id
	 */
	@ApiField("salesforce_id")
	private String salesforceId;

	public String getCloudFeeReductionId() {
		return this.cloudFeeReductionId;
	}
	public void setCloudFeeReductionId(String cloudFeeReductionId) {
		this.cloudFeeReductionId = cloudFeeReductionId;
	}

	public String getSalesforceId() {
		return this.salesforceId;
	}
	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

}

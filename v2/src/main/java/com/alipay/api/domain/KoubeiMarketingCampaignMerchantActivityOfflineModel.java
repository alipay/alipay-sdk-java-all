package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景化商家营销活动下线
 *
 * @author auto create
 * @since 1.0, 2022-06-27 11:30:43
 */
public class KoubeiMarketingCampaignMerchantActivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7847977651134497534L;

	/**
	 * 活动ActivityId
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 下架备注memo
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 指定operator字段操作人类型，目前支持枚举：外部商户：MER、商户操作员：MER_OPERATOR、外部服务商：PROVIDER、外部服务商员工：PROVIDER_STAFF
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}

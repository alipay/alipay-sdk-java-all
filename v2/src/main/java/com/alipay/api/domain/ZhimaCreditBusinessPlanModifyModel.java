package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻商业信用履约计划修改
 *
 * @author auto create
 * @since 1.0, 2024-10-08 15:08:03
 */
public class ZhimaCreditBusinessPlanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7351237218336379267L;

	/**
	 * 【免押】支付宝授权资金订单号。 与商户的授权资金订单号不能同时为空，二者都传入时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 请求流水号，用于标示请求流水的唯一性。 仅支持字母、数字、下划线。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 计划详情列表
	 */
	@ApiListField("plan_details")
	@ApiField("credit_performance_plan_detail_open")
	private List<CreditPerformancePlanDetailOpen> planDetails;

	/**
	 * 产品标识，按枚举填入。
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<CreditPerformancePlanDetailOpen> getPlanDetails() {
		return this.planDetails;
	}
	public void setPlanDetails(List<CreditPerformancePlanDetailOpen> planDetails) {
		this.planDetails = planDetails;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}

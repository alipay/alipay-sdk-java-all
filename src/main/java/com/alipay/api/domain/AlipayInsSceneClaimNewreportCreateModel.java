package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新理赔报案接口
 *
 * @author auto create
 * @since 1.0, 2022-03-08 13:29:58
 */
public class AlipayInsSceneClaimNewreportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7685169549122544317L;

	/**
	 * 申报原因
1:收货电话无法接通
2:收货地址不正确
	 */
	@ApiField("apply_reason")
	private String applyReason;

	/**
	 * 申诉结果
1:成功
2:失败
	 */
	@ApiField("apply_result")
	private String applyResult;

	/**
	 * 受益人
	 */
	@ApiField("beneficiary")
	private InsPerson beneficiary;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 外部报案金额(单位:分)
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 报案原因:
1:订单超时
2:物流取消订单；
3:商家切换自配送；
4:特殊申报单
备注:枚举可自定义
	 */
	@ApiField("claim_report_reason")
	private String claimReportReason;

	/**
	 * 关联订单信息
	 */
	@ApiField("order_info")
	private InsOrderInfo orderInfo;

	/**
	 * 外部业务号(幂等字段)
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品号(一般由蚂蚁提供)
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	public String getApplyReason() {
		return this.applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getApplyResult() {
		return this.applyResult;
	}
	public void setApplyResult(String applyResult) {
		this.applyResult = applyResult;
	}

	public InsPerson getBeneficiary() {
		return this.beneficiary;
	}
	public void setBeneficiary(InsPerson beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Long getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	public String getClaimReportReason() {
		return this.claimReportReason;
	}
	public void setClaimReportReason(String claimReportReason) {
		this.claimReportReason = claimReportReason;
	}

	public InsOrderInfo getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(InsOrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public InsPerson getReporter() {
		return this.reporter;
	}
	public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

}

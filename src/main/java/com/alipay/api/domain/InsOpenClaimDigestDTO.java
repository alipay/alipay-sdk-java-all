package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台电商 理赔单摘要模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:19:16
 */
public class InsOpenClaimDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 7267779463954165679L;

	/**
	 * 报案时间
	 */
	@ApiField("claim_apply_time")
	private Date claimApplyTime;

	/**
	 * 核赔时间
	 */
	@ApiField("claim_assess_time")
	private Date claimAssessTime;

	/**
	 * 销案时间
	 */
	@ApiField("claim_cancel_time")
	private Date claimCancelTime;

	/**
	 * 赔付金额赔付成功之后有效
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 立案时间
	 */
	@ApiField("claim_record_time")
	private Date claimRecordTime;

	/**
	 * 理赔报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 理赔单状态：
     INIT  已报案
     RECORDED 已立案
     RECORD_REJECTED 不予立案
     RESOLVED 已结案
     REJECTED 已拒赔
     ASSESSED 已核赔
     CANCELLED 已销案
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 资金打款执行返回码
	 */
	@ApiField("fund_result_code")
	private String fundResultCode;

	/**
	 * 资金打款执行返回描述
	 */
	@ApiField("fund_result_desc")
	private String fundResultDesc;

	/**
	 * 资金打款状态：
INIT 初始化
      PAID 已支付
      CLOSED 已关闭
      REFUND 已退款
      BOUNCED 已退票
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品编码，标识某一类产品：YFX（运费险）
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 拒赔原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public Date getClaimApplyTime() {
		return this.claimApplyTime;
	}
	public void setClaimApplyTime(Date claimApplyTime) {
		this.claimApplyTime = claimApplyTime;
	}

	public Date getClaimAssessTime() {
		return this.claimAssessTime;
	}
	public void setClaimAssessTime(Date claimAssessTime) {
		this.claimAssessTime = claimAssessTime;
	}

	public Date getClaimCancelTime() {
		return this.claimCancelTime;
	}
	public void setClaimCancelTime(Date claimCancelTime) {
		this.claimCancelTime = claimCancelTime;
	}

	public Long getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public Date getClaimRecordTime() {
		return this.claimRecordTime;
	}
	public void setClaimRecordTime(Date claimRecordTime) {
		this.claimRecordTime = claimRecordTime;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getFundResultCode() {
		return this.fundResultCode;
	}
	public void setFundResultCode(String fundResultCode) {
		this.fundResultCode = fundResultCode;
	}

	public String getFundResultDesc() {
		return this.fundResultDesc;
	}
	public void setFundResultDesc(String fundResultDesc) {
		this.fundResultDesc = fundResultDesc;
	}

	public String getFundStatus() {
		return this.fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}

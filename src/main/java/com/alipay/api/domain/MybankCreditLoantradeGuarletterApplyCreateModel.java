package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函申请
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:36:32
 */
public class MybankCreditLoantradeGuarletterApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8163431286951937137L;

	/**
	 * 申请金额
	 */
	@ApiField("apply_amt")
	private CreditPayMoneyVO applyAmt;

	/**
	 * 申请信息附件
	 */
	@ApiField("apply_attatchments")
	private ApplyAttatchmentVO applyAttatchments;

	/**
	 * 申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 申请企业信息
	 */
	@ApiField("apply_user_info")
	private EnterpriseCustomerInfoVO applyUserInfo;

	/**
	 * 投标人公钥
	 */
	@ApiField("apply_user_public_key")
	private String applyUserPublicKey;

	/**
	 * 收益人信息（招标人信息）
	 */
	@ApiField("beneficiary_user_info")
	private EnterpriseCustomerInfoVO beneficiaryUserInfo;

	/**
	 * 标的明细
	 */
	@ApiField("bid_detail")
	private BidDetailVO bidDetail;

	/**
	 * 是否密文
	 */
	@ApiField("encrypted")
	private Boolean encrypted;

	/**
	 * 担保到期时间
	 */
	@ApiField("guar_end_date")
	private Date guarEndDate;

	/**
	 * 保函生效时间
	 */
	@ApiField("guar_start_date")
	private Date guarStartDate;

	/**
	 * 保函生效天数
	 */
	@ApiField("guar_valid_days")
	private Long guarValidDays;

	/**
	 * 操作员信息
	 */
	@ApiField("operator_user_info")
	private IndividualCustomerInfoVO operatorUserInfo;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	public CreditPayMoneyVO getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(CreditPayMoneyVO applyAmt) {
		this.applyAmt = applyAmt;
	}

	public ApplyAttatchmentVO getApplyAttatchments() {
		return this.applyAttatchments;
	}
	public void setApplyAttatchments(ApplyAttatchmentVO applyAttatchments) {
		this.applyAttatchments = applyAttatchments;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public EnterpriseCustomerInfoVO getApplyUserInfo() {
		return this.applyUserInfo;
	}
	public void setApplyUserInfo(EnterpriseCustomerInfoVO applyUserInfo) {
		this.applyUserInfo = applyUserInfo;
	}

	public String getApplyUserPublicKey() {
		return this.applyUserPublicKey;
	}
	public void setApplyUserPublicKey(String applyUserPublicKey) {
		this.applyUserPublicKey = applyUserPublicKey;
	}

	public EnterpriseCustomerInfoVO getBeneficiaryUserInfo() {
		return this.beneficiaryUserInfo;
	}
	public void setBeneficiaryUserInfo(EnterpriseCustomerInfoVO beneficiaryUserInfo) {
		this.beneficiaryUserInfo = beneficiaryUserInfo;
	}

	public BidDetailVO getBidDetail() {
		return this.bidDetail;
	}
	public void setBidDetail(BidDetailVO bidDetail) {
		this.bidDetail = bidDetail;
	}

	public Boolean getEncrypted() {
		return this.encrypted;
	}
	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	public Date getGuarEndDate() {
		return this.guarEndDate;
	}
	public void setGuarEndDate(Date guarEndDate) {
		this.guarEndDate = guarEndDate;
	}

	public Date getGuarStartDate() {
		return this.guarStartDate;
	}
	public void setGuarStartDate(Date guarStartDate) {
		this.guarStartDate = guarStartDate;
	}

	public Long getGuarValidDays() {
		return this.guarValidDays;
	}
	public void setGuarValidDays(Long guarValidDays) {
		this.guarValidDays = guarValidDays;
	}

	public IndividualCustomerInfoVO getOperatorUserInfo() {
		return this.operatorUserInfo;
	}
	public void setOperatorUserInfo(IndividualCustomerInfoVO operatorUserInfo) {
		this.operatorUserInfo = operatorUserInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融资方终审结果通知
 *
 * @author auto create
 * @since 1.0, 2021-04-27 15:11:24
 */
public class MybankCreditSceneprodLoanConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6418285416491254759L;

	/**
	 * 网商针对一次客户主动申请生成的申请单据编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 审核结果，通过：approved，拒绝：refused
	 */
	@ApiField("approve_result")
	private String approveResult;

	/**
	 * 证件主体名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 资方生成的申请单号
	 */
	@ApiField("fin_order_no")
	private String finOrderNo;

	/**
	 * 拒绝码，通过填写00
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 拒绝原因，审核通过可不传
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 终审备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 标识一次业务交互, 网商的ipRoleId+"_"YYYYMMDD+35位流水号, 最后2，3位要求是数字。
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getApproveResult() {
		return this.approveResult;
	}
	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getFinOrderNo() {
		return this.finOrderNo;
	}
	public void setFinOrderNo(String finOrderNo) {
		this.finOrderNo = finOrderNo;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}

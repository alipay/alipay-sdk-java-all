package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-25 16:02:56
 */
public class TpaBillDataDTO extends AlipayObject {

	private static final long serialVersionUID = 6454463174523888929L;

	/**
	 * 账单理赔状态 CREATED 创建 CANCLE 取消
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 理赔申请书
	 */
	@ApiField("claim_application_form_url")
	private String claimApplicationFormUrl;

	/**
	 * 理赔单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 理赔类型
	 */
	@ApiField("claim_type")
	private String claimType;

	/**
	 * 码值
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 医院门店编号
	 */
	@ApiField("hospital_branch_code")
	private String hospitalBranchCode;

	/**
	 * 医院门店名称
	 */
	@ApiField("hospital_branch_name")
	private String hospitalBranchName;

	/**
	 * 医院Code
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院名
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 个单号
	 */
	@ApiField("policy_id")
	private String policyId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 就诊时间
	 */
	@ApiField("visit_time")
	private String visitTime;

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClaimApplicationFormUrl() {
		return this.claimApplicationFormUrl;
	}
	public void setClaimApplicationFormUrl(String claimApplicationFormUrl) {
		this.claimApplicationFormUrl = claimApplicationFormUrl;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimType() {
		return this.claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHospitalBranchCode() {
		return this.hospitalBranchCode;
	}
	public void setHospitalBranchCode(String hospitalBranchCode) {
		this.hospitalBranchCode = hospitalBranchCode;
	}

	public String getHospitalBranchName() {
		return this.hospitalBranchName;
	}
	public void setHospitalBranchName(String hospitalBranchName) {
		this.hospitalBranchName = hospitalBranchName;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyId() {
		return this.policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getVisitTime() {
		return this.visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

}

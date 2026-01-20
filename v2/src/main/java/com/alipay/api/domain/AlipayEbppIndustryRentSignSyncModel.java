package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金中心或租房企业同步用户签约信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 16:01:21
 */
public class AlipayEbppIndustryRentSignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1865637745339784347L;

	/**
	 * 用户证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业方调用时，必传数据
	 */
	@ApiField("enterprise_credit_no")
	private String enterpriseCreditNo;

	/**
	 * 公积金中心分配的租赁企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 公积金中心调用时，必传企业唯一标识
	 */
	@ApiField("enterprise_no")
	private String enterpriseNo;

	/**
	 * 公积金中心分配的租赁企业凭证
	 */
	@ApiField("enterprise_proof")
	private String enterpriseProof;

	/**
	 * 公积金中心编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 用户签约状态
	 */
	@ApiField("rent_sign_status")
	private String rentSignStatus;

	/**
	 * 新用户签约时传签约（SIGNED）；老用户按实际办理状态传对应状态
	 */
	@ApiField("rent_sign_type")
	private String rentSignType;

	/**
	 * 公积金中心
	 */
	@ApiField("request_party")
	private String requestParty;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 签约用户在公积金侧的备案编号
	 */
	@ApiField("user_record_no")
	private String userRecordNo;

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

	public String getEnterpriseCreditNo() {
		return this.enterpriseCreditNo;
	}
	public void setEnterpriseCreditNo(String enterpriseCreditNo) {
		this.enterpriseCreditNo = enterpriseCreditNo;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseNo() {
		return this.enterpriseNo;
	}
	public void setEnterpriseNo(String enterpriseNo) {
		this.enterpriseNo = enterpriseNo;
	}

	public String getEnterpriseProof() {
		return this.enterpriseProof;
	}
	public void setEnterpriseProof(String enterpriseProof) {
		this.enterpriseProof = enterpriseProof;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getRentSignStatus() {
		return this.rentSignStatus;
	}
	public void setRentSignStatus(String rentSignStatus) {
		this.rentSignStatus = rentSignStatus;
	}

	public String getRentSignType() {
		return this.rentSignType;
	}
	public void setRentSignType(String rentSignType) {
		this.rentSignType = rentSignType;
	}

	public String getRequestParty() {
		return this.requestParty;
	}
	public void setRequestParty(String requestParty) {
		this.requestParty = requestParty;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRecordNo() {
		return this.userRecordNo;
	}
	public void setUserRecordNo(String userRecordNo) {
		this.userRecordNo = userRecordNo;
	}

}

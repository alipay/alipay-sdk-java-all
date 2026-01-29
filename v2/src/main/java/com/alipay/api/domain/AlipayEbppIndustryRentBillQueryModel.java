package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房企业查询用户公积金账单信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 16:02:42
 */
public class AlipayEbppIndustryRentBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2353573919255376528L;

	/**
	 * 用户证件号码
	 */
	@ApiField("cert_num")
	private String certNum;

	/**
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 企业信用代码
	 */
	@ApiField("enterprise_credit_no")
	private String enterpriseCreditNo;

	/**
	 * 	
公积金中心分配的租赁企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

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
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNum() {
		return this.certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

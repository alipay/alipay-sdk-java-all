package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业基础信息模型
 *
 * @author auto create
 * @since 1.0, 2024-03-01 10:44:46
 */
public class EpBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 5859119515324141223L;

	/**
	 * 公司地址
	 */
	@ApiField("ep_address")
	private String epAddress;

	/**
	 * 核准日期
	 */
	@ApiField("ep_appr_date")
	private String epApprDate;

	/**
	 * 企业社会信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 公司名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 营业期至
	 */
	@ApiField("ep_open_to")
	private String epOpenTo;

	/**
	 * 经营范围
	 */
	@ApiField("ep_operate_scope")
	private String epOperateScope;

	/**
	 * 注册资本
	 */
	@ApiField("ep_reg_captial")
	private String epRegCaptial;

	/**
	 * 企业注册号
	 */
	@ApiField("ep_reg_no")
	private String epRegNo;

	/**
	 * 登记机关
	 */
	@ApiField("ep_reg_org")
	private String epRegOrg;

	/**
	 * 企业经营状态
	 */
	@ApiField("ep_status")
	private String epStatus;

	/**
	 * 企业主体类型
	 */
	@ApiField("ep_type")
	private String epType;

	/**
	 * 公司成立日期
	 */
	@ApiField("establish_date")
	private String establishDate;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 企业信用生成的唯一企业ID
	 */
	@ApiField("one_id")
	private String oneId;

	public String getEpAddress() {
		return this.epAddress;
	}
	public void setEpAddress(String epAddress) {
		this.epAddress = epAddress;
	}

	public String getEpApprDate() {
		return this.epApprDate;
	}
	public void setEpApprDate(String epApprDate) {
		this.epApprDate = epApprDate;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpOpenTo() {
		return this.epOpenTo;
	}
	public void setEpOpenTo(String epOpenTo) {
		this.epOpenTo = epOpenTo;
	}

	public String getEpOperateScope() {
		return this.epOperateScope;
	}
	public void setEpOperateScope(String epOperateScope) {
		this.epOperateScope = epOperateScope;
	}

	public String getEpRegCaptial() {
		return this.epRegCaptial;
	}
	public void setEpRegCaptial(String epRegCaptial) {
		this.epRegCaptial = epRegCaptial;
	}

	public String getEpRegNo() {
		return this.epRegNo;
	}
	public void setEpRegNo(String epRegNo) {
		this.epRegNo = epRegNo;
	}

	public String getEpRegOrg() {
		return this.epRegOrg;
	}
	public void setEpRegOrg(String epRegOrg) {
		this.epRegOrg = epRegOrg;
	}

	public String getEpStatus() {
		return this.epStatus;
	}
	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}

	public String getEpType() {
		return this.epType;
	}
	public void setEpType(String epType) {
		this.epType = epType;
	}

	public String getEstablishDate() {
		return this.establishDate;
	}
	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getOneId() {
		return this.oneId;
	}
	public void setOneId(String oneId) {
		this.oneId = oneId;
	}

}

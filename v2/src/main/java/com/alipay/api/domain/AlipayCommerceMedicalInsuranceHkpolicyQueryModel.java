package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保单查询(风石→商保码,HK场景)
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:07:58
 */
public class AlipayCommerceMedicalInsuranceHkpolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1553665395121584514L;

	/**
	 * 申请人证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 申请人证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * HK场景
	 */
	@ApiField("hk_scene")
	private String hkScene;

	/**
	 * 被保人证件编号
	 */
	@ApiField("insured_cert_no")
	private String insuredCertNo;

	/**
	 * 被保人证件类型
	 */
	@ApiField("insured_cert_type")
	private String insuredCertType;

	/**
	 * 被保人用户姓名
	 */
	@ApiField("insured_name")
	private String insuredName;

	/**
	 * 申请人用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * null
	 */
	@ApiListField("policy_no_list")
	@ApiField("string")
	private List<String> policyNoList;

	/**
	 * 交易来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 申请人支付宝user_id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getHkScene() {
		return this.hkScene;
	}
	public void setHkScene(String hkScene) {
		this.hkScene = hkScene;
	}

	public String getInsuredCertNo() {
		return this.insuredCertNo;
	}
	public void setInsuredCertNo(String insuredCertNo) {
		this.insuredCertNo = insuredCertNo;
	}

	public String getInsuredCertType() {
		return this.insuredCertType;
	}
	public void setInsuredCertType(String insuredCertType) {
		this.insuredCertType = insuredCertType;
	}

	public String getInsuredName() {
		return this.insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPolicyNoList() {
		return this.policyNoList;
	}
	public void setPolicyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA就医登记记录回传
 *
 * @author auto create
 * @since 1.0, 2026-04-16 14:17:45
 */
public class AlipayCommerceMedicalInsuranceTpatraderegSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8648458767439987171L;

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
	 * 保单生失效日期
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 医院门店编码
	 */
	@ApiField("hospital_branch_code")
	private String hospitalBranchCode;

	/**
	 * 医院门店名称
	 */
	@ApiField("hospital_branch_name")
	private String hospitalBranchName;

	/**
	 * 医院编码
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院名
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保险产品
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 签到时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 垫资方编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 用户ID
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

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
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

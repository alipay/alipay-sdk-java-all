package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道额度查询
 *
 * @author auto create
 * @since 1.0, 2026-04-11 15:27:45
 */
public class AlipayCommerceMedicalInsuranceTpadirectpayquotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8193391727843453396L;

	/**
	 * 用户证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * tpa 编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 支付宝用户id
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

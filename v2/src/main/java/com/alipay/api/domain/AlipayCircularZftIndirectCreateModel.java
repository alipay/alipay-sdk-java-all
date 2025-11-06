package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁直付通进件申请
 *
 * @author auto create
 * @since 1.0, 2025-11-05 14:53:00
 */
public class AlipayCircularZftIndirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8169235894336964562L;

	/**
	 * 签约支付宝账户
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 商户证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商户联系人信息
	 */
	@ApiField("contact_info")
	private ZftContactInfo contactInfo;

	/**
	 * 默认结算账号
	 */
	@ApiField("default_settle_rule")
	private ZftDefaultSettleRule defaultSettleRule;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
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

	public ZftContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ZftContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public ZftDefaultSettleRule getDefaultSettleRule() {
		return this.defaultSettleRule;
	}
	public void setDefaultSettleRule(ZftDefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}

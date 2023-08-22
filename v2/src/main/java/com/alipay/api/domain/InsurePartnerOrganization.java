package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保合作商信息
 *
 * @author auto create
 * @since 1.0, 2023-08-15 18:54:35
 */
public class InsurePartnerOrganization extends AlipayObject {

	private static final long serialVersionUID = 8847745748145723894L;

	/**
	 * 支付宝账号，本次场景是和蚂蚁保签约的平台账号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 操作关联的支付宝openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 证件名称，本次场景是和蚂蚁保签约的平台名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件名称，本次场景是和蚂蚁保签约的平台证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件名称，本次场景是和蚂蚁保签约的平台证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 合作商id
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
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

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}

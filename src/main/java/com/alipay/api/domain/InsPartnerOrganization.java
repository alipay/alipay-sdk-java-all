package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险合作商信息
 *
 * @author auto create
 * @since 1.0, 2022-08-13 21:31:24
 */
public class InsPartnerOrganization extends AlipayObject {

	private static final long serialVersionUID = 5544925471289781368L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

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

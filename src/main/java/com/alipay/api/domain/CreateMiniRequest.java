package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序创建请求
 *
 * @author auto create
 * @since 1.0, 2021-07-29 09:50:57
 */
public class CreateMiniRequest extends AlipayObject {

	private static final long serialVersionUID = 7667648784216282423L;

	/**
	 * 商家登录支付宝的邮箱帐号或手机号，当前仅支持企业支付宝帐号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 营业执照企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 营业执照编码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商家联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 商家联系人手机电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 商家法人名称
	 */
	@ApiField("legal_personal_name")
	private String legalPersonalName;

	/**
	 * 开发者外部订单号，通过开发者账号+outOrderNo做业务幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
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

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getLegalPersonalName() {
		return this.legalPersonalName;
	}
	public void setLegalPersonalName(String legalPersonalName) {
		this.legalPersonalName = legalPersonalName;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}

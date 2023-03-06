package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证试用小程序
 *
 * @author auto create
 * @since 1.0, 2023-02-04 10:02:51
 */
public class AlipayOpenMiniIsvCertifyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5216148396136575921L;

	/**
	 * 商家登录支付宝的邮箱帐号或手机号。（1）默认只支持企业账号类型；（2）将is_individual设置为true，支持个体工商户类型的账号（同时也兼容企业账号）（3）将is_individual设置为true且上传营业执照照片，将同时对具备个体工商户营业执照的商家个人账号认证成为个体工商户账号（同时也兼容企业账号、个体工商户账号）
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 营业执照企业名称，如果是“无主体名称个体工商户”则填“个体户+法人姓名”，例如“个体户张三”
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
	 * 默认为 false。当设置为 true 时，支持个体工商户的账号类型（同时兼容企业账号）
	 */
	@ApiField("is_individual")
	private Boolean isIndividual;

	/**
	 * 商家法人名称
	 */
	@ApiField("legal_personal_name")
	private String legalPersonalName;

	/**
	 * 营业执照图片的Base64编码字符串，图片大小不能超过2M。将is_individual设置为true，当传入该参数后，如果商家账号不是个体工商户类型，将同时为商家升级账号，无需商家额外操作升级（同时支持企业账号、个体工商户账号）
	 */
	@ApiField("license_pic")
	private String licensePic;

	/**
	 * 试用小程序订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
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

	public Boolean getIsIndividual() {
		return this.isIndividual;
	}
	public void setIsIndividual(Boolean isIndividual) {
		this.isIndividual = isIndividual;
	}

	public String getLegalPersonalName() {
		return this.legalPersonalName;
	}
	public void setLegalPersonalName(String legalPersonalName) {
		this.legalPersonalName = legalPersonalName;
	}

	public String getLicensePic() {
		return this.licensePic;
	}
	public void setLicensePic(String licensePic) {
		this.licensePic = licensePic;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}

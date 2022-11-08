package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的基本信息配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:00:29
 */
public class ZMGOBasicConfig extends AlipayObject {

	private static final long serialVersionUID = 5774126289434646771L;

	/**
	 * 商户在芝麻GO配置的业务身份编码
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商家客服电话
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 运营商商户支付宝ID。若非ISV代理模式，也就是商户自运营模式，此属性取值与partner_id一致。
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户LOGO
	 */
	@ApiField("merchant_custom_logo")
	private String merchantCustomLogo;

	/**
	 * 外部业务单号，供幂等使用，需保证每次请求的值都不同
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户的支付宝ID，即为此商户创建芝麻GO模板
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMerchantCustomLogo() {
		return this.merchantCustomLogo;
	}
	public void setMerchantCustomLogo(String merchantCustomLogo) {
		this.merchantCustomLogo = merchantCustomLogo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}

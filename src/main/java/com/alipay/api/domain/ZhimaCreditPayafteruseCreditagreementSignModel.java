package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先用后付记签约
 *
 * @author auto create
 * @since 1.0, 2021-04-13 14:01:37
 */
public class ZhimaCreditPayafteruseCreditagreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 2595578792739895119L;

	/**
	 * 当用户进入芝麻后付开通页面后，点击左上角的回退按钮，中断开通流程，跳转回商户的页面地址。
	 */
	@ApiField("cancel_back_link")
	private String cancelBackLink;

	/**
	 * 芝麻外部类目。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 用户在商户网站的登录账号。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式。
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 商户外部协议号。
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 产品码，不填默认为 CREDIT_PAY_AFTER_USE。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户成功完成芝麻后付开通流程后，跳转回商户的页面地址。
	 */
	@ApiField("return_back_link")
	private String returnBackLink;

	/**
	 * 芝麻服务ID。
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getCancelBackLink() {
		return this.cancelBackLink;
	}
	public void setCancelBackLink(String cancelBackLink) {
		this.cancelBackLink = cancelBackLink;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getReturnBackLink() {
		return this.returnBackLink;
	}
	public void setReturnBackLink(String returnBackLink) {
		this.returnBackLink = returnBackLink;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}

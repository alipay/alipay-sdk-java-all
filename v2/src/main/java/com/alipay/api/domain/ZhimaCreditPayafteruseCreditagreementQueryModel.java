package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先用后付授权状态查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 16:31:33
 */
public class ZhimaCreditPayafteruseCreditagreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8122614858388247455L;

	/**
	 * 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 扩展参数
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 当产品是芝麻守约时必填，需传入CREDIT_AGREEMENT
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 芝麻信用服务id，上线前提前分配给商户
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
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

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}

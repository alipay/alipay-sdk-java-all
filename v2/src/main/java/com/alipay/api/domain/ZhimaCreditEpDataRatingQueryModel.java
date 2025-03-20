package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业金融风控查询
 *
 * @author auto create
 * @since 1.0, 2020-06-16 19:13:34
 */
public class ZhimaCreditEpDataRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2332641831911546873L;

	/**
	 * 特定业务场景传输的扩展参数，以JSON形式传输
	 */
	@ApiField("biz_ext_param")
	private String bizExtParam;

	/**
	 * 身份证上的姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型
工商注册号：NATIONAL_LEGAL
社会统一信用代码 : NATIONAL_LEGAL_MERGE
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 产品ID
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，商户要保证其唯一性，可以传入流水号。建议：前面几位字符是商户自定义的简称，中间可以使用一段日期，结尾可以使用一个序列号。
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getBizExtParam() {
		return this.bizExtParam;
	}
	public void setBizExtParam(String bizExtParam) {
		this.bizExtParam = bizExtParam;
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

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpCertType() {
		return this.epCertType;
	}
	public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}

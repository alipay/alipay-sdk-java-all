package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 断直连贷款授信单初始化服务
 *
 * @author auto create
 * @since 1.0, 2023-03-22 10:06:10
 */
public class ZhimaCreditEpCreditlinkloanAuthorderInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8335532845214949377L;

	/**
	 * 授信准入类型
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 贷种类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/**
	 * 商户自身的授信单号，需保证其唯一性
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	/**
	 * 企业法人证件号
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getMerchantBizNo() {
		return this.merchantBizNo;
	}
	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}

	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

}

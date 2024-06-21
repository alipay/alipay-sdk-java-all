package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 断直连贷款授信单提交服务
 *
 * @author auto create
 * @since 1.0, 2023-03-22 10:04:28
 */
public class ZhimaCreditEpCreditlinkloanAuthorderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3131246678356171654L;

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

}

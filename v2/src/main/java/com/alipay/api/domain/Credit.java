package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授信信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 16:03:34
 */
public class Credit extends AlipayObject {

	private static final long serialVersionUID = 7732623481317522262L;

	/**
	 * 客户授信金额，单位分
	 */
	@ApiField("credit_amt")
	private Long creditAmt;

	/**
	 * 定价列表
	 */
	@ApiListField("credit_pricing_list")
	@ApiField("credit_pricing")
	private List<CreditPricing> creditPricingList;

	/**
	 * 是否默认授信
	 */
	@ApiField("default_credit")
	private Boolean defaultCredit;

	/**
	 * 授信过期时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 贷款类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/**
	 * 授信产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	public Long getCreditAmt() {
		return this.creditAmt;
	}
	public void setCreditAmt(Long creditAmt) {
		this.creditAmt = creditAmt;
	}

	public List<CreditPricing> getCreditPricingList() {
		return this.creditPricingList;
	}
	public void setCreditPricingList(List<CreditPricing> creditPricingList) {
		this.creditPricingList = creditPricingList;
	}

	public Boolean getDefaultCredit() {
		return this.defaultCredit;
	}
	public void setDefaultCredit(Boolean defaultCredit) {
		this.defaultCredit = defaultCredit;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}

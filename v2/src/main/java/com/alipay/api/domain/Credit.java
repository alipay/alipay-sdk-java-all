package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授信信息
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:52:39
 */
public class Credit extends AlipayObject {

	private static final long serialVersionUID = 2887969273241978335L;

	/**
	 * 可用金额，单位分
	 */
	@ApiField("available_amt")
	private Long availableAmt;

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
	 * 额度变更的原因
	 */
	@ApiField("credit_update_reason")
	private String creditUpdateReason;

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
	 * 是否支持多笔支用
true-是，false-否
	 */
	@ApiField("multiple_lend")
	private Boolean multipleLend;

	/**
	 * 授信产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 授信可用状态
	 */
	@ApiField("usable_status")
	private String usableStatus;

	/**
	 * 已用金额，单位分
	 */
	@ApiField("used_amt")
	private Long usedAmt;

	public Long getAvailableAmt() {
		return this.availableAmt;
	}
	public void setAvailableAmt(Long availableAmt) {
		this.availableAmt = availableAmt;
	}

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

	public String getCreditUpdateReason() {
		return this.creditUpdateReason;
	}
	public void setCreditUpdateReason(String creditUpdateReason) {
		this.creditUpdateReason = creditUpdateReason;
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

	public Boolean getMultipleLend() {
		return this.multipleLend;
	}
	public void setMultipleLend(Boolean multipleLend) {
		this.multipleLend = multipleLend;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUsableStatus() {
		return this.usableStatus;
	}
	public void setUsableStatus(String usableStatus) {
		this.usableStatus = usableStatus;
	}

	public Long getUsedAmt() {
		return this.usedAmt;
	}
	public void setUsedAmt(Long usedAmt) {
		this.usedAmt = usedAmt;
	}

}

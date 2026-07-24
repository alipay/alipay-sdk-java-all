package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:52:53
 */
public class AucCredit extends AlipayObject {

	private static final long serialVersionUID = 6474645563196266654L;

	/**
	 * 客户授信金额，单位分
	 */
	@ApiField("credit_amt")
	private Long creditAmt;

	/**
	 * null
	 */
	@ApiListField("credit_pricing_list")
	@ApiField("auc_credit_pricing")
	private List<AucCreditPricing> creditPricingList;

	/**
	 * 授信过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	public Long getCreditAmt() {
		return this.creditAmt;
	}
	public void setCreditAmt(Long creditAmt) {
		this.creditAmt = creditAmt;
	}

	public List<AucCreditPricing> getCreditPricingList() {
		return this.creditPricingList;
	}
	public void setCreditPricingList(List<AucCreditPricing> creditPricingList) {
		this.creditPricingList = creditPricingList;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

}

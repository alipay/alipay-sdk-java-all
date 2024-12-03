package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 持股列表
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CorpShareholderTotal extends AlipayObject {

	private static final long serialVersionUID = 7594793563252535755L;

	/**
	 * 出资方式
	 */
	@ApiField("funding_method")
	private String fundingMethod;

	/**
	 * 实缴币种
	 */
	@ApiField("paid_currency")
	private String paidCurrency;

	/**
	 * 持股比例
	 */
	@ApiField("shareholding_percent")
	private String shareholdingPercent;

	/**
	 * 持股类型
	 */
	@ApiField("shareholding_type")
	private String shareholdingType;

	/**
	 * 总持股数
	 */
	@ApiField("shares_num")
	private Long sharesNum;

	public String getFundingMethod() {
		return this.fundingMethod;
	}
	public void setFundingMethod(String fundingMethod) {
		this.fundingMethod = fundingMethod;
	}

	public String getPaidCurrency() {
		return this.paidCurrency;
	}
	public void setPaidCurrency(String paidCurrency) {
		this.paidCurrency = paidCurrency;
	}

	public String getShareholdingPercent() {
		return this.shareholdingPercent;
	}
	public void setShareholdingPercent(String shareholdingPercent) {
		this.shareholdingPercent = shareholdingPercent;
	}

	public String getShareholdingType() {
		return this.shareholdingType;
	}
	public void setShareholdingType(String shareholdingType) {
		this.shareholdingType = shareholdingType;
	}

	public Long getSharesNum() {
		return this.sharesNum;
	}
	public void setSharesNum(Long sharesNum) {
		this.sharesNum = sharesNum;
	}

}

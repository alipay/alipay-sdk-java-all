package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易分账统一查询
 *
 * @author auto create
 * @since 1.0, 2023-03-31 11:41:26
 */
public class AlipayTradeOrderOnsettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3346242547921868899L;

	/**
	 * unsettled表示从待结算资金分账；不传表示从售后分账
	 */
	@ApiField("royalty_source")
	private String royaltySource;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRoyaltySource() {
		return this.royaltySource;
	}
	public void setRoyaltySource(String royaltySource) {
		this.royaltySource = royaltySource;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对于部分签约境内当面付的商家，为了能够在境外进行推广，因此需要汇率进行币种之间的转换，本接口提供此业务场景下的汇率查询服务
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:50
 */
public class AlipayAccountExrateRatequeryModel extends AlipayObject {

	private static final long serialVersionUID = 6437985853998499861L;

	/**
	 * 需要查询汇率的货币对，如果为空则返回当前支持的所有货币对的汇率
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	public String getCurrencyPair() {
		return this.currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

}

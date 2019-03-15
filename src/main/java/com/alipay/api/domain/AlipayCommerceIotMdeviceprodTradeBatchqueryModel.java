package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据交易流水号查询设备信息
 *
 * @author auto create
 * @since 1.0, 2019-02-25 16:47:04
 */
public class AlipayCommerceIotMdeviceprodTradeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4762561296931566169L;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

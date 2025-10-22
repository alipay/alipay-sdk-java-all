package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时到账批量退款查询接口
 *
 * @author auto create
 * @since 1.0, 2019-07-08 15:20:17
 */
public class AlipayTradeBatchRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2474386641219429789L;

	/**
	 * 商户请求批量退款时传递的批次号。
trade_no和batch_no不能同时为空
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 退款明细的支付宝交易号。
trade_no和batch_no不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

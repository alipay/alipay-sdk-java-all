package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行追款场景数据
 *
 * @author auto create
 * @since 1.0, 2019-11-12 19:52:42
 */
public class BankRepayData extends AlipayObject {

	private static final long serialVersionUID = 1259456187382336748L;

	/**
	 * 原清算交易中支付宝文件流水传的senderClrgTrcno发行方清算流水号;
追款关联的原银行清算流水号，二选一传入即可
	 */
	@ApiField("original_out_trade_no")
	private String originalOutTradeNo;

	/**
	 * 原清算交易中支付宝文件流水传的etcClrgTrcnoETC清算流水号
	 */
	@ApiField("original_trade_no")
	private String originalTradeNo;

	public String getOriginalOutTradeNo() {
		return this.originalOutTradeNo;
	}
	public void setOriginalOutTradeNo(String originalOutTradeNo) {
		this.originalOutTradeNo = originalOutTradeNo;
	}

	public String getOriginalTradeNo() {
		return this.originalTradeNo;
	}
	public void setOriginalTradeNo(String originalTradeNo) {
		this.originalTradeNo = originalTradeNo;
	}

}

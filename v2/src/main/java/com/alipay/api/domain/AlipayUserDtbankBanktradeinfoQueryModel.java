package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行绑卡交易信息查询
 *
 * @author auto create
 * @since 1.0, 2021-09-27 10:07:42
 */
public class AlipayUserDtbankBanktradeinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2124286674597352638L;

	/**
	 * ICBC：工行，
ABC：农行，
BOC：中行，
CEB：光大银行
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBankInstId() {
		return this.bankInstId;
	}
	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单确认结算接口
 *
 * @author auto create
 * @since 1.0, 2021-11-26 21:12:32
 */
public class AlipayTradeSettleConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3434265991432519844L;

	/**
	 * 扩展字段信息
	 */
	@ApiField("extend_params")
	private SettleConfirmExtendParams extendParams;

	/**
	 * 确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 描述结算信息，json格式。
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public SettleConfirmExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(SettleConfirmExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public SettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(SettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

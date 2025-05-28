package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进件设备交易订单完结
 *
 * @author auto create
 * @since 1.0, 2022-12-07 10:43:29
 */
public class AlipayCommerceOperationTerminalPowerbankorderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 4884266296825614297L;

	/**
	 * 完结订单时在哪个设备
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 需要更新的记录外部订单号
	 */
	@ApiField("out_trade_id")
	private String outTradeId;

	/**
	 * 进件过的,且之前生成了对应订单记录的设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 完结时,对应记录状态,只能是FINISHED(订单成功完结且扣款成功)或者PAY_FAIL(订单完结但扣款失败)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 预授权转交易,收单时的交易Id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getOutTradeId() {
		return this.outTradeId;
	}
	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}

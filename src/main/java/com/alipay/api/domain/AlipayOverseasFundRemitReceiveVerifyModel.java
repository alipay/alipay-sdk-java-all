package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款信息确认接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 04:32:13
 */
public class AlipayOverseasFundRemitReceiveVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4545673719539195124L;

	/**
	 * product_code用来确定汇款产品，汇款机构签约时确定。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * receive_amount, 汇款汇入金额, 采用receive_currency参数标示的汇出币种最小金额单位。例如: receive_currency = USD, USD最小单位为$0.01(一美分),则 receive_amount = 100 是$1.00USD。如果receive_currency = JPY, JPY最小单位是1日元，则receive_amount = 100是100JPY
	 */
	@ApiField("receive_amount")
	private Long receiveAmount;

	/**
	 * receive_currency, 汇款汇入币种
	 */
	@ApiField("receive_currency")
	private String receiveCurrency;

	/**
	 * receive_fx_rate, 支付宝给汇款机构提供的收款汇率
	 */
	@ApiField("receive_fx_rate")
	private RemitExchangeRate receiveFxRate;

	/**
	 * receiver, 汇款机构提供的收款人详细信息。支付宝根据信息来确认用户信息。
	 */
	@ApiField("receiver")
	private RemitReceiver receiver;

	/**
	 * 汇款Agent信息
	 */
	@ApiField("send_agent")
	private RemitAgent sendAgent;

	/**
	 * send_amount, 汇款汇出金额, 采用send_currency参数标示的汇出币种最小金额单位。例如: send_currency = USD, USD最小单位为$0.01(一美分),则 send_amount = 100 是$1.00USD。如果send_currency = JPY, JPY最小单位是1日元，则send_amount = 100是100JPY
	 */
	@ApiField("send_amount")
	private Long sendAmount;

	/**
	 * send_currency, 汇款汇出币种
	 */
	@ApiField("send_currency")
	private String sendCurrency;

	/**
	 * send_fx_rate, 汇款机构的给汇款方的汇出汇率
	 */
	@ApiField("send_fx_rate")
	private RemitExchangeRate sendFxRate;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getReceiveAmount() {
		return this.receiveAmount;
	}
	public void setReceiveAmount(Long receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public String getReceiveCurrency() {
		return this.receiveCurrency;
	}
	public void setReceiveCurrency(String receiveCurrency) {
		this.receiveCurrency = receiveCurrency;
	}

	public RemitExchangeRate getReceiveFxRate() {
		return this.receiveFxRate;
	}
	public void setReceiveFxRate(RemitExchangeRate receiveFxRate) {
		this.receiveFxRate = receiveFxRate;
	}

	public RemitReceiver getReceiver() {
		return this.receiver;
	}
	public void setReceiver(RemitReceiver receiver) {
		this.receiver = receiver;
	}

	public RemitAgent getSendAgent() {
		return this.sendAgent;
	}
	public void setSendAgent(RemitAgent sendAgent) {
		this.sendAgent = sendAgent;
	}

	public Long getSendAmount() {
		return this.sendAmount;
	}
	public void setSendAmount(Long sendAmount) {
		this.sendAmount = sendAmount;
	}

	public String getSendCurrency() {
		return this.sendCurrency;
	}
	public void setSendCurrency(String sendCurrency) {
		this.sendCurrency = sendCurrency;
	}

	public RemitExchangeRate getSendFxRate() {
		return this.sendFxRate;
	}
	public void setSendFxRate(RemitExchangeRate sendFxRate) {
		this.sendFxRate = sendFxRate;
	}

}

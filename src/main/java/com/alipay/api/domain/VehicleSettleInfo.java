package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算描述信息
 *
 * @author auto create
 * @since 1.0, 2019-11-12 19:52:42
 */
public class VehicleSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 7537723896393712577L;

	/**
	 * 结算的金额，单位为元。目前必须和交易金额相同
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 结算汇总维度，按照这个维度汇总成批次结算，由商户指定。
目前需要和结算收款方账户类型为cardAliasNo配合使用
	 */
	@ApiField("summary_dimension")
	private String summaryDimension;

	/**
	 * 结算收款方。当结算收款方类型是cardAliasNo时，本参数为用户在支付宝绑定的卡编号；结算收款方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；当结算收款方类型是loginName时，本参数为用户的支付宝登录号
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 结算收款方的账户类型。
cardAliasNo：结算收款方的银行卡编号;
userId：表示是支付宝账号对应的支付宝唯一用户号;
loginName：表示是支付宝登录号；
	 */
	@ApiField("trans_in_type")
	private String transInType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSummaryDimension() {
		return this.summaryDimension;
	}
	public void setSummaryDimension(String summaryDimension) {
		this.summaryDimension = summaryDimension;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

}

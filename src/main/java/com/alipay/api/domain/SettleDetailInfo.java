package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算详细信息
 *
 * @author auto create
 * @since 1.0, 2018-04-04 18:19:51
 */
public class SettleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1698175232853931945L;

	/**
	 * 结算的金额，单位为元。目前必须和交易金额相同
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 结算汇总维度，按照这个维度汇总成批次结算，由商户指定。

目前需要和结算收款方账户类型为cardSerialNo配合使用
	 */
	@ApiField("summary_dimension")
	private String summaryDimension;

	/**
	 * 结算收款方。当结算收款方类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 结算收款方的账户类型。

cardSerialNo：结算收款方的银行卡编号。

目前只支持cardSerialNo账户类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
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

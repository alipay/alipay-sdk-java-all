package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快收服务下单
 *
 * @author auto create
 * @since 1.0, 2025-12-26 13:07:27
 */
public class AlipayTradeFinanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5335421995829146195L;

	/**
	 * 下单金额，单位（元，2位小数点），需要和预下单金额一致
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务时间。例如，由接入方传入的交易结算时间or卖家提现时间。
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 用于传递特殊业务信息的拓展信息
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 外部订单号, 外部的业务单据号，例如xx平台交易订单id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求号，幂等字段，两次请求的外部请求号若一致，则系统认为是一笔请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付宝结算单号，预下单时生成
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSettlementNo() {
		return this.settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

}

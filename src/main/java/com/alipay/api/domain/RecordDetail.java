package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据导出记录详情对象，com.alipay.pcreditsceneprod.facade.dto.RecordDetail
 *
 * @author auto create
 * @since 1.0, 2020-04-30 23:12:07
 */
public class RecordDetail extends AlipayObject {

	private static final long serialVersionUID = 8671424173711231751L;

	/**
	 * 消费说明
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 交易订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 交易金额
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 交易时间 yyyy-mm-dd HH:MM:SS
	 */
	@ApiField("trans_dt")
	private Date transDt;

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public Date getTransDt() {
		return this.transDt;
	}
	public void setTransDt(Date transDt) {
		this.transDt = transDt;
	}

}

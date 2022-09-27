package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用收单申请接口
 *
 * @author auto create
 * @since 1.0, 2019-07-26 13:56:45
 */
public class ZhimaMerchantOrderCreditCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2612689931782561479L;

	/**
	 * 该笔订单的资金总金额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 芝麻业务端分配的风险类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 业务办理渠道，商户自定义
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 该笔订单的押金总额，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("deposit")
	private String deposit;

	/**
	 * 此处固定填写WEB，如果是小程序渠道，则填写TINY_APP
	 */
	@ApiField("from_channel")
	private String fromChannel;

	/**
	 * 芝麻业务端分配的业务识别码，商户入驻签约后分配
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订单处理url，商户处理订单的页面，例如订单详情url，目前仅用于线下租赁(景区)业务
	 */
	@ApiField("order_process_url")
	private String orderProcessUrl;

	/**
	 * 商户的订单号或业务办理号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 业务逾期时间，请根据实际业务合理设置该值，如果是线上或线下租赁业务则该字段不允许为空，格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("overdue_time")
	private String overdueTime;

	/**
	 * 商品内容，JSON格式，该部分信息会在信用收单页展示给用户，注意：如果数据包含中文，需要对该数据先进行一次编码，如示例值里的"bicycle"想传入"汉服"，则需要进行编码
	 */
	@ApiField("subject")
	private String subject;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDeposit() {
		return this.deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getFromChannel() {
		return this.fromChannel;
	}
	public void setFromChannel(String fromChannel) {
		this.fromChannel = fromChannel;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderProcessUrl() {
		return this.orderProcessUrl;
	}
	public void setOrderProcessUrl(String orderProcessUrl) {
		this.orderProcessUrl = orderProcessUrl;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOverdueTime() {
		return this.overdueTime;
	}
	public void setOverdueTime(String overdueTime) {
		this.overdueTime = overdueTime;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单变更同步接口
 *
 * @author auto create
 * @since 1.0, 2019-09-12 15:43:02
 */
public class AlipayBossFncInvoicereceiptCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2499656623739562686L;

	/**
	 * 账单金额变更消息事件码
AR_MTHLY_BILL_CREATE:应收账单创建,
AR_MTHLY_BILL_CHANGE:应收金额更新
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 账单金额变更消息事件类型
CREATE:创建事件,UPDATE:更新事件
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 月帐单信息
	 */
	@ApiField("monthly_bill")
	private ArMonthlyBillDTO monthlyBill;

	/**
	 * 事件全局id，可以使用uuid
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 消息来源 01:主站，02：芝麻，03:金融云,04:微贷
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public ArMonthlyBillDTO getMonthlyBill() {
		return this.monthlyBill;
	}
	public void setMonthlyBill(ArMonthlyBillDTO monthlyBill) {
		this.monthlyBill = monthlyBill;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

}

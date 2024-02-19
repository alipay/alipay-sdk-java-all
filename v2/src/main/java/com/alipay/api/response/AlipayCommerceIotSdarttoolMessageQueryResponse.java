package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sdarttool.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:33:17
 */
public class AlipayCommerceIotSdarttoolMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2521417416344565181L;

	/** 
	 * 消息消费返回码，不用的消息类型返回码不一样
	 */
	@ApiField("consume_err_code")
	private String consumeErrCode;

	/** 
	 * 消息消费错误原因
	 */
	@ApiField("consume_err_msg")
	private String consumeErrMsg;

	/** 
	 * 消息消费状态1-未消费; 2-消费成功；3-消费失败
	 */
	@ApiField("consume_state")
	private Long consumeState;

	/** 
	 * 消息投递次数
	 */
	@ApiField("deliver_cnt")
	private Long deliverCnt;

	/** 
	 * 消息投递状态
1: 未投递 2: 投递中 3: 投递成功 4: 投递失败 5: 消息失效不再发送
	 */
	@ApiField("deliver_status")
	private String deliverStatus;

	/** 
	 * 消息最后一次发送时间
	 */
	@ApiField("last_deliver_at")
	private Long lastDeliverAt;

	/** 
	 * 消息确认消费时间(ms)
	 */
	@ApiField("msg_ack_time")
	private Long msgAckTime;

	/** 
	 * 消息必达类型 1-非必达; 2-必达.
	 */
	@ApiField("msg_bida")
	private Long msgBida;

	/** 
	 * 消息过期时间(ms)
	 */
	@ApiField("msg_expire_time")
	private Long msgExpireTime;

	/** 
	 * 消息创建时间(ms)
	 */
	@ApiField("msg_gmt_create")
	private Long msgGmtCreate;

	/** 
	 * 消息投递优先级
	 */
	@ApiField("msg_priority")
	private Long msgPriority;

	public void setConsumeErrCode(String consumeErrCode) {
		this.consumeErrCode = consumeErrCode;
	}
	public String getConsumeErrCode( ) {
		return this.consumeErrCode;
	}

	public void setConsumeErrMsg(String consumeErrMsg) {
		this.consumeErrMsg = consumeErrMsg;
	}
	public String getConsumeErrMsg( ) {
		return this.consumeErrMsg;
	}

	public void setConsumeState(Long consumeState) {
		this.consumeState = consumeState;
	}
	public Long getConsumeState( ) {
		return this.consumeState;
	}

	public void setDeliverCnt(Long deliverCnt) {
		this.deliverCnt = deliverCnt;
	}
	public Long getDeliverCnt( ) {
		return this.deliverCnt;
	}

	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}
	public String getDeliverStatus( ) {
		return this.deliverStatus;
	}

	public void setLastDeliverAt(Long lastDeliverAt) {
		this.lastDeliverAt = lastDeliverAt;
	}
	public Long getLastDeliverAt( ) {
		return this.lastDeliverAt;
	}

	public void setMsgAckTime(Long msgAckTime) {
		this.msgAckTime = msgAckTime;
	}
	public Long getMsgAckTime( ) {
		return this.msgAckTime;
	}

	public void setMsgBida(Long msgBida) {
		this.msgBida = msgBida;
	}
	public Long getMsgBida( ) {
		return this.msgBida;
	}

	public void setMsgExpireTime(Long msgExpireTime) {
		this.msgExpireTime = msgExpireTime;
	}
	public Long getMsgExpireTime( ) {
		return this.msgExpireTime;
	}

	public void setMsgGmtCreate(Long msgGmtCreate) {
		this.msgGmtCreate = msgGmtCreate;
	}
	public Long getMsgGmtCreate( ) {
		return this.msgGmtCreate;
	}

	public void setMsgPriority(Long msgPriority) {
		this.msgPriority = msgPriority;
	}
	public Long getMsgPriority( ) {
		return this.msgPriority;
	}

}

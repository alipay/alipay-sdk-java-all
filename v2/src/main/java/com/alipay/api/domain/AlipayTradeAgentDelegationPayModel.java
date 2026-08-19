package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体委托支付接口
 *
 * @author auto create
 * @since 1.0, 2026-08-18 19:39:00
 */
public class AlipayTradeAgentDelegationPayModel extends AlipayObject {

	private static final long serialVersionUID = 6543292773498216226L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务单号列表，单笔支付场景塞一个业务单号值。
合并支付场景塞多笔订单，英文逗号分割。
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 代买委托id
	 */
	@ApiField("delegation_id")
	private String delegationId;

	/**
	 * 传阶段号out_relation_id的值。

如果不传，则用交易号作为本次请求号，意味着是整笔订单支付。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 预下单ID，通过请求alipay.trade.order.prepay接口获取预下单ID
	 */
	@ApiField("prepay_id")
	private String prepayId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getDelegationId() {
		return this.delegationId;
	}
	public void setDelegationId(String delegationId) {
		this.delegationId = delegationId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

}

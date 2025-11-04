package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iotnsp授权接口
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:15:35
 */
public class AlipayCommerceCityfacilitatorIotnsphgHgauthGetModel extends AlipayObject {

	private static final long serialVersionUID = 4876232445547171595L;

	/**
	 * 行业金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 设备ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 关联外部订单
	 */
	@ApiField("ori_out_trade_no")
	private String oriOutTradeNo;

	/**
	 * 原请求ID
	 */
	@ApiField("ori_req_id")
	private String oriReqId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 请求id
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 业务标识处理id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getOriOutTradeNo() {
		return this.oriOutTradeNo;
	}
	public void setOriOutTradeNo(String oriOutTradeNo) {
		this.oriOutTradeNo = oriOutTradeNo;
	}

	public String getOriReqId() {
		return this.oriReqId;
	}
	public void setOriReqId(String oriReqId) {
		this.oriReqId = oriReqId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}

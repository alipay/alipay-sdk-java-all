package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-交易查询接口
 *
 * @author auto create
 * @since 1.0, 2020-03-23 17:08:49
 */
public class MybankCreditSupplychainCreditpayTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8127337998354255727L;

	/**
	 * 买方信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 平台类型
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * Trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 网商交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

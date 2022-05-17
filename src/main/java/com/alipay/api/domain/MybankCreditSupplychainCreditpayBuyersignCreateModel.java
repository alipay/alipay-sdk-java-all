package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-买家签约
 *
 * @author auto create
 * @since 1.0, 2022-03-09 13:56:21
 */
public class MybankCreditSupplychainCreditpayBuyersignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2721932113397158618L;

	/**
	 * 买家信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 1688买家ID
	 */
	@ApiField("buyer_scene_id")
	private String buyerSceneId;

	/**
	 * 平台类型
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * 请求幂等控制ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 网商日志跟踪ID
	 */
	@ApiField("trace_id")
	private String traceId;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getBuyerSceneId() {
		return this.buyerSceneId;
	}
	public void setBuyerSceneId(String buyerSceneId) {
		this.buyerSceneId = buyerSceneId;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}

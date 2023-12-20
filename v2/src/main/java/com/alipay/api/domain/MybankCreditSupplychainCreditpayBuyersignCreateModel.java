package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-买家签约
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:37:19
 */
public class MybankCreditSupplychainCreditpayBuyersignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6238876474872749755L;

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
	 * 是否签约数据授权,签约=Y,不签约=N
	 */
	@ApiField("is_sign_data_auth")
	private String isSignDataAuth;

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

	public String getIsSignDataAuth() {
		return this.isSignDataAuth;
	}
	public void setIsSignDataAuth(String isSignDataAuth) {
		this.isSignDataAuth = isSignDataAuth;
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

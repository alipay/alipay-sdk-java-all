package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-买家解约准入查询
 *
 * @author auto create
 * @since 1.0, 2023-01-11 10:24:08
 */
public class MybankCreditSupplychainCreditpayBuyerunsignadmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1227294346153754842L;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

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
	 * 请求冥等ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

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

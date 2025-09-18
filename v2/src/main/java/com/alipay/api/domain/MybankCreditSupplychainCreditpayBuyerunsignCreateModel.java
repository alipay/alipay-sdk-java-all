package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-买家解约
 *
 * @author auto create
 * @since 1.0, 2023-04-11 15:26:51
 */
public class MybankCreditSupplychainCreditpayBuyerunsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3738584295989157243L;

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
	 * 授权场景码
	 */
	@ApiField("mybk_auth_scene_code")
	private String mybkAuthSceneCode;

	/**
	 * 授权令牌
	 */
	@ApiField("mybk_auth_token")
	private String mybkAuthToken;

	/**
	 * 请求冥等控制ID
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getMybkAuthSceneCode() {
		return this.mybkAuthSceneCode;
	}
	public void setMybkAuthSceneCode(String mybkAuthSceneCode) {
		this.mybkAuthSceneCode = mybkAuthSceneCode;
	}

	public String getMybkAuthToken() {
		return this.mybkAuthToken;
	}
	public void setMybkAuthToken(String mybkAuthToken) {
		this.mybkAuthToken = mybkAuthToken;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}

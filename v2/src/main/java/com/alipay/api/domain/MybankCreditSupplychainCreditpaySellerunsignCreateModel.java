package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-卖家解约
 *
 * @author auto create
 * @since 1.0, 2023-04-11 15:26:55
 */
public class MybankCreditSupplychainCreditpaySellerunsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4265373714892491371L;

	/**
	 * 合同编号
	 */
	@ApiField("ar_no")
	private String arNo;

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

	/**
	 * 卖家信息
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * 1688卖家ID
	 */
	@ApiField("seller_scene_id")
	private String sellerSceneId;

	/**
	 * havanaId
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称，在需要填写店铺名称时
	 */
	@ApiField("shop_name")
	private String shopName;

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

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public String getSellerSceneId() {
		return this.sellerSceneId;
	}
	public void setSellerSceneId(String sellerSceneId) {
		this.sellerSceneId = sellerSceneId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}

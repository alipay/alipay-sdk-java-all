package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-卖家解约
 *
 * @author auto create
 * @since 1.0, 2020-03-04 11:22:21
 */
public class MybankCreditSupplychainCreditpaySellerunsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7365961567172673331L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取团购套餐列表
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:13
 */
public class AlipayOpenSpNordercateringItemsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5544795771841562365L;

	/**
	 * 设备app token
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 点餐端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 已曝光商品 itemId 累计列表
	 */
	@ApiField("exposed_item_list")
	private String exposedItemList;

	/**
	 * 点餐回跳地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 当client_type为WECHAT必填
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 对外会话标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 神券门店 ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户 UID，当client_type为ALIPAY必填
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户 UID当client_type为ALIPAY必填
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	/**
	 * 微信用户辅助标识
	 */
	@ApiField("wx_id")
	private String wxId;

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getExposedItemList() {
		return this.exposedItemList;
	}
	public void setExposedItemList(String exposedItemList) {
		this.exposedItemList = exposedItemList;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getWxId() {
		return this.wxId;
	}
	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

}

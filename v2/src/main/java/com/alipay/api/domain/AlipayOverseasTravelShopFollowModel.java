package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游发现店铺收藏接口
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:38:13
 */
public class AlipayOverseasTravelShopFollowModel extends AlipayObject {

	private static final long serialVersionUID = 5561257926626715913L;

	/**
	 * 取值说明：CONFIRM确认收藏/CANCEL取消收藏
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝跨境游店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便与外部排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：HAVANA为集团havanaId，ALIPAY为支付宝2088开头用户id。不传的时候，默认为ALIPAY。
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小游戏虚拟币交易订单查询
 *
 * @author auto create
 * @since 1.0, 2025-08-12 16:41:09
 */
public class AlipayUserGamepaycoinTradeorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4535726979148879156L;

	/**
	 * 开发者自定义订单号，在下单的时候传入的customId
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

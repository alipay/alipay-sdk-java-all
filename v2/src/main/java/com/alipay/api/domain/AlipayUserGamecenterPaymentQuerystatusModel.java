package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值状态查询
 *
 * @author auto create
 * @since 1.0, 2025-04-01 16:42:19
 */
public class AlipayUserGamecenterPaymentQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 6826779974488352266L;

	/**
	 * 开发者自定义订单号，在下单的时候传入的customId
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 商户app_id维度下的用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
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

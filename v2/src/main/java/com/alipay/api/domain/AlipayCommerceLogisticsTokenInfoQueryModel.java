package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流寄件下单token信息查询
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:24:57
 */
public class AlipayCommerceLogisticsTokenInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5578224792123689287L;

	/**
	 * 支付宝聚合下单页跳转商户小程序携带的token，商户通过token回查支付宝获取用户填选的信息
	 */
	@ApiField("info_token")
	private String infoToken;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getInfoToken() {
		return this.infoToken;
	}
	public void setInfoToken(String infoToken) {
		this.infoToken = infoToken;
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

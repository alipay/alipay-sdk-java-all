package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网约车_超级打车卡信息查询
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:37:16
 */
public class AlipayCommerceTransportOnlinerideSuperwalletQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5115349441541352193L;

	/**
	 * 业务请求来源，
首页：HOME_PAGE
发单页：ORDER_PAGE
	 */
	@ApiField("biz_source")
	private String bizSource;

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

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
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

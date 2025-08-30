package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取淘宝ID
 *
 * @author auto create
 * @since 1.0, 2025-05-27 13:57:40
 */
public class AlipayOpenNppdUsertbidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3462268891297436286L;

	/**
	 * 请求凭证
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 企业侧的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
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

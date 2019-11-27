package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户常驻位置
 *
 * @author auto create
 * @since 1.0, 2017-03-29 17:25:23
 */
public class AlipayMsaasMobilelbsResidentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5728382873826572938L;

	/**
	 * 内容投放平台
	 */
	@ApiField("appkey")
	private String appkey;

	/**
	 * 支付宝用户的唯一userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppkey() {
		return this.appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

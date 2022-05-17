package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部签到活动报名接口
 *
 * @author auto create
 * @since 1.0, 2020-05-06 17:34:52
 */
public class AlipayMarketingToolSignupSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4512636276767181586L;

	/**
	 * 玩法ID。
	 */
	@ApiField("play_id")
	private String playId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPlayId() {
		return this.playId;
	}
	public void setPlayId(String playId) {
		this.playId = playId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

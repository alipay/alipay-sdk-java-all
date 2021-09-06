package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动任务权益发放
 *
 * @author auto create
 * @since 1.0, 2021-06-28 17:01:29
 */
public class AlipayOpenMiniActivityTaskequityReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 8352434596749437329L;

	/**
	 * 任务完成的业务时间，用于做权益发放的原始时间戳，将以任务完成时间为准发放权益
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

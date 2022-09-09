package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户联通手机卡信息同步接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayUserUnicomCardInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7631873669553798757L;

	/**
	 * 状态发生变更的时间，返回自January 1, 1970, 00:00:00 GMT至手机号状态变更发生时的毫秒数, java代码获取示例：new Date().getTime()
	 */
	@ApiField("gmt_status_change")
	private String gmtStatusChange;

	/**
	 * 状态发生变更的用户的联通手机号码(11位，不含国家码)
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 联通手机号码状态（激活: CARD_ACTIVE, 注销: CARD_CLOSE）
	 */
	@ApiField("phone_no_status")
	private String phoneNoStatus;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getGmtStatusChange() {
		return this.gmtStatusChange;
	}
	public void setGmtStatusChange(String gmtStatusChange) {
		this.gmtStatusChange = gmtStatusChange;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPhoneNoStatus() {
		return this.phoneNoStatus;
	}
	public void setPhoneNoStatus(String phoneNoStatus) {
		this.phoneNoStatus = phoneNoStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

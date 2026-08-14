package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 铁路优惠券前置查询接口
 *
 * @author auto create
 * @since 1.0, 2026-08-11 16:47:49
 */
public class AlipayCommerceTransportRailwayCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6496134437694612957L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("phone_list")
	@ApiField("string")
	private List<String> phoneList;

	/**
	 * 第三方请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getPhoneList() {
		return this.phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

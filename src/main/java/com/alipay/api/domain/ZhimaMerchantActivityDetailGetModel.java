package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取承诺消费活动详情页
 *
 * @author auto create
 * @since 1.0, 2019-03-25 16:47:50
 */
public class ZhimaMerchantActivityDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 6549576556872694175L;

	/**
	 * 活动号，唯一标识一个活动。
	 */
	@ApiField("activity_no")
	private String activityNo;

	/**
	 * 用户取消合约后，有行动点可以回跳到该地址
	 */
	@ApiField("canceled_callback")
	private String canceledCallback;

	/**
	 * 活动所属门店。线上模式等没有门店概念的活动可不填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 签约成功页回跳，本页面接口拉起活动页，用户签约后，成功页可以回跳到业务发起者的页面。
	 */
	@ApiField("sign_success_callback")
	private String signSuccessCallback;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityNo() {
		return this.activityNo;
	}
	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

	public String getCanceledCallback() {
		return this.canceledCallback;
	}
	public void setCanceledCallback(String canceledCallback) {
		this.canceledCallback = canceledCallback;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSignSuccessCallback() {
		return this.signSuccessCallback;
	}
	public void setSignSuccessCallback(String signSuccessCallback) {
		this.signSuccessCallback = signSuccessCallback;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

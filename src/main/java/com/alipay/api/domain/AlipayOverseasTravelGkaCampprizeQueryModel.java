package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询苹果活动奖品信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:34:26
 */
public class AlipayOverseasTravelGkaCampprizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3533139257533637386L;

	/**
	 * 活动id，获取方式：联系支付宝运营同学获取（适用于支付宝平台活动，由合作伙伴调用触发）
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户参与活动的手机号
	 */
	@ApiField("login_mobile")
	private String loginMobile;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。user_id、bind_mobile两个参数至少有一个非空。使用优先级为 user_id > bind_mobile
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getLoginMobile() {
		return this.loginMobile;
	}
	public void setLoginMobile(String loginMobile) {
		this.loginMobile = loginMobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发现金红包活动
 *
 * @author auto create
 * @since 1.0, 2022-11-23 14:04:03
 */
public class AlipayMarketingCampaignCashTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 3763792552666256783L;

	/**
	 * 现金活动号，通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create">alipay.marketing.campaign.cash.create</a>(创建现金活动)接口创建现金活动获取。
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 用户登录账号名，一般为邮箱或手机号。
注意：user_id与login_id二选一必填，同时传入时以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 此字段如果传入金额，就忽略prize_type算法，按照传入的金额发奖。如果不传或者小于等于0，则按照活动创建时指定的prize_type为fixed或者random算法发奖
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 领取红包的外部业务号，只由可由字母、数字、下划线组成。同一个活动中不可重复，相同的外部业务号会被幂等并返回之前的结果。不填时，系统会生成一个默认固定的外部业务号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户支付宝唯一标识，2088开头。
注意：user_id与login_id二选一必填，同时传入时以user_id为准。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

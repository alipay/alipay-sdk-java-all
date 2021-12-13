package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查活动流水发放接口
 *
 * @author auto create
 * @since 1.0, 2021-10-15 19:31:22
 */
public class AlipayUserDtbankcustActivityorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8411183944238211116L;

	/**
	 * 数字分行活动id，activity_order_id为空时必填
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动流水唯一id，由系统自动生成的，在调用活动触发接口会返回该id。
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/**
	 * 登录ID
支付宝用户ID 。user_id, logon_id，手机号不能同时为空，优先级依次降低
注：若手机号为非注册账号，则会查询失败
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 外部业务号，activity_order_id为空时必填
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户手机号，user_id, logon_id，手机号不能同时为空，优先级依次降低
注：通过该参数入参将关联用户常用支付宝账号，可能存在误差，请优先使用user_id和logon_id
	 */
	@ApiField("phone_id")
	private String phoneId;

	/**
	 * 支付宝用户ID 。user_id, logon_id，手机号不能同时为空，优先级依次降低
注：UID为用户唯一标识，可通过授权方式获取，具体见产品文档
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityOrderId() {
		return this.activityOrderId;
	}
	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhoneId() {
		return this.phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

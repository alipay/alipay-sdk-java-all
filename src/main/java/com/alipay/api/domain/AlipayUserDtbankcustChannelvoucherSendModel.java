package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行通用红包发放接口
 *
 * @author auto create
 * @since 1.0, 2022-02-21 15:05:53
 */
public class AlipayUserDtbankcustChannelvoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 7471735288712583294L;

	/**
	 * 数字分行活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 支付宝用户ID 。user_id，logon_id，phone_id不能同时为空，优先级依次降低。
注：若手机号为非用户注册支付宝账号，则会发放失败。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户手机号。user_id，logon_id，phone_id不能同时为空，优先级依次降低。
注：该参数将先匹配用户手机号对应支付宝账号，若不存在，则再匹配用户手机号绑定支付宝账号。若用户手机号绑定多个支付宝账号，则以系统判定的常用支付宝账号为准。请优先使用user_id和logon_id。
	 */
	@ApiField("phone_id")
	private String phoneId;

	/**
	 * 支付宝用户ID 。user_id，logon_id，phone_id不能同时为空，优先级依次降低。
注：UID为用户唯一标识，可通过授权方式获取，具体见产品文档。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
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

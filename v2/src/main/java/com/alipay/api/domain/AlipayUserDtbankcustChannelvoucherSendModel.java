package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行通用红包发放接口
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:47:07
 */
public class AlipayUserDtbankcustChannelvoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 6292336498658763546L;

	/**
	 * 数字分行活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 支付宝用户ID 。当不传入specify_user_info字段时：user_id，open_id，logon_id，phone_id不能同时为空，优先级依次降低；当传入specify_user_info字段时：不可传入logon_id字段。
注：若手机号为非用户注册支付宝账号，则会发放失败。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 映射user_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该参数将先匹配用户手机号对应支付宝账号，若存在且完成实名认证则以此支付宝账号发放，若该支付宝账号未完成实名认证则发放失败；若用户手机号对应支付宝账号不存在，则再匹配用户手机号绑定支付宝账号。若用户手机号绑定多个支付宝账号，则以系统判定的常用支付宝账号为准。请优先使用user_id和logon_id。
	 */
	@ApiField("phone_id")
	private String phoneId;

	/**
	 * 适用于通过指定主体的appid和指定openid解析出对应userid发奖，specify_user_info发奖需先找BD申请加白
	 */
	@ApiField("specify_user_info")
	private SpecifyUserInfo specifyUserInfo;

	/**
	 * 支付宝用户ID 。当不传入specify_user_info字段时：user_id，open_id，logon_id，phone_id不能同时为空，优先级依次降低；当传入specify_user_info字段时：不可传入user_id字段。
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public SpecifyUserInfo getSpecifyUserInfo() {
		return this.specifyUserInfo;
	}
	public void setSpecifyUserInfo(SpecifyUserInfo specifyUserInfo) {
		this.specifyUserInfo = specifyUserInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

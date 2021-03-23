package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行通用红包发放接口
 *
 * @author auto create
 * @since 1.0, 2021-02-23 13:52:20
 */
public class AlipayUserDtbankcustChannelvoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 1568496432873994945L;

	/**
	 * 数字分行活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 登录ID
支付宝用户ID 。user_id, logon_id不能同时为空，优先级依次降低
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID 。user_id, logon_id不能同时为空，优先级依次降低
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

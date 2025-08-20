package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名提交的券信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:36
 */
public class RecruitVoucher extends AlipayObject {

	private static final long serialVersionUID = 3154164198661813135L;

	/**
	 * 券活动id。支持商家券（创建商家券请参考https://opendocs.alipay.com/apis/01xm17）和支付券（创建支付券请参考https://opendocs.alipay.com/pre-apis/027185，仅供受邀用户使用），取值均为返回结果的activity_id字段。
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}

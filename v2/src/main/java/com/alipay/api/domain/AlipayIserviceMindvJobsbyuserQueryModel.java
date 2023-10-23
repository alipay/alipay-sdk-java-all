package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角_查询用户作答过的任务
 *
 * @author auto create
 * @since 1.0, 2023-02-03 16:41:05
 */
public class AlipayIserviceMindvJobsbyuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7455357725115899869L;

	/**
	 * 对应账号类型下的唯一账号主键_用以区分对应的填写用户
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 账号类型_用以区分不同账号体系的用户

ALIPAY-支付宝
HEMA-盒马
ALIBABA_INC-内部域账号
	 */
	@ApiField("user_type")
	private String userType;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}

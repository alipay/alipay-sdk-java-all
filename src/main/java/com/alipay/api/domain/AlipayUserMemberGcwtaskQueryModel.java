package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广场舞大赛活动任务列表查询
 *
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:17
 */
public class AlipayUserMemberGcwtaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3373451159552816248L;

	/**
	 * 蚂蚁统一会员ID，16位2088开头。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 应用id，固定值，用于识别相关调用方的应用来源
	 */
	@ApiField("application_id")
	private String applicationId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我的快递营销活动准入咨询服务
 *
 * @author auto create
 * @since 1.0, 2025-08-28 14:22:37
 */
public class AlipayCommerceLogisticsActivityAccessConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3278711755839451423L;

	/**
	 * 约定值，可找对接方技术确认，数字和字母组成的字符，长度在8-32之间
	 */
	@ApiField("activity_key")
	private String activityKey;

	/**
	 * 支付宝侧得uid，通过openId映射
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝侧得uid，通过openId映射
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getActivityKey() {
		return this.activityKey;
	}
	public void setActivityKey(String activityKey) {
		this.activityKey = activityKey;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园支付银行优惠活动查询
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:28:44
 */
public class AlipayCommerceEducateCampusPaymentactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5786155345881993421L;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 用户的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务类型：1、指定银行优先：DESIGNATED_BANK
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

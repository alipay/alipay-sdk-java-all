package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条件查询用户券
 *
 * @author auto create
 * @since 1.0, 2022-08-25 15:40:14
 */
public class AlipayMarketingActivityUserBatchqueryvoucherModel extends AlipayObject {

	private static final long serialVersionUID = 3463565529641794432L;

	/**
	 * 活动 id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券归属商户
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 券发放商户
	 */
	@ApiField("sender_merchant_id")
	private String senderMerchantId;

	/**
	 * 支付宝用户 id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券状态，其中已过期状态可查询6个月内的数据
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBelongMerchantId() {
		return this.belongMerchantId;
	}
	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSenderMerchantId() {
		return this.senderMerchantId;
	}
	public void setSenderMerchantId(String senderMerchantId) {
		this.senderMerchantId = senderMerchantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}

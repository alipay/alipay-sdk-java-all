package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条件查询用户券
 *
 * @author auto create
 * @since 1.0, 2021-11-22 17:56:18
 */
public class AlipayMarketingActivityUserBatchqueryvoucherModel extends AlipayObject {

	private static final long serialVersionUID = 8519131789687119279L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券归属商户
限制:
1.belong_merchant_id和sender_merchant_id必填一个，且只能二选一。
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 分页查询页码。 
限制: 必须为大于0的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。 
限制: 
1.必须为大于0的整数 
2.每页最大值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 券发放商户
限制:
1.belong_merchant_id和sender_merchant_id必填一个，且只能二选一。
	 */
	@ApiField("sender_merchant_id")
	private String senderMerchantId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券状态
枚举值 
SENDED：可用 
USED：已核销 
EXPIRED：已过期(可查询6个月内数据)
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

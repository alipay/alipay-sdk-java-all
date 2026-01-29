package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售活动积分兑换
 *
 * @author auto create
 * @since 1.0, 2025-03-12 14:40:54
 */
public class AlipayCommerceRetailActivityExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 6645225855567245127L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 活动奖品的唯一标识
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 活动唯一标识
	 */
	@ApiField("retail_activity_id")
	private String retailActivityId;

	/**
	 * 转账备注
	 */
	@ApiField("transfer_info")
	private String transferInfo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getRetailActivityId() {
		return this.retailActivityId;
	}
	public void setRetailActivityId(String retailActivityId) {
		this.retailActivityId = retailActivityId;
	}

	public String getTransferInfo() {
		return this.transferInfo;
	}
	public void setTransferInfo(String transferInfo) {
		this.transferInfo = transferInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售活动奖品发放
 *
 * @author auto create
 * @since 1.0, 2025-05-12 13:39:32
 */
public class AlipayCommerceRetailActivitySendModel extends AlipayObject {

	private static final long serialVersionUID = 7752355373483828924L;

	/**
	 * 业务单号，用于幂等。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 碰一下设备的唯一标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 碰一下设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 奖品唯一标识
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 活动的唯一标识
	 */
	@ApiField("retail_activity_id")
	private String retailActivityId;

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

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

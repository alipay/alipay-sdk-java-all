package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅套餐校验返回接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 19:11:41
 */
public class SubscribeMemberInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8111237612241248763L;

	/**
	 * 失效时间
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/**
	 * 剩余次数
	 */
	@ApiField("left_times")
	private String leftTimes;

	/**
	 * 订阅时间
	 */
	@ApiField("subscribe_date")
	private String subscribeDate;

	/**
	 * 套餐id
	 */
	@ApiField("subscribe_package_id")
	private String subscribePackageId;

	/**
	 * 套餐类型
	 */
	@ApiField("subscribe_package_type")
	private String subscribePackageType;

	/**
	 * 订阅次数
	 */
	@ApiField("subscribe_times")
	private String subscribeTimes;

	public String getExpiredDate() {
		return this.expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getLeftTimes() {
		return this.leftTimes;
	}
	public void setLeftTimes(String leftTimes) {
		this.leftTimes = leftTimes;
	}

	public String getSubscribeDate() {
		return this.subscribeDate;
	}
	public void setSubscribeDate(String subscribeDate) {
		this.subscribeDate = subscribeDate;
	}

	public String getSubscribePackageId() {
		return this.subscribePackageId;
	}
	public void setSubscribePackageId(String subscribePackageId) {
		this.subscribePackageId = subscribePackageId;
	}

	public String getSubscribePackageType() {
		return this.subscribePackageType;
	}
	public void setSubscribePackageType(String subscribePackageType) {
		this.subscribePackageType = subscribePackageType;
	}

	public String getSubscribeTimes() {
		return this.subscribeTimes;
	}
	public void setSubscribeTimes(String subscribeTimes) {
		this.subscribeTimes = subscribeTimes;
	}

}

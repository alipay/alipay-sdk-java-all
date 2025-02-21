package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碳普惠绿色出行列表结果
 *
 * @author auto create
 * @since 1.0, 2024-10-30 00:20:44
 */
public class CarbonJusticeQueryOpenapiDTO extends AlipayObject {

	private static final long serialVersionUID = 1767218244564279347L;

	/**
	 * 本次绿色行程的距离。单位-米。目前仅地铁支持距离计算
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务发生时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 该绿色行程是什么类型
	 */
	@ApiField("trip_type")
	private String tripType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getTripType() {
		return this.tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

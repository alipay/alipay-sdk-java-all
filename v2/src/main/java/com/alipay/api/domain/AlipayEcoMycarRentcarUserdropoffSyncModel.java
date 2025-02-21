package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车用户还车状态同步
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:27:23
 */
public class AlipayEcoMycarRentcarUserdropoffSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2184381697223983798L;

	/**
	 * 实际还车时间
	 */
	@ApiField("actual_drop_off_time")
	private Date actualDropOffTime;

	/**
	 * 行驶距离，单位公里
	 */
	@ApiField("driving_distance")
	private Long drivingDistance;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActualDropOffTime() {
		return this.actualDropOffTime;
	}
	public void setActualDropOffTime(Date actualDropOffTime) {
		this.actualDropOffTime = actualDropOffTime;
	}

	public Long getDrivingDistance() {
		return this.drivingDistance;
	}
	public void setDrivingDistance(Long drivingDistance) {
		this.drivingDistance = drivingDistance;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

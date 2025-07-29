package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单行程信息
 *
 * @author auto create
 * @since 1.0, 2025-06-03 17:06:52
 */
public class ApprovalTripDTO extends AlipayObject {

	private static final long serialVersionUID = 2456736672827889578L;

	/**
	 * 行程对应到达日期
	 */
	@ApiField("apply_finish_time")
	private Date applyFinishTime;

	/**
	 * 行程对应出发日期
	 */
	@ApiField("apply_start_time")
	private Date applyStartTime;

	/**
	 * 目的地城市信息
	 */
	@ApiField("destination")
	private ApprovalCityDTO destination;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 出发地城市信息
	 */
	@ApiField("origin")
	private ApprovalCityDTO origin;

	/**
	 * 行程模式，默认值为其他
	 */
	@ApiField("trip_mode")
	private String tripMode;

	/**
	 * 行程类型
	 */
	@ApiField("trip_way")
	private String tripWay;

	public Date getApplyFinishTime() {
		return this.applyFinishTime;
	}
	public void setApplyFinishTime(Date applyFinishTime) {
		this.applyFinishTime = applyFinishTime;
	}

	public Date getApplyStartTime() {
		return this.applyStartTime;
	}
	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public ApprovalCityDTO getDestination() {
		return this.destination;
	}
	public void setDestination(ApprovalCityDTO destination) {
		this.destination = destination;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public ApprovalCityDTO getOrigin() {
		return this.origin;
	}
	public void setOrigin(ApprovalCityDTO origin) {
		this.origin = origin;
	}

	public String getTripMode() {
		return this.tripMode;
	}
	public void setTripMode(String tripMode) {
		this.tripMode = tripMode;
	}

	public String getTripWay() {
		return this.tripWay;
	}
	public void setTripWay(String tripWay) {
		this.tripWay = tripWay;
	}

}

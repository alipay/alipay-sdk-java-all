package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户行为上报接口
 *
 * @author auto create
 * @since 1.0, 2026-09-10 16:27:55
 */
public class AlipayOfflineProviderIndflowActionMaintainModel extends AlipayObject {

	private static final long serialVersionUID = 3658364715149825545L;

	/**
	 * 动作发生时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * EXPOSE 曝光/CLICK 点击
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 展位外部ID
	 */
	@ApiField("ad_pos_id")
	private String adPosId;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 供给ID
	 */
	@ApiField("supply_id")
	private String supplyId;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAdPosId() {
		return this.adPosId;
	}
	public void setAdPosId(String adPosId) {
		this.adPosId = adPosId;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSupplyId() {
		return this.supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}

}

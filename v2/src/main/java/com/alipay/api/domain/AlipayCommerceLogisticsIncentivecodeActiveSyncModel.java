package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寄件激励码绑码激活信息同步
 *
 * @author auto create
 * @since 1.0, 2024-09-04 16:25:17
 */
public class AlipayCommerceLogisticsIncentivecodeActiveSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4828325952859955558L;

	/**
	 * 码值绑定主体对应的支付宝用户id
	 */
	@ApiField("active_code_open_id")
	private String activeCodeOpenId;

	/**
	 * 码值绑定主体对应的支付宝用户id
	 */
	@ApiField("active_code_user_id")
	private String activeCodeUserId;

	/**
	 * 码值绑定时位置的纬度，单位：度
	 */
	@ApiField("active_latitude")
	private String activeLatitude;

	/**
	 * 码值绑定时位置的经度，单位：度
	 */
	@ApiField("active_longitude")
	private String activeLongitude;

	/**
	 * 用于传入的时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * EXPRESSMAN 代表快递员
STATION 代表驿站
	 */
	@ApiField("active_type")
	private String activeType;

	/**
	 * 用于标识激励码
	 */
	@ApiField("incentive_code")
	private String incentiveCode;

	/**
	 * 商户标识（接口调用方的渠道编码，由支付宝分配）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	public String getActiveCodeOpenId() {
		return this.activeCodeOpenId;
	}
	public void setActiveCodeOpenId(String activeCodeOpenId) {
		this.activeCodeOpenId = activeCodeOpenId;
	}

	public String getActiveCodeUserId() {
		return this.activeCodeUserId;
	}
	public void setActiveCodeUserId(String activeCodeUserId) {
		this.activeCodeUserId = activeCodeUserId;
	}

	public String getActiveLatitude() {
		return this.activeLatitude;
	}
	public void setActiveLatitude(String activeLatitude) {
		this.activeLatitude = activeLatitude;
	}

	public String getActiveLongitude() {
		return this.activeLongitude;
	}
	public void setActiveLongitude(String activeLongitude) {
		this.activeLongitude = activeLongitude;
	}

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getActiveType() {
		return this.activeType;
	}
	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}

	public String getIncentiveCode() {
		return this.incentiveCode;
	}
	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

}

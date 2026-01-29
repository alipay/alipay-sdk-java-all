package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运营变化通知
 *
 * @author auto create
 * @since 1.0, 2025-12-27 10:57:42
 */
public class AlipayCommerceTransportOnlinerideServiceareaNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7697271777792181889L;

	/**
	 * 变更动作，1:启用 2:停运
	 */
	@ApiField("action")
	private String action;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 停运原因,动作为停运时必填
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 区域编码
	 */
	@ApiField("region_id")
	private String regionId;

	/**
	 * null
	 */
	@ApiListField("time_ranges")
	@ApiField("robo_downtime_info")
	private List<RoboDowntimeInfo> timeRanges;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRegionId() {
		return this.regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<RoboDowntimeInfo> getTimeRanges() {
		return this.timeRanges;
	}
	public void setTimeRanges(List<RoboDowntimeInfo> timeRanges) {
		this.timeRanges = timeRanges;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实时公交线路信息
 *
 * @author auto create
 * @since 1.0, 2021-10-22 11:09:08
 */
public class BusRealtimeInfo extends AlipayObject {

	private static final long serialVersionUID = 6198688172663391467L;

	/**
	 * 线路id，线路的唯一标志。
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路名称
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 剩余到站时间，单位是秒。
	 */
	@ApiField("seconds_left")
	private Long secondsLeft;

	/**
	 * 站点id，站点的唯一标志。
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 剩余到站站数
	 */
	@ApiField("station_left")
	private Long stationLeft;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 线路运营子状态。取值如下：
0：正常，有实时数据
-1：等待发车
-2：实时信息维护中
-3：已停运
-4：尚未发车
-5：尚未开通实时公交
-8：不在运营时间
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 线路运营子状态文案。例如：不在运营时间
	 */
	@ApiField("sub_text")
	private String subText;

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return this.lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public Long getSecondsLeft() {
		return this.secondsLeft;
	}
	public void setSecondsLeft(Long secondsLeft) {
		this.secondsLeft = secondsLeft;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Long getStationLeft() {
		return this.stationLeft;
	}
	public void setStationLeft(Long stationLeft) {
		this.stationLeft = stationLeft;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getSubText() {
		return this.subText;
	}
	public void setSubText(String subText) {
		this.subText = subText;
	}

}

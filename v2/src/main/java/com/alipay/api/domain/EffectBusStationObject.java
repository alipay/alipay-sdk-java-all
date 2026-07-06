package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受影响站点对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class EffectBusStationObject extends AlipayObject {

	private static final long serialVersionUID = 6552115482457861977L;

	/**
	 * 影响类型: 吸引量(rise)或流失量(fail)
	 */
	@ApiField("impact_type")
	private String impactType;

	/**
	 * 客流量，单位：人次
	 */
	@ApiField("passenger_volume")
	private String passengerVolume;

	/**
	 * 排序
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	public String getImpactType() {
		return this.impactType;
	}
	public void setImpactType(String impactType) {
		this.impactType = impactType;
	}

	public String getPassengerVolume() {
		return this.passengerVolume;
	}
	public void setPassengerVolume(String passengerVolume) {
		this.passengerVolume = passengerVolume;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}

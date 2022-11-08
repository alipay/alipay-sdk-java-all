package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电单据信息
 *
 * @author auto create
 * @since 1.0, 2022-03-29 09:46:57
 */
public class ChargeOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7793239981756578694L;

	/**
	 * 充电枪ID
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 充电桩ID
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 充电站ID
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getEquipmentId() {
		return this.equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}

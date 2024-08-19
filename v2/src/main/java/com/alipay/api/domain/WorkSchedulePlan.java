package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工作排班计划
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:27:51
 */
public class WorkSchedulePlan extends AlipayObject {

	private static final long serialVersionUID = 4152294236694652249L;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 排班计划中，车辆对应线路
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 车次链列表
	 */
	@ApiListField("trip_chain")
	@ApiField("transport_trip")
	private List<TransportTrip> tripChain;

	/**
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineKey() {
		return this.lineKey;
	}
	public void setLineKey(String lineKey) {
		this.lineKey = lineKey;
	}

	public List<TransportTrip> getTripChain() {
		return this.tripChain;
	}
	public void setTripChain(List<TransportTrip> tripChain) {
		this.tripChain = tripChain;
	}

	public String getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}

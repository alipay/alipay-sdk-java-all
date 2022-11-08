package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PositionPoint;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.transcap.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-14 16:51:54
 */
public class AlipayCommerceTransportTaxiTranscapQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3715226671952916821L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/** 
	 * 位置点列表
	 */
	@ApiListField("positions")
	@ApiField("position_point")
	private List<PositionPoint> positions;

	/** 
	 * 车辆/机具ID
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarNo( ) {
		return this.carNo;
	}

	public void setPositions(List<PositionPoint> positions) {
		this.positions = positions;
	}
	public List<PositionPoint> getPositions( ) {
		return this.positions;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleId( ) {
		return this.vehicleId;
	}

}

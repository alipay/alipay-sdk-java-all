package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流预测对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class PassengerFlowPredictObject extends AlipayObject {

	private static final long serialVersionUID = 2685432932672967728L;

	/**
	 * 进站客流预测数量
	 */
	@ApiField("enter_passenger_flow_predict_count")
	private Long enterPassengerFlowPredictCount;

	/**
	 * 出站客流预测数量
	 */
	@ApiField("exit_passenger_flow_predict_count")
	private Long exitPassengerFlowPredictCount;

	/**
	 * 站点序号
	 */
	@ApiField("station_index")
	private Long stationIndex;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	public Long getEnterPassengerFlowPredictCount() {
		return this.enterPassengerFlowPredictCount;
	}
	public void setEnterPassengerFlowPredictCount(Long enterPassengerFlowPredictCount) {
		this.enterPassengerFlowPredictCount = enterPassengerFlowPredictCount;
	}

	public Long getExitPassengerFlowPredictCount() {
		return this.exitPassengerFlowPredictCount;
	}
	public void setExitPassengerFlowPredictCount(Long exitPassengerFlowPredictCount) {
		this.exitPassengerFlowPredictCount = exitPassengerFlowPredictCount;
	}

	public Long getStationIndex() {
		return this.stationIndex;
	}
	public void setStationIndex(Long stationIndex) {
		this.stationIndex = stationIndex;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}

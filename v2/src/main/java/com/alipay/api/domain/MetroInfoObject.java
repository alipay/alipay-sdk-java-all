package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地铁详细信息
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class MetroInfoObject extends AlipayObject {

	private static final long serialVersionUID = 5113546345735567284L;

	/**
	 * 调整运营组织列表
	 */
	@ApiListField("adjust_operation_organization_list")
	@ApiField("adjust_operation_organization_object")
	private List<AdjustOperationOrganizationObject> adjustOperationOrganizationList;

	/**
	 * 调整线路方向列表
	 */
	@ApiListField("adjust_route_direction_list")
	@ApiField("adjust_route_direction_object")
	private List<AdjustRouteDirectionObject> adjustRouteDirectionList;

	/**
	 * 调整建议汇总
	 */
	@ApiField("adjustment_suggestions_summary")
	private String adjustmentSuggestionsSummary;

	/**
	 * 公交换乘列表
	 */
	@ApiListField("bus_transfer_list")
	@ApiField("bus_transfer_object")
	private List<BusTransferObject> busTransferList;

	/**
	 * 公交换乘信息汇总
	 */
	@ApiField("bus_transfer_platform_summary")
	private String busTransferPlatformSummary;

	/**
	 * 下行方向
	 */
	@ApiField("down_direction")
	private String downDirection;

	/**
	 * 下行运营时间，单位：min
	 */
	@ApiField("down_time")
	private String downTime;

	/**
	 * 受影响线路列表
	 */
	@ApiListField("effect_bus_route_list")
	@ApiField("effect_bus_route_object")
	private List<EffectBusRouteObject> effectBusRouteList;

	/**
	 * 受影响线路汇总
	 */
	@ApiField("effect_bus_route_summary")
	private String effectBusRouteSummary;

	/**
	 * 受影响线路站点列表
	 */
	@ApiListField("effect_bus_station_list")
	@ApiField("effect_bus_station_object")
	private List<EffectBusStationObject> effectBusStationList;

	/**
	 * 站点出入口信息
	 */
	@ApiListField("entrance_exit_list")
	@ApiField("entrance_exit_object")
	private List<EntranceExitObject> entranceExitList;

	/**
	 * 地铁唯一编码
	 */
	@ApiField("metro_code")
	private String metroCode;

	/**
	 * 地铁长度，单位km
	 */
	@ApiField("metro_length")
	private String metroLength;

	/**
	 * 地铁名称
	 */
	@ApiField("metro_name")
	private String metroName;

	/**
	 * 地铁换乘站数量
	 */
	@ApiField("metro_station_count")
	private Long metroStationCount;

	/**
	 * 地铁状态，0：停运,1：正常,2：规划中,3：在建
	 */
	@ApiField("metro_status")
	private Long metroStatus;

	/**
	 * 换乘线路数量
	 */
	@ApiField("metro_transfer_route_count")
	private Long metroTransferRouteCount;

	/**
	 * 换乘线路明细（顿号隔开）
	 */
	@ApiField("metro_transfer_route_detail")
	private String metroTransferRouteDetail;

	/**
	 * 地铁换乘站数量
	 */
	@ApiField("metro_transfer_station_count")
	private Long metroTransferStationCount;

	/**
	 * 换乘站点信息
	 */
	@ApiField("metro_transfer_station_detail")
	private String metroTransferStationDetail;

	/**
	 * 并行线路列表
	 */
	@ApiListField("parallel_bus_route_list")
	@ApiField("parallel_route_object")
	private List<ParallelRouteObject> parallelBusRouteList;

	/**
	 * 并行公交线路汇总
	 */
	@ApiField("parallel_bus_route_summary")
	private String parallelBusRouteSummary;

	/**
	 * 客流预测列表
	 */
	@ApiListField("passenger_flow_predict_list")
	@ApiField("passenger_flow_predict_object")
	private List<PassengerFlowPredictObject> passengerFlowPredictList;

	/**
	 * 客流预测汇总
	 */
	@ApiField("passenger_flow_predict_summary")
	private String passengerFlowPredictSummary;

	/**
	 * 站点列表
	 */
	@ApiListField("station_list")
	@ApiField("station_object")
	private List<StationObject> stationList;

	/**
	 * 上行方向
	 */
	@ApiField("up_direction")
	private String upDirection;

	/**
	 * 上行运营时间，单位：min
	 */
	@ApiField("up_time")
	private String upTime;

	public List<AdjustOperationOrganizationObject> getAdjustOperationOrganizationList() {
		return this.adjustOperationOrganizationList;
	}
	public void setAdjustOperationOrganizationList(List<AdjustOperationOrganizationObject> adjustOperationOrganizationList) {
		this.adjustOperationOrganizationList = adjustOperationOrganizationList;
	}

	public List<AdjustRouteDirectionObject> getAdjustRouteDirectionList() {
		return this.adjustRouteDirectionList;
	}
	public void setAdjustRouteDirectionList(List<AdjustRouteDirectionObject> adjustRouteDirectionList) {
		this.adjustRouteDirectionList = adjustRouteDirectionList;
	}

	public String getAdjustmentSuggestionsSummary() {
		return this.adjustmentSuggestionsSummary;
	}
	public void setAdjustmentSuggestionsSummary(String adjustmentSuggestionsSummary) {
		this.adjustmentSuggestionsSummary = adjustmentSuggestionsSummary;
	}

	public List<BusTransferObject> getBusTransferList() {
		return this.busTransferList;
	}
	public void setBusTransferList(List<BusTransferObject> busTransferList) {
		this.busTransferList = busTransferList;
	}

	public String getBusTransferPlatformSummary() {
		return this.busTransferPlatformSummary;
	}
	public void setBusTransferPlatformSummary(String busTransferPlatformSummary) {
		this.busTransferPlatformSummary = busTransferPlatformSummary;
	}

	public String getDownDirection() {
		return this.downDirection;
	}
	public void setDownDirection(String downDirection) {
		this.downDirection = downDirection;
	}

	public String getDownTime() {
		return this.downTime;
	}
	public void setDownTime(String downTime) {
		this.downTime = downTime;
	}

	public List<EffectBusRouteObject> getEffectBusRouteList() {
		return this.effectBusRouteList;
	}
	public void setEffectBusRouteList(List<EffectBusRouteObject> effectBusRouteList) {
		this.effectBusRouteList = effectBusRouteList;
	}

	public String getEffectBusRouteSummary() {
		return this.effectBusRouteSummary;
	}
	public void setEffectBusRouteSummary(String effectBusRouteSummary) {
		this.effectBusRouteSummary = effectBusRouteSummary;
	}

	public List<EffectBusStationObject> getEffectBusStationList() {
		return this.effectBusStationList;
	}
	public void setEffectBusStationList(List<EffectBusStationObject> effectBusStationList) {
		this.effectBusStationList = effectBusStationList;
	}

	public List<EntranceExitObject> getEntranceExitList() {
		return this.entranceExitList;
	}
	public void setEntranceExitList(List<EntranceExitObject> entranceExitList) {
		this.entranceExitList = entranceExitList;
	}

	public String getMetroCode() {
		return this.metroCode;
	}
	public void setMetroCode(String metroCode) {
		this.metroCode = metroCode;
	}

	public String getMetroLength() {
		return this.metroLength;
	}
	public void setMetroLength(String metroLength) {
		this.metroLength = metroLength;
	}

	public String getMetroName() {
		return this.metroName;
	}
	public void setMetroName(String metroName) {
		this.metroName = metroName;
	}

	public Long getMetroStationCount() {
		return this.metroStationCount;
	}
	public void setMetroStationCount(Long metroStationCount) {
		this.metroStationCount = metroStationCount;
	}

	public Long getMetroStatus() {
		return this.metroStatus;
	}
	public void setMetroStatus(Long metroStatus) {
		this.metroStatus = metroStatus;
	}

	public Long getMetroTransferRouteCount() {
		return this.metroTransferRouteCount;
	}
	public void setMetroTransferRouteCount(Long metroTransferRouteCount) {
		this.metroTransferRouteCount = metroTransferRouteCount;
	}

	public String getMetroTransferRouteDetail() {
		return this.metroTransferRouteDetail;
	}
	public void setMetroTransferRouteDetail(String metroTransferRouteDetail) {
		this.metroTransferRouteDetail = metroTransferRouteDetail;
	}

	public Long getMetroTransferStationCount() {
		return this.metroTransferStationCount;
	}
	public void setMetroTransferStationCount(Long metroTransferStationCount) {
		this.metroTransferStationCount = metroTransferStationCount;
	}

	public String getMetroTransferStationDetail() {
		return this.metroTransferStationDetail;
	}
	public void setMetroTransferStationDetail(String metroTransferStationDetail) {
		this.metroTransferStationDetail = metroTransferStationDetail;
	}

	public List<ParallelRouteObject> getParallelBusRouteList() {
		return this.parallelBusRouteList;
	}
	public void setParallelBusRouteList(List<ParallelRouteObject> parallelBusRouteList) {
		this.parallelBusRouteList = parallelBusRouteList;
	}

	public String getParallelBusRouteSummary() {
		return this.parallelBusRouteSummary;
	}
	public void setParallelBusRouteSummary(String parallelBusRouteSummary) {
		this.parallelBusRouteSummary = parallelBusRouteSummary;
	}

	public List<PassengerFlowPredictObject> getPassengerFlowPredictList() {
		return this.passengerFlowPredictList;
	}
	public void setPassengerFlowPredictList(List<PassengerFlowPredictObject> passengerFlowPredictList) {
		this.passengerFlowPredictList = passengerFlowPredictList;
	}

	public String getPassengerFlowPredictSummary() {
		return this.passengerFlowPredictSummary;
	}
	public void setPassengerFlowPredictSummary(String passengerFlowPredictSummary) {
		this.passengerFlowPredictSummary = passengerFlowPredictSummary;
	}

	public List<StationObject> getStationList() {
		return this.stationList;
	}
	public void setStationList(List<StationObject> stationList) {
		this.stationList = stationList;
	}

	public String getUpDirection() {
		return this.upDirection;
	}
	public void setUpDirection(String upDirection) {
		this.upDirection = upDirection;
	}

	public String getUpTime() {
		return this.upTime;
	}
	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-客流od分析任务-创建
 *
 * @author auto create
 * @since 1.0, 2023-08-29 13:29:00
 */
public class AlipayCommerceTransportIntelligentizeFlowodanalysCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2283174166334772492L;

	/**
	 * 【特殊可选】围栏所在城市，当taskType为FlowOdAnalysisTaskTypeEnum.CROSS_CITY时必传
	 */
	@ApiField("area_city")
	private String areaCity;

	/**
	 * 【可选】城市全量OD对应区域码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 【特殊可选】当客流OD分析任务类型为--区域围栏od（CITY_AREA_ALL）/区域围栏不方便od（CITY_AREA_INCONVENIENT）/跨城围栏od（CROSS_CITY）时必填
	 */
	@ApiField("area_selected")
	private Area areaSelected;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交企业ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 【特殊可选】跨城目标城市，当taskType为FlowOdAnalysisTaskTypeEnum.CROSS_CITY时必传
	 */
	@ApiField("cross_city")
	private String crossCity;

	/**
	 * 【可选】是否需要人群标签客流数据 默认false
	 */
	@ApiField("crowd_label")
	private Boolean crowdLabel;

	/**
	 * 客流OD分析月份,格式为yyyyMM,与dataTime二选一
	 */
	@ApiField("data_month")
	private String dataMonth;

	/**
	 * 支持多个日期选择，与dataMonth二选一，优先级高于dataMonth
	 */
	@ApiField("data_time")
	private String dataTime;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 客流OD分析任务类型
	 */
	@ApiField("flow_od_analysis_task_type")
	private String flowOdAnalysisTaskType;

	/**
	 * 【特殊可选】当客流od任务为STATION_POTENTIAL地铁潜客OD时必填
请按照支付宝标准传参,以数字底座线网版本为准
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 【特殊可选】客流OD分析类型，当taskType为FlowOdAnalysisTaskTypeEnum.CITY_AREA时必传
	 */
	@ApiField("pattern")
	private String pattern;

	/**
	 * 客流分析精度
	 */
	@ApiField("precision")
	private String precision;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 【必填】服务任务名称
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	/**
	 * 【特殊可选】当客流od任务为STATION_POTENTIAL地铁潜客OD时必填
请按照支付宝标准传参,以数字底座线网版本为准
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 【可选】是否需要分时客流数据 默认false
	 */
	@ApiField("time_division")
	private Boolean timeDivision;

	/**
	 * 【特殊可选】当客流od任务为STATION_POTENTIAL地铁潜客OD时必填
请按照支付宝标准传参,以数字底座线网版本为准
	 */
	@ApiField("traffic_type")
	private String trafficType;

	/**
	 * 【可选】是否需要出行方式明细客流数据 默认fasle
	 */
	@ApiField("trans_type")
	private Boolean transType;

	public String getAreaCity() {
		return this.areaCity;
	}
	public void setAreaCity(String areaCity) {
		this.areaCity = areaCity;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Area getAreaSelected() {
		return this.areaSelected;
	}
	public void setAreaSelected(Area areaSelected) {
		this.areaSelected = areaSelected;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCrossCity() {
		return this.crossCity;
	}
	public void setCrossCity(String crossCity) {
		this.crossCity = crossCity;
	}

	public Boolean getCrowdLabel() {
		return this.crowdLabel;
	}
	public void setCrowdLabel(Boolean crowdLabel) {
		this.crowdLabel = crowdLabel;
	}

	public String getDataMonth() {
		return this.dataMonth;
	}
	public void setDataMonth(String dataMonth) {
		this.dataMonth = dataMonth;
	}

	public String getDataTime() {
		return this.dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getFlowOdAnalysisTaskType() {
		return this.flowOdAnalysisTaskType;
	}
	public void setFlowOdAnalysisTaskType(String flowOdAnalysisTaskType) {
		this.flowOdAnalysisTaskType = flowOdAnalysisTaskType;
	}

	public String getLineName() {
		return this.lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getPattern() {
		return this.pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getPrecision() {
		return this.precision;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Boolean getTimeDivision() {
		return this.timeDivision;
	}
	public void setTimeDivision(Boolean timeDivision) {
		this.timeDivision = timeDivision;
	}

	public String getTrafficType() {
		return this.trafficType;
	}
	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

	public Boolean getTransType() {
		return this.transType;
	}
	public void setTransType(Boolean transType) {
		this.transType = transType;
	}

}

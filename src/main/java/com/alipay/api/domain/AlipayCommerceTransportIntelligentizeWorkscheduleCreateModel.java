package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-排班任务-创建
 *
 * @author auto create
 * @since 1.0, 2021-01-04 20:32:02
 */
public class AlipayCommerceTransportIntelligentizeWorkscheduleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7639842886745818362L;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交业主ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 下行首站的临时停车容量，大于等于0整数
	 */
	@ApiField("down_first_station_capacity")
	private Long downFirstStationCapacity;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路Key，同一条线路的不同方向该值相同
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 休息时间列表
	 */
	@ApiListField("rest_time_list")
	@ApiField("rest_time")
	private List<RestTime> restTimeList;

	/**
	 * 服务任务名称
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	/**
	 * 使用时刻表中部分方向的数据计算排班，不传表示使用全量的时刻表数据计算排班
	 */
	@ApiField("timetable_direction")
	private String timetableDirection;

	/**
	 * 单个车次结束后的驻站时长（单位：分钟），不传则由算法自行决策驻站时长
	 */
	@ApiField("trip_break_time")
	private Long tripBreakTime;

	/**
	 * 上行首站的临时停车容量，大于等于0整数
	 */
	@ApiField("up_first_station_capacity")
	private Long upFirstStationCapacity;

	/**
	 * 班型列表
	 */
	@ApiListField("work_pattern_list")
	@ApiField("work_pattern")
	private List<WorkPattern> workPatternList;

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

	public Long getDownFirstStationCapacity() {
		return this.downFirstStationCapacity;
	}
	public void setDownFirstStationCapacity(Long downFirstStationCapacity) {
		this.downFirstStationCapacity = downFirstStationCapacity;
	}

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RestTime> getRestTimeList() {
		return this.restTimeList;
	}
	public void setRestTimeList(List<RestTime> restTimeList) {
		this.restTimeList = restTimeList;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

	public String getTimetableDirection() {
		return this.timetableDirection;
	}
	public void setTimetableDirection(String timetableDirection) {
		this.timetableDirection = timetableDirection;
	}

	public Long getTripBreakTime() {
		return this.tripBreakTime;
	}
	public void setTripBreakTime(Long tripBreakTime) {
		this.tripBreakTime = tripBreakTime;
	}

	public Long getUpFirstStationCapacity() {
		return this.upFirstStationCapacity;
	}
	public void setUpFirstStationCapacity(Long upFirstStationCapacity) {
		this.upFirstStationCapacity = upFirstStationCapacity;
	}

	public List<WorkPattern> getWorkPatternList() {
		return this.workPatternList;
	}
	public void setWorkPatternList(List<WorkPattern> workPatternList) {
		this.workPatternList = workPatternList;
	}

}

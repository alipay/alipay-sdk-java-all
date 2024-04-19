package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-排班任务-创建
 *
 * @author auto create
 * @since 1.0, 2022-11-03 23:07:00
 */
public class AlipayCommerceTransportIntelligentizeWorkscheduleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2876571515343625294L;

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
	 * （注意：该字段已废弃）下行首站的临时停车容量，大于等于0整数
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
	 * 版本1.1单个车次结束后的驻站时长（单位：分钟），不传则由算法自行决策驻站时长。
版本1.2该字段从int类型变更为String类型。支持为上行、下行分别设置上限时长、下限时长。同时兼容使用老版本openapi SDK的调用方传入int类型参数。
格式如下（单位：分钟）
{
    "up_min_break_time":10, // 上行最小驻站时长，也即下行结束之后在主站的最小驻站时长
    "up_max_break_time":30, // 上行最大驻站时长，也即下行结束之后在主站的最大驻站时长
    "down_min_break_time":10, // 下行最小驻站时长，也即上行结束之后在副站的最小驻站时长
    "down_max_break_time":30, // 下行最大驻站时长，也即上行结束之后在副站的最大驻站时长
}
	 */
	@ApiField("trip_break_time")
	private Long tripBreakTime;

	/**
	 * （注意：该字段已废弃）上行首站的临时停车容量，大于等于0整数
	 */
	@ApiField("up_first_station_capacity")
	private Long upFirstStationCapacity;

	/**
	 * 班型列表
	 */
	@ApiListField("work_pattern_list")
	@ApiField("work_pattern")
	private List<WorkPattern> workPatternList;

	/**
	 * 不同的排班模式对应不同的排班算法。目前支持：
HUMAN_LIKE_BY_WORK_PATTERN：仿人工排班（基于班型）
HUMAN_LIKE_BY_MATRIX_TEMPLATE：仿人工排班（基于矩阵模板）
DELICATE_BY_WORK_PATTERN_TEMPLATE：精细化排班（基于班型模板）
USE_RECOMMENDED_PARAMS_WITH_TIMETABLE_PRIORITY：使用推荐参数排班（时刻表优先）
USE_RECOMMENDED_PARAMS_WITH_RESOURCE_PRIORITY：使用推荐参数排班（人车资源优先）
	 */
	@ApiField("work_schedule_mode")
	private String workScheduleMode;

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

	public String getWorkScheduleMode() {
		return this.workScheduleMode;
	}
	public void setWorkScheduleMode(String workScheduleMode) {
		this.workScheduleMode = workScheduleMode;
	}

}

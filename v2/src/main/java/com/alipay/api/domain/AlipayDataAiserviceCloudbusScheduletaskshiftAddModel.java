package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班调度---轮班任务
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:36:28
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftAddModel extends AlipayObject {

	private static final long serialVersionUID = 6854926442851749752L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交公司id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 待轮班的日期天数
	 */
	@ApiField("cycle_cnt")
	private Long cycleCnt;

	/**
	 * 该线路配备的司机数
	 */
	@ApiField("driver_cnt")
	private Long driverCnt;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 待排班的时期列表，多个用逗号分隔
	 */
	@ApiListField("shift_date_list")
	@ApiField("string")
	private List<String> shiftDateList;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 排班任务id
	 */
	@ApiListField("work_schedule_pids")
	@ApiField("string")
	private List<String> workSchedulePids;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
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

	public Long getCycleCnt() {
		return this.cycleCnt;
	}
	public void setCycleCnt(Long cycleCnt) {
		this.cycleCnt = cycleCnt;
	}

	public Long getDriverCnt() {
		return this.driverCnt;
	}
	public void setDriverCnt(Long driverCnt) {
		this.driverCnt = driverCnt;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public List<String> getShiftDateList() {
		return this.shiftDateList;
	}
	public void setShiftDateList(List<String> shiftDateList) {
		this.shiftDateList = shiftDateList;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public List<String> getWorkSchedulePids() {
		return this.workSchedulePids;
	}
	public void setWorkSchedulePids(List<String> workSchedulePids) {
		this.workSchedulePids = workSchedulePids;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 时刻表排班任务
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:36:21
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeAddModel extends AlipayObject {

	private static final long serialVersionUID = 7344446753274668698L;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 客流预测任务id
	 */
	@ApiField("bus_od_pid")
	private String busOdPid;

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
	 * 时刻表线路信息
	 */
	@ApiListField("line_info")
	@ApiField("input_schedule_time")
	private List<InputScheduleTime> lineInfo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBusOdPid() {
		return this.busOdPid;
	}
	public void setBusOdPid(String busOdPid) {
		this.busOdPid = busOdPid;
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

	public List<InputScheduleTime> getLineInfo() {
		return this.lineInfo;
	}
	public void setLineInfo(List<InputScheduleTime> lineInfo) {
		this.lineInfo = lineInfo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}

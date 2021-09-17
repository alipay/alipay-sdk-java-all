package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度任务提交
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:36:37
 */
public class AlipayDataAiserviceCloudbusSchedualtaskAddModel extends AlipayObject {

	private static final long serialVersionUID = 6542122821164626655L;

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
	 * 下行场站配车数
	 */
	@ApiField("down_bus_cnt")
	private Long downBusCnt;

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
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 排班任务
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 排班
	 */
	@ApiField("time_table_pid")
	private String timeTablePid;

	/**
	 * 上行场站配车数
	 */
	@ApiField("up_bus_cnt")
	private Long upBusCnt;

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

	public Long getDownBusCnt() {
		return this.downBusCnt;
	}
	public void setDownBusCnt(Long downBusCnt) {
		this.downBusCnt = downBusCnt;
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

	public String getTimeTablePid() {
		return this.timeTablePid;
	}
	public void setTimeTablePid(String timeTablePid) {
		this.timeTablePid = timeTablePid;
	}

	public Long getUpBusCnt() {
		return this.upBusCnt;
	}
	public void setUpBusCnt(Long upBusCnt) {
		this.upBusCnt = upBusCnt;
	}

}

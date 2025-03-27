package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班调度客流任务提交
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:35:41
 */
public class AlipayDataAiserviceCloudbusScheduletaskodAddModel extends AlipayObject {

	private static final long serialVersionUID = 6355386347899337878L;

	/**
	 * 接口版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 配制id
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 公交公司id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 线路信息
	 */
	@ApiListField("line_info")
	@ApiField("input_schedule_line")
	private List<InputScheduleLine> lineInfo;

	/**
	 * 任务描述
	 */
	@ApiField("task_name")
	private String taskName;

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

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public List<InputScheduleLine> getLineInfo() {
		return this.lineInfo;
	}
	public void setLineInfo(List<InputScheduleLine> lineInfo) {
		this.lineInfo = lineInfo;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}

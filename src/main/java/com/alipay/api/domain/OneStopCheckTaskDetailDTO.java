package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * slm任务详情
 *
 * @author auto create
 * @since 1.0, 2022-09-19 16:37:32
 */
public class OneStopCheckTaskDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1379298722896194972L;

	/**
	 * 应用信息
	 */
	@ApiField("app_info")
	private SlmAppInfo appInfo;

	/**
	 * slm平台的自动录制的视频
	 */
	@ApiField("auto_screen_cap")
	private String autoScreenCap;

	/**
	 * 用例名称
	 */
	@ApiField("case_ame")
	private String caseAme;

	/**
	 * 用例描述
	 */
	@ApiField("case_desc")
	private String caseDesc;

	/**
	 * 业务的检查点
	 */
	@ApiListField("check_points")
	@ApiField("check_point_v_o")
	private List<CheckPointVO> checkPoints;

	/**
	 * 业务自己打印的日志
	 */
	@ApiField("custom_log")
	private String customLog;

	/**
	 * slm平台的自定义录制视频
	 */
	@ApiListField("custom_screen_caps")
	@ApiField("slm_artifact_info")
	private List<SlmArtifactInfo> customScreenCaps;

	/**
	 * 用例执行结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用例错误原因
	 */
	@ApiField("error_info")
	private SlmCaseErrorInfo errorInfo;

	/**
	 * slm返回机型
	 */
	@ApiField("model")
	private SlmDeviceInfo model;

	/**
	 * 用例执行结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 用例截图
	 */
	@ApiListField("screenshot_list")
	@ApiField("slm_artifact_info")
	private List<SlmArtifactInfo> screenshotList;

	/**
	 * 用例执行开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * slm任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public SlmAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(SlmAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public String getAutoScreenCap() {
		return this.autoScreenCap;
	}
	public void setAutoScreenCap(String autoScreenCap) {
		this.autoScreenCap = autoScreenCap;
	}

	public String getCaseAme() {
		return this.caseAme;
	}
	public void setCaseAme(String caseAme) {
		this.caseAme = caseAme;
	}

	public String getCaseDesc() {
		return this.caseDesc;
	}
	public void setCaseDesc(String caseDesc) {
		this.caseDesc = caseDesc;
	}

	public List<CheckPointVO> getCheckPoints() {
		return this.checkPoints;
	}
	public void setCheckPoints(List<CheckPointVO> checkPoints) {
		this.checkPoints = checkPoints;
	}

	public String getCustomLog() {
		return this.customLog;
	}
	public void setCustomLog(String customLog) {
		this.customLog = customLog;
	}

	public List<SlmArtifactInfo> getCustomScreenCaps() {
		return this.customScreenCaps;
	}
	public void setCustomScreenCaps(List<SlmArtifactInfo> customScreenCaps) {
		this.customScreenCaps = customScreenCaps;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public SlmCaseErrorInfo getErrorInfo() {
		return this.errorInfo;
	}
	public void setErrorInfo(SlmCaseErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public SlmDeviceInfo getModel() {
		return this.model;
	}
	public void setModel(SlmDeviceInfo model) {
		this.model = model;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public List<SlmArtifactInfo> getScreenshotList() {
		return this.screenshotList;
	}
	public void setScreenshotList(List<SlmArtifactInfo> screenshotList) {
		this.screenshotList = screenshotList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}

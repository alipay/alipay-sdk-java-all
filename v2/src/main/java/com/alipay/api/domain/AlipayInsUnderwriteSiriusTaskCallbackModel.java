package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险-天狼星任务回调
 *
 * @author auto create
 * @since 1.0, 2023-10-25 13:32:19
 */
public class AlipayInsUnderwriteSiriusTaskCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 5169112558972427941L;

	/**
	 * 天狼星业务id，通常是天狼星任务主键id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 任务来源
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 渠道码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 请求码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息，包含邮箱类型字段，不同模式，字段可能不一样
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 文件Id，文件唯一标识
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 是否压测
	 */
	@ApiField("load_test")
	private String loadTest;

	/**
	 * 日志文件id
	 */
	@ApiField("log_file_id")
	private String logFileId;

	/**
	 * 操作消息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 标识渠道任务如何处理
	 */
	@ApiField("mode_code")
	private String modeCode;

	/**
	 * 响应信息
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 单次操作token，用于鉴权
	 */
	@ApiField("op_token")
	private String opToken;

	/**
	 * 任务结果内容，包含失败类型、失败原因、进度、失败详情等
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 模板内容，包含失败类型、失败原因、进度、失败详情、字段转换结果等
	 */
	@ApiField("payload_template_std_content")
	private String payloadTemplateStdContent;

	/**
	 * 重试次数
	 */
	@ApiField("retry_times")
	private String retryTimes;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 天狼星应用Id标识
	 */
	@ApiField("sirius_app_id")
	private String siriusAppId;

	/**
	 * 请求码，0=任务成功
	 */
	@ApiField("sirius_code")
	private String siriusCode;

	/**
	 * 天狼星环境
	 */
	@ApiField("sirius_env")
	private String siriusEnv;

	/**
	 * 天狼星调用来源，0=托管云天狼星
	 */
	@ApiField("sirius_source")
	private String siriusSource;

	/**
	 * 用户标志，部分模式任务下，该值随机生成，不一定是UID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 源文件Id，原始文件标识
	 */
	@ApiField("source_file_id")
	private String sourceFileId;

	/**
	 * 天狼星任务输入内容，包含任务日期、业务id、省份名等
	 */
	@ApiField("task_payload")
	private String taskPayload;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getLoadTest() {
		return this.loadTest;
	}
	public void setLoadTest(String loadTest) {
		this.loadTest = loadTest;
	}

	public String getLogFileId() {
		return this.logFileId;
	}
	public void setLogFileId(String logFileId) {
		this.logFileId = logFileId;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getModeCode() {
		return this.modeCode;
	}
	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOpToken() {
		return this.opToken;
	}
	public void setOpToken(String opToken) {
		this.opToken = opToken;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getPayloadTemplateStdContent() {
		return this.payloadTemplateStdContent;
	}
	public void setPayloadTemplateStdContent(String payloadTemplateStdContent) {
		this.payloadTemplateStdContent = payloadTemplateStdContent;
	}

	public String getRetryTimes() {
		return this.retryTimes;
	}
	public void setRetryTimes(String retryTimes) {
		this.retryTimes = retryTimes;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSiriusAppId() {
		return this.siriusAppId;
	}
	public void setSiriusAppId(String siriusAppId) {
		this.siriusAppId = siriusAppId;
	}

	public String getSiriusCode() {
		return this.siriusCode;
	}
	public void setSiriusCode(String siriusCode) {
		this.siriusCode = siriusCode;
	}

	public String getSiriusEnv() {
		return this.siriusEnv;
	}
	public void setSiriusEnv(String siriusEnv) {
		this.siriusEnv = siriusEnv;
	}

	public String getSiriusSource() {
		return this.siriusSource;
	}
	public void setSiriusSource(String siriusSource) {
		this.siriusSource = siriusSource;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public String getSourceFileId() {
		return this.sourceFileId;
	}
	public void setSourceFileId(String sourceFileId) {
		this.sourceFileId = sourceFileId;
	}

	public String getTaskPayload() {
		return this.taskPayload;
	}
	public void setTaskPayload(String taskPayload) {
		this.taskPayload = taskPayload;
	}

}

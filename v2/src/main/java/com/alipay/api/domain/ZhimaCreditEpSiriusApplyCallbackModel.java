package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用-天狼星申请单回调
 *
 * @author auto create
 * @since 1.0, 2024-03-26 14:19:05
 */
public class ZhimaCreditEpSiriusApplyCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 1795119573646977384L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 申请单状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 天狼星业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 渠道码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 加密信息标识
	 */
	@ApiField("encrypted")
	private String encrypted;

	/**
	 * 结果文件Id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 标识渠道任务如何处理
	 */
	@ApiField("mode_code")
	private String modeCode;

	/**
	 * 业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务结果对象，加密内容
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 重试次数，调用方网关统一使用字符串类型
	 */
	@ApiField("retry_times")
	private String retryTimes;

	/**
	 * 场景码，区分不同业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 天狼星应用id
	 */
	@ApiField("sirius_app_id")
	private String siriusAppId;

	/**
	 * 用户标志，该值可能随机生成，不一定是UID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 源文件Id
	 */
	@ApiField("source_file_id")
	private String sourceFileId;

	/**
	 * 任务入参，加密内容
	 */
	@ApiField("task_payload")
	private String taskPayload;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getEncrypted() {
		return this.encrypted;
	}
	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getModeCode() {
		return this.modeCode;
	}
	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于回调使用
 *
 * @author auto create
 * @since 1.0, 2025-07-15 17:28:02
 */
public class AssetCallbackInfo extends AlipayObject {

	private static final long serialVersionUID = 2269237223936728921L;

	/**
	 * 是哪一个交互动作之后的回调
	 */
	@ApiField("biz_action")
	private String bizAction;

	/**
	 * 回调操作的唯一键
	 */
	@ApiField("biz_key_value")
	private String bizKeyValue;

	/**
	 * 用来确认回调信息的准确性，判断是否需要重试
	 */
	@ApiListField("callback_infos")
	@ApiField("asset_sub_feedback_info")
	private List<AssetSubFeedbackInfo> callbackInfos;

	/**
	 * 无此分配指令
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 物料版本反馈信息
	 */
	@ApiField("feedback_info")
	private AssetItemVersionFeedBackInfo feedbackInfo;

	/**
	 * 是否处理成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizAction() {
		return this.bizAction;
	}
	public void setBizAction(String bizAction) {
		this.bizAction = bizAction;
	}

	public String getBizKeyValue() {
		return this.bizKeyValue;
	}
	public void setBizKeyValue(String bizKeyValue) {
		this.bizKeyValue = bizKeyValue;
	}

	public List<AssetSubFeedbackInfo> getCallbackInfos() {
		return this.callbackInfos;
	}
	public void setCallbackInfos(List<AssetSubFeedbackInfo> callbackInfos) {
		this.callbackInfos = callbackInfos;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public AssetItemVersionFeedBackInfo getFeedbackInfo() {
		return this.feedbackInfo;
	}
	public void setFeedbackInfo(AssetItemVersionFeedBackInfo feedbackInfo) {
		this.feedbackInfo = feedbackInfo;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}

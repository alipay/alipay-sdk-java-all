package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sirius.task.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 10:33:44
 */
public class AlipayPcreditLoanSiriusTaskCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4227868293352112489L;

	/** 
	 * 天狼星业务id，通常是天狼星任务主键id
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 渠道码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/** 
	 * 扩展信息，包含邮箱类型字段，不同模式，字段可能不一样
	 */
	@ApiField("ext")
	private String ext;

	/** 
	 * 消息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 标识渠道任务如何处理
	 */
	@ApiField("mode_code")
	private String modeCode;

	/** 
	 * 操作token
	 */
	@ApiField("op_token")
	private String opToken;

	/** 
	 * 场景码，区分不同业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 天狼星应用Id标识
	 */
	@ApiField("sirius_app_id")
	private String siriusAppId;

	/** 
	 * 响应码
	 */
	@ApiField("sirius_code")
	private String siriusCode;

	/** 
	 * 天狼星环境
	 */
	@ApiField("sirius_env")
	private String siriusEnv;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelCode( ) {
		return this.channelCode;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getExt( ) {
		return this.ext;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}
	public String getModeCode( ) {
		return this.modeCode;
	}

	public void setOpToken(String opToken) {
		this.opToken = opToken;
	}
	public String getOpToken( ) {
		return this.opToken;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSiriusAppId(String siriusAppId) {
		this.siriusAppId = siriusAppId;
	}
	public String getSiriusAppId( ) {
		return this.siriusAppId;
	}

	public void setSiriusCode(String siriusCode) {
		this.siriusCode = siriusCode;
	}
	public String getSiriusCode( ) {
		return this.siriusCode;
	}

	public void setSiriusEnv(String siriusEnv) {
		this.siriusEnv = siriusEnv;
	}
	public String getSiriusEnv( ) {
		return this.siriusEnv;
	}

}

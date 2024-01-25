package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.sirius.task.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 13:36:49
 */
public class AlipayInsUnderwriteSiriusTaskCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 6549687616257341972L;

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
	 * 扩展信息，包含邮箱类型字段
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
	 * 单次操作token，用于鉴权
	 */
	@ApiField("op_token")
	private String opToken;

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
	 * 响应码，0=成功
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

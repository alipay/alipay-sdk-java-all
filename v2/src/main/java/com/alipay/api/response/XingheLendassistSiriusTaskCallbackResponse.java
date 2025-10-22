package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.sirius.task.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 14:17:26
 */
public class XingheLendassistSiriusTaskCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4636781114428186784L;

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
	 * 响应消息
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
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 响应码
	 */
	@ApiField("resp_code")
	private Long respCode;

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
	 * 响应码
	 */
	@ApiField("sirius_code")
	private String siriusCode;

	/** 
	 * 天狼星环境
	 */
	@ApiField("sirius_env")
	private String siriusEnv;

	/** 
	 * 用户标志，该值可能随机生成，不一定是UID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

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

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRespCode(Long respCode) {
		this.respCode = respCode;
	}
	public Long getRespCode( ) {
		return this.respCode;
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

	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}
	public String getSiteUserId( ) {
		return this.siteUserId;
	}

}

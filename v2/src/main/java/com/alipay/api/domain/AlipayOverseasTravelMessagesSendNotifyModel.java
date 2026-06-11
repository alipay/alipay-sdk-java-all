package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝跨境游消息通知接口
 *
 * @author auto create
 * @since 1.0, 2026-06-01 10:37:28
 */
public class AlipayOverseasTravelMessagesSendNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8188438655416793825L;

	/**
	 * 消息参数，钱包服务端使用该字段值去组装对应的模板参数
	 */
	@ApiField("message_args")
	private String messageArgs;

	/**
	 * 业务id,消息唯一id
	 */
	@ApiField("message_request_id")
	private String messageRequestId;

	/**
	 * 消息场景，用于映射消息通知模板
	 */
	@ApiField("message_scene")
	private String messageScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 钱包id
	 */
	@ApiField("psp_id")
	private String pspId;

	public String getMessageArgs() {
		return this.messageArgs;
	}
	public void setMessageArgs(String messageArgs) {
		this.messageArgs = messageArgs;
	}

	public String getMessageRequestId() {
		return this.messageRequestId;
	}
	public void setMessageRequestId(String messageRequestId) {
		this.messageRequestId = messageRequestId;
	}

	public String getMessageScene() {
		return this.messageScene;
	}
	public void setMessageScene(String messageScene) {
		this.messageScene = messageScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPspId() {
		return this.pspId;
	}
	public void setPspId(String pspId) {
		this.pspId = pspId;
	}

}

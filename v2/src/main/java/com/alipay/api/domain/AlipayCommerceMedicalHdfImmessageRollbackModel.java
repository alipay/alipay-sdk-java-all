package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫im消息撤回
 *
 * @author auto create
 * @since 1.0, 2026-04-17 14:57:46
 */
public class AlipayCommerceMedicalHdfImmessageRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 5298822342514827153L;

	/**
	 * 发送者账号ID（SDK撤回时必填）
	 */
	@ApiField("from_source_id")
	private String fromSourceId;

	/**
	 * 发送者账号类型（SDK撤回时必填）
	 */
	@ApiField("from_source_type")
	private String fromSourceType;

	/**
	 * 方法动作: revoke-服务端撤回, revokeForSDK-SDK撤回
	 */
	@ApiField("method_action")
	private String methodAction;

	/**
	 * 消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 是否需要分发消息
	 */
	@ApiField("need_distribute")
	private Boolean needDistribute;

	/**
	 * 接收者账号ID
	 */
	@ApiField("to_source_id")
	private String toSourceId;

	/**
	 * 接收者账号类型
	 */
	@ApiField("to_source_type")
	private String toSourceType;

	/**
	 * 用户ID（SDK撤回时必填）
	 */
	@ApiField("user_id")
	private String userId;

	public String getFromSourceId() {
		return this.fromSourceId;
	}
	public void setFromSourceId(String fromSourceId) {
		this.fromSourceId = fromSourceId;
	}

	public String getFromSourceType() {
		return this.fromSourceType;
	}
	public void setFromSourceType(String fromSourceType) {
		this.fromSourceType = fromSourceType;
	}

	public String getMethodAction() {
		return this.methodAction;
	}
	public void setMethodAction(String methodAction) {
		this.methodAction = methodAction;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public Boolean getNeedDistribute() {
		return this.needDistribute;
	}
	public void setNeedDistribute(Boolean needDistribute) {
		this.needDistribute = needDistribute;
	}

	public String getToSourceId() {
		return this.toSourceId;
	}
	public void setToSourceId(String toSourceId) {
		this.toSourceId = toSourceId;
	}

	public String getToSourceType() {
		return this.toSourceType;
	}
	public void setToSourceType(String toSourceType) {
		this.toSourceType = toSourceType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

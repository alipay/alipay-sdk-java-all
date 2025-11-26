package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话历史修改
 *
 * @author auto create
 * @since 1.0, 2024-04-18 16:57:24
 */
public class AntfortuneFinresearchSessionDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5833789392119992387L;

	/**
	 * 本次会话的主体ID
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 修改历史记录中的标题内容
	 */
	@ApiField("new_title")
	private String newTitle;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getNewTitle() {
		return this.newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

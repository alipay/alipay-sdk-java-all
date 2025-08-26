package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群广告屏蔽命中处理方式模型
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:23
 */
public class GroupControlActionVO extends AlipayObject {

	private static final long serialVersionUID = 4518436227932363941L;

	/**
	 * 命中处理方式
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 警告语
	 */
	@ApiField("warn_msg")
	private String warnMsg;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getWarnMsg() {
		return this.warnMsg;
	}
	public void setWarnMsg(String warnMsg) {
		this.warnMsg = warnMsg;
	}

}

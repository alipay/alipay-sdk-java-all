package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * text的数据类型
 *
 * @author auto create
 * @since 1.0, 2025-08-12 11:24:09
 */
public class RealtimeQcDialog extends AlipayObject {

	private static final long serialVersionUID = 2533579997582375477L;

	/**
	 * Long类型
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 唯一标识一句话
	 */
	@ApiField("dialog_id")
	private String dialogId;

	/**
	 * 对话文本所属角色
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 会话文本内容
	 */
	@ApiField("text")
	private String text;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getDialogId() {
		return this.dialogId;
	}
	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}

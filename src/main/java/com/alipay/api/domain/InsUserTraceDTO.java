package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户投保行为回溯信息
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:21:03
 */
public class InsUserTraceDTO extends AlipayObject {

	private static final long serialVersionUID = 1413869567592493893L;

	/**
	 * 回溯动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 其他回溯的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * action对应的操作对象
	 */
	@ApiField("object")
	private String object;

	/**
	 * 触发时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getObject() {
		return this.object;
	}
	public void setObject(String object) {
		this.object = object;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

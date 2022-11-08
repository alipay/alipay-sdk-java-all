package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知机构用户出库状态信息对象
 *
 * @author auto create
 * @since 1.0, 2022-04-11 09:52:52
 */
public class IotVspOrgUserDeleteNotifyUserInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 1541985186328948875L;

	/**
	 * 返回状态描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 返回出库状态（1：成功，2：失败）
	 */
	@ApiField("state")
	private String state;

	/**
	 * 机构用户ID
	 */
	@ApiField("vid")
	private String vid;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}

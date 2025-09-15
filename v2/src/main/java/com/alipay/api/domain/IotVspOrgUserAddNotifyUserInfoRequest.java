package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知机构用户入库请求对象
 *
 * @author auto create
 * @since 1.0, 2023-08-31 17:27:51
 */
public class IotVspOrgUserAddNotifyUserInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 7754376727624381597L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 扩展信息，ISV自定义，如无可为空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 返回状态描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 返回入库状态（1：成功，2：失败）
	 */
	@ApiField("state")
	private Long state;

	/**
	 * 机构用户ID
	 */
	@ApiField("vid")
	private String vid;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}

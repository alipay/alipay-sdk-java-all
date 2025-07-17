package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取头像昵称
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:41:33
 */
public class AnttechNftOauthuserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1123669315169891495L;

	/**
	 * accessToken请求
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 请求唯一ID，用于链路跟踪和问题排查
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/**
	 * 默认可以不传;
如果要查询手机号，实名标记等信息，传user_ext_info
	 */
	@ApiField("scope")
	private String scope;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}

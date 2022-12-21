package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi测试用
 *
 * @author auto create
 * @since 1.0, 2022-11-18 16:50:58
 */
public class AlipayOpenOperationOpenbizmockQuitModel extends AlipayObject {

	private static final long serialVersionUID = 8586467387364998145L;

	/**
	 * userid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * userid
	 */
	@ApiField("userid")
	private String userid;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

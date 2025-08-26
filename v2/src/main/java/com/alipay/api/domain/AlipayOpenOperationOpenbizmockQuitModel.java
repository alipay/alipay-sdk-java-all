package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi测试用
 *
 * @author auto create
 * @since 1.0, 2023-02-13 23:55:59
 */
public class AlipayOpenOperationOpenbizmockQuitModel extends AlipayObject {

	private static final long serialVersionUID = 1378115252898518889L;

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

	/**
	 * 1
	 */
	@ApiField("xixihha")
	private String xixihha;

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

	public String getXixihha() {
		return this.xixihha;
	}
	public void setXixihha(String xixihha) {
		this.xixihha = xixihha;
	}

}

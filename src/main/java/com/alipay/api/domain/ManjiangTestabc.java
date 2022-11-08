package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ManjiangTestabc
 *
 * @author auto create
 * @since 1.0, 2022-09-17 21:39:46
 */
public class ManjiangTestabc extends AlipayObject {

	private static final long serialVersionUID = 6545399871251224294L;

	/**
	 * 1
	 */
	@ApiField("json")
	private String json;

	/**
	 * 1
	 */
	@ApiField("t")
	private String t;

	/**
	 * 1
	 */
	@ApiField("t_openid")
	private String tOpenid;

	public String getJson() {
		return this.json;
	}
	public void setJson(String json) {
		this.json = json;
	}

	public String getT() {
		return this.t;
	}
	public void setT(String t) {
		this.t = t;
	}

	public String gettOpenid() {
		return this.tOpenid;
	}
	public void settOpenid(String tOpenid) {
		this.tOpenid = tOpenid;
	}

}

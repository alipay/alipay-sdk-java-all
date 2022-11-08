package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openid测试专用复杂类型
 *
 * @author auto create
 * @since 1.0, 2022-09-19 21:41:11
 */
public class OpenidTestAll extends AlipayObject {

	private static final long serialVersionUID = 1694742256198183919L;

	/**
	 * 1
	 */
	@ApiField("json")
	private JsonOpenidTest json;

	/**
	 * 1
	 */
	@ApiField("jsonuid")
	private String jsonuid;

	/**
	 * 1
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public JsonOpenidTest getJson() {
		return this.json;
	}
	public void setJson(JsonOpenidTest json) {
		this.json = json;
	}

	public String getJsonuid() {
		return this.jsonuid;
	}
	public void setJsonuid(String jsonuid) {
		this.jsonuid = jsonuid;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}

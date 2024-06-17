package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * KongsuTest
 *
 * @author auto create
 * @since 1.0, 2023-01-10 16:34:44
 */
public class KongsuTest extends AlipayObject {

	private static final long serialVersionUID = 6639211386259461811L;

	/**
	 * 1
	 */
	@ApiField("json")
	private String json;

	/**
	 * 1
	 */
	@ApiField("s_open_id")
	private String sOpenId;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	public String getJson() {
		return this.json;
	}
	public void setJson(String json) {
		this.json = json;
	}

	public String getsOpenId() {
		return this.sOpenId;
	}
	public void setsOpenId(String sOpenId) {
		this.sOpenId = sOpenId;
	}

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

}

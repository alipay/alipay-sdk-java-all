package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ManjiangTestabc
 *
 * @author auto create
 * @since 1.0, 2023-07-07 00:42:22
 */
public class ManjiangTestabc extends AlipayObject {

	private static final long serialVersionUID = 7515583153814715293L;

	/**
	 * 1
	 */
	@ApiField("json")
	private String json;

	/**
	 * 1
	 */
	@ApiField("ssddf")
	private ApiInfoVO ssddf;

	/**
	 * 1
	 */
	@ApiField("sss_2")
	private ApiInfoVO sss2;

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

	public ApiInfoVO getSsddf() {
		return this.ssddf;
	}
	public void setSsddf(ApiInfoVO ssddf) {
		this.ssddf = ssddf;
	}

	public ApiInfoVO getSss2() {
		return this.sss2;
	}
	public void setSss2(ApiInfoVO sss2) {
		this.sss2 = sss2;
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

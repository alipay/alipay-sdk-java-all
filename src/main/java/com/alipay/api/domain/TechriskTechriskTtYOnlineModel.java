package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 111t
 *
 * @author auto create
 * @since 1.0, 2022-10-25 11:58:06
 */
public class TechriskTechriskTtYOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 5756841965446849183L;

	/**
	 * 1
	 */
	@ApiField("s_openid")
	private String sOpenid;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * 1
	 */
	@ApiField("sss_open_id")
	private String sssOpenId;

	/**
	 * 1
	 */
	@ApiField("ssss")
	private String ssss;

	/**
	 * 金额
	 */
	@ApiField("test_1")
	private ManjiangTestab test1;

	public String getsOpenid() {
		return this.sOpenid;
	}
	public void setsOpenid(String sOpenid) {
		this.sOpenid = sOpenid;
	}

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

	public String getSssOpenId() {
		return this.sssOpenId;
	}
	public void setSssOpenId(String sssOpenId) {
		this.sssOpenId = sssOpenId;
	}

	public String getSsss() {
		return this.ssss;
	}
	public void setSsss(String ssss) {
		this.ssss = ssss;
	}

	public ManjiangTestab getTest1() {
		return this.test1;
	}
	public void setTest1(ManjiangTestab test1) {
		this.test1 = test1;
	}

}

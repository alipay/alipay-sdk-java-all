package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2023-05-17 20:02:13
 */
public class TestDemo extends AlipayObject {

	private static final long serialVersionUID = 2853644465489799752L;

	/**
	 * test 当前字段已废弃(test废弃字段测试)
	 */
	@ApiField("open_id")
	@Deprecated
	private String openId;

	/**
	 * ttes
	 */
	@ApiField("string_yingshe")
	private String stringYingshe;

	/**
	 * test
	 */
	@ApiField("string_yingshe_1_open_id")
	private String stringYingshe1OpenId;

	/**
	 * test
	 */
	@ApiField("string_yingshe_2_openid")
	private String stringYingshe2Openid;

	/**
	 * test 当前字段已废弃(test废弃字段测试)
	 */
	@ApiField("uid")
	@Deprecated
	private String uid;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStringYingshe() {
		return this.stringYingshe;
	}
	public void setStringYingshe(String stringYingshe) {
		this.stringYingshe = stringYingshe;
	}

	public String getStringYingshe1OpenId() {
		return this.stringYingshe1OpenId;
	}
	public void setStringYingshe1OpenId(String stringYingshe1OpenId) {
		this.stringYingshe1OpenId = stringYingshe1OpenId;
	}

	public String getStringYingshe2Openid() {
		return this.stringYingshe2Openid;
	}
	public void setStringYingshe2Openid(String stringYingshe2Openid) {
		this.stringYingshe2Openid = stringYingshe2Openid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}

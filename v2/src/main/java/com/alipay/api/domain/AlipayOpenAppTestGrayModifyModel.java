package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * put
 *
 * @author auto create
 * @since 1.0, 2023-01-09 15:57:19
 */
public class AlipayOpenAppTestGrayModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2541989265838132355L;

	/**
	 * 详细地址
	 */
	@ApiField("a")
	private String a;

	/**
	 * 12
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("b_param")
	private String bParam;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * d
	 */
	@ApiField("d")
	private String d;

	/**
	 * 1
	 */
	@ApiField("e")
	private String e;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("user_id")
	private String userId;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getbParam() {
		return this.bParam;
	}
	public void setbParam(String bParam) {
		this.bParam = bParam;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return this.e;
	}
	public void setE(String e) {
		this.e = e;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

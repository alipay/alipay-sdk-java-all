package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi-oas3.0灰度
 *
 * @author auto create
 * @since 1.0, 2023-01-10 11:23:50
 */
public class AlipayOpenAppTestGrayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6862415218215631128L;

	/**
	 * a
	 */
	@ApiField("a")
	private String a;

	/**
	 * 生
	 */
	@ApiField("b")
	private String b;

	/**
	 * b1
	 */
	@ApiField("body")
	private String body;

	/**
	 * body
	 */
	@ApiField("body_1")
	private String body1;

	/**
	 * c1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 复杂参数
	 */
	@ApiField("complex_param")
	private OpenidComplex complexParam;

	/**
	 * 1
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * xx
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

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBody1() {
		return this.body1;
	}
	public void setBody1(String body1) {
		this.body1 = body1;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public OpenidComplex getComplexParam() {
		return this.complexParam;
	}
	public void setComplexParam(OpenidComplex complexParam) {
		this.complexParam = complexParam;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
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

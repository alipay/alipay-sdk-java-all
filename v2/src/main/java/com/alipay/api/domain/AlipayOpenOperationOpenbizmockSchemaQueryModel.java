package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成schema测试
 *
 * @author auto create
 * @since 1.0, 2024-04-08 11:52:54
 */
public class AlipayOpenOperationOpenbizmockSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6482687266553671167L;

	/**
	 * test
	 */
	@ApiField("a")
	private String a;

	/**
	 * test
	 */
	@ApiField("b")
	private String b;

	/**
	 * test
	 */
	@ApiField("c")
	private String c;

	/**
	 * 111
	 */
	@ApiField("complex_a")
	private TestDemo complexA;

	/**
	 * test
	 */
	@ApiField("fuza")
	private TestDemoWzw fuza;

	/**
	 * test
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * test
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * {"test":"test"}
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * test
	 */
	@ApiField("uid_a")
	private String uidA;

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

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public TestDemo getComplexA() {
		return this.complexA;
	}
	public void setComplexA(TestDemo complexA) {
		this.complexA = complexA;
	}

	public TestDemoWzw getFuza() {
		return this.fuza;
	}
	public void setFuza(TestDemoWzw fuza) {
		this.fuza = fuza;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUidA() {
		return this.uidA;
	}
	public void setUidA(String uidA) {
		this.uidA = uidA;
	}

}

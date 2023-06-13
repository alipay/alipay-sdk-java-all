package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成schema测试
 *
 * @author auto create
 * @since 1.0, 2023-01-17 21:28:16
 */
public class AlipayOpenOperationOpenbizmockSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6148774515879118967L;

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
	 * test
	 */
	@ApiField("uid")
	private String uid;

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

}

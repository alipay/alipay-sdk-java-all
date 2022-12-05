package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyoutestopenidThree
 *
 * @author auto create
 * @since 1.0, 2022-11-19 12:51:37
 */
public class JinyoutestopenidThree extends AlipayObject {

	private static final long serialVersionUID = 2143646625886367224L;

	/**
	 * 12
	 */
	@ApiField("a")
	private String a;

	/**
	 * 有openid,无枚举，有注意事项
	 */
	@ApiField("b")
	private String b;

	/**
	 * 有openid,无枚举，有注意事项
	 */
	@ApiField("b_open_id")
	private String bOpenId;

	/**
	 * 复杂参数2
	 */
	@ApiField("f")
	private JinyoutestopenidTwo f;

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

	public String getbOpenId() {
		return this.bOpenId;
	}
	public void setbOpenId(String bOpenId) {
		this.bOpenId = bOpenId;
	}

	public JinyoutestopenidTwo getF() {
		return this.f;
	}
	public void setF(JinyoutestopenidTwo f) {
		this.f = f;
	}

}

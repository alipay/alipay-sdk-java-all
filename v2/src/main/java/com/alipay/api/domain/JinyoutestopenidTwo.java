package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyoutestopenidTwo
 *
 * @author auto create
 * @since 1.0, 2022-11-19 12:41:20
 */
public class JinyoutestopenidTwo extends AlipayObject {

	private static final long serialVersionUID = 6295295386437686367L;

	/**
	 * 无openid,有枚举值，有注意事项
	 */
	@ApiField("a")
	private String a;

	/**
	 * 有openid，无枚举值，无注意事项
	 */
	@ApiField("b")
	private String b;

	/**
	 * 有openid，无枚举值，无注意事项,openid有注意事项
	 */
	@ApiField("b_open_id")
	private String bOpenId;

	/**
	 * 复杂类型第二层
	 */
	@ApiField("f")
	private JinyoutestopenidOne f;

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

	public JinyoutestopenidOne getF() {
		return this.f;
	}
	public void setF(JinyoutestopenidOne f) {
		this.f = f;
	}

}

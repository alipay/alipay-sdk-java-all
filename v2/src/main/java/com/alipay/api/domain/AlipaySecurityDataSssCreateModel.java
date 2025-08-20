package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档回归测试勿动openapi_openid_post多场景
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:25:55
 */
public class AlipaySecurityDataSssCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1284772649516782857L;

	/**
	 * path.数字，无枚举，有注意事项
	 */
	@ApiField("a")
	private Long a;

	/**
	 * body,可选，无openid，有枚举值，注意事项
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 有枚举，必须，有openid，有注意事项
	 */
	@ApiField("b")
	private String b;

	/**
	 * 有枚举，必须，有openid，有注意事项
	 */
	@ApiField("b_open_id")
	private String bOpenId;

	/**
	 * 复杂类型
	 */
	@ApiField("f")
	private JinyoutestopenidThree f;

	public Long getA() {
		return this.a;
	}
	public void setA(Long a) {
		this.a = a;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
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

	public JinyoutestopenidThree getF() {
		return this.f;
	}
	public void setF(JinyoutestopenidThree f) {
		this.f = f;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试authtoken
 *
 * @author auto create
 * @since 1.0, 2024-05-23 11:25:08
 */
public class AlipaySecurityProdJhjtestSupportauthtokenModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3262852521363771285L;

	/**
	 * 2313
	 */
	@ApiField("aaa")
	private String aaa;

	/**
	 * 11
	 */
	@ApiField("com_a")
	private PublicTestProd comA;

	/**
	 * 1
	 */
	@ApiField("is_aasda")
	private String isAasda;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public PublicTestProd getComA() {
		return this.comA;
	}
	public void setComA(PublicTestProd comA) {
		this.comA = comA;
	}

	public String getIsAasda() {
		return this.isAasda;
	}
	public void setIsAasda(String isAasda) {
		this.isAasda = isAasda;
	}

}

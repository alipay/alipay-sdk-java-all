package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档链路测试
 *
 * @author auto create
 * @since 1.0, 2024-06-21 17:12:10
 */
public class AlipaySecurityProdJhjtestPredocCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1389465686696852384L;

	/**
	 * 11111
	 */
	@ApiField("com_a")
	private JhjtestDoc comA;

	/**
	 * 添加不在迭代内的开发中2.0复杂类型，
	 */
	@ApiField("com_c")
	private JhjTestNew comC;

	/**
	 * 1
	 */
	@ApiField("is_s")
	private String isS;

	/**
	 * 11
	 */
	@ApiField("isasdasd")
	private Boolean isasdasd;

	/**
	 * 111
	 */
	@ApiField("price_a_input")
	private String priceAInput;

	/**
	 * 1
	 */
	@ApiField("sdd")
	private Boolean sdd;

	/**
	 * 基础描述修改缓存11
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * 基础描述修改缓存11
	 */
	@ApiField("test_a_openid")
	private String testAOpenid;

	public JhjtestDoc getComA() {
		return this.comA;
	}
	public void setComA(JhjtestDoc comA) {
		this.comA = comA;
	}

	public JhjTestNew getComC() {
		return this.comC;
	}
	public void setComC(JhjTestNew comC) {
		this.comC = comC;
	}

	public String getIsS() {
		return this.isS;
	}
	public void setIsS(String isS) {
		this.isS = isS;
	}

	public Boolean getIsasdasd() {
		return this.isasdasd;
	}
	public void setIsasdasd(Boolean isasdasd) {
		this.isasdasd = isasdasd;
	}

	public String getPriceAInput() {
		return this.priceAInput;
	}
	public void setPriceAInput(String priceAInput) {
		this.priceAInput = priceAInput;
	}

	public Boolean getSdd() {
		return this.sdd;
	}
	public void setSdd(Boolean sdd) {
		this.sdd = sdd;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public String getTestAOpenid() {
		return this.testAOpenid;
	}
	public void setTestAOpenid(String testAOpenid) {
		this.testAOpenid = testAOpenid;
	}

}

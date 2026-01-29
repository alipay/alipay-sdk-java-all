package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N选一的测试接口
 *
 * @author auto create
 * @since 1.0, 2024-07-18 20:50:31
 */
public class AlipayDataDataserviceCodecheckRainyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5528317653459293151L;

	/**
	 * 1
	 */
	@ApiField("boolean_a")
	private Boolean booleanA;

	/**
	 * 12
	 */
	@ApiField("boolean_b")
	private Boolean booleanB;

	/**
	 * 123
	 */
	@ApiField("diff_boolean_b")
	private Boolean diffBooleanB;

	/**
	 * 1-5
	 */
	@ApiField("diff_num_c")
	private Long diffNumC;

	/**
	 * 1-3
	 */
	@ApiField("diff_price_d")
	private String diffPriceD;

	/**
	 * 1
	 */
	@ApiField("diff_string_a")
	private String diffStringA;

	/**
	 * 1
	 */
	@ApiField("num_a")
	private Long numA;

	/**
	 * 99-201
	 */
	@ApiField("num_b")
	private Long numB;

	/**
	 * 1
	 */
	@ApiField("price_a")
	private String priceA;

	/**
	 * 1oo-201
	 */
	@ApiField("price_b")
	private String priceB;

	/**
	 * aa
	 */
	@ApiField("string_a")
	private String stringA;

	/**
	 * a
	 */
	@ApiField("string_b")
	private String stringB;

	public Boolean getBooleanA() {
		return this.booleanA;
	}
	public void setBooleanA(Boolean booleanA) {
		this.booleanA = booleanA;
	}

	public Boolean getBooleanB() {
		return this.booleanB;
	}
	public void setBooleanB(Boolean booleanB) {
		this.booleanB = booleanB;
	}

	public Boolean getDiffBooleanB() {
		return this.diffBooleanB;
	}
	public void setDiffBooleanB(Boolean diffBooleanB) {
		this.diffBooleanB = diffBooleanB;
	}

	public Long getDiffNumC() {
		return this.diffNumC;
	}
	public void setDiffNumC(Long diffNumC) {
		this.diffNumC = diffNumC;
	}

	public String getDiffPriceD() {
		return this.diffPriceD;
	}
	public void setDiffPriceD(String diffPriceD) {
		this.diffPriceD = diffPriceD;
	}

	public String getDiffStringA() {
		return this.diffStringA;
	}
	public void setDiffStringA(String diffStringA) {
		this.diffStringA = diffStringA;
	}

	public Long getNumA() {
		return this.numA;
	}
	public void setNumA(Long numA) {
		this.numA = numA;
	}

	public Long getNumB() {
		return this.numB;
	}
	public void setNumB(Long numB) {
		this.numB = numB;
	}

	public String getPriceA() {
		return this.priceA;
	}
	public void setPriceA(String priceA) {
		this.priceA = priceA;
	}

	public String getPriceB() {
		return this.priceB;
	}
	public void setPriceB(String priceB) {
		this.priceB = priceB;
	}

	public String getStringA() {
		return this.stringA;
	}
	public void setStringA(String stringA) {
		this.stringA = stringA;
	}

	public String getStringB() {
		return this.stringB;
	}
	public void setStringB(String stringB) {
		this.stringB = stringB;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于测试三层的复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-07-05 00:30:55
 */
public class ManjiangTestThreeData extends AlipayObject {

	private static final long serialVersionUID = 8644388257619878747L;

	/**
	 * 1
	 */
	@ApiField("new_field")
	private String newField;

	/**
	 * 2
	 */
	@ApiField("test_complex")
	private ManjiangTestLevelTwoData testComplex;

	/**
	 * 1
	 */
	@ApiField("test_complex_1")
	private ManjiangTestLevelTwoData testComplex1;

	/**
	 * 3
	 */
	@ApiField("test_level_three")
	private String testLevelThree;

	public String getNewField() {
		return this.newField;
	}
	public void setNewField(String newField) {
		this.newField = newField;
	}

	public ManjiangTestLevelTwoData getTestComplex() {
		return this.testComplex;
	}
	public void setTestComplex(ManjiangTestLevelTwoData testComplex) {
		this.testComplex = testComplex;
	}

	public ManjiangTestLevelTwoData getTestComplex1() {
		return this.testComplex1;
	}
	public void setTestComplex1(ManjiangTestLevelTwoData testComplex1) {
		this.testComplex1 = testComplex1;
	}

	public String getTestLevelThree() {
		return this.testLevelThree;
	}
	public void setTestLevelThree(String testLevelThree) {
		this.testLevelThree = testLevelThree;
	}

}

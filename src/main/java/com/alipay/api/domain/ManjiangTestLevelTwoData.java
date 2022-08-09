package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试两层复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-07-05 11:58:10
 */
public class ManjiangTestLevelTwoData extends AlipayObject {

	private static final long serialVersionUID = 7247912129714854733L;

	/**
	 * 1
	 */
	@ApiField("test_comple_2")
	private ManjiangTestComplexOneData testComple2;

	/**
	 * 1
	 */
	@ApiField("tets_level_2")
	private String tetsLevel2;

	public ManjiangTestComplexOneData getTestComple2() {
		return this.testComple2;
	}
	public void setTestComple2(ManjiangTestComplexOneData testComple2) {
		this.testComple2 = testComple2;
	}

	public String getTetsLevel2() {
		return this.tetsLevel2;
	}
	public void setTetsLevel2(String tetsLevel2) {
		this.tetsLevel2 = tetsLevel2;
	}

}

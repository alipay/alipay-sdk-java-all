package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试两层复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-09-17 21:46:45
 */
public class ManjiangTestLevelTwoData extends AlipayObject {

	private static final long serialVersionUID = 7891444748357429721L;

	/**
	 * 1
	 */
	@ApiField("open_json")
	private String openJson;

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

	public String getOpenJson() {
		return this.openJson;
	}
	public void setOpenJson(String openJson) {
		this.openJson = openJson;
	}

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

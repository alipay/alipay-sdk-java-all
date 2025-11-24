package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试两层复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-07-14 10:24:42
 */
public class ManjiangTestLevelTwoData extends AlipayObject {

	private static final long serialVersionUID = 7546496376374521356L;

	/**
	 * 1
	 */
	@ApiField("open_json")
	private String openJson;

	/**
	 * 1
	 */
	@ApiField("sss")
	private ManjiangTestabc sss;

	/**
	 * 1
	 */
	@ApiField("test_comple_2")
	private ManjiangTestComplexOneData testComple2;

	/**
	 * 1
	 */
	@ApiField("test_open_id")
	private String testOpenId;

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

	public ManjiangTestabc getSss() {
		return this.sss;
	}
	public void setSss(ManjiangTestabc sss) {
		this.sss = sss;
	}

	public ManjiangTestComplexOneData getTestComple2() {
		return this.testComple2;
	}
	public void setTestComple2(ManjiangTestComplexOneData testComple2) {
		this.testComple2 = testComple2;
	}

	public String getTestOpenId() {
		return this.testOpenId;
	}
	public void setTestOpenId(String testOpenId) {
		this.testOpenId = testOpenId;
	}

	public String getTetsLevel2() {
		return this.tetsLevel2;
	}
	public void setTetsLevel2(String tetsLevel2) {
		this.tetsLevel2 = tetsLevel2;
	}

}

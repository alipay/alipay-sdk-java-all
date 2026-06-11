package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第四层
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:08:14
 */
public class RainyComplexTypesTheFirstFouth extends AlipayObject {

	private static final long serialVersionUID = 7691666914156172185L;

	/**
	 * 第五层
	 */
	@ApiField("fifth_level")
	private RainyComplexTypesTheFirst fifthLevel;

	/**
	 * 第四层布尔参数
	 */
	@ApiField("fouth_level_boolean")
	private Boolean fouthLevelBoolean;

	/**
	 * 第四层数值c参数
	 */
	@ApiField("fouth_level_num")
	private Long fouthLevelNum;

	/**
	 * 第四层有正则的参数
	 */
	@ApiField("fouth_level_string")
	private String fouthLevelString;

	/**
	 * 新增的而已
	 */
	@ApiField("new_creat")
	private String newCreat;

	/**
	 * 字符串的复杂类型拉
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * boolean,V2版本改成可选；
	 */
	@ApiField("test_b")
	private Boolean testB;

	public RainyComplexTypesTheFirst getFifthLevel() {
		return this.fifthLevel;
	}
	public void setFifthLevel(RainyComplexTypesTheFirst fifthLevel) {
		this.fifthLevel = fifthLevel;
	}

	public Boolean getFouthLevelBoolean() {
		return this.fouthLevelBoolean;
	}
	public void setFouthLevelBoolean(Boolean fouthLevelBoolean) {
		this.fouthLevelBoolean = fouthLevelBoolean;
	}

	public Long getFouthLevelNum() {
		return this.fouthLevelNum;
	}
	public void setFouthLevelNum(Long fouthLevelNum) {
		this.fouthLevelNum = fouthLevelNum;
	}

	public String getFouthLevelString() {
		return this.fouthLevelString;
	}
	public void setFouthLevelString(String fouthLevelString) {
		this.fouthLevelString = fouthLevelString;
	}

	public String getNewCreat() {
		return this.newCreat;
	}
	public void setNewCreat(String newCreat) {
		this.newCreat = newCreat;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public Boolean getTestB() {
		return this.testB;
	}
	public void setTestB(Boolean testB) {
		this.testB = testB;
	}

}

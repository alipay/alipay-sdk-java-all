package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指标数据
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:18
 */
public class IndicatorData extends AlipayObject {

	private static final long serialVersionUID = 8826499315243549926L;

	/**
	 * 绝对差结果
	 */
	@ApiField("absolute")
	private TestResult absolute;

	/**
	 * 49700049
	 */
	@ApiField("id")
	private String id;

	/**
	 * 指标名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 相对差结果
	 */
	@ApiField("relative")
	private TestResult relative;

	public TestResult getAbsolute() {
		return this.absolute;
	}
	public void setAbsolute(TestResult absolute) {
		this.absolute = absolute;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public TestResult getRelative() {
		return this.relative;
	}
	public void setRelative(TestResult relative) {
		this.relative = relative;
	}

}

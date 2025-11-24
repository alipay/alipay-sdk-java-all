package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能对话可选工具
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:29:40
 */
public class ChoiceTools extends AlipayObject {

	private static final long serialVersionUID = 7555636112822941261L;

	/**
	 * 为true代表此工具一定被执行。注意，只会执行第一个一定执行的工具
	 */
	@ApiField("expected")
	private Boolean expected;

	/**
	 * 指定的工具ID（只有此agent关联的工具才生效）
	 */
	@ApiField("name")
	private String name;

	/**
	 * 调用工具时的预设参数，json字符串形式的参数集合
	 */
	@ApiField("params")
	private String params;

	/**
	 * 运行时动态工具配置，如果列表非空，本轮执行的工具一定在此列表范围内（白名单）。
	 */
	@ApiField("type")
	private String type;

	public Boolean getExpected() {
		return this.expected;
	}
	public void setExpected(Boolean expected) {
		this.expected = expected;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业标签
 *
 * @author auto create
 * @since 1.0, 2021-03-17 10:09:33
 */
public class Hylabel extends AlipayObject {

	private static final long serialVersionUID = 5442519287663555899L;

	/**
	 * 行业id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 行业标签名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 概率值
	 */
	@ApiField("probabilities")
	private String probabilities;

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

	public String getProbabilities() {
		return this.probabilities;
	}
	public void setProbabilities(String probabilities) {
		this.probabilities = probabilities;
	}

}

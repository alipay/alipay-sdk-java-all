package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 症状子部分
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class SymptomSubPart extends AlipayObject {

	private static final long serialVersionUID = 8288342168735444257L;

	/**
	 * 标志
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 顺序
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 症状
	 */
	@ApiListField("symptoms")
	@ApiField("string")
	private List<String> symptoms;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public List<String> getSymptoms() {
		return this.symptoms;
	}
	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

}

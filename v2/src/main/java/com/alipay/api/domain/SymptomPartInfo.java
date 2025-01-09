package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 症状部分信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class SymptomPartInfo extends AlipayObject {

	private static final long serialVersionUID = 7235523352742162157L;

	/**
	 * 症状标志图片
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
	 * 子症状列表
	 */
	@ApiListField("sub_parts")
	@ApiField("symptom_sub_part")
	private List<SymptomSubPart> subParts;

	/**
	 * 症状列表
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

	public List<SymptomSubPart> getSubParts() {
		return this.subParts;
	}
	public void setSubParts(List<SymptomSubPart> subParts) {
		this.subParts = subParts;
	}

	public List<String> getSymptoms() {
		return this.symptoms;
	}
	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

}

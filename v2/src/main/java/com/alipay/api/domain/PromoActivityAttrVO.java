package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动属性
 *
 * @author auto create
 * @since 1.0, 2023-12-10 17:46:40
 */
public class PromoActivityAttrVO extends AlipayObject {

	private static final long serialVersionUID = 6214792625391254288L;

	/**
	 * 属性的 key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 是否多选
	 */
	@ApiField("multi")
	private Boolean multi;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 可选项列表
	 */
	@ApiListField("options")
	@ApiField("promo_activity_attr_option_v_o")
	private List<PromoActivityAttrOptionVO> options;

	/**
	 * 该属性是否必填
	 */
	@ApiField("required")
	private Boolean required;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<PromoActivityAttrOptionVO> getOptions() {
		return this.options;
	}
	public void setOptions(List<PromoActivityAttrOptionVO> options) {
		this.options = options;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

}

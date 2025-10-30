package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品规格
 *
 * @author auto create
 * @since 1.0, 2024-06-07 13:59:54
 */
public class LinkedMallItemSpecDTO extends AlipayObject {

	private static final long serialVersionUID = 2662731163375293692L;

	/**
	 * 规格名
	 */
	@ApiField("key")
	private String key;

	/**
	 * 规格值集合
	 */
	@ApiListField("values")
	@ApiField("linked_mall_item_spec_value_d_t_o")
	private List<LinkedMallItemSpecValueDTO> values;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<LinkedMallItemSpecValueDTO> getValues() {
		return this.values;
	}
	public void setValues(List<LinkedMallItemSpecValueDTO> values) {
		this.values = values;
	}

}

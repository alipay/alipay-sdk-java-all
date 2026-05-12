package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品模型，可以通过该参数一并创建商品信息
 *
 * @author auto create
 * @since 1.0, 2026-03-30 15:52:45
 */
public class ProductData extends AlipayObject {

	private static final long serialVersionUID = 4322518385582837248L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商户需要保存在商品模型中的元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

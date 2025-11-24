package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SKU属性信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:59:42
 */
public class RentSkuAttrInfo extends AlipayObject {

	private static final long serialVersionUID = 7692589219675447925L;

	/**
	 * 属性key，例如 品牌对应 brand，通过alipay.open.app.item.cateattr.query接口获取
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	/**
	 * 属性值ID
	 */
	@ApiField("attr_value_id")
	private String attrValueId;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public String getAttrValueId() {
		return this.attrValueId;
	}
	public void setAttrValueId(String attrValueId) {
		this.attrValueId = attrValueId;
	}

}

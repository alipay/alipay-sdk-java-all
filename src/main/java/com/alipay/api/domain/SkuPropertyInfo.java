package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商家sku属性详情
 *
 * @author auto create
 * @since 1.0, 2018-06-26 14:23:36
 */
public class SkuPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 3346975368537741146L;

	/**
	 * sku属性key值,可发邮件到lei.mao@antfin.com,联系支付宝获取已支持的key.支付宝在收到邮件后三个工作日内回复
	 */
	@ApiField("key")
	private String key;

	/**
	 * 商家sku属性值列表
	 */
	@ApiListField("value")
	@ApiField("sku_property_value")
	private List<SkuPropertyValue> value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<SkuPropertyValue> getValue() {
		return this.value;
	}
	public void setValue(List<SkuPropertyValue> value) {
		this.value = value;
	}

}

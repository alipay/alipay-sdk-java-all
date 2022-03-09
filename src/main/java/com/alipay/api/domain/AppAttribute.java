package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用属性信息，如小程序或生活号子服务的类目属性。适用于涉及属性信息的增删改查接口。
 *
 * @author auto create
 * @since 1.0, 2020-09-26 13:55:21
 */
public class AppAttribute extends AlipayObject {

	private static final long serialVersionUID = 1243254577615673143L;

	/**
	 * 属性的Key，对于类目属性，支付宝侧约定属性编码，商户侧根据实际情况，按需传入。具体可以参见接口所在功能包的产品说明文档。
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性的Value，对于类目属性，如果值是枚举化的，支付宝测约会定具体的编码，商户侧根据实际情况，按需传入。具体可以参考接口所在功能包的产品说明文档。
	 */
	@ApiListField("value")
	@ApiField("string")
	private List<String> value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<String> getValue() {
		return this.value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}

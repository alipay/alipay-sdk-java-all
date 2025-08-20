package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意内容元数据
 *
 * @author auto create
 * @since 1.0, 2023-09-05 17:39:58
 */
public class DspCreativeElement extends AlipayObject {

	private static final long serialVersionUID = 5646523314116374736L;

	/**
	 * 创意属性名
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 创意属性值
	 */
	@ApiListField("attr_value")
	@ApiField("string")
	private List<String> attrValue;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public List<String> getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(List<String> attrValue) {
		this.attrValue = attrValue;
	}

}

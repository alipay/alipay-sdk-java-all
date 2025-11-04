package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意关联的标题/描述等文本素材详情
 *
 * @author auto create
 * @since 1.0, 2020-10-29 17:45:57
 */
public class TextInstance extends AlipayObject {

	private static final long serialVersionUID = 6461155976459838931L;

	/**
	 * 元素C端渲染关联位置key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 物料元素类型，TITLE-标题；DESC-描述
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 标题/描述文本值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

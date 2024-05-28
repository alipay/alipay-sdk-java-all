package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意交互行为属性实例值
 *
 * @author auto create
 * @since 1.0, 2024-05-23 20:37:50
 */
public class ActionProperty extends AlipayObject {

	private static final long serialVersionUID = 5429388343569926493L;

	/**
	 * 属性C端渲染key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 广告投放平台生成的物料实例ID
	 */
	@ApiField("material_instance_id")
	private Long materialInstanceId;

	/**
	 * 交互动作属性元素类型，IMG-图片；TEXT-普通文本
	 */
	@ApiField("type")
	private String type;

	/**
	 * 属性图片URL；属性文本值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Long getMaterialInstanceId() {
		return this.materialInstanceId;
	}
	public void setMaterialInstanceId(Long materialInstanceId) {
		this.materialInstanceId = materialInstanceId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

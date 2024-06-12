package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作为TenantDTO的拓展字段
 *
 * @author auto create
 * @since 1.0, 2023-02-22 13:50:18
 */
public class LabelDTO extends AlipayObject {

	private static final long serialVersionUID = 8462535179377346153L;

	/**
	 * label 不唯一 spi不支持map，该dto作为tenantDTO的map 无枚举 被调用方提供 无特殊说明
	 */
	@ApiField("label")
	private String label;

	/**
	 * value 不唯一 spi不支持map，所以使用该dto作为map，该值为value 无枚举 无特殊说明
	 */
	@ApiField("value")
	private String value;

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

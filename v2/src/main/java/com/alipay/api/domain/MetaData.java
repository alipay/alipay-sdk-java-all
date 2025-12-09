package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 元数据，用以定义一些抽象数据结构
 *
 * @author auto create
 * @since 1.0, 2025-09-22 13:37:56
 */
public class MetaData extends AlipayObject {

	private static final long serialVersionUID = 2526871966784965217L;

	/**
	 * 元数据code
	 */
	@ApiField("meta_data_code")
	private String metaDataCode;

	/**
	 * 元数据的描述
	 */
	@ApiField("meta_data_desc")
	private String metaDataDesc;

	/**
	 * 元数据名称
	 */
	@ApiField("meta_data_name")
	private String metaDataName;

	/**
	 * 元数据对应的简单类型的值，字符串类型
	 */
	@ApiField("simple_value")
	private String simpleValue;

	public String getMetaDataCode() {
		return this.metaDataCode;
	}
	public void setMetaDataCode(String metaDataCode) {
		this.metaDataCode = metaDataCode;
	}

	public String getMetaDataDesc() {
		return this.metaDataDesc;
	}
	public void setMetaDataDesc(String metaDataDesc) {
		this.metaDataDesc = metaDataDesc;
	}

	public String getMetaDataName() {
		return this.metaDataName;
	}
	public void setMetaDataName(String metaDataName) {
		this.metaDataName = metaDataName;
	}

	public String getSimpleValue() {
		return this.simpleValue;
	}
	public void setSimpleValue(String simpleValue) {
		this.simpleValue = simpleValue;
	}

}

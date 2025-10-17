package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 字段配置信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:45:55
 */
public class ConfigOutDTO extends AlipayObject {

	private static final long serialVersionUID = 7276132162539339778L;

	/**
	 * 字段信息
	 */
	@ApiListField("fields")
	@ApiField("field_out_d_t_o")
	private List<FieldOutDTO> fields;

	/**
	 * 模型编码
	 */
	@ApiField("model_code")
	private String modelCode;

	/**
	 * 字段属性
	 */
	@ApiField("props")
	private PropertyOutDTO props;

	public List<FieldOutDTO> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldOutDTO> fields) {
		this.fields = fields;
	}

	public String getModelCode() {
		return this.modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public PropertyOutDTO getProps() {
		return this.props;
	}
	public void setProps(PropertyOutDTO props) {
		this.props = props;
	}

}

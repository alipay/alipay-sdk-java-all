package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建标签接口
 *
 * @author auto create
 * @since 1.0, 2024-09-02 13:40:24
 */
public class AlipayOpenPublicLifeLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5549815136328322398L;

	/**
	 * 标签值类型，不填默认为 string 类型。
注意：目前只支持 string（字符串类型）。
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 自定义标签名。
注意：每个生活号最多创建 100 个自定义标签。
	 */
	@ApiField("label_name")
	private String labelName;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}

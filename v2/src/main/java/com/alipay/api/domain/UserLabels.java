package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-05 15:02:43
 */
public class UserLabels extends AlipayObject {

	private static final long serialVersionUID = 2744284748529959273L;

	/**
	 * 当前参数为标签名称对应的属性编码（Code），其定义源自数据服务平台。
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 当前参数为源自数据服务平台定义的标签名称属性
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 该参数表示标签值，用于标识对应标签的具体取值。
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}

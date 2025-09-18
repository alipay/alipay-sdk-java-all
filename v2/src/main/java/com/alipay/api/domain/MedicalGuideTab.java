package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗导诊标签
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideTab extends AlipayObject {

	private static final long serialVersionUID = 7694879377222211392L;

	/**
	 * 按钮名称
	 */
	@ApiField("btn_name")
	private String btnName;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 科室类型
	 */
	@ApiField("type")
	private String type;

	public String getBtnName() {
		return this.btnName;
	}
	public void setBtnName(String btnName) {
		this.btnName = btnName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

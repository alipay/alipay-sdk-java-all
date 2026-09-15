package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:47:57
 */
public class IvrItem extends AlipayObject {

	private static final long serialVersionUID = 1439684691261964236L;

	/**
	 * 关联流程code（下拉选中值，对应任务taskIVRCode/transferCode）
	 */
	@ApiField("ivr_code")
	private String ivrCode;

	/**
	 * 流程名称（下拉显示）
	 */
	@ApiField("name")
	private String name;

	public String getIvrCode() {
		return this.ivrCode;
	}
	public void setIvrCode(String ivrCode) {
		this.ivrCode = ivrCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

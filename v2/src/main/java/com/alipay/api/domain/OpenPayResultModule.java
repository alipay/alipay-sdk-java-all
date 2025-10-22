package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务支付结果
 *
 * @author auto create
 * @since 1.0, 2025-08-18 16:36:16
 */
public class OpenPayResultModule extends AlipayObject {

	private static final long serialVersionUID = 5585267134297185118L;

	/**
	 * 支付结果主题内容
	 */
	@ApiField("open_module_data")
	private OpenModuleData openModuleData;

	/**
	 * 业务类型
	 */
	@ApiField("type")
	private String type;

	public OpenModuleData getOpenModuleData() {
		return this.openModuleData;
	}
	public void setOpenModuleData(OpenModuleData openModuleData) {
		this.openModuleData = openModuleData;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

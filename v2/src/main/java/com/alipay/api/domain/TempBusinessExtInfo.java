package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务自定义扩展字段
 *
 * @author auto create
 * @since 1.0, 2026-01-12 17:11:23
 */
public class TempBusinessExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5517385994391152333L;

	/**
	 * 服务商调用接口为商家添加申请物料信息时，可以指定商家的uid信息
	 */
	@ApiField("custom_ext_info_str")
	private String customExtInfoStr;

	public String getCustomExtInfoStr() {
		return this.customExtInfoStr;
	}
	public void setCustomExtInfoStr(String customExtInfoStr) {
		this.customExtInfoStr = customExtInfoStr;
	}

}

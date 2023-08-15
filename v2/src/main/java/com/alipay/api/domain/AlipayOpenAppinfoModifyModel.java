package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用信息修改接口
 *
 * @author auto create
 * @since 1.0, 2023-08-10 15:59:48
 */
public class AlipayOpenAppinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3678835279915893277L;

	/**
	 * 应用openid配置
	 */
	@ApiField("open_id_config")
	private String openIdConfig;

	public String getOpenIdConfig() {
		return this.openIdConfig;
	}
	public void setOpenIdConfig(String openIdConfig) {
		this.openIdConfig = openIdConfig;
	}

}

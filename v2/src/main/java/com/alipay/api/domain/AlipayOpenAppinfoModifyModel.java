package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用信息修改接口
 *
 * @author auto create
 * @since 1.0, 2023-03-22 15:40:50
 */
public class AlipayOpenAppinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4584275526563328183L;

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

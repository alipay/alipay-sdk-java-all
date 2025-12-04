package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据urId获取 最后的登录信息
 *
 * @author auto create
 * @since 1.0, 2025-05-08 16:35:18
 */
public class AlipayIserviceIsportalLogindigestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8137712842212829442L;

	/**
	 * 星云对应的用户平台的ID
	 */
	@ApiField("ur_id")
	private String urId;

	public String getUrId() {
		return this.urId;
	}
	public void setUrId(String urId) {
		this.urId = urId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿打发打发打发发
 *
 * @author auto create
 * @since 1.0, 2019-08-19 18:34:31
 */
public class AlipaySecurityProdAdfdsaadsfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3466279787448393774L;

	/**
	 * 提供三方服务能力的开放平台应用ID
	 */
	@ApiField("target_id")
	private String targetId;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}

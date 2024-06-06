package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景实例信息
 *
 * @author auto create
 * @since 1.0, 2023-09-28 09:33:14
 */
public class OpenApiSceneInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 4429292239857751794L;

	/**
	 * 外部租户id
	 */
	@ApiField("external_inst_id")
	private String externalInstId;

	public String getExternalInstId() {
		return this.externalInstId;
	}
	public void setExternalInstId(String externalInstId) {
		this.externalInstId = externalInstId;
	}

}

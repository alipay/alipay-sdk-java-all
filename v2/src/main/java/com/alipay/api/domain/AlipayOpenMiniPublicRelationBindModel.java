package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序绑定生活号
 *
 * @author auto create
 * @since 1.0, 2025-08-07 18:49:17
 */
public class AlipayOpenMiniPublicRelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 1563833185435529777L;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}

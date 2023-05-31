package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序绑定生活号
 *
 * @author auto create
 * @since 1.0, 2019-12-18 10:18:06
 */
public class AlipayOpenMiniPublicRelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 5389769937335518763L;

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

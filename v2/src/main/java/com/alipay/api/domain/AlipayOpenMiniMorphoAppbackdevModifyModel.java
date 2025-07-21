package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退回开发
 *
 * @author auto create
 * @since 1.0, 2020-08-20 19:53:58
 */
public class AlipayOpenMiniMorphoAppbackdevModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4743341224212317544L;

	/**
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 闪蝶身份验证信息
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

}

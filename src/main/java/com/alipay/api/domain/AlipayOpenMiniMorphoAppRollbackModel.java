package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回滚应用
 *
 * @author auto create
 * @since 1.0, 2019-11-18 10:37:12
 */
public class AlipayOpenMiniMorphoAppRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 2616242619619983422L;

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

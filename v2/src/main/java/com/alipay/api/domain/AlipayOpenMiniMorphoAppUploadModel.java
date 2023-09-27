package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交构建应用
 *
 * @author auto create
 * @since 1.0, 2020-08-20 19:48:55
 */
public class AlipayOpenMiniMorphoAppUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1432534448426375867L;

	/**
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 闪蝶身份校验信息
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	/**
	 * 基于源码创建场景下的源码信息
	 */
	@ApiField("source")
	private MorphoSource source;

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

	public MorphoSource getSource() {
		return this.source;
	}
	public void setSource(MorphoSource source) {
		this.source = source;
	}

}

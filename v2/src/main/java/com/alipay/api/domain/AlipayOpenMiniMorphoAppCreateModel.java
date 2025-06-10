package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶应用创建接口
 *
 * @author auto create
 * @since 1.0, 2020-08-20 19:54:24
 */
public class AlipayOpenMiniMorphoAppCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8686628327994717391L;

	/**
	 * 闪蝶创建应用的应用信息
	 */
	@ApiField("application")
	private MorphoCreateApp application;

	/**
	 * 闪蝶身份校验信息
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	/**
	 * 闪蝶创建应用的源码信息
	 */
	@ApiField("source")
	private MorphoCreateSource source;

	/**
	 * 创建应用使用的模板的信息
	 */
	@ApiField("template")
	private MorphoTemplate template;

	public MorphoCreateApp getApplication() {
		return this.application;
	}
	public void setApplication(MorphoCreateApp application) {
		this.application = application;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

	public MorphoCreateSource getSource() {
		return this.source;
	}
	public void setSource(MorphoCreateSource source) {
		this.source = source;
	}

	public MorphoTemplate getTemplate() {
		return this.template;
	}
	public void setTemplate(MorphoTemplate template) {
		this.template = template;
	}

}

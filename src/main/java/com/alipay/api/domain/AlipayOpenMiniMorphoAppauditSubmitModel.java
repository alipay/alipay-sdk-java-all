package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用提交审核
 *
 * @author auto create
 * @since 1.0, 2019-12-26 15:02:54
 */
public class AlipayOpenMiniMorphoAppauditSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8527227582239452816L;

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

	/**
	 * 2张应用截图
	 */
	@ApiField("screen_shots")
	private String screenShots;

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

	public String getScreenShots() {
		return this.screenShots;
	}
	public void setScreenShots(String screenShots) {
		this.screenShots = screenShots;
	}

}

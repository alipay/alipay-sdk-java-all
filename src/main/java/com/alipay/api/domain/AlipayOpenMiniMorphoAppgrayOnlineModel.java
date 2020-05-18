package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度上架
 *
 * @author auto create
 * @since 1.0, 2019-12-26 15:03:57
 */
public class AlipayOpenMiniMorphoAppgrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 5225226591421891372L;

	/**
	 * 灰度策略
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

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

	public String getGrayStrategy() {
		return this.grayStrategy;
	}
	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶身份校验信息
 *
 * @author auto create
 * @since 1.0, 2020-08-21 14:19:49
 */
public class MorphoIdentity extends AlipayObject {

	private static final long serialVersionUID = 4126117947735784434L;

	/**
	 * 闪蝶侧用户身份唯一标识
	 */
	@ApiField("biz_id")
	private String bizId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

}

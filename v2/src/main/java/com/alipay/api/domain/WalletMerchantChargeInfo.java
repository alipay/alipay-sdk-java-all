package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包商户收费信息
 *
 * @author auto create
 * @since 1.0, 2025-11-26 11:10:41
 */
public class WalletMerchantChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 6247863627264223845L;

	/**
	 * 收费场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}

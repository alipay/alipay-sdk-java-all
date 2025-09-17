package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能体意图三要素信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-22 17:53:46
 */
public class AlipayEbppIndustryIntentionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2138911596274875478L;

	/**
	 * 查询意图信息的场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户活动批量信息查询
 *
 * @author auto create
 * @since 1.0, 2020-12-29 11:05:04
 */
public class AlipayMarketingCampaignSelfActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3754191121825731279L;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}

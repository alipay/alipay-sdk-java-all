package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签列表查询
 *
 * @author auto create
 * @since 1.0, 2023-07-18 21:36:52
 */
public class DatadigitalFincloudFinsaasTagListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1139429657596677272L;

	/**
	 * 场景code
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

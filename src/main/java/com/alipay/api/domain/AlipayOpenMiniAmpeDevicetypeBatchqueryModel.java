package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取可选设备类型列表
 *
 * @author auto create
 * @since 1.0, 2020-07-06 10:07:34
 */
public class AlipayOpenMiniAmpeDevicetypeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6844539633123924426L;

	/**
	 * 场景码，申请后平台分配，必填
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

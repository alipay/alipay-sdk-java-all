package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户设备产品列表
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:49:33
 */
public class AlipayOpenMiniAmpeProductBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1463897554259775574L;

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

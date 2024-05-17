package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询调用应用绑定列表
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:56:03
 */
public class AlipayOpenMiniAmpeInvokeappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2699471355322951384L;

	/**
	 * 场景码，申请后平台分配
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询移动应用绑定列表
 *
 * @author auto create
 * @since 1.0, 2024-04-03 12:00:20
 */
public class AlipayOpenMiniAmpeMobileappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3358268289815425927L;

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

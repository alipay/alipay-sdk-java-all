package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询移动应用绑定列表
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:54
 */
public class AlipayOpenMiniAmpeMobileappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3435597366656398387L;

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

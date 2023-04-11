package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询标签列表
 *
 * @author auto create
 * @since 1.0, 2021-03-11 10:08:22
 */
public class AlipayCommerceEducateTrainTagsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135386718645568239L;

	/**
	 * 场景类型
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

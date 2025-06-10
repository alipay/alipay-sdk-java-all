package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热门问题查询
 *
 * @author auto create
 * @since 1.0, 2024-08-15 14:18:29
 */
public class AlipayIserviceCcmRobotHotquestionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2756319532432534594L;

	/**
	 * 聊天窗code
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

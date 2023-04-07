package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 敏感字段申请，场景查询结果
 *
 * @author auto create
 * @since 1.0, 2020-10-28 16:03:14
 */
public class AuthFieldSceneDTO extends AlipayObject {

	private static final long serialVersionUID = 4481169926331584157L;

	/**
	 * 场景CODE
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景code描述
	 */
	@ApiField("scene_desc")
	private String sceneDesc;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneDesc() {
		return this.sceneDesc;
	}
	public void setSceneDesc(String sceneDesc) {
		this.sceneDesc = sceneDesc;
	}

}

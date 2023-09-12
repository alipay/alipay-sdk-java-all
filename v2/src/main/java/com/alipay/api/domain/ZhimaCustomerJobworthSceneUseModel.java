package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证外部渠道应用数据回流
 *
 * @author auto create
 * @since 1.0, 2021-06-25 17:12:12
 */
public class ZhimaCustomerJobworthSceneUseModel extends AlipayObject {

	private static final long serialVersionUID = 6137458989836724711L;

	/**
	 * 针对不同的场景类型，使用不同的字段
	 */
	@ApiField("extra_info")
	private SceneInfo extraInfo;

	/**
	 * 候选人列表
	 */
	@ApiField("scene_type")
	private String sceneType;

	public SceneInfo getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(SceneInfo extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}

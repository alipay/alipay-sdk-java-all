package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区标签
 *
 * @author auto create
 * @since 1.0, 2018-12-18 10:49:03
 */
public class AntfortuneContentCommunityLabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2384142715855148585L;

	/**
	 * 标签场景
	 */
	@ApiField("label_scene")
	private String labelScene;

	public String getLabelScene() {
		return this.labelScene;
	}
	public void setLabelScene(String labelScene) {
		this.labelScene = labelScene;
	}

}

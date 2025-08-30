package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class OutPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 1885289115817215771L;

	/**
	 * 标记外部访问来源，biqiang、1688
	 */
	@ApiField("out_scene")
	private String outScene;

	public String getOutScene() {
		return this.outScene;
	}
	public void setOutScene(String outScene) {
		this.outScene = outScene;
	}

}

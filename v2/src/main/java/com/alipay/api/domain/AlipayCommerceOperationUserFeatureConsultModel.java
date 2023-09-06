package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义场景用户特征咨询
 *
 * @author auto create
 * @since 1.0, 2023-07-28 11:24:13
 */
public class AlipayCommerceOperationUserFeatureConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3398231618373445491L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

}

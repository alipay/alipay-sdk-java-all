package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:59
 */
public class RentDeductInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3218581369181783583L;

	/**
	 * 代扣签约场景
	 */
	@ApiField("sign_scene")
	private String signScene;

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

}

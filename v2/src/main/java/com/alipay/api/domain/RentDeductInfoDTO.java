package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2025-06-06 17:52:47
 */
public class RentDeductInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6764968831381324371L;

	/**
	 * 代扣签约场景。租赁代扣固定传入RENT_DEDUCT
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

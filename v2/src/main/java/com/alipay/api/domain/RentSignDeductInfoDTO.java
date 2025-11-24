package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2025-07-30 10:44:03
 */
public class RentSignDeductInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7333946577591447867L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV金额试算
 *
 * @author auto create
 * @since 1.0, 2023-05-11 14:02:12
 */
public class AlipayOverseasOpenIndramountPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 1271229712153713313L;

	/**
	 * 原金额
	 */
	@ApiField("original_amount")
	private IndrMoneyDTO originalAmount;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public IndrMoneyDTO getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(IndrMoneyDTO originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}

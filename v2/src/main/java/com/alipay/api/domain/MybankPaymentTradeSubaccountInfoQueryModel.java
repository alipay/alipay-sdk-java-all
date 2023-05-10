package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账号信息查询
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:06:18
 */
public class MybankPaymentTradeSubaccountInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1889568567547294372L;

	/**
	 * 场景码，和开子户保持一致
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 子户外标
	 */
	@ApiField("sub_card_no")
	private String subCardNo;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSubCardNo() {
		return this.subCardNo;
	}
	public void setSubCardNo(String subCardNo) {
		this.subCardNo = subCardNo;
	}

}

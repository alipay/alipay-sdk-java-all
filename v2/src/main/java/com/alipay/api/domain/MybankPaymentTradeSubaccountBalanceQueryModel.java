package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账户余额查询
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:05:14
 */
public class MybankPaymentTradeSubaccountBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7183334842376838133L;

	/**
	 * 场景码，和开通子户时保持一致
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

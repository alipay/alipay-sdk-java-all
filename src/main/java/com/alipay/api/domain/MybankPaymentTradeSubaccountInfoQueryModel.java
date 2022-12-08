package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账号信息查询
 *
 * @author auto create
 * @since 1.0, 2021-09-09 16:13:12
 */
public class MybankPaymentTradeSubaccountInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4216636433144697438L;

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

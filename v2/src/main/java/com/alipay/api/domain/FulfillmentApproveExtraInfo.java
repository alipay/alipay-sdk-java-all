package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约订单商家审核通过扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-04-03 10:58:29
 */
public class FulfillmentApproveExtraInfo extends AlipayObject {

	private static final long serialVersionUID = 6447243456531161238L;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

}

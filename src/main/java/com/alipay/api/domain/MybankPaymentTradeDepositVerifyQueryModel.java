package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款验证查询
 *
 * @author auto create
 * @since 1.0, 2020-08-17 11:36:52
 */
public class MybankPaymentTradeDepositVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3382778196923172498L;

	/**
	 * 打款验证ID 打款验证受理后生成的一个唯一标识
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}

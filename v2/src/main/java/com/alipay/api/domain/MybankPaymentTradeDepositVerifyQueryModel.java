package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款验证查询
 *
 * @author auto create
 * @since 1.0, 2021-02-25 16:31:32
 */
public class MybankPaymentTradeDepositVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5855851748594221148L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件存证查询
 *
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class AlipaySecurityProdAltechlegalDepositQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7416532995575987545L;

	/**
	 * 存证接口返回到存证编号
	 */
	@ApiField("deposit_no")
	private String depositNo;

	public String getDepositNo() {
		return this.depositNo;
	}
	public void setDepositNo(String depositNo) {
		this.depositNo = depositNo;
	}

}

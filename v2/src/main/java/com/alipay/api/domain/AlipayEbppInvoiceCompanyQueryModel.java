package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业税务信息
 *
 * @author auto create
 * @since 1.0, 2020-04-13 09:53:46
 */
public class AlipayEbppInvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2287867539264984589L;

	/**
	 * 纳税人识别号。register_id与payee_register_no不能同时为空
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 入驻工单ID. register_id与payee_register_no不能同时为空
	 */
	@ApiField("register_id")
	private String registerId;

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas账户创建
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4184121754115971554L;

	/**
	 * 二级商户名称；相同外部商户号幂等重试时必须与首次一致
	 */
	@ApiField("out_merchant_name")
	private String outMerchantName;

	/**
	 * 外部平台为二级商户分配的唯一编码；同一商户 PID 下不可重复
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public String getOutMerchantName() {
		return this.outMerchantName;
	}
	public void setOutMerchantName(String outMerchantName) {
		this.outMerchantName = outMerchantName;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas账户创建
 *
 * @author auto create
 * @since 1.0, 2026-08-25 21:17:52
 */
public class AlipayTradeSaasAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1135743612746936617L;

	/**
	 * 企业登记注册号；首次创建银行转账账户且未命中企业信息校验豁免时必填，中国大陆企业填写统一社会信用代码
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

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

	public String getEnterpriseRegistrationNo() {
		return this.enterpriseRegistrationNo;
	}
	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}

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

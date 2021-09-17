package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-08-26 16:46:10
 */
public class AlipayInsUnderwritePolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1448425252629388925L;

	/**
	 * 商户生成的外部投保业务号;当保单凭证号不传时则必传.
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单凭证号;商户生成的外部投保业务号不传时则必传.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品编码;当保单凭证号不传时则必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}

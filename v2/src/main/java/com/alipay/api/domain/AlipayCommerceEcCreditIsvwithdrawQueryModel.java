package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业的请款结果查询
 *
 * @author auto create
 * @since 1.0, 2024-10-16 13:31:58
 */
public class AlipayCommerceEcCreditIsvwithdrawQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4536634573471451222L;

	/**
	 * 请款时传入的支付宝支付流水号
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 企业码内部自动生成企业唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业的请款申请
 *
 * @author auto create
 * @since 1.0, 2024-10-16 13:31:36
 */
public class AlipayCommerceEcCreditIsvwithdrawApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4596178736465185691L;

	/**
	 * 支付宝支付流水号，请款必须与真实的支付宝交易对应
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 请款金额，单位元，精度分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业码内部自动生成企业唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 商户冻结单号
	 */
	@ApiField("out_freeze_no")
	private String outFreezeNo;

	/**
	 * 平台服务费金额， 单位为元，精确到小数点后两位
	 */
	@ApiField("service_fee")
	private String serviceFee;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutFreezeNo() {
		return this.outFreezeNo;
	}
	public void setOutFreezeNo(String outFreezeNo) {
		this.outFreezeNo = outFreezeNo;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

}

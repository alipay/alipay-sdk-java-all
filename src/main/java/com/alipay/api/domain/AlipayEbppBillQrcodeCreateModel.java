package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预创建待受理单据
 *
 * @author auto create
 * @since 1.0, 2017-08-04 22:00:19
 */
public class AlipayEbppBillQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6148136854826485619L;

	/**
	 * 户号（缴税业务：纳税人识别号，对于三证合一的企业来说，采用社会信用代码；对于个人来说，采用身份证号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称，TAX-缴税
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构代码（缴税业务：指征收机关英文代码，例如南京玄武国税（NJXWGS））
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 扩展字段（缴税业务：taxpayerName -纳税人名称，taxOrgCode - 征收机关代码）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构账单ID（缴税业务：用外部申报号）
	 */
	@ApiField("inst_bill_no")
	private String instBillNo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额（包含滞纳金），单位：元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 二维码的过期时间，以秒为单位，默认10分钟。
	 */
	@ApiField("qr_code_expiration")
	private Long qrCodeExpiration;

	/**
	 * 子业务类型英文名称，ELECTRIC-电费，WATER-水费，GAS-燃气费，TAX-缴税
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstBillNo() {
		return this.instBillNo;
	}
	public void setInstBillNo(String instBillNo) {
		this.instBillNo = instBillNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Long getQrCodeExpiration() {
		return this.qrCodeExpiration;
	}
	public void setQrCodeExpiration(Long qrCodeExpiration) {
		this.qrCodeExpiration = qrCodeExpiration;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当成付扣款接口
 *
 * @author auto create
 * @since 1.0, 2022-12-15 16:57:28
 */
public class AlipayEbppFacepayBillPayModel extends AlipayObject {

	private static final long serialVersionUID = 6781759246162719813L;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号（缴税业务：纳税人识别号，对于三证合一的企业来说，采用社会信用代码；对于个人来说，采用身份证号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称，JF-缴费、TAX-缴税
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构代码（缴税业务：指征收机关英文代码，例如南京玄武国税（NJXWGS））
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 扩展字段（缴税业务：taxpayerName -纳税人名称，taxOrgCode - 征收机关代码；缴费业务如需支付宝销账：billCacheKey -欠费单缓存Key，billUniqId - 欠费单唯一ID）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额，单位：元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 机构账单ID（缴税业务：用外部申报号）
	 */
	@ApiField("inst_no")
	private String instNo;

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
	 * 商户partnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 子业务类型英文名称，ELECTRIC-电费，WATER-水费，GAS-燃气费，TAX-缴税
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户支付宝付款码
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

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

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getInstNo() {
		return this.instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserIdentityCode() {
		return this.userIdentityCode;
	}
	public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}

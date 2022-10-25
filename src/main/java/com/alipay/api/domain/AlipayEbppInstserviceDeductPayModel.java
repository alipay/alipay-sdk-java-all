package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣
 *
 * @author auto create
 * @since 1.0, 2022-03-07 14:50:50
 */
public class AlipayEbppInstserviceDeductPayModel extends AlipayObject {

	private static final long serialVersionUID = 6762394218676586119L;

	/**
	 * 支付宝代扣协议Id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 帐期，示例值代表2020年8月份
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 在充值场景为手机号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 代扣类型
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 分配机构的唯一ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 商户外部业务流水号（用做幂等字段）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扣款金额，支付总金额，包含滞纳金，单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户PartnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

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

	public String getEdeductProductCode() {
		return this.edeductProductCode;
	}
	public void setEdeductProductCode(String edeductProductCode) {
		this.edeductProductCode = edeductProductCode;
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

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

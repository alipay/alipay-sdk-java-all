package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单提交
 *
 * @author auto create
 * @since 1.0, 2025-01-03 10:12:55
 */
public class AnttechBlockchainFinanceTvpBillSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8876448927617239121L;

	/**
	 * 账单实际支付金额，单位元
original_total_amount + adjust_amount = actual_total_amount
	 */
	@ApiField("actual_total_amount")
	private String actualTotalAmount;

	/**
	 * 账单调整金额，单位元。减免金额输入负数，增加金额输入正数
original_total_amount + adjust_amount = actual_total_amount
	 */
	@ApiField("adjusted_amount")
	private String adjustedAmount;

	/**
	 * 账单业务信息。
	 */
	@ApiField("bill_biz_info")
	private String billBizInfo;

	/**
	 * 账单名称
	 */
	@ApiField("bill_name")
	private String billName;

	/**
	 * 账单产出时间
	 */
	@ApiField("billing_date")
	private Date billingDate;

	/**
	 * 账单核算截止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 账单初始总金额，单位元
	 */
	@ApiField("original_total_amount")
	private String originalTotalAmount;

	/**
	 * 外部账单id，商户唯一
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 收款方主体
	 */
	@ApiField("payee_entity")
	private TrustEntityInfo payeeEntity;

	/**
	 * 付款方主体
	 */
	@ApiField("payer_entity")
	private TrustEntityInfo payerEntity;

	/**
	 * 可信价值中心产品码，接入时由对应业务同学提供
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 账单核算起始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 账单类型
	 */
	@ApiField("type")
	private String type;

	public String getActualTotalAmount() {
		return this.actualTotalAmount;
	}
	public void setActualTotalAmount(String actualTotalAmount) {
		this.actualTotalAmount = actualTotalAmount;
	}

	public String getAdjustedAmount() {
		return this.adjustedAmount;
	}
	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}

	public String getBillBizInfo() {
		return this.billBizInfo;
	}
	public void setBillBizInfo(String billBizInfo) {
		this.billBizInfo = billBizInfo;
	}

	public String getBillName() {
		return this.billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}

	public Date getBillingDate() {
		return this.billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOriginalTotalAmount() {
		return this.originalTotalAmount;
	}
	public void setOriginalTotalAmount(String originalTotalAmount) {
		this.originalTotalAmount = originalTotalAmount;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public TrustEntityInfo getPayeeEntity() {
		return this.payeeEntity;
	}
	public void setPayeeEntity(TrustEntityInfo payeeEntity) {
		this.payeeEntity = payeeEntity;
	}

	public TrustEntityInfo getPayerEntity() {
		return this.payerEntity;
	}
	public void setPayerEntity(TrustEntityInfo payerEntity) {
		this.payerEntity = payerEntity;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

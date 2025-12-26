package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单撤销
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:55:04
 */
public class AnttechBlockchainFinanceTvpBillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4867228943517284683L;

	/**
	 * 可信账单ID
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 外部账单Id
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 可信账单产品实例
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 账单撤销备注
	 */
	@ApiField("remark")
	private String remark;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}

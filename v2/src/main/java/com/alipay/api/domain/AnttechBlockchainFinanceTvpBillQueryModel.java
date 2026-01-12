package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单明细查询
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:54:32
 */
public class AnttechBlockchainFinanceTvpBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4192199476357862135L;

	/**
	 * 账单id，数科唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 外部账单id，商户唯一
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 账单管理产品实例ID
	 */
	@ApiField("product_code")
	private String productCode;

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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款账单查询
 *
 * @author auto create
 * @since 1.0, 2020-10-09 10:43:20
 */
public class AlipayTradeRepaybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1252234864521486361L;

	/**
	 * 支付宝账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单产品类型，标识业务用，具体值支付宝根据业务接入场景进行分配。
	 */
	@ApiField("bill_product")
	private String billProduct;

	/**
	 * 外部账单号
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 账单归属主体，蚂蚁统一会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillProduct() {
		return this.billProduct;
	}
	public void setBillProduct(String billProduct) {
		this.billProduct = billProduct;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

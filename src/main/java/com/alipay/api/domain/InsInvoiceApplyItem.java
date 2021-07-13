package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发票申请项目明细
 *
 * @author auto create
 * @since 1.0, 2017-03-30 11:59:29
 */
public class InsInvoiceApplyItem extends AlipayObject {

	private static final long serialVersionUID = 8887487526593179573L;

	/**
	 * 申请发票开票维度;BUSINESS_ORDER:业务单;
	 */
	@ApiField("apply_scope")
	private String applyScope;

	/**
	 * 费用类型;PREMIUM:保费;
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 业务单号;apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_no")
	private String insBizNo;

	/**
	 * 业务单类型;APPLICATION:投保订单;POLICY:保单;ENDORSEMENT:批单;RECOVERY;追偿单.
apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_type")
	private String insBizType;

	public String getApplyScope() {
		return this.applyScope;
	}
	public void setApplyScope(String applyScope) {
		this.applyScope = applyScope;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getInsBizNo() {
		return this.insBizNo;
	}
	public void setInsBizNo(String insBizNo) {
		this.insBizNo = insBizNo;
	}

	public String getInsBizType() {
		return this.insBizType;
	}
	public void setInsBizType(String insBizType) {
		this.insBizType = insBizType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请核销的左右手明细单据
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:21:57
 */
public class WriteOffLeftRightDetailOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 3399243339833915675L;

	/**
	 * 机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 申请核销方PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 左手方核销金额
	 */
	@ApiField("left_apply_write_off_amt")
	private MultiCurrencyMoneyOpenApi leftApplyWriteOffAmt;

	/**
	 * 左手方传入单据号
	 */
	@ApiField("left_bill_no")
	private String leftBillNo;

	/**
	 * 左手方单据类型
["DELAYED_SETTLE_ORDER","REAL_SETTLE_ORDER","ADVANCE_SETTLE_ORDER"]
	 */
	@ApiField("left_write_off_bill_type")
	private String leftWriteOffBillType;

	/**
	 * 右手方申请核销金额
	 */
	@ApiField("right_apply_write_off_amt")
	private MultiCurrencyMoneyOpenApi rightApplyWriteOffAmt;

	/**
	 * 右手方单据号
	 */
	@ApiField("right_bill_no")
	private String rightBillNo;

	/**
	 * 右手方单据类型
COLLECT_RECEIPT
	 */
	@ApiField("right_write_off_bill_type")
	private String rightWriteOffBillType;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public MultiCurrencyMoneyOpenApi getLeftApplyWriteOffAmt() {
		return this.leftApplyWriteOffAmt;
	}
	public void setLeftApplyWriteOffAmt(MultiCurrencyMoneyOpenApi leftApplyWriteOffAmt) {
		this.leftApplyWriteOffAmt = leftApplyWriteOffAmt;
	}

	public String getLeftBillNo() {
		return this.leftBillNo;
	}
	public void setLeftBillNo(String leftBillNo) {
		this.leftBillNo = leftBillNo;
	}

	public String getLeftWriteOffBillType() {
		return this.leftWriteOffBillType;
	}
	public void setLeftWriteOffBillType(String leftWriteOffBillType) {
		this.leftWriteOffBillType = leftWriteOffBillType;
	}

	public MultiCurrencyMoneyOpenApi getRightApplyWriteOffAmt() {
		return this.rightApplyWriteOffAmt;
	}
	public void setRightApplyWriteOffAmt(MultiCurrencyMoneyOpenApi rightApplyWriteOffAmt) {
		this.rightApplyWriteOffAmt = rightApplyWriteOffAmt;
	}

	public String getRightBillNo() {
		return this.rightBillNo;
	}
	public void setRightBillNo(String rightBillNo) {
		this.rightBillNo = rightBillNo;
	}

	public String getRightWriteOffBillType() {
		return this.rightWriteOffBillType;
	}
	public void setRightWriteOffBillType(String rightWriteOffBillType) {
		this.rightWriteOffBillType = rightWriteOffBillType;
	}

}

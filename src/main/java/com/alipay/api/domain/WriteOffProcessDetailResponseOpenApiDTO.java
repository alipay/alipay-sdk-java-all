package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销明细结果返回DTO
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:22:09
 */
public class WriteOffProcessDetailResponseOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 6414123696769932851L;

	/**
	 * 真正核销单据对应的单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 核销对象PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 与之核销的对方单据号
	 */
	@ApiField("opposite_bill_no")
	private String oppositeBillNo;

	/**
	 * 与申请核销的单据匹配对应的单据类型
COLLECT_RECEIPT("COLLECT_RECEIPT"),
SETTLE_ORDER("SETTLE_ORDER"),
	 */
	@ApiField("opposite_writeoffable_bill_type")
	private String oppositeWriteoffableBillType;

	/**
	 * 核销金额
	 */
	@ApiField("writeoff_amt")
	private MultiCurrencyMoneyOpenApi writeoffAmt;

	/**
	 * 核销单据的类型
COLLECT_RECEIPT("COLLECT_RECEIPT"),
SETTLE_ORDER("SETTLE_ORDER"),
	 */
	@ApiField("writeoffable_bill_type")
	private String writeoffableBillType;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOppositeBillNo() {
		return this.oppositeBillNo;
	}
	public void setOppositeBillNo(String oppositeBillNo) {
		this.oppositeBillNo = oppositeBillNo;
	}

	public String getOppositeWriteoffableBillType() {
		return this.oppositeWriteoffableBillType;
	}
	public void setOppositeWriteoffableBillType(String oppositeWriteoffableBillType) {
		this.oppositeWriteoffableBillType = oppositeWriteoffableBillType;
	}

	public MultiCurrencyMoneyOpenApi getWriteoffAmt() {
		return this.writeoffAmt;
	}
	public void setWriteoffAmt(MultiCurrencyMoneyOpenApi writeoffAmt) {
		this.writeoffAmt = writeoffAmt;
	}

	public String getWriteoffableBillType() {
		return this.writeoffableBillType;
	}
	public void setWriteoffableBillType(String writeoffableBillType) {
		this.writeoffableBillType = writeoffableBillType;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单明细信息，可以同步多笔账单，json数组
 *
 * @author auto create
 * @since 1.0, 2017-11-08 10:54:24
 */
public class AlipayEcoRenthouseBill extends AlipayObject {

	private static final long serialVersionUID = 1597948354761251799L;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单创建时间
数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("bill_create_time")
	private Date billCreateTime;

	/**
	 * 对描述该笔账单进行具体描述，用于提醒用户。例如：八月房屋租金、八月杂费等。
	 */
	@ApiField("bill_desc")
	private String billDesc;

	/**
	 * 账单编号-ka保证唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单状态
0:正常1:作废2:关闭
	 */
	@ApiField("bill_status")
	private Long billStatus;

	/**
	 * 账单类型
10001:房屋租金
10002:其他费用
20001:房屋押金
20002:其他押金
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("deadline_date")
	private String deadlineDate;

	/**
	 * 定金抵扣金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 结束时间
数据格式：yyyy-mm-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 租约编号(KA内部租约业务编号)
	 */
	@ApiField("lease_no")
	private String leaseNo;

	/**
	 * 其他未涵盖信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 最低支付金额
	 */
	@ApiField("min_pay_amount")
	private String minPayAmount;

	/**
	 * 已支付金额
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * 1:禁止tp发起支付
	 */
	@ApiField("pay_lock")
	private Long payLock;

	/**
	 * 禁止支付原因-页面提示租客
	 */
	@ApiField("pay_lock_memo")
	private String payLockMemo;

	/**
	 * 支付状态
0:未支付1:已支付
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 账单支付时间
数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 开始时间
数据格式：yyyy-mm-dd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public Date getBillCreateTime() {
		return this.billCreateTime;
	}
	public void setBillCreateTime(Date billCreateTime) {
		this.billCreateTime = billCreateTime;
	}

	public String getBillDesc() {
		return this.billDesc;
	}
	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Long getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(Long billStatus) {
		this.billStatus = billStatus;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getDeadlineDate() {
		return this.deadlineDate;
	}
	public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLeaseNo() {
		return this.leaseNo;
	}
	public void setLeaseNo(String leaseNo) {
		this.leaseNo = leaseNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMinPayAmount() {
		return this.minPayAmount;
	}
	public void setMinPayAmount(String minPayAmount) {
		this.minPayAmount = minPayAmount;
	}

	public String getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Long getPayLock() {
		return this.payLock;
	}
	public void setPayLock(Long payLock) {
		this.payLock = payLock;
	}

	public String getPayLockMemo() {
		return this.payLockMemo;
	}
	public void setPayLockMemo(String payLockMemo) {
		this.payLockMemo = payLockMemo;
	}

	public Long getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}

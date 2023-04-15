package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出的机构账单模型
 *
 * @author auto create
 * @since 1.0, 2017-07-19 12:08:56
 */
public class JfExportInstBillModel extends AlipayObject {

	private static final long serialVersionUID = 5592458995347323283L;

	/**
	 * 账单金额，单位为：RMB元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额，单位为：RMB元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 滞纳金，单位为：RMB元。
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构流水号
	 */
	@ApiField("inst_bill_no")
	private String instBillNo;

	/**
	 * 账单拥有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 唯一标识，每次查询均保证唯一性，但是不保证幂等性
	 */
	@ApiField("uniq_id")
	private String uniqId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillFines() {
		return this.billFines;
	}
	public void setBillFines(String billFines) {
		this.billFines = billFines;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstBillNo() {
		return this.instBillNo;
	}
	public void setInstBillNo(String instBillNo) {
		this.instBillNo = instBillNo;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getUniqId() {
		return this.uniqId;
	}
	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}

}

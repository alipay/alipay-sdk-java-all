package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 实时查询欠费单返回对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class QueryInstBillInfo extends AlipayObject {

	private static final long serialVersionUID = 8696882397667426447L;

	/**
	 * 账单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账单日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 明细说明
	 */
	@ApiListField("bill_detail")
	@ApiField("query_inst_bill_detail")
	private List<QueryInstBillDetail> billDetail;

	/**
	 * 滞纳金
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 账单流水
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 户名
	 */
	@ApiField("bill_user_name")
	private String billUserName;

	/**
	 * JDBXINHUI
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 查询欠费单的惟一标识
	 */
	@ApiField("charge_uniq_id")
	private String chargeUniqId;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构给出账机构分配的ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 扩展属性
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 业务类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 错误信息
	 */
	@ApiField("return_message")
	private String returnMessage;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

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

	public List<QueryInstBillDetail> getBillDetail() {
		return this.billDetail;
	}
	public void setBillDetail(List<QueryInstBillDetail> billDetail) {
		this.billDetail = billDetail;
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

	public String getBillUserName() {
		return this.billUserName;
	}
	public void setBillUserName(String billUserName) {
		this.billUserName = billUserName;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeUniqId() {
		return this.chargeUniqId;
	}
	public void setChargeUniqId(String chargeUniqId) {
		this.chargeUniqId = chargeUniqId;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getReturnMessage() {
		return this.returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getSubOrderType() {
		return this.subOrderType;
	}
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

}

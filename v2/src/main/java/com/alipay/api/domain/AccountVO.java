package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 银行账号信息
 *
 * @author auto create
 * @since 1.0, 2023-09-06 16:13:49
 */
public class AccountVO extends AlipayObject {

	private static final long serialVersionUID = 3119445416646893147L;

	/**
	 * 户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 金额明细
	 */
	@ApiField("amount_item")
	private AmountItem amountItem;

	/**
	 * 分类 BUYER付款账户； SELLER收款账户
	 */
	@ApiField("category")
	private String category;

	/**
	 * 上次支付失败
	 */
	@ApiField("last_pay_fail")
	private String lastPayFail;

	/**
	 * 开户网点
	 */
	@ApiField("offical_name")
	private String officalName;

	/**
	 * 联行号
	 */
	@ApiField("offical_number")
	private String officalNumber;

	/**
	 * BALANCE 账户余额； BILL 电子票据
	 */
	@ApiListField("pay_method")
	@ApiField("string")
	private List<String> payMethod;

	/**
	 * 主体：I-个人；E-企业
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 账号状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 账户类型 MAIN 银行账户；ECOLLECTION e收宝； Q_PAYEE 通用静默户
	 */
	@ApiField("type")
	private String type;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public AmountItem getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(AmountItem amountItem) {
		this.amountItem = amountItem;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getLastPayFail() {
		return this.lastPayFail;
	}
	public void setLastPayFail(String lastPayFail) {
		this.lastPayFail = lastPayFail;
	}

	public String getOfficalName() {
		return this.officalName;
	}
	public void setOfficalName(String officalName) {
		this.officalName = officalName;
	}

	public String getOfficalNumber() {
		return this.officalNumber;
	}
	public void setOfficalNumber(String officalNumber) {
		this.officalNumber = officalNumber;
	}

	public List<String> getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(List<String> payMethod) {
		this.payMethod = payMethod;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

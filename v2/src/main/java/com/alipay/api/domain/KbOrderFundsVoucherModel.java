package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单资金凭证列表
 *
 * @author auto create
 * @since 1.0, 2017-09-27 10:58:29
 */
public class KbOrderFundsVoucherModel extends AlipayObject {

	private static final long serialVersionUID = 1758325143854299365L;

	/**
	 * 资金流入账户,打款动作存在该字段
	 */
	@ApiField("account")
	private String account;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金凭证ID
	 */
	@ApiField("funds_voucher_no")
	private String fundsVoucherNo;

	/**
	 * 资金流转发生时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 门店ID，打款动作存在该字段
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 资金流入外部门店ID，打款时存在该字段
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 资金类型  PAY/SETTLE/REFUND 对应 支付／打款／退款
	 */
	@ApiField("trans_type")
	private String transType;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundsVoucherNo() {
		return this.fundsVoucherNo;
	}
	public void setFundsVoucherNo(String fundsVoucherNo) {
		this.fundsVoucherNo = fundsVoucherNo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}

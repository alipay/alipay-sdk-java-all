package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单提醒用户信息
 *
 * @author auto create
 * @since 1.0, 2024-11-19 11:11:30
 */
public class BillNotifyInfo extends AlipayObject {

	private static final long serialVersionUID = 7159326445522573721L;

	/**
	 * 脱敏地址，按照国网40号文：保留省、市、区县及门牌号最后5位信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 账单金额，以元为单位，精确到小数点后2位
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账期或者出账时间
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 01:高压
02:低压非居民
03:低压居民
	 */
	@ApiField("billkey_type")
	private String billkeyType;

	/**
	 * uid和户号通过SM3加密后的后8位
	 */
	@ApiField("cipher_billkey")
	private String cipherBillkey;

	/**
	 * 余额提醒阈值，以元为单位，精确到小数点后2位
	 */
	@ApiField("notify_threshold_amount")
	private String notifyThresholdAmount;

	/**
	 * 用户id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillkeyType() {
		return this.billkeyType;
	}
	public void setBillkeyType(String billkeyType) {
		this.billkeyType = billkeyType;
	}

	public String getCipherBillkey() {
		return this.cipherBillkey;
	}
	public void setCipherBillkey(String cipherBillkey) {
		this.cipherBillkey = cipherBillkey;
	}

	public String getNotifyThresholdAmount() {
		return this.notifyThresholdAmount;
	}
	public void setNotifyThresholdAmount(String notifyThresholdAmount) {
		this.notifyThresholdAmount = notifyThresholdAmount;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}

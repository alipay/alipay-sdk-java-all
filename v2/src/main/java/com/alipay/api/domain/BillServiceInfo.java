package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单服务提醒用户信息
 *
 * @author auto create
 * @since 1.0, 2024-11-19 11:11:56
 */
public class BillServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 1554989731782547742L;

	/**
	 * 脱敏地址，按照国网40号文：保留省、市、区县及门牌号最后5位信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 01:高压
02:低压非居民
03:低压居民
	 */
	@ApiField("billkey_type")
	private String billkeyType;

	/**
	 * 用户id和户号经过SM3加密后的后8位
	 */
	@ApiField("cipher_billkey")
	private String cipherBillkey;

	/**
	 * 阶梯用电档位
	 */
	@ApiField("current_ladder")
	private String currentLadder;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

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

	public String getCurrentLadder() {
		return this.currentLadder;
	}
	public void setCurrentLadder(String currentLadder) {
		this.currentLadder = currentLadder;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}

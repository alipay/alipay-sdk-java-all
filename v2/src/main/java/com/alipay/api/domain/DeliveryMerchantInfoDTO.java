package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约商家信息
 *
 * @author auto create
 * @since 1.0, 2025-04-03 19:49:54
 */
public class DeliveryMerchantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2612936773477938634L;

	/**
	 * 代扣出账号，本参数为代扣的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("deduct_out")
	private String deductOut;

	/**
	 * 代扣出账号的账户类型,balance为钱包类型
	 */
	@ApiField("deduct_out_type")
	private String deductOutType;

	/**
	 * 具体是由哪个商家履约的
	 */
	@ApiField("mrchant_pid")
	private String mrchantPid;

	public String getDeductOut() {
		return this.deductOut;
	}
	public void setDeductOut(String deductOut) {
		this.deductOut = deductOut;
	}

	public String getDeductOutType() {
		return this.deductOutType;
	}
	public void setDeductOutType(String deductOutType) {
		this.deductOutType = deductOutType;
	}

	public String getMrchantPid() {
		return this.mrchantPid;
	}
	public void setMrchantPid(String mrchantPid) {
		this.mrchantPid = mrchantPid;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约商家信息
 *
 * @author auto create
 * @since 1.0, 2025-08-26 10:51:43
 */
public class DeliveryMerchantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2739561143681293966L;

	/**
	 * 代扣出账号，如果是余额代扣类型则本参数为代扣的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字。
	 */
	@ApiField("deduct_out")
	private String deductOut;

	/**
	 * 代扣出账号的账户类型,balance为钱包类型
	 */
	@ApiField("deduct_out_type")
	private String deductOutType;

	/**
	 * 二级回收商PID信息
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 具体履约商家的PID 当前字段已废弃(更换字段名称，换为merchant_pid)
	 */
	@ApiField("mrchant_pid")
	@Deprecated
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

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMrchantPid() {
		return this.mrchantPid;
	}
	public void setMrchantPid(String mrchantPid) {
		this.mrchantPid = mrchantPid;
	}

}

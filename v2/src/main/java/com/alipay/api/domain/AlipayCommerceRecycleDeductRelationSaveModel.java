package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级回收商代扣关系维护
 *
 * @author auto create
 * @since 1.0, 2025-06-20 18:04:52
 */
public class AlipayCommerceRecycleDeductRelationSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2785146561898397448L;

	/**
	 * 绑定的收款钱包信息Id 场景钱包:钱包id，余额：userId
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/**
	 * 代扣关系支付类型
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	/**
	 * 代扣关系绑定类型
	 */
	@ApiField("handle_type")
	private String handleType;

	/**
	 * 二级商户openid
	 */
	@ApiField("second_merchant_open_id")
	private String secondMerchantOpenId;

	/**
	 * 二级商户pid
	 */
	@ApiField("second_merchant_pid")
	private String secondMerchantPid;

	public String getBindWalletId() {
		return this.bindWalletId;
	}
	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

	public String getHandleType() {
		return this.handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getSecondMerchantOpenId() {
		return this.secondMerchantOpenId;
	}
	public void setSecondMerchantOpenId(String secondMerchantOpenId) {
		this.secondMerchantOpenId = secondMerchantOpenId;
	}

	public String getSecondMerchantPid() {
		return this.secondMerchantPid;
	}
	public void setSecondMerchantPid(String secondMerchantPid) {
		this.secondMerchantPid = secondMerchantPid;
	}

}

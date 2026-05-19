package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币福利钱包余额查询
 *
 * @author auto create
 * @since 1.0, 2026-04-22 16:41:18
 */
public class MybankEcnyWelfarewalletBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3543274122986435143L;

	/**
	 * 固定为STKJ，商通科技简称
	 */
	@ApiField("partner_abbr_name")
	private String partnerAbbrName;

	/**
	 * 合作机构的2088编码，识别商通身份
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 福利子钱包编号
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getPartnerAbbrName() {
		return this.partnerAbbrName;
	}
	public void setPartnerAbbrName(String partnerAbbrName) {
		this.partnerAbbrName = partnerAbbrName;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}

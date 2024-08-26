package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.source.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:34:51
 */
public class AntMerchantExpandIndirectSourceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299399269175786152L;

	/** 
	 * 间连商户等级。
INDIRECT_LEVEL_M0：M0级;
INDIRECT_LEVEL_M1：M1级;
INDIRECT_LEVEL_M2：M2级;
INDIRECT_LEVEL_M3：M3级；
INDIRECT_LEVEL_M4：M4级；
	 */
	@ApiField("indirect_level")
	private String indirectLevel;

	/** 
	 * 当间连商户为M4等级时，该字段才有值，代表商户认领的支付宝pid
	 */
	@ApiField("merchant_confirm_pid")
	private String merchantConfirmPid;

	public void setIndirectLevel(String indirectLevel) {
		this.indirectLevel = indirectLevel;
	}
	public String getIndirectLevel( ) {
		return this.indirectLevel;
	}

	public void setMerchantConfirmPid(String merchantConfirmPid) {
		this.merchantConfirmPid = merchantConfirmPid;
	}
	public String getMerchantConfirmPid( ) {
		return this.merchantConfirmPid;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑外部券使用接口
 *
 * @author auto create
 * @since 1.0, 2021-07-14 14:00:01
 */
public class AlipayOfflineMarketingVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 8132213168548562695L;

	/**
	 * 约定的扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部活动id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部交易信息
	 */
	@ApiField("external_trade_info")
	private VoucherUserExternalTradeInfo externalTradeInfo;

	/**
	 * 外部券码
	 */
	@ApiField("external_voucher_code")
	private String externalVoucherCode;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public VoucherUserExternalTradeInfo getExternalTradeInfo() {
		return this.externalTradeInfo;
	}
	public void setExternalTradeInfo(VoucherUserExternalTradeInfo externalTradeInfo) {
		this.externalTradeInfo = externalTradeInfo;
	}

	public String getExternalVoucherCode() {
		return this.externalVoucherCode;
	}
	public void setExternalVoucherCode(String externalVoucherCode) {
		this.externalVoucherCode = externalVoucherCode;
	}

}

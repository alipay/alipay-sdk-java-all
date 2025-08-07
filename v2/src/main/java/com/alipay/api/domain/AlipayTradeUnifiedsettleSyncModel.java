package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易订单同步
 *
 * @author auto create
 * @since 1.0, 2025-06-26 16:32:40
 */
public class AlipayTradeUnifiedsettleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6836246557539427662L;

	/**
	 * 收单模式，目前仅支持PLATFORM_BUSINESS
	 */
	@ApiField("acquire_mode")
	private String acquireMode;

	/**
	 * 订单同步金额，biz_type=PAY_SYNC时为支付金额，biz_type=REFUND_SYNC时为退款金额。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private UnifiedSettleExtendParams extendParams;

	/**
	 * 实际外部支付渠道支付或退款发生时间
	 */
	@ApiField("external_inst_biz_date")
	private Date externalInstBizDate;

	/**
	 * 外部收单渠道
	 */
	@ApiField("external_inst_channel")
	private String externalInstChannel;

	/**
	 * 实际外部支付渠道交易创建时间
	 */
	@ApiField("external_inst_create_date")
	private Date externalInstCreateDate;

	/**
	 * 退款流水号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端单笔交易维度不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 签约产品码，目前仅支持UNIFIED_SETTLE
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 同步流水的类型，支付为PAY_SYNC，退款为REFUND_SYNC
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 结算信息， 直付通模式下requestType=PAY_SYNC时必传。
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 二级商户信息。 直付通模式下requestType=PAY_SYNC时必传
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	public String getAcquireMode() {
		return this.acquireMode;
	}
	public void setAcquireMode(String acquireMode) {
		this.acquireMode = acquireMode;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public UnifiedSettleExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(UnifiedSettleExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public Date getExternalInstBizDate() {
		return this.externalInstBizDate;
	}
	public void setExternalInstBizDate(Date externalInstBizDate) {
		this.externalInstBizDate = externalInstBizDate;
	}

	public String getExternalInstChannel() {
		return this.externalInstChannel;
	}
	public void setExternalInstChannel(String externalInstChannel) {
		this.externalInstChannel = externalInstChannel;
	}

	public Date getExternalInstCreateDate() {
		return this.externalInstCreateDate;
	}
	public void setExternalInstCreateDate(Date externalInstCreateDate) {
		this.externalInstCreateDate = externalInstCreateDate;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public SettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(SettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

	public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

}

package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TradePrecreateConfirmIndirectMerchantInfo;
import com.alipay.api.domain.TradePrecreateConfirmTradeMerchantInfo;
import com.alipay.api.domain.TradePrecreateConfirmOrderInfo;
import com.alipay.api.domain.TradePrecreateConfirmPrecreateCodeInfo;
import com.alipay.api.domain.TradePrecreateConfirmTradeStoreInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.precreate.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-13 11:47:30
 */
public class AlipayTradePrecreateConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2317385311179871731L;

	/** 
	 * 收单模式

银行代理收单，取值：bankAgentMode

平台直连收单，取值：

normalOrderMode
	 */
	@ApiField("acquiring_mode")
	private String acquiringMode;

	/** 
	 * 间联商户信息,若商户是间联商户则必选
格式为json
	 */
	@ApiField("indirect_merchant_info")
	private TradePrecreateConfirmIndirectMerchantInfo indirectMerchantInfo;

	/** 
	 * 直连商户信息，当商户为直连商户会有非空的值
格式为json
	 */
	@ApiField("merchant_info")
	private TradePrecreateConfirmTradeMerchantInfo merchantInfo;

	/** 
	 * 商户原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/** 
	 * 订单信息
格式为json
	 */
	@ApiField("order_info")
	private TradePrecreateConfirmOrderInfo orderInfo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 预下单的码信息
格式为json
	 */
	@ApiField("precreate_code_info")
	private TradePrecreateConfirmPrecreateCodeInfo precreateCodeInfo;

	/** 
	 * 清算机构流水号（如网联流水号）
	 */
	@ApiField("settle_serial_no")
	private String settleSerialNo;

	/** 
	 * 店铺信息
格式为json
	 */
	@ApiField("store_info")
	private TradePrecreateConfirmTradeStoreInfo storeInfo;

	/** 
	 * 订单金额
币种：人民币
单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAcquiringMode(String acquiringMode) {
		this.acquiringMode = acquiringMode;
	}
	public String getAcquiringMode( ) {
		return this.acquiringMode;
	}

	public void setIndirectMerchantInfo(TradePrecreateConfirmIndirectMerchantInfo indirectMerchantInfo) {
		this.indirectMerchantInfo = indirectMerchantInfo;
	}
	public TradePrecreateConfirmIndirectMerchantInfo getIndirectMerchantInfo( ) {
		return this.indirectMerchantInfo;
	}

	public void setMerchantInfo(TradePrecreateConfirmTradeMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	public TradePrecreateConfirmTradeMerchantInfo getMerchantInfo( ) {
		return this.merchantInfo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public Date getOrderCreateTime( ) {
		return this.orderCreateTime;
	}

	public void setOrderInfo(TradePrecreateConfirmOrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public TradePrecreateConfirmOrderInfo getOrderInfo( ) {
		return this.orderInfo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPrecreateCodeInfo(TradePrecreateConfirmPrecreateCodeInfo precreateCodeInfo) {
		this.precreateCodeInfo = precreateCodeInfo;
	}
	public TradePrecreateConfirmPrecreateCodeInfo getPrecreateCodeInfo( ) {
		return this.precreateCodeInfo;
	}

	public void setSettleSerialNo(String settleSerialNo) {
		this.settleSerialNo = settleSerialNo;
	}
	public String getSettleSerialNo( ) {
		return this.settleSerialNo;
	}

	public void setStoreInfo(TradePrecreateConfirmTradeStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}
	public TradePrecreateConfirmTradeStoreInfo getStoreInfo( ) {
		return this.storeInfo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}

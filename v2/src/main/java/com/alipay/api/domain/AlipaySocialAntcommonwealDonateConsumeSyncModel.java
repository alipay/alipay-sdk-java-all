package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接收饿了么推送爱心商家的交易订单信息
 *
 * @author auto create
 * @since 1.0, 2022-10-24 15:37:49
 */
public class AlipaySocialAntcommonwealDonateConsumeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5715661693994897542L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展属性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 核算完成时间，如果不填则默认不当前时间
	 */
	@ApiField("gmt_trade_finished")
	private Date gmtTradeFinished;

	/**
	 * 交易发起用户user_id对应的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户Id
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 外部交易账号
	 */
	@ApiField("platform_trade_no")
	private String platformTradeNo;

	/**
	 * 捐赠产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商家uid或协议
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 平台来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 以分为单位，1001即10.01元
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	/**
	 * 交易发起用户
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtTradeFinished() {
		return this.gmtTradeFinished;
	}
	public void setGmtTradeFinished(Date gmtTradeFinished) {
		this.gmtTradeFinished = gmtTradeFinished;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getPlatformTradeNo() {
		return this.platformTradeNo;
	}
	public void setPlatformTradeNo(String platformTradeNo) {
		this.platformTradeNo = platformTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

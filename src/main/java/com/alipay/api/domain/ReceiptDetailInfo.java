package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子小票详情信息
 *
 * @author auto create
 * @since 1.0, 2021-03-31 11:19:01
 */
public class ReceiptDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4781974587693497171L;

	/**
	 * 交易实付金额，单位分
	 */
	@ApiField("actual_pay_amount")
	private Long actualPayAmount;

	/**
	 * 机具身份id
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 用户支付宝uid
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 币种（CNY-人命币）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 取餐号
	 */
	@ApiField("fetch_num")
	private String fetchNum;

	/**
	 * 小票订单产生时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 电子小票id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 电子发票链接
	 */
	@ApiField("invoice_entry")
	private String invoiceEntry;

	/**
	 * 商户logo链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 门店优惠金额，单位分
	 */
	@ApiField("merchant_discount_amount")
	private Long merchantDiscountAmount;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单原价，单位分
	 */
	@ApiField("origin_amount")
	private Long originAmount;

	/**
	 * 外部订单号，小票编号
	 */
	@ApiField("out_trade_id")
	private String outTradeId;

	/**
	 * 平台（tmall）优惠金额，单位分
	 */
	@ApiField("platform_discount_amount")
	private Long platformDiscountAmount;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店联系方式
	 */
	@ApiField("shop_contract")
	private String shopContract;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商户类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 商品详情
	 */
	@ApiListField("skus")
	@ApiField("receipt_sku")
	private List<ReceiptSku> skus;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_id")
	private String tradeId;

	public Long getActualPayAmount() {
		return this.actualPayAmount;
	}
	public void setActualPayAmount(Long actualPayAmount) {
		this.actualPayAmount = actualPayAmount;
	}

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFetchNum() {
		return this.fetchNum;
	}
	public void setFetchNum(String fetchNum) {
		this.fetchNum = fetchNum;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceEntry() {
		return this.invoiceEntry;
	}
	public void setInvoiceEntry(String invoiceEntry) {
		this.invoiceEntry = invoiceEntry;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(Long merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Long getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(Long originAmount) {
		this.originAmount = originAmount;
	}

	public String getOutTradeId() {
		return this.outTradeId;
	}
	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
	}

	public Long getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(Long platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopContract() {
		return this.shopContract;
	}
	public void setShopContract(String shopContract) {
		this.shopContract = shopContract;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public List<ReceiptSku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<ReceiptSku> skus) {
		this.skus = skus;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}

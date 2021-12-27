package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务市场发票服务订购信息
 *
 * @author auto create
 * @since 1.0, 2020-05-21 14:50:34
 */
public class InvoiceOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 5716375253257472947L;

	/**
	 * 商品CODE
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * 商品原价，单位元，最多2位小数
	 */
	@ApiField("article_fee")
	private Long articleFee;

	/**
	 * 服务市场商品ID
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * 商品名称
	 */
	@ApiField("article_name")
	private String articleName;

	/**
	 * 订购时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("buy_date")
	private Date buyDate;

	/**
	 * 服务生效截止时间，格式yyyy-MM-dd HH:mm:ss. 新订购可空。
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 拓展字段
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 实付总金额，单位元，最多2位小数
	 */
	@ApiField("fact_total_fee")
	private Long factTotalFee;

	/**
	 * 税号可开发票类型，列表类型。 可选值： 增值税电子普通发票：PLAIN, 增值税专用发票：SPECIAL， 增值税普通发票：PLAIN_INVOICE，增值税普通发票(卷式)：PAPER_INVOICE
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 商品规格CODE
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品规格ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品规格名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 服务市场订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订购类型，可选值：
新订购：new
续订：renew
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 税控服务商key，服务商入驻中台后生成
	 */
	@ApiField("provider_key")
	private String providerKey;

	/**
	 * 服务生效起始时间，格式yyyy-MM-dd HH:mm:ss. 新订购可空。
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 产品类型，产品码由中台定义。 对应支付宝开票系统中的 productCode, 默认为DOCK_TAX_OPEN 税控托管产品
	 */
	@ApiField("tax_feature")
	private String taxFeature;

	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public Long getArticleFee() {
		return this.articleFee;
	}
	public void setArticleFee(Long articleFee) {
		this.articleFee = articleFee;
	}

	public String getArticleId() {
		return this.articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return this.articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Date getBuyDate() {
		return this.buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public Long getFactTotalFee() {
		return this.factTotalFee;
	}
	public void setFactTotalFee(Long factTotalFee) {
		this.factTotalFee = factTotalFee;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProviderKey() {
		return this.providerKey;
	}
	public void setProviderKey(String providerKey) {
		this.providerKey = providerKey;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTaxFeature() {
		return this.taxFeature;
	}
	public void setTaxFeature(String taxFeature) {
		this.taxFeature = taxFeature;
	}

}

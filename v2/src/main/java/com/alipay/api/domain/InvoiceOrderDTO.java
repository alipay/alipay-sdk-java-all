package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票入驻订单
 *
 * @author auto create
 * @since 1.0, 2020-06-18 20:19:42
 */
public class InvoiceOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 4399484773657767449L;

	/**
	 * 商品code
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * 商品原价，单位元，最多2位小数
	 */
	@ApiField("article_fee")
	private String articleFee;

	/**
	 * 商品ID
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
	 * 拓展字段，json格式
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 实付总金额，单位元，最多2位小数
	 */
	@ApiField("fact_total_fee")
	private String factTotalFee;

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
	 * 订购类型，可选值： 新订购：new， 续费：renew，线下转线上：online
	 */
	@ApiField("order_type")
	private String orderType;

	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleFee() {
		return this.articleFee;
	}
	public void setArticleFee(String articleFee) {
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

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public String getFactTotalFee() {
		return this.factTotalFee;
	}
	public void setFactTotalFee(String factTotalFee) {
		this.factTotalFee = factTotalFee;
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

}

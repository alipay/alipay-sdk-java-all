package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品下单购买
 *
 * @author auto create
 * @since 1.0, 2020-06-04 14:52:46
 */
public class KoubeiTradeItemorderBuyModel extends AlipayObject {

	private static final long serialVersionUID = 3284733756512713445L;

	/**
	 * 业务产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家支付宝ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 购买商品信息
	 */
	@ApiListField("item_order_details")
	@ApiField("item_order_detail")
	private List<ItemOrderDetail> itemOrderDetails;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户传入营销信息，具体值要和口碑约定，格式为json格式
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易，不传默认3m。取值范围:1m～30m(单位:分钟) ，不支持小数。
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，必须等于费用之和
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public List<ItemOrderDetail> getItemOrderDetails() {
		return this.itemOrderDetails;
	}
	public void setItemOrderDetails(List<ItemOrderDetail> itemOrderDetails) {
		this.itemOrderDetails = itemOrderDetails;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimeout() {
		return this.timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

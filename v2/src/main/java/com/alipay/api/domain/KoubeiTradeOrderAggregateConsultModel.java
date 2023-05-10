package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付订单咨询服务
 *
 * @author auto create
 * @since 1.0, 2020-03-24 16:04:09
 */
public class KoubeiTradeOrderAggregateConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2292998739999918539L;

	/**
	 * 订单包含的商品列表信息，json格式。
	 */
	@ApiField("goods_info")
	private KbGoodsInfo goodsInfo;

	/**
	 * 外部订单号,商户下必须保持唯一，控制幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单标题，报送至支付宝或微信
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 支付超时时间，默认3m（即3分钟）。表示该笔订单允许的最晚付款时间，逾期将关闭交易。
取值范围：1m～15d。m-分钟，h-小时，d-天。
注意：该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额； 若不可打折金额等于订单金额，则屏蔽营销
	 */
	@ApiField("un_discount_amount")
	private String unDiscountAmount;

	public KbGoodsInfo getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(KbGoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUnDiscountAmount() {
		return this.unDiscountAmount;
	}
	public void setUnDiscountAmount(String unDiscountAmount) {
		this.unDiscountAmount = unDiscountAmount;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建业务订单
 *
 * @author auto create
 * @since 1.0, 2019-04-26 11:01:48
 */
public class AlipayMerchantOrderPageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7367991691415915165L;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 买家的支付宝账号对应的支付宝唯一用户号（以2088开头的纯16位数字）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 业务扩展参数（键值对列表，有重复的键后者覆盖前者，建议唯一，以免出现不可预期的结果）
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 支付宝商品id列表，不能和sku_ids同时为空
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 外部业务号，用于幂等控制，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型，由大写字母以及下划线组成，由支付宝分配
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 卖家的支付宝账号对应的支付宝唯一用户号（以2088开头的纯16位数字）
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支付宝商品SKU ID列表，不能和item_ids同时为空
	 */
	@ApiListField("sku_ids")
	@ApiField("string")
	private List<String> skuIds;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭订单。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public List<String> getSkuIds() {
		return this.skuIds;
	}
	public void setSkuIds(List<String> skuIds) {
		this.skuIds = skuIds;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}

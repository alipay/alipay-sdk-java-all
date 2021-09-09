package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单创建
 *
 * @author auto create
 * @since 1.0, 2021-03-23 18:59:28
 */
public class AntMerchantExpandTradeorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3276643794429736881L;

	/**
	 * 订单金额（单位：分）
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 买家的支付宝账号对应的支付宝唯一用户号（以2088开头的纯16位数字）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 扩展信息（键值对列表，有重复的键后者覆盖前者，建议唯一，以免出现不可预期的结果）
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商品订单列表
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order")
	private List<ItemOrder> itemOrderList;

	/**
	 * 备注信息，一万个字符以内
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商家补贴金额（单位：分）
	 */
	@ApiField("merchant_subsidy_amount")
	private Long merchantSubsidyAmount;

	/**
	 * 服务商、平台商侧自己的业务订单单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型，由大写字母以及下划线组成，由支付宝分配
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 外部商户优惠信息列表
	 */
	@ApiListField("out_discount_infos")
	@ApiField("out_discount_info")
	private List<OutDiscountInfo> outDiscountInfos;

	/**
	 * 服务商、平台商在支付宝侧的商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 平台补贴金额（单位：分）
	 */
	@ApiField("partner_subsidy_amount")
	private Long partnerSubsidyAmount;

	/**
	 * 实付金额（单位：分）
	 */
	@ApiField("real_amount")
	private Long realAmount;

	/**
	 * 卖家的支付宝账号对应的支付宝唯一用户号（以2088开头的纯16位数字）
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
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

	public List<ItemOrder> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrder> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getMerchantSubsidyAmount() {
		return this.merchantSubsidyAmount;
	}
	public void setMerchantSubsidyAmount(Long merchantSubsidyAmount) {
		this.merchantSubsidyAmount = merchantSubsidyAmount;
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

	public List<OutDiscountInfo> getOutDiscountInfos() {
		return this.outDiscountInfos;
	}
	public void setOutDiscountInfos(List<OutDiscountInfo> outDiscountInfos) {
		this.outDiscountInfos = outDiscountInfos;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getPartnerSubsidyAmount() {
		return this.partnerSubsidyAmount;
	}
	public void setPartnerSubsidyAmount(Long partnerSubsidyAmount) {
		this.partnerSubsidyAmount = partnerSubsidyAmount;
	}

	public Long getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(Long realAmount) {
		this.realAmount = realAmount;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

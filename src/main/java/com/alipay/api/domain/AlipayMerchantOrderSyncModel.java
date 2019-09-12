package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2019-06-10 15:25:29
 */
public class AlipayMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3521694534323734953L;

	/**
	 * 订单金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 买家userId
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 扩展信息，请参见产品文档
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商品信息列表
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_info")
	private List<ItemOrderInfo> itemOrderList;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约商户userId
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 卖家userId
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public List<ItemOrderInfo> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrderInfo> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

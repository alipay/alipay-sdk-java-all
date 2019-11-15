package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2019-10-15 20:29:52
 */
public class AlipayMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2697511312977279537L;

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
	 * 物流信息
列表最多支持物流信息个数，请参考产品文档
注：若该值不为空，且物流信息同步至我的快递，则在查询订单时可返回具体物流信息
	 */
	@ApiListField("logistics_info_list")
	@ApiField("order_logistics_information_request")
	private List<OrderLogisticsInformationRequest> logisticsInfoList;

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

	public List<OrderLogisticsInformationRequest> getLogisticsInfoList() {
		return this.logisticsInfoList;
	}
	public void setLogisticsInfoList(List<OrderLogisticsInformationRequest> logisticsInfoList) {
		this.logisticsInfoList = logisticsInfoList;
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

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2019-11-25 10:27:50
 */
public class AlipayMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3317944996613857981L;

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
	 * buyer_info与buyer_user_id必选其一
	 */
	@ApiField("buyer_info")
	private UserInfomation buyerInfo;

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
out_biz_no唯一对应一笔订单，相同的订单需传入相同的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约商户userId
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付金额
需要实际支付的金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付超时时间，超过时间支付宝自行关闭订单
	 */
	@ApiField("pay_timeout_express")
	private String payTimeoutExpress;

	/**
	 * 商户订单同步记录id
	 */
	@ApiField("record_id")
	private String recordId;

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

	public UserInfomation getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(UserInfomation buyerInfo) {
		this.buyerInfo = buyerInfo;
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

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayTimeoutExpress() {
		return this.payTimeoutExpress;
	}
	public void setPayTimeoutExpress(String payTimeoutExpress) {
		this.payTimeoutExpress = payTimeoutExpress;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
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

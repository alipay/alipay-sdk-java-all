package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁商订单放款风控咨询
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class AlipayCommerceRentLoanConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5215756989361655743L;

	/**
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private RentReceiverAddressInfoDTO addressInfo;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家用户信息
	 */
	@ApiField("buyer_info")
	private BuyerInfoDTO buyerInfo;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * null
	 */
	@ApiListField("consult_invest_pid_list")
	@ApiField("string")
	private List<String> consultInvestPidList;

	/**
	 * 商品详细信息
	 */
	@ApiField("item_infos")
	private RentItemInfoDTO itemInfos;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 租赁价格明细信息
	 */
	@ApiField("price_info")
	private RentPriceInfoDTO priceInfo;

	public RentReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RentReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public BuyerInfoDTO getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(BuyerInfoDTO buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public List<String> getConsultInvestPidList() {
		return this.consultInvestPidList;
	}
	public void setConsultInvestPidList(List<String> consultInvestPidList) {
		this.consultInvestPidList = consultInvestPidList;
	}

	public RentItemInfoDTO getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(RentItemInfoDTO itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public RentPriceInfoDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(RentPriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

}

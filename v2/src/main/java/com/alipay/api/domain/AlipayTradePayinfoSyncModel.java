package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家支付信息前置同步接口
 *
 * @author auto create
 * @since 1.0, 2026-03-03 15:52:03
 */
public class AlipayTradePayinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5389677832736199883L;

	/**
	 * 买家id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 买家id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private ExtInfoMap extInfos;

	/**
	 * 是否使用商家营销
0-未使用商家优惠
1-已使用商家优惠
	 */
	@ApiField("merchant_promo_status")
	private String merchantPromoStatus;

	/**
	 * 总价，单位：元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 外部单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 子购物单信息
	 */
	@ApiListField("sub_goods_order_list")
	@ApiField("goods_detail")
	private List<GoodsDetail> subGoodsOrderList;

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public ExtInfoMap getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(ExtInfoMap extInfos) {
		this.extInfos = extInfos;
	}

	public String getMerchantPromoStatus() {
		return this.merchantPromoStatus;
	}
	public void setMerchantPromoStatus(String merchantPromoStatus) {
		this.merchantPromoStatus = merchantPromoStatus;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public List<GoodsDetail> getSubGoodsOrderList() {
		return this.subGoodsOrderList;
	}
	public void setSubGoodsOrderList(List<GoodsDetail> subGoodsOrderList) {
		this.subGoodsOrderList = subGoodsOrderList;
	}

}

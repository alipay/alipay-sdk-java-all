package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈场景交易优惠信息回传接口
 *
 * @author auto create
 * @since 1.0, 2019-01-31 16:18:52
 */
public class KoubeiMallScanpurchaseDiscountdetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7583432775945671975L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 优惠信息列表
	 */
	@ApiListField("discount_details")
	@ApiField("mall_discount_detail")
	private List<MallDiscountDetail> discountDetails;

	/**
	 * 商圈场景订单id。（order_id和trade_no不能都为空）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝交易号，（order_id和trade_no不能都为空）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public List<MallDiscountDetail> getDiscountDetails() {
		return this.discountDetails;
	}
	public void setDiscountDetails(List<MallDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

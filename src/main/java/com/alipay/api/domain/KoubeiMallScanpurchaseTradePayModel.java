package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扫码购下单接口
 *
 * @author auto create
 * @since 1.0, 2019-01-30 14:23:31
 */
public class KoubeiMallScanpurchaseTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 4631163846123836727L;

	/**
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	/**
	 * 买家的支付宝用户id，如果为空，会从传入了码值信息中获取买家ID
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 优惠信息
	 */
	@ApiListField("discount_details")
	@ApiField("mall_discount_detail")
	private List<MallDiscountDetail> discountDetails;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 
如果该值未传入，但传入了【订单付款总金额】和【不可打折金额】，则该值默认为【订单付款总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明。
默认用预订单的商品列表。商品的总金额必须要等于订单总金额（total_amount)
	 */
	@ApiListField("goods_detail")
	@ApiField("mall_goods_detail")
	private List<MallGoodsDetail> goodsDetail;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复。如果不传，则以前置订单id对应的out_order_no作为该值。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单付款总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]  
如果同时传入了【可打折金额】，【不可打折金额】，【订单付款总金额】三者，则必须满足如下条件：【订单付款总金额】=【可打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果该值未传入，但传入了【订单付款总金额】和【可打折金额】，则该值默认为【订单付款总金额】-【可打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

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

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public List<MallGoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<MallGoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}

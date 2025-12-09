package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扫码购场景商品优惠咨询
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:06:45
 */
public class KoubeiMallScanpurchaseTradeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5487811611634747896L;

	/**
	 * 商品明细列表。注意：单品总金额不能大于订单金额
	 */
	@ApiListField("goods_detail")
	@ApiField("mall_goods_detail")
	private List<MallGoodsDetail> goodsDetail;

	/**
	 * 用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 唯一请求id，开放者请确保每次请求的唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单总金额，单位元，精确到小数点后两位，取值范围[0.01,999999999]
如果同时传入了【不可打折金额】，【订单总金额】两者，则必须满足【不可打折金额】<=【订单总金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额，单位为元，精确到小数点后两位，取值范围[0,999999999]
如果同时传入了【不可打折金额】、【订单总金额】，则必须满足【不可打折金额】<=【订单总金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public List<MallGoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<MallGoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

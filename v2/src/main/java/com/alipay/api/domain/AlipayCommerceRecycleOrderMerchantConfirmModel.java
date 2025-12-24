package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收商户质检报价
 *
 * @author auto create
 * @since 1.0, 2025-09-01 19:33:32
 */
public class AlipayCommerceRecycleOrderMerchantConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5839442386987964246L;

	/**
	 * 二级回收商出资账号
	 */
	@ApiField("deduct_out")
	private RecycleDeductOutVO deductOut;

	/**
	 * 质检产品信息
	 */
	@ApiListField("inspect_products")
	@ApiField("recycle_inspect_product_v_o")
	private List<RecycleInspectProductVO> inspectProducts;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 单位=元, 两位精度
	 */
	@ApiField("order_inspect_price")
	private String orderInspectPrice;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 分账信息。当前最多支持5个分账方。如有额外诉求联系BD
	 */
	@ApiListField("royalty_infos")
	@ApiField("recycle_royalty_info")
	private List<RecycleRoyaltyInfo> royaltyInfos;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RecycleDeductOutVO getDeductOut() {
		return this.deductOut;
	}
	public void setDeductOut(RecycleDeductOutVO deductOut) {
		this.deductOut = deductOut;
	}

	public List<RecycleInspectProductVO> getInspectProducts() {
		return this.inspectProducts;
	}
	public void setInspectProducts(List<RecycleInspectProductVO> inspectProducts) {
		this.inspectProducts = inspectProducts;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderInspectPrice() {
		return this.orderInspectPrice;
	}
	public void setOrderInspectPrice(String orderInspectPrice) {
		this.orderInspectPrice = orderInspectPrice;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<RecycleRoyaltyInfo> getRoyaltyInfos() {
		return this.royaltyInfos;
	}
	public void setRoyaltyInfos(List<RecycleRoyaltyInfo> royaltyInfos) {
		this.royaltyInfos = royaltyInfos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

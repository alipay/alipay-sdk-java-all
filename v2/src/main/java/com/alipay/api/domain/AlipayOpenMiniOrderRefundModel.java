package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易组件订单退款接口
 *
 * @author auto create
 * @since 1.0, 2023-06-08 19:29:11
 */
public class AlipayOpenMiniOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5884914271788337571L;

	/**
	 * 部分商品退款信息
	 */
	@ApiListField("item_infos")
	@ApiField("mini_refund_goods_info_d_t_o")
	private List<MiniRefundGoodsInfoDTO> itemInfos;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。order_id、out_order_id，二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商户自定义退款流水id,标识一次退款请求，需要保证在交易号下唯一。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款金额,单位"元"
	 */
	@ApiField("refund")
	private String refund;

	/**
	 * 退款原因说明。
商家自定义，将会在商户和用户的pc退款账单详情中展示
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public List<MiniRefundGoodsInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<MiniRefundGoodsInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getRefund() {
		return this.refund;
	}
	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

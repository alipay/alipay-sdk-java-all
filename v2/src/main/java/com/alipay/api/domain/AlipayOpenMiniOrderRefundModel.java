package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易组件订单退款接口
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:23:24
 */
public class AlipayOpenMiniOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1234612847574248534L;

	/**
	 * 分期单号,指定分期退款的时候需要传入
	 */
	@ApiField("installment_order_id")
	private String installmentOrderId;

	/**
	 * 部分商品退款信息
	 */
	@ApiListField("item_infos")
	@ApiField("mini_refund_goods_info_d_t_o")
	private List<MiniRefundGoodsInfoDTO> itemInfos;

	/**
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部退款流水号,标识一次退款请求，需要保证在订单号下唯一。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款流水号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款流水号多次请求只会退一次。
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款金额,单位：元，精确到小数点后两位
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
	 * 买家支付宝用户ID；open_id和user_id二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getInstallmentOrderId() {
		return this.installmentOrderId;
	}
	public void setInstallmentOrderId(String installmentOrderId) {
		this.installmentOrderId = installmentOrderId;
	}

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

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建售后
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:14:26
 */
public class AlipayOpenMiniOrderAftersaleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6361275616633483491L;

	/**
	 * 售后原因code
	 */
	@ApiField("aftersale_reason_code")
	private String aftersaleReasonCode;

	/**
	 * 退换商品的信息
	 */
	@ApiListField("item_infos")
	@ApiField("aftersale_item_info_d_t_o")
	private List<AftersaleItemInfoDTO> itemInfos;

	/**
	 * 地址信息
	 */
	@ApiField("merchant_address_info")
	private AftersaleAddressInfoDTO merchantAddressInfo;

	/**
	 * 用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家自定义售后ID
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
order_id、out_order_id，二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商家小程序该售后单的页面path或者订单详情页面path，优先传入售后单页面path。
	 */
	@ApiField("path")
	private String path;

	/**
	 * 售后单退款金额，单位：元，精确到小数点后两位。发起实物商品的售后时需要传入
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 售后类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户的uid（与openId二选一）
	 */
	@ApiField("user_id")
	private String userId;

	public String getAftersaleReasonCode() {
		return this.aftersaleReasonCode;
	}
	public void setAftersaleReasonCode(String aftersaleReasonCode) {
		this.aftersaleReasonCode = aftersaleReasonCode;
	}

	public List<AftersaleItemInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<AftersaleItemInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public AftersaleAddressInfoDTO getMerchantAddressInfo() {
		return this.merchantAddressInfo;
	}
	public void setMerchantAddressInfo(AftersaleAddressInfoDTO merchantAddressInfo) {
		this.merchantAddressInfo = merchantAddressInfo;
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

	public String getOutAftersaleId() {
		return this.outAftersaleId;
	}
	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

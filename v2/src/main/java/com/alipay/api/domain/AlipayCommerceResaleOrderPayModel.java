package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二手售卖支付接口
 *
 * @author auto create
 * @since 1.0, 2026-04-24 09:52:45
 */
public class AlipayCommerceResaleOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 2483894933451216585L;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部支付流水，需要保证订单下全局唯一。 若重复会幂等返回前序已经发起的一笔流水
	 */
	@ApiField("out_pay_id")
	private String outPayId;

	/**
	 * 赔付类、订单部分支付类需要
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * FULL_PAY,全额支付
PARTIAL_PAY,部分支付
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/**
	 * 支付备注
	 */
	@ApiField("pay_memo")
	private String payMemo;

	/**
	 * null
	 */
	@ApiListField("pay_scene_items")
	@ApiField("resale_pay_info_v_o")
	private List<ResalePayInfoVO> paySceneItems;

	/**
	 * JSAPI（小程序支付）、PAY_AFTER_USE（先享后付）、installmentPay（分期支付）
	 */
	@ApiField("pay_tool")
	private String payTool;

	/**
	 * ORDER（订单支付）、OTHER（其他支付）
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutPayId() {
		return this.outPayId;
	}
	public void setOutPayId(String outPayId) {
		this.outPayId = outPayId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayAmountType() {
		return this.payAmountType;
	}
	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}

	public String getPayMemo() {
		return this.payMemo;
	}
	public void setPayMemo(String payMemo) {
		this.payMemo = payMemo;
	}

	public List<ResalePayInfoVO> getPaySceneItems() {
		return this.paySceneItems;
	}
	public void setPaySceneItems(List<ResalePayInfoVO> paySceneItems) {
		this.paySceneItems = paySceneItems;
	}

	public String getPayTool() {
		return this.payTool;
	}
	public void setPayTool(String payTool) {
		this.payTool = payTool;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

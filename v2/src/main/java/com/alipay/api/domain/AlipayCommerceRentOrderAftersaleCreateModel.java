package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁售后单创建
 *
 * @author auto create
 * @since 1.0, 2025-07-30 19:00:50
 */
public class AlipayCommerceRentOrderAftersaleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7844934817374769492L;

	/**
	 * 补充描述
	 */
	@ApiField("additional_description")
	private String additionalDescription;

	/**
	 * 申请售后的补充凭证，类型包括图片、视频等
	 */
	@ApiListField("additional_media_list")
	@ApiField("aftersale_media_info_v_o")
	private List<AftersaleMediaInfoVO> additionalMediaList;

	/**
	 * 售后类型
	 */
	@ApiField("aftersale_type")
	private String aftersaleType;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 商家小程序对应的售后详情页路径地址，仅需传入小程序页面路径即可，且需是小程序内部页面路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 订单费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("aftersale_pay_item_v_o")
	private List<AftersalePayItemVO> payItems;

	/**
	 * 用户发起售后原因，具体传入规则如下：
1. 取消订单售后场景下，根据当前订单状态是「待发货」和「已发货」，可传入的原因类型不同：
1.1. 已发货：可传入TIMEOUT_FOR_CONFIRM、LOGISTICS_ILLEGAL、REJECT_TO_CONFIRM、NO_NEED、BUYER_AGREED、OTHER；
1.2. 待发货：可传入OTHER_CHANNEL_CHEAP、CHEAPER_ITEM、RENT_AMOUNT_OVER_PLAN、NO_NEED、NO_GOODS_OR_REJECT、NEED_TO_CHANGE_CHANNEL、NEED_TO_PAY_MANY_PERIOD_AMOUNT、CANNOT_CAONTACT_WITH_MERCHANT、OTHER。
2. 赔付售后场景下，如果pay_items中金额类型为INDEMNITY，则可以传入ITEM_DAMAGED、ITEM_REPAIR、ITEM_LOST和ITEM_DEPRECIATION；如果金额类型为LATE_FEE，则可以传入RETURN_EARLY和RETURN_OVERDUE。
	 */
	@ApiField("reason_code")
	private String reasonCode;

	public String getAdditionalDescription() {
		return this.additionalDescription;
	}
	public void setAdditionalDescription(String additionalDescription) {
		this.additionalDescription = additionalDescription;
	}

	public List<AftersaleMediaInfoVO> getAdditionalMediaList() {
		return this.additionalMediaList;
	}
	public void setAdditionalMediaList(List<AftersaleMediaInfoVO> additionalMediaList) {
		this.additionalMediaList = additionalMediaList;
	}

	public String getAftersaleType() {
		return this.aftersaleType;
	}
	public void setAftersaleType(String aftersaleType) {
		this.aftersaleType = aftersaleType;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
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

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public List<AftersalePayItemVO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<AftersalePayItemVO> payItems) {
		this.payItems = payItems;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}

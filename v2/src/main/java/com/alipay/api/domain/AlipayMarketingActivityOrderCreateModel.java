package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销购买下单接口
 *
 * @author auto create
 * @since 1.0, 2023-10-27 17:06:41
 */
public class AlipayMarketingActivityOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3849776773964171189L;

	/**
	 * 购买者的支付宝uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 购买者的支付宝用户openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * （待废弃）
推广渠道信息。 由支付宝公私域跳转到服务商小程序时带入。例如 alipays://platformapi/startapp?appId=2021002147682XXX&page=pages/main/mian&query=chInfo%3DchInfo_promotion 其中chInfo为支付宝带入投放渠道信息，需要在调用下单接口时传入
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 公域跳转私域时小程序预埋的官方渠道信息。获取方式：小程序被唤起后，统一通过启动参数referrerInfo.extraData的值内部获取miniTraceInfo。使用场景：在商家小程序售卖商品需要使用平台的渠道专享优惠时需要传入。使用此字段请咨询官方小二，暂不全量开放。
	 */
	@ApiField("mini_trace_info")
	private String miniTraceInfo;

	/**
	 * 外部业务订单号。

同时具备幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 投放埋点信息。由支付宝公私域跳转到服务商小程序时带入。例如alipays://platformapi/startapp?appId=2021002140648450&query=promoTraceInfo%3DUFJPTU9fU0NFTkVfSUQ9OkNCMTExOTk3MDBAO0BQT1NJVElPTl9DT0RFPTptb3JwaG9fYzQxYWY2，其中promoTraceInfo由支付宝带入投放埋点信息，需要在调用下单接口时传入
	 */
	@ApiField("promo_trace_info")
	private String promoTraceInfo;

	/**
	 * 售卖活动信息列表。

目前只支持
sale_activity_info_list

中传入单个类型的活动信息。
	 */
	@ApiListField("sale_activity_info_list")
	@ApiField("sale_activity_info")
	private List<SaleActivityInfo> saleActivityInfoList;

	/**
	 * 商品订单总金额.

该总金额必须等于
sale_activity_info_list中所有商品单价*数量的总和。

支付宝内部会进行金额一致性检查。 保障用户下单看到的金额，和实际支付显示的金额保持一致。
	 */
	@ApiField("total_amount")
	private String totalAmount;

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

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getMiniTraceInfo() {
		return this.miniTraceInfo;
	}
	public void setMiniTraceInfo(String miniTraceInfo) {
		this.miniTraceInfo = miniTraceInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPromoTraceInfo() {
		return this.promoTraceInfo;
	}
	public void setPromoTraceInfo(String promoTraceInfo) {
		this.promoTraceInfo = promoTraceInfo;
	}

	public List<SaleActivityInfo> getSaleActivityInfoList() {
		return this.saleActivityInfoList;
	}
	public void setSaleActivityInfoList(List<SaleActivityInfo> saleActivityInfoList) {
		this.saleActivityInfoList = saleActivityInfoList;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

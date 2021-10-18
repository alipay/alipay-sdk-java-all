package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销购买下单接口
 *
 * @author auto create
 * @since 1.0, 2021-09-01 10:33:55
 */
public class AlipayMarketingActivityOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1174227213151818617L;

	/**
	 * 购买者的支付宝uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 推广渠道信息。 由支付宝公私域跳转到服务商小程序时带入。例如 aalipays://platformapi/startapp?appId=2021002147682XXX&page=pages/main/mian&query=chInfo%3DchInfo_promotion 其中chInfo为支付宝带入投放渠道信息，需要在调用下单接口时传入
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 外部业务订单号。

同时具备幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

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

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

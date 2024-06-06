package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC行程账单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2023-02-10 13:20:49
 */
public class AlipayCommerceTransportEtcTripSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2511444999571633398L;

	/**
	 * 垫资状态（
0：无垫资；
1：有垫资；
2：垫资已偿还；）
	 */
	@ApiField("advance_status")
	private String advanceStatus;

	/**
	 * 高速场景数据
	 */
	@ApiField("highway_data")
	private HighwaySceneData highwayData;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，对应用户该笔ETC申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单号,商户端唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 车牌颜色： 0：蓝； 1：黄； 2：黑； 3：白； 4：绿；5：黄绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号。仅包括省份+车牌，不包括特殊字符。
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 发行方id，一般为ETC卡号前缀： 
"3701", "山东省"；
"6201", "甘肃省"；
"3201", "江苏省"；
"1101", "北京"；
"5301", "云南省"；
"4601", "海南省"；
"3301", "浙江省"；
"3101", "上海"；
"6101", "陕西省"；
"1201", "天津"；
"6501", "新疆维吾尔自治区"；
"5201", "贵州省"；
"3401", "安徽省"；
"8201", "澳门特别行政区"；
"4301", "湖南省"；
"1301", "河北省"；
"8101", "香港特别行政区"；
"2101", "辽宁省"；
"5101", "四川省"；
"6401", "宁夏回族自治区"；
"2201", "吉林省"；
"3501", "福建省"；
"4201", "湖北省"；
"4401", "广东省"；
"5001", "重庆"；
"1401", "山西省"；
"3601", "江西省"；
"2301", "黑龙江省"；
"6301", "青海省"；
"4101", "河南省"；
"7101", "台湾省"；
"1501", "内蒙古自治区"；
"5401", "西藏自治区"；
"4501", "广西壮族自治区"；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 交易单号，通过支付宝扣款的订单，这个参数必传。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝交易状态（S：扣款成功； R: 退款成功）银行交易状态（IN_PROCESSING：处理中，PROCESS_SUCCESS：受理成功；PROCESS_FAIL：受理失败；）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 支付宝用户id
	 */
	@ApiField("uid")
	private String uid;

	public String getAdvanceStatus() {
		return this.advanceStatus;
	}
	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;
	}

	public HighwaySceneData getHighwayData() {
		return this.highwayData;
	}
	public void setHighwayData(HighwaySceneData highwayData) {
		this.highwayData = highwayData;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}

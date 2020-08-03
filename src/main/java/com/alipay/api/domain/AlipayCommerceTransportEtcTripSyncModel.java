package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC行程账单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2020-07-22 10:39:01
 */
public class AlipayCommerceTransportEtcTripSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2566151381371968769L;

	/**
	 * 高速场景数据
	 */
	@ApiField("highway_data")
	private HighwaySceneData highwayData;

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
	 * 发行方id，一般为ETC卡号前缀： '3701':'山东'; '3201':'江苏'; '3301':'浙江'; '3101':'上海'; '1101':'北京'; '3401':'安徽'; '5201':'贵州'; '4501':'广西'; '1301':'河北'; '1201':'天津'; '4301':'湖南';
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 交易状态；
S：扣款成功；
R:  退款成功；
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 支付宝用户id
	 */
	@ApiField("uid")
	private String uid;

	public HighwaySceneData getHighwayData() {
		return this.highwayData;
	}
	public void setHighwayData(HighwaySceneData highwayData) {
		this.highwayData = highwayData;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC订单创建或修改
 *
 * @author auto create
 * @since 1.0, 2023-12-20 11:14:26
 */
public class AlipayCommerceTransportEtcenterpriseApplyorderCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2885661239431976847L;

	/**
	 * 办理人所在地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 企业订单对应支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 车辆发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * ETC办理激活手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 审核资料提交状态。WAIT_SUBMIT：信息待提交；SUBMITTED：信息已提交。
	 */
	@ApiField("order_censor_status")
	private String orderCensorStatus;

	/**
	 * 支付宝订单号，提供则认为是更新
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 发行方的标识ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 车辆识别号
	 */
	@ApiField("vi_vin")
	private String viVin;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOrderCensorStatus() {
		return this.orderCensorStatus;
	}
	public void setOrderCensorStatus(String orderCensorStatus) {
		this.orderCensorStatus = orderCensorStatus;
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

	public String getViVin() {
		return this.viVin;
	}
	public void setViVin(String viVin) {
		this.viVin = viVin;
	}

}

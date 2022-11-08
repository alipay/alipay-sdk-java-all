package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理车辆及设备信息变更
 *
 * @author auto create
 * @since 1.0, 2022-10-26 20:19:05
 */
public class AlipayCommerceTransportEtcInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5254551529793638578L;

	/**
	 * 支付宝侧业务协议号，在订单同步接口中会同步给外部机构。与biz_agreement_no参数，两者二选一必传。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 用户ETC卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户ETC OBU号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 支付宝侧申请订单号，在订单同步接口中会同步给外部机构。与biz_agreement_no参数，两者二选一必传。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号，在支付宝订单同步给外部机构时，由外部生成并返回给支付宝，对应用户该笔ETC申请单号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 0：蓝； 1：黄； 2：黑； 3：白； 4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核定人数
	 */
	@ApiField("vi_ac")
	private String viAc;

	/**
	 * 总质量,单位kg
	 */
	@ApiField("vi_gross_mass")
	private String viGrossMass;

	/**
	 * 车高，单位mm
	 */
	@ApiField("vi_height")
	private String viHeight;

	/**
	 * 车长，单位mm
	 */
	@ApiField("vi_length")
	private String viLength;

	/**
	 * 行驶证上的车主姓名
	 */
	@ApiField("vi_owner_name")
	private String viOwnerName;

	/**
	 * 车宽，单位mm
	 */
	@ApiField("vi_width")
	private String viWidth;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getViAc() {
		return this.viAc;
	}
	public void setViAc(String viAc) {
		this.viAc = viAc;
	}

	public String getViGrossMass() {
		return this.viGrossMass;
	}
	public void setViGrossMass(String viGrossMass) {
		this.viGrossMass = viGrossMass;
	}

	public String getViHeight() {
		return this.viHeight;
	}
	public void setViHeight(String viHeight) {
		this.viHeight = viHeight;
	}

	public String getViLength() {
		return this.viLength;
	}
	public void setViLength(String viLength) {
		this.viLength = viLength;
	}

	public String getViOwnerName() {
		return this.viOwnerName;
	}
	public void setViOwnerName(String viOwnerName) {
		this.viOwnerName = viOwnerName;
	}

	public String getViWidth() {
		return this.viWidth;
	}
	public void setViWidth(String viWidth) {
		this.viWidth = viWidth;
	}

}

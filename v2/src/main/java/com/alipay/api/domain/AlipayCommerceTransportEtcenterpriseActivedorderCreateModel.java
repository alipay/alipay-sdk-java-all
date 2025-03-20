package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC激活订单创建
 *
 * @author auto create
 * @since 1.0, 2024-06-10 11:11:07
 */
public class AlipayCommerceTransportEtcenterpriseActivedorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6673336835411832351L;

	/**
	 * 经办人证件号
	 */
	@ApiField("agent_cert_no")
	private String agentCertNo;

	/**
	 * 经办人证件类型
	 */
	@ApiField("agent_cert_type")
	private String agentCertType;

	/**
	 * 经办人姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 业务发生时间，对应order_status 几个状态的变更时间，当order_status = ACTIVATED时 biz_time为设备激活时间，以此类推
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 用户ETC卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 办理人所在地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 车辆所属企业在支付宝侧入驻的企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 用户ETCOBU号
	 */
	@ApiField("device_no")
	private String deviceNo;

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
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号对应该笔ETC申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 发行方身份标识
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 核定载人数不带单位
	 */
	@ApiField("vi_ac")
	private Long viAc;

	/**
	 * 行驶证发证日期
	 */
	@ApiField("vi_grant_date")
	private String viGrantDate;

	/**
	 * 总质量单位kg
	 */
	@ApiField("vi_gross_mass")
	private Long viGrossMass;

	/**
	 * 车高单位mm
	 */
	@ApiField("vi_height")
	private Long viHeight;

	/**
	 * 车长单位mm
	 */
	@ApiField("vi_length")
	private Long viLength;

	/**
	 * 行驶证上的品牌型号
	 */
	@ApiField("vi_model_name")
	private String viModelName;

	/**
	 * 车主姓名
	 */
	@ApiField("vi_owner_name")
	private String viOwnerName;

	/**
	 * 车辆注册日期
	 */
	@ApiField("vi_register_date")
	private String viRegisterDate;

	/**
	 * 车辆VIN码
	 */
	@ApiField("vi_vin")
	private String viVin;

	/**
	 * 车宽单位mm
	 */
	@ApiField("vi_width")
	private Long viWidth;

	public String getAgentCertNo() {
		return this.agentCertNo;
	}
	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

	public String getAgentCertType() {
		return this.agentCertType;
	}
	public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

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

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
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

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public Long getViAc() {
		return this.viAc;
	}
	public void setViAc(Long viAc) {
		this.viAc = viAc;
	}

	public String getViGrantDate() {
		return this.viGrantDate;
	}
	public void setViGrantDate(String viGrantDate) {
		this.viGrantDate = viGrantDate;
	}

	public Long getViGrossMass() {
		return this.viGrossMass;
	}
	public void setViGrossMass(Long viGrossMass) {
		this.viGrossMass = viGrossMass;
	}

	public Long getViHeight() {
		return this.viHeight;
	}
	public void setViHeight(Long viHeight) {
		this.viHeight = viHeight;
	}

	public Long getViLength() {
		return this.viLength;
	}
	public void setViLength(Long viLength) {
		this.viLength = viLength;
	}

	public String getViModelName() {
		return this.viModelName;
	}
	public void setViModelName(String viModelName) {
		this.viModelName = viModelName;
	}

	public String getViOwnerName() {
		return this.viOwnerName;
	}
	public void setViOwnerName(String viOwnerName) {
		this.viOwnerName = viOwnerName;
	}

	public String getViRegisterDate() {
		return this.viRegisterDate;
	}
	public void setViRegisterDate(String viRegisterDate) {
		this.viRegisterDate = viRegisterDate;
	}

	public String getViVin() {
		return this.viVin;
	}
	public void setViVin(String viVin) {
		this.viVin = viVin;
	}

	public Long getViWidth() {
		return this.viWidth;
	}
	public void setViWidth(Long viWidth) {
		this.viWidth = viWidth;
	}

}

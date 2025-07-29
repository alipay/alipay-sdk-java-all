package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停车入场信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-07 15:26:22
 */
public class AlipayCommerceTransportParkingEnterinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5795577727913944389L;

	/**
	 * 是否启用车牌代扣状态查询功能，true为启用，false为停用
	 */
	@ApiField("agreement_query")
	private Boolean agreementQuery;

	/**
	 * 本次行程收费计划清单
	 */
	@ApiListField("charge_info_list")
	@ApiField("parking_charge_info")
	private List<ParkingChargeInfo> chargeInfoList;

	/**
	 * 车辆进入停车场的入口通道名称
	 */
	@ApiField("entrance_name")
	private String entranceName;

	/**
	 * 车辆进入停车场的入口通道编号；按线下实际编号为准；
	 */
	@ApiField("entrance_number")
	private Long entranceNumber;

	/**
	 * 当前停车场的入场免费时长分钟数
	 */
	@ApiField("free_enter_minutes")
	private String freeEnterMinutes;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
	 */
	@ApiField("in_time")
	private Date inTime;

	/**
	 * 车牌是否加密，true为加密，false为不加密，默认为false
	 */
	@ApiField("is_encrypt_plate_no")
	private Boolean isEncryptPlateNo;

	/**
	 * 当前车主的停车会员信息
	 */
	@ApiField("membership_info")
	private ParkingMembershipInfo membershipInfo;

	/**
	 * 当前行程是否需要计费。true：需要，false：不需要。不传默认为true。
	 */
	@ApiField("need_charge")
	private Boolean needCharge;

	/**
	 * 蚂蚁会员统一ID对应的归属应用appid
	 */
	@ApiField("open_appid")
	private String openAppid;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create
(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 车牌颜色，车牌颜色，枚举支持：
*BLUE：蓝。
*GREEN：绿。
*YELLOW：黄。
*WHITE：白。
*BLACK：黑。
*LIMEGREEN：黄绿色。
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号（支持加密格式）
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 停车服务页面地址。
1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F

2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId=2021001102642986&page=pages%2Fparking-fee%2Findex

3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId=2021001102642986&page=%2Fpages%2Fparking-bill%2Findex
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public Boolean getAgreementQuery() {
		return this.agreementQuery;
	}
	public void setAgreementQuery(Boolean agreementQuery) {
		this.agreementQuery = agreementQuery;
	}

	public List<ParkingChargeInfo> getChargeInfoList() {
		return this.chargeInfoList;
	}
	public void setChargeInfoList(List<ParkingChargeInfo> chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}

	public String getEntranceName() {
		return this.entranceName;
	}
	public void setEntranceName(String entranceName) {
		this.entranceName = entranceName;
	}

	public Long getEntranceNumber() {
		return this.entranceNumber;
	}
	public void setEntranceNumber(Long entranceNumber) {
		this.entranceNumber = entranceNumber;
	}

	public String getFreeEnterMinutes() {
		return this.freeEnterMinutes;
	}
	public void setFreeEnterMinutes(String freeEnterMinutes) {
		this.freeEnterMinutes = freeEnterMinutes;
	}

	public Date getInTime() {
		return this.inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Boolean getIsEncryptPlateNo() {
		return this.isEncryptPlateNo;
	}
	public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
		this.isEncryptPlateNo = isEncryptPlateNo;
	}

	public ParkingMembershipInfo getMembershipInfo() {
		return this.membershipInfo;
	}
	public void setMembershipInfo(ParkingMembershipInfo membershipInfo) {
		this.membershipInfo = membershipInfo;
	}

	public Boolean getNeedCharge() {
		return this.needCharge;
	}
	public void setNeedCharge(Boolean needCharge) {
		this.needCharge = needCharge;
	}

	public String getOpenAppid() {
		return this.openAppid;
	}
	public void setOpenAppid(String openAppid) {
		this.openAppid = openAppid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
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

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}

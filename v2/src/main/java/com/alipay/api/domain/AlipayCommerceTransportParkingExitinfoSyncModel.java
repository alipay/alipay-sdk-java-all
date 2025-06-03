package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车离场信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-07 16:59:07
 */
public class AlipayCommerceTransportParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1795564175268886949L;

	/**
	 * 车辆出场的出口通道名称；取实地通道名称；
	 */
	@ApiField("exit_name")
	private String exitName;

	/**
	 * 车辆出场的出口通道编号；与线下实地编码一致；
	 */
	@ApiField("exit_number")
	private Long exitNumber;

	/**
	 * 车牌是否加密，true为加密，false为不加密，默认为false
	 */
	@ApiField("is_encrypt_plate_no")
	private Boolean isEncryptPlateNo;

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
	 * 车辆出场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，出场时间不应晚于当前网络时间，也不当早于入场时间。
	 */
	@ApiField("out_time")
	private Date outTime;

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
1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F 2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId=2021001102642986&page=pages%2Fparking-fee%2Findex 3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId=2021001102642986&page=%2Fpages%2Fparking-bill%2Findex
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getExitName() {
		return this.exitName;
	}
	public void setExitName(String exitName) {
		this.exitName = exitName;
	}

	public Long getExitNumber() {
		return this.exitNumber;
	}
	public void setExitNumber(Long exitNumber) {
		this.exitNumber = exitNumber;
	}

	public Boolean getIsEncryptPlateNo() {
		return this.isEncryptPlateNo;
	}
	public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
		this.isEncryptPlateNo = isEncryptPlateNo;
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

	public Date getOutTime() {
		return this.outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
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

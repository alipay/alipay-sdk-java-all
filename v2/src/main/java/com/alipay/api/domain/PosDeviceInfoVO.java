package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备商回流pos基础设备信息
 *
 * @author auto create
 * @since 1.0, 2018-03-08 10:35:41
 */
public class PosDeviceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7574298645236792531L;

	/**
	 * 设备对应的软件方公司名称，比如：美味不用等；银盒子；二维火；云纵；雅座；辰森；
	 */
	@ApiField("decive_software_name")
	private String deciveSoftwareName;

	/**
	 * 设备安装的应用数
	 */
	@ApiField("device_app_cnt")
	private String deviceAppCnt;

	/**
	 * 设备安装的应用列表对应的流量,单位KB
	 */
	@ApiField("device_app_flow")
	private String deviceAppFlow;

	/**
	 * 设备安装的应用列表
	 */
	@ApiField("device_app_list")
	private String deviceAppList;

	/**
	 * 设备出厂公司；比如：商米；新大陆；荣焱；
	 */
	@ApiField("device_company_name")
	private String deviceCompanyName;

	/**
	 * 设备总使用流量,单位KB
	 */
	@ApiField("device_flow")
	private String deviceFlow;

	/**
	 * pos机设备ip值
	 */
	@ApiField("device_ip")
	private String deviceIp;

	/**
	 * pos机设备MAC地址
	 */
	@ApiField("device_mac")
	private String deviceMac;

	/**
	 * 设备运行的操作系统版本
	 */
	@ApiField("device_os_version")
	private String deviceOsVersion;

	/**
	 * pos机设备状态值，枚举值为：已出厂(1)，已入仓(2)，已出售(3)，已报单(4)，已发货(5)，已收货(6)，已激活(7)、已绑定(8)、运行中(9)、设备失联(10)、已解绑(11)
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * pos机设备类型，枚举值为: 旗舰(FLAG_SHIP),高端(HIGH_END),标准(STANDARD),手持(IN_HAND)
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备型号，如荣焱P10CC、商米D1、荣焱P10S、商米P1、荣焱HD01、商米V1、商米M1、荣焱P8K、商米T1、商米T2lite、荣焱P8G、商米T1、商米T2Lite等
	 */
	@ApiField("device_version")
	private String deviceVersion;

	/**
	 * 设备激活时间
	 */
	@ApiField("gmt_activate")
	private Date gmtActivate;

	/**
	 * 最后登录时间:设备处于登陆状态的最后时间
	 */
	@ApiField("gmt_login")
	private Date gmtLogin;

	/**
	 * 设备解绑时间
	 */
	@ApiField("gmt_production")
	private Date gmtProduction;

	/**
	 * 最后发送信息时间:设备最后发送信息的时间，发给服务端的最后时间
	 */
	@ApiField("gmt_send")
	private Date gmtSend;

	/**
	 * 设备出厂时间
	 */
	@ApiField("gmt_unbundling")
	private Date gmtUnbundling;

	/**
	 * 最后更新时间:设备上软件的最后更新时间
	 */
	@ApiField("gmt_update")
	private Date gmtUpdate;

	/**
	 * 数据回流设备对应的ISV名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 数据回流设备对应的ISV_PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 口碑门店id，激活设备才有口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 设备id，唯一标识设备的ID,SN号
	 */
	@ApiField("sn_no")
	private String snNo;

	public String getDeciveSoftwareName() {
		return this.deciveSoftwareName;
	}
	public void setDeciveSoftwareName(String deciveSoftwareName) {
		this.deciveSoftwareName = deciveSoftwareName;
	}

	public String getDeviceAppCnt() {
		return this.deviceAppCnt;
	}
	public void setDeviceAppCnt(String deviceAppCnt) {
		this.deviceAppCnt = deviceAppCnt;
	}

	public String getDeviceAppFlow() {
		return this.deviceAppFlow;
	}
	public void setDeviceAppFlow(String deviceAppFlow) {
		this.deviceAppFlow = deviceAppFlow;
	}

	public String getDeviceAppList() {
		return this.deviceAppList;
	}
	public void setDeviceAppList(String deviceAppList) {
		this.deviceAppList = deviceAppList;
	}

	public String getDeviceCompanyName() {
		return this.deviceCompanyName;
	}
	public void setDeviceCompanyName(String deviceCompanyName) {
		this.deviceCompanyName = deviceCompanyName;
	}

	public String getDeviceFlow() {
		return this.deviceFlow;
	}
	public void setDeviceFlow(String deviceFlow) {
		this.deviceFlow = deviceFlow;
	}

	public String getDeviceIp() {
		return this.deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getDeviceMac() {
		return this.deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}

	public String getDeviceOsVersion() {
		return this.deviceOsVersion;
	}
	public void setDeviceOsVersion(String deviceOsVersion) {
		this.deviceOsVersion = deviceOsVersion;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public Date getGmtActivate() {
		return this.gmtActivate;
	}
	public void setGmtActivate(Date gmtActivate) {
		this.gmtActivate = gmtActivate;
	}

	public Date getGmtLogin() {
		return this.gmtLogin;
	}
	public void setGmtLogin(Date gmtLogin) {
		this.gmtLogin = gmtLogin;
	}

	public Date getGmtProduction() {
		return this.gmtProduction;
	}
	public void setGmtProduction(Date gmtProduction) {
		this.gmtProduction = gmtProduction;
	}

	public Date getGmtSend() {
		return this.gmtSend;
	}
	public void setGmtSend(Date gmtSend) {
		this.gmtSend = gmtSend;
	}

	public Date getGmtUnbundling() {
		return this.gmtUnbundling;
	}
	public void setGmtUnbundling(Date gmtUnbundling) {
		this.gmtUnbundling = gmtUnbundling;
	}

	public Date getGmtUpdate() {
		return this.gmtUpdate;
	}
	public void setGmtUpdate(Date gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSnNo() {
		return this.snNo;
	}
	public void setSnNo(String snNo) {
		this.snNo = snNo;
	}

}

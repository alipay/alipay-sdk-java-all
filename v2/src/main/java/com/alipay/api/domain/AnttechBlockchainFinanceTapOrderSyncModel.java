package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产订单同步
 *
 * @author auto create
 * @since 1.0, 2023-12-13 14:04:58
 */
public class AnttechBlockchainFinanceTapOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1719653958244668171L;

	/**
	 * 使用年限
	 */
	@ApiField("battery_life")
	private String batteryLife;

	/**
	 * 电池规格
	 */
	@ApiField("battery_special")
	private String batterySpecial;

	/**
	 * 预约结束时间
	 */
	@ApiField("book_end_time")
	private Date bookEndTime;

	/**
	 * 预约开始时间
	 */
	@ApiField("book_start_time")
	private Date bookStartTime;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 成交价格，单位为分
	 */
	@ApiField("complete_price")
	private Long completePrice;

	/**
	 * 订单成交时间
	 */
	@ApiField("complete_time")
	private Date completeTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 预留字段
	 */
	@ApiField("data_info")
	private String dataInfo;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 地区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * isv订单号
	 */
	@ApiField("isv_order_id")
	private String isvOrderId;

	/**
	 * 消息类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBatteryLife() {
		return this.batteryLife;
	}
	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}

	public String getBatterySpecial() {
		return this.batterySpecial;
	}
	public void setBatterySpecial(String batterySpecial) {
		this.batterySpecial = batterySpecial;
	}

	public Date getBookEndTime() {
		return this.bookEndTime;
	}
	public void setBookEndTime(Date bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	public Date getBookStartTime() {
		return this.bookStartTime;
	}
	public void setBookStartTime(Date bookStartTime) {
		this.bookStartTime = bookStartTime;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getCompletePrice() {
		return this.completePrice;
	}
	public void setCompletePrice(Long completePrice) {
		this.completePrice = completePrice;
	}

	public Date getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDataInfo() {
		return this.dataInfo;
	}
	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getIsvOrderId() {
		return this.isvOrderId;
	}
	public void setIsvOrderId(String isvOrderId) {
		this.isvOrderId = isvOrderId;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

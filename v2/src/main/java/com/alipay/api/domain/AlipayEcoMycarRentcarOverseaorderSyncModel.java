package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车境外租车订单同步
 *
 * @author auto create
 * @since 1.0, 2023-10-10 19:13:52
 */
public class AlipayEcoMycarRentcarOverseaorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3494479459767296957L;

	/**
	 * 续租交易信息
	 */
	@ApiField("add_rent_trade_list")
	private AddRentTradeInfo addRentTradeList;

	/**
	 * 分润基数，单位元。注意，这里单位是元。已支付必传
	 */
	@ApiField("applets_service_amount")
	private Long appletsServiceAmount;

	/**
	 * 分润类目。已支付必传
	 */
	@ApiField("applets_service_category")
	private String appletsServiceCategory;

	/**
	 * 取消违约费，单位分
	 */
	@ApiField("cancelled_amount")
	private Long cancelledAmount;

	/**
	 * 车生活车型id
	 */
	@ApiField("carlife_vehicle_id")
	private String carlifeVehicleId;

	/**
	 * 押金金额，单位分
	 */
	@ApiField("deposit_amount")
	private Long depositAmount;

	/**
	 * 押金扣款金额，单位分
	 */
	@ApiField("deposit_deduct_amount")
	private Long depositDeductAmount;

	/**
	 * 订单折扣（优惠）金额，单位分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 车型排量
	 */
	@ApiField("displacement")
	private String displacement;

	/**
	 * 驾驶人手机号。待支付状态必传
	 */
	@ApiField("driver_mobile")
	private String driverMobile;

	/**
	 * 驾驶人姓名。待支付状态必传
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 租赁期间行驶里程，单位公里
	 */
	@ApiField("driving_distance")
	private Long drivingDistance;

	/**
	 * 还车地址。待支付必传
	 */
	@ApiField("drop_off_address")
	private String dropOffAddress;

	/**
	 * 还车城市代码。待支付必传
	 */
	@ApiField("drop_off_city_code")
	private String dropOffCityCode;

	/**
	 * 还车城市名名称。待支付必传
	 */
	@ApiField("drop_off_city_name")
	private String dropOffCityName;

	/**
	 * 还车地区代码。待支付必传
	 */
	@ApiField("drop_off_region_code")
	private String dropOffRegionCode;

	/**
	 * 还车地区名称。待支付必传
	 */
	@ApiField("drop_off_region_name")
	private String dropOffRegionName;

	/**
	 * 还车网点名称。待支付必传
	 */
	@ApiField("drop_off_store_name")
	private String dropOffStoreName;

	/**
	 * 还车时间。待支付必传
	 */
	@ApiField("drop_off_time")
	private Date dropOffTime;

	/**
	 * 用户补款金额，单位分
	 */
	@ApiField("fill_amount")
	private Long fillAmount;

	/**
	 * 是否有续租
	 */
	@ApiField("has_continue_rent")
	private Boolean hasContinueRent;

	/**
	 * 是否有车损
	 */
	@ApiField("has_damage")
	private Boolean hasDamage;

	/**
	 * 是否提前换车
	 */
	@ApiField("has_early_give_back")
	private Boolean hasEarlyGiveBack;

	/**
	 * 是否有违章
	 */
	@ApiField("has_violation")
	private Boolean hasViolation;

	/**
	 * 是否上门送取车
	 */
	@ApiField("home_get_and_send")
	private Boolean homeGetAndSend;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单状态，状态机：
待支付->已取消，待支付->已关闭，待支付->已支付；
已支付->已取消，已支付->已确认；
已确认->已取消；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 是否异地取还车
	 */
	@ApiField("other_drop_off")
	private Boolean otherDropOff;

	/**
	 * 商户侧订单号，支付宝侧通过商户pid+out_order_no进行订单唯一性校验
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部订单下单时间
	 */
	@ApiField("out_order_time")
	private Date outOrderTime;

	/**
	 * 订单实付金额，单位分。订单总金额-折扣金额=实付金额。已支付必传
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 订单支付时间。已支付必传
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 取车地址。待支付必传
	 */
	@ApiField("pick_up_address")
	private String pickUpAddress;

	/**
	 * 取车城市代码。待支付必传
	 */
	@ApiField("pick_up_city_code")
	private String pickUpCityCode;

	/**
	 * 取车城市名称。待支付必传
	 */
	@ApiField("pick_up_city_name")
	private String pickUpCityName;

	/**
	 * 取车地区代码。待支付必传
	 */
	@ApiField("pick_up_region_code")
	private String pickUpRegionCode;

	/**
	 * 取车地区名称。待支付必传
	 */
	@ApiField("pick_up_region_name")
	private String pickUpRegionName;

	/**
	 * 取车网点名称。待支付必传
	 */
	@ApiField("pick_up_store_name")
	private String pickUpStoreName;

	/**
	 * 取车时间。待支付必传
	 */
	@ApiField("pick_up_time")
	private Date pickUpTime;

	/**
	 * 退款金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 租车公司名称。待支付必传
	 */
	@ApiField("rent_company_name")
	private String rentCompanyName;

	/**
	 * 门店还车联系电话
	 */
	@ApiField("store_drop_off_phone")
	private String storeDropOffPhone;

	/**
	 * 门店取车联系电话
	 */
	@ApiField("store_pick_up_phone")
	private String storePickUpPhone;

	/**
	 * 订单总金额，单位分。待支付必传
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 用户支付租金的支付宝交易号，已支付状态必传
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 档位类型，自动挡或手动挡。待支付必传
	 */
	@ApiField("transmission_type")
	private String transmissionType;

	/**
	 * 单价（日均价），单位分。待支付必传
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车型品牌名
	 */
	@ApiField("vehicle_brand_name")
	private String vehicleBrandName;

	/**
	 * 车牌号码
	 */
	@ApiField("vehicle_plate_no")
	private String vehiclePlateNo;

	/**
	 * 车型车系名
	 */
	@ApiField("vehicle_series_name")
	private String vehicleSeriesName;

	/**
	 * 车型展示名称。待支付必传
	 */
	@ApiField("vehicle_show_name")
	private String vehicleShowName;

	public AddRentTradeInfo getAddRentTradeList() {
		return this.addRentTradeList;
	}
	public void setAddRentTradeList(AddRentTradeInfo addRentTradeList) {
		this.addRentTradeList = addRentTradeList;
	}

	public Long getAppletsServiceAmount() {
		return this.appletsServiceAmount;
	}
	public void setAppletsServiceAmount(Long appletsServiceAmount) {
		this.appletsServiceAmount = appletsServiceAmount;
	}

	public String getAppletsServiceCategory() {
		return this.appletsServiceCategory;
	}
	public void setAppletsServiceCategory(String appletsServiceCategory) {
		this.appletsServiceCategory = appletsServiceCategory;
	}

	public Long getCancelledAmount() {
		return this.cancelledAmount;
	}
	public void setCancelledAmount(Long cancelledAmount) {
		this.cancelledAmount = cancelledAmount;
	}

	public String getCarlifeVehicleId() {
		return this.carlifeVehicleId;
	}
	public void setCarlifeVehicleId(String carlifeVehicleId) {
		this.carlifeVehicleId = carlifeVehicleId;
	}

	public Long getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(Long depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Long getDepositDeductAmount() {
		return this.depositDeductAmount;
	}
	public void setDepositDeductAmount(Long depositDeductAmount) {
		this.depositDeductAmount = depositDeductAmount;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDisplacement() {
		return this.displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getDriverMobile() {
		return this.driverMobile;
	}
	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Long getDrivingDistance() {
		return this.drivingDistance;
	}
	public void setDrivingDistance(Long drivingDistance) {
		this.drivingDistance = drivingDistance;
	}

	public String getDropOffAddress() {
		return this.dropOffAddress;
	}
	public void setDropOffAddress(String dropOffAddress) {
		this.dropOffAddress = dropOffAddress;
	}

	public String getDropOffCityCode() {
		return this.dropOffCityCode;
	}
	public void setDropOffCityCode(String dropOffCityCode) {
		this.dropOffCityCode = dropOffCityCode;
	}

	public String getDropOffCityName() {
		return this.dropOffCityName;
	}
	public void setDropOffCityName(String dropOffCityName) {
		this.dropOffCityName = dropOffCityName;
	}

	public String getDropOffRegionCode() {
		return this.dropOffRegionCode;
	}
	public void setDropOffRegionCode(String dropOffRegionCode) {
		this.dropOffRegionCode = dropOffRegionCode;
	}

	public String getDropOffRegionName() {
		return this.dropOffRegionName;
	}
	public void setDropOffRegionName(String dropOffRegionName) {
		this.dropOffRegionName = dropOffRegionName;
	}

	public String getDropOffStoreName() {
		return this.dropOffStoreName;
	}
	public void setDropOffStoreName(String dropOffStoreName) {
		this.dropOffStoreName = dropOffStoreName;
	}

	public Date getDropOffTime() {
		return this.dropOffTime;
	}
	public void setDropOffTime(Date dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public Long getFillAmount() {
		return this.fillAmount;
	}
	public void setFillAmount(Long fillAmount) {
		this.fillAmount = fillAmount;
	}

	public Boolean getHasContinueRent() {
		return this.hasContinueRent;
	}
	public void setHasContinueRent(Boolean hasContinueRent) {
		this.hasContinueRent = hasContinueRent;
	}

	public Boolean getHasDamage() {
		return this.hasDamage;
	}
	public void setHasDamage(Boolean hasDamage) {
		this.hasDamage = hasDamage;
	}

	public Boolean getHasEarlyGiveBack() {
		return this.hasEarlyGiveBack;
	}
	public void setHasEarlyGiveBack(Boolean hasEarlyGiveBack) {
		this.hasEarlyGiveBack = hasEarlyGiveBack;
	}

	public Boolean getHasViolation() {
		return this.hasViolation;
	}
	public void setHasViolation(Boolean hasViolation) {
		this.hasViolation = hasViolation;
	}

	public Boolean getHomeGetAndSend() {
		return this.homeGetAndSend;
	}
	public void setHomeGetAndSend(Boolean homeGetAndSend) {
		this.homeGetAndSend = homeGetAndSend;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Boolean getOtherDropOff() {
		return this.otherDropOff;
	}
	public void setOtherDropOff(Boolean otherDropOff) {
		this.otherDropOff = otherDropOff;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getOutOrderTime() {
		return this.outOrderTime;
	}
	public void setOutOrderTime(Date outOrderTime) {
		this.outOrderTime = outOrderTime;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPickUpAddress() {
		return this.pickUpAddress;
	}
	public void setPickUpAddress(String pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}

	public String getPickUpCityCode() {
		return this.pickUpCityCode;
	}
	public void setPickUpCityCode(String pickUpCityCode) {
		this.pickUpCityCode = pickUpCityCode;
	}

	public String getPickUpCityName() {
		return this.pickUpCityName;
	}
	public void setPickUpCityName(String pickUpCityName) {
		this.pickUpCityName = pickUpCityName;
	}

	public String getPickUpRegionCode() {
		return this.pickUpRegionCode;
	}
	public void setPickUpRegionCode(String pickUpRegionCode) {
		this.pickUpRegionCode = pickUpRegionCode;
	}

	public String getPickUpRegionName() {
		return this.pickUpRegionName;
	}
	public void setPickUpRegionName(String pickUpRegionName) {
		this.pickUpRegionName = pickUpRegionName;
	}

	public String getPickUpStoreName() {
		return this.pickUpStoreName;
	}
	public void setPickUpStoreName(String pickUpStoreName) {
		this.pickUpStoreName = pickUpStoreName;
	}

	public Date getPickUpTime() {
		return this.pickUpTime;
	}
	public void setPickUpTime(Date pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getRentCompanyName() {
		return this.rentCompanyName;
	}
	public void setRentCompanyName(String rentCompanyName) {
		this.rentCompanyName = rentCompanyName;
	}

	public String getStoreDropOffPhone() {
		return this.storeDropOffPhone;
	}
	public void setStoreDropOffPhone(String storeDropOffPhone) {
		this.storeDropOffPhone = storeDropOffPhone;
	}

	public String getStorePickUpPhone() {
		return this.storePickUpPhone;
	}
	public void setStorePickUpPhone(String storePickUpPhone) {
		this.storePickUpPhone = storePickUpPhone;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTransmissionType() {
		return this.transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public Long getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehicleBrandName() {
		return this.vehicleBrandName;
	}
	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getVehiclePlateNo() {
		return this.vehiclePlateNo;
	}
	public void setVehiclePlateNo(String vehiclePlateNo) {
		this.vehiclePlateNo = vehiclePlateNo;
	}

	public String getVehicleSeriesName() {
		return this.vehicleSeriesName;
	}
	public void setVehicleSeriesName(String vehicleSeriesName) {
		this.vehicleSeriesName = vehicleSeriesName;
	}

	public String getVehicleShowName() {
		return this.vehicleShowName;
	}
	public void setVehicleShowName(String vehicleShowName) {
		this.vehicleShowName = vehicleShowName;
	}

}

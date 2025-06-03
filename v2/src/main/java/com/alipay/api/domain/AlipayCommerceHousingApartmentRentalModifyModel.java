package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓房源修改
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:29
 */
public class AlipayCommerceHousingApartmentRentalModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6579687812522544337L;

	/**
	 * 外部房源id
	 */
	@ApiField("apartment_house_id")
	private String apartmentHouseId;

	/**
	 * 入住时间
	 */
	@ApiField("check_in_time")
	private String checkInTime;

	/**
	 * 押金
	 */
	@ApiField("deposit")
	private String deposit;

	/**
	 * 是否独卫
	 */
	@ApiField("has_private_bathroom")
	private String hasPrivateBathroom;

	/**
	 * 使用面积(平方米)
	 */
	@ApiField("internal_area")
	private String internalArea;

	/**
	 * 公寓名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 朝向
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * 付款方式(周/月/季)
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 租金(元)
	 */
	@ApiField("rent")
	private String rent;

	/**
	 * 租金单位
	 */
	@ApiField("rent_unit")
	private String rentUnit;

	/**
	 * 房源状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 校验码
	 */
	@ApiField("verification_code")
	private String verificationCode;

	public String getApartmentHouseId() {
		return this.apartmentHouseId;
	}
	public void setApartmentHouseId(String apartmentHouseId) {
		this.apartmentHouseId = apartmentHouseId;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getDeposit() {
		return this.deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getHasPrivateBathroom() {
		return this.hasPrivateBathroom;
	}
	public void setHasPrivateBathroom(String hasPrivateBathroom) {
		this.hasPrivateBathroom = hasPrivateBathroom;
	}

	public String getInternalArea() {
		return this.internalArea;
	}
	public void setInternalArea(String internalArea) {
		this.internalArea = internalArea;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getRent() {
		return this.rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getRentUnit() {
		return this.rentUnit;
	}
	public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerificationCode() {
		return this.verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

}

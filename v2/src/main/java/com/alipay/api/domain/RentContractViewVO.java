package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * C2C租房智能体合同展示模型
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:50
 */
public class RentContractViewVO extends AlipayObject {

	private static final long serialVersionUID = 1489433321629545359L;

	/**
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同备注
	 */
	@ApiField("contract_notes")
	private String contractNotes;

	/**
	 * 押金金额（单位：元 人民币）
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 设备清单
	 */
	@ApiListField("equipment_list")
	@ApiField("rent_house_equipment_v_o")
	private List<RentHouseEquipmentVO> equipmentList;

	/**
	 * 房东身份证
	 */
	@ApiField("landlord_id_number")
	private String landlordIdNumber;

	/**
	 * 房东姓名
	 */
	@ApiField("landlord_name")
	private String landlordName;

	/**
	 * 房东手机号
	 */
	@ApiField("landlord_phone")
	private String landlordPhone;

	/**
	 * 支付周期类型
	 */
	@ApiField("pay_period_type")
	private String payPeriodType;

	/**
	 * 租金金额（单位：元 人民币）
	 */
	@ApiField("rent_amount")
	private String rentAmount;

	/**
	 * 租期 单位：月
	 */
	@ApiField("rent_mouth")
	private Long rentMouth;

	/**
	 * 租房开始日期 yyyy-MM-dd
	 */
	@ApiField("rent_start_date")
	private String rentStartDate;

	/**
	 * 租客身份证
	 */
	@ApiField("renter_id_number")
	private String renterIdNumber;

	/**
	 * 租客姓名
	 */
	@ApiField("renter_name")
	private String renterName;

	/**
	 * 租客手机号
	 */
	@ApiField("renter_phone")
	private String renterPhone;

	/**
	 * 房屋地址
	 */
	@ApiField("room_address")
	private String roomAddress;

	/**
	 * 房屋面积（单位：平方米）
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * 房间备注
	 */
	@ApiField("room_notes")
	private String roomNotes;

	/**
	 * 出租方法
	 */
	@ApiField("room_rent_type")
	private String roomRentType;

	/**
	 * 是否芝麻免押
	 */
	@ApiField("support_no_deposit")
	private Boolean supportNoDeposit;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractNotes() {
		return this.contractNotes;
	}
	public void setContractNotes(String contractNotes) {
		this.contractNotes = contractNotes;
	}

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public List<RentHouseEquipmentVO> getEquipmentList() {
		return this.equipmentList;
	}
	public void setEquipmentList(List<RentHouseEquipmentVO> equipmentList) {
		this.equipmentList = equipmentList;
	}

	public String getLandlordIdNumber() {
		return this.landlordIdNumber;
	}
	public void setLandlordIdNumber(String landlordIdNumber) {
		this.landlordIdNumber = landlordIdNumber;
	}

	public String getLandlordName() {
		return this.landlordName;
	}
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}

	public String getLandlordPhone() {
		return this.landlordPhone;
	}
	public void setLandlordPhone(String landlordPhone) {
		this.landlordPhone = landlordPhone;
	}

	public String getPayPeriodType() {
		return this.payPeriodType;
	}
	public void setPayPeriodType(String payPeriodType) {
		this.payPeriodType = payPeriodType;
	}

	public String getRentAmount() {
		return this.rentAmount;
	}
	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Long getRentMouth() {
		return this.rentMouth;
	}
	public void setRentMouth(Long rentMouth) {
		this.rentMouth = rentMouth;
	}

	public String getRentStartDate() {
		return this.rentStartDate;
	}
	public void setRentStartDate(String rentStartDate) {
		this.rentStartDate = rentStartDate;
	}

	public String getRenterIdNumber() {
		return this.renterIdNumber;
	}
	public void setRenterIdNumber(String renterIdNumber) {
		this.renterIdNumber = renterIdNumber;
	}

	public String getRenterName() {
		return this.renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getRenterPhone() {
		return this.renterPhone;
	}
	public void setRenterPhone(String renterPhone) {
		this.renterPhone = renterPhone;
	}

	public String getRoomAddress() {
		return this.roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

	public String getRoomArea() {
		return this.roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomNotes() {
		return this.roomNotes;
	}
	public void setRoomNotes(String roomNotes) {
		this.roomNotes = roomNotes;
	}

	public String getRoomRentType() {
		return this.roomRentType;
	}
	public void setRoomRentType(String roomRentType) {
		this.roomRentType = roomRentType;
	}

	public Boolean getSupportNoDeposit() {
		return this.supportNoDeposit;
	}
	public void setSupportNoDeposit(Boolean supportNoDeposit) {
		this.supportNoDeposit = supportNoDeposit;
	}

}

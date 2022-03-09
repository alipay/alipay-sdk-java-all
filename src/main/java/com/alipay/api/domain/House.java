package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 房产详情
 *
 * @author auto create
 * @since 1.0, 2021-02-01 13:53:27
 */
public class House extends AlipayObject {

	private static final long serialVersionUID = 4123927286174845695L;

	/**
	 * 房屋所在区县编号
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 建成年份
	 */
	@ApiField("built_year")
	private String builtYear;

	/**
	 * 房屋产权人列表
	 */
	@ApiListField("house_owners")
	@ApiField("house_owner")
	private List<HouseOwner> houseOwners;

	/**
	 * 不动产单元号(可能多个)
	 */
	@ApiListField("house_unit_codes")
	@ApiField("string")
	private List<String> houseUnitCodes;

	/**
	 * 房屋所在层数
	 */
	@ApiField("its_floor")
	private String itsFloor;

	/**
	 * 土地证号
	 */
	@ApiField("land_cert_no")
	private String landCertNo;

	/**
	 * 房屋坐落地址
	 */
	@ApiField("location")
	private String location;

	/**
	 * 是否有抵押。enum (Y, N)
	 */
	@ApiField("mortgaged")
	private String mortgaged;

	/**
	 * 房产共有情况。
enum (INDIVIDUALLY-单独所有, SHARE_COOWNER-共同共有, SEVERAL_COOWNER-按份共有, OTHER_COOWNER-其他共有, UNKNOWN--)
	 */
	@ApiField("owner_ship_status")
	private String ownerShipStatus;

	/**
	 * 房屋建筑面积
	 */
	@ApiField("structure_area")
	private String structureArea;

	/**
	 * 房屋建筑面积单位。
enum (SQUARE_METER-平方米, MU-亩, SQUARE_CENTIMETER-平方厘米, HECTARE-公顷)
	 */
	@ApiField("structure_area_unit")
	private String structureAreaUnit;

	/**
	 * 总层数
	 */
	@ApiField("total_floor")
	private String totalFloor;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBuiltYear() {
		return this.builtYear;
	}
	public void setBuiltYear(String builtYear) {
		this.builtYear = builtYear;
	}

	public List<HouseOwner> getHouseOwners() {
		return this.houseOwners;
	}
	public void setHouseOwners(List<HouseOwner> houseOwners) {
		this.houseOwners = houseOwners;
	}

	public List<String> getHouseUnitCodes() {
		return this.houseUnitCodes;
	}
	public void setHouseUnitCodes(List<String> houseUnitCodes) {
		this.houseUnitCodes = houseUnitCodes;
	}

	public String getItsFloor() {
		return this.itsFloor;
	}
	public void setItsFloor(String itsFloor) {
		this.itsFloor = itsFloor;
	}

	public String getLandCertNo() {
		return this.landCertNo;
	}
	public void setLandCertNo(String landCertNo) {
		this.landCertNo = landCertNo;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMortgaged() {
		return this.mortgaged;
	}
	public void setMortgaged(String mortgaged) {
		this.mortgaged = mortgaged;
	}

	public String getOwnerShipStatus() {
		return this.ownerShipStatus;
	}
	public void setOwnerShipStatus(String ownerShipStatus) {
		this.ownerShipStatus = ownerShipStatus;
	}

	public String getStructureArea() {
		return this.structureArea;
	}
	public void setStructureArea(String structureArea) {
		this.structureArea = structureArea;
	}

	public String getStructureAreaUnit() {
		return this.structureAreaUnit;
	}
	public void setStructureAreaUnit(String structureAreaUnit) {
		this.structureAreaUnit = structureAreaUnit;
	}

	public String getTotalFloor() {
		return this.totalFloor;
	}
	public void setTotalFloor(String totalFloor) {
		this.totalFloor = totalFloor;
	}

}

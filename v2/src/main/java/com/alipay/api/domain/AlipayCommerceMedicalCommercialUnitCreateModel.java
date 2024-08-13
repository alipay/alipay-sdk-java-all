package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗行业商业化门店入驻
 *
 * @author auto create
 * @since 1.0, 2024-04-09 11:54:28
 */
public class AlipayCommerceMedicalCommercialUnitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2873924934396778223L;

	/**
	 * 门店支持的商品ID列表
	 */
	@ApiListField("out_product_id_list")
	@ApiField("string")
	private List<String> outProductIdList;

	/**
	 * 门店地址
	 */
	@ApiField("unit_address")
	private String unitAddress;

	/**
	 * 城市编码
	 */
	@ApiField("unit_city_code")
	private String unitCityCode;

	/**
	 * 联系电话
	 */
	@ApiField("unit_contact_number")
	private String unitContactNumber;

	/**
	 * 门店维度
	 */
	@ApiField("unit_latitude")
	private String unitLatitude;

	/**
	 * 门店经度
	 */
	@ApiField("unit_longitude")
	private String unitLongitude;

	/**
	 * 门店名称
	 */
	@ApiField("unit_name")
	private String unitName;

	/**
	 * 门店营业时间
	 */
	@ApiField("unit_opening_hours")
	private String unitOpeningHours;

	/**
	 * 外部门店编码
	 */
	@ApiField("unit_out_code")
	private String unitOutCode;

	/**
	 * 门店所属商户PID
	 */
	@ApiField("unit_out_pid")
	private String unitOutPid;

	public List<String> getOutProductIdList() {
		return this.outProductIdList;
	}
	public void setOutProductIdList(List<String> outProductIdList) {
		this.outProductIdList = outProductIdList;
	}

	public String getUnitAddress() {
		return this.unitAddress;
	}
	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	public String getUnitCityCode() {
		return this.unitCityCode;
	}
	public void setUnitCityCode(String unitCityCode) {
		this.unitCityCode = unitCityCode;
	}

	public String getUnitContactNumber() {
		return this.unitContactNumber;
	}
	public void setUnitContactNumber(String unitContactNumber) {
		this.unitContactNumber = unitContactNumber;
	}

	public String getUnitLatitude() {
		return this.unitLatitude;
	}
	public void setUnitLatitude(String unitLatitude) {
		this.unitLatitude = unitLatitude;
	}

	public String getUnitLongitude() {
		return this.unitLongitude;
	}
	public void setUnitLongitude(String unitLongitude) {
		this.unitLongitude = unitLongitude;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitOpeningHours() {
		return this.unitOpeningHours;
	}
	public void setUnitOpeningHours(String unitOpeningHours) {
		this.unitOpeningHours = unitOpeningHours;
	}

	public String getUnitOutCode() {
		return this.unitOutCode;
	}
	public void setUnitOutCode(String unitOutCode) {
		this.unitOutCode = unitOutCode;
	}

	public String getUnitOutPid() {
		return this.unitOutPid;
	}
	public void setUnitOutPid(String unitOutPid) {
		this.unitOutPid = unitOutPid;
	}

}

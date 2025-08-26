package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送地址
 *
 * @author auto create
 * @since 1.0, 2023-12-08 16:43:50
 */
public class AssetDeliveryAddress extends AlipayObject {

	private static final long serialVersionUID = 3716952554393688647L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 收件人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 区信息
	 */
	@ApiField("district")
	private String district;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 仓库id
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	/**
	 * 供应商的仓库名称
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

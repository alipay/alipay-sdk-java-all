package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出库单模型
 *
 * @author auto create
 * @since 1.0, 2019-06-25 20:58:07
 */
public class StuffStockOutOrder extends AlipayObject {

	private static final long serialVersionUID = 1871199161812745434L;

	/**
	 * 市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区编号
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * erp订单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * erp订单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 出库单明细
	 */
	@ApiListField("order_items")
	@ApiField("stuff_stock_out_order_item")
	private List<StuffStockOutOrderItem> orderItems;

	/**
	 * 省编号
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 收货方地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收件方公司
	 */
	@ApiField("receiver_company")
	private String receiverCompany;

	/**
	 * 收件人
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件方联系方式
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收件方邮编
	 */
	@ApiField("receiver_zip_code")
	private String receiverZipCode;

	/**
	 * 顺丰订单类型
	 */
	@ApiField("sf_order_type")
	private String sfOrderType;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getErpOrder() {
		return this.erpOrder;
	}
	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}

	public String getErpOrderType() {
		return this.erpOrderType;
	}
	public void setErpOrderType(String erpOrderType) {
		this.erpOrderType = erpOrderType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<StuffStockOutOrderItem> getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(List<StuffStockOutOrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCompany() {
		return this.receiverCompany;
	}
	public void setReceiverCompany(String receiverCompany) {
		this.receiverCompany = receiverCompany;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverZipCode() {
		return this.receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

	public String getSfOrderType() {
		return this.sfOrderType;
	}
	public void setSfOrderType(String sfOrderType) {
		this.sfOrderType = sfOrderType;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}

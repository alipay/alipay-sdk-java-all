package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流服务商查询到的配送单
 *
 * @author auto create
 * @since 1.0, 2019-04-08 16:48:49
 */
public class DeliveryOrderApiInfo extends AlipayObject {

	private static final long serialVersionUID = 3185848293899712924L;

	/**
	 * 目标仓库收货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 目标仓库收货地址市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 目标仓库收货地址市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 目标仓库收货人联系方式
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 配送单号
	 */
	@ApiField("delivery_order_id")
	private String deliveryOrderId;

	/**
	 * 物流发发货类型：顺丰特惠、标快陆运、顺丰标快、重货包裹、小票零担、重货快运、物流普运、顺丰次晨、顺丰即日
	 */
	@ApiField("express_type")
	private String expressType;

	/**
	 * 保留字段，用于后期功能扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 配送单明细信息
	 */
	@ApiListField("item_info")
	@ApiField("delivery_order_item_info")
	private List<DeliveryOrderItemInfo> itemInfo;

	/**
	 * 目标仓库收货地址省编号
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 目标仓库收货地址省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 目标仓库收货人名称
	 */
	@ApiField("receiver_name")
	private String receiverName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

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

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDeliveryOrderId() {
		return this.deliveryOrderId;
	}
	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

	public String getExpressType() {
		return this.expressType;
	}
	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<DeliveryOrderItemInfo> getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(List<DeliveryOrderItemInfo> itemInfo) {
		this.itemInfo = itemInfo;
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

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

}

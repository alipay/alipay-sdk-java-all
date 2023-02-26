package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  餐饮服务标准化服务状态同步
 *
 * @author auto create
 * @since 1.0, 2021-09-14 14:12:04
 */
public class AlipayCommerceOperationIsvStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6624494356845351796L;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务子类型
PICK_UP = 自提
TAKE_AWAY = 外卖
QUEUE = 排队
	 */
	@ApiField("service_sub_type")
	private String serviceSubType;

	/**
	 * 商家服务状态枚举：OFFLINE("OFFLINE","下线状态")， IN_BUSINESS("IN_BUSINESS","营业中"),BUSY("BUSY","繁忙"),RESTING("RESTING","休息中"),RECEPTION_RESERVATION("RECEPTION_RESERVATION","接收预定");
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商家门店id（ISV内部门店唯一编号）
	 */
	@ApiField("store_id")
	private String storeId;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceSubType() {
		return this.serviceSubType;
	}
	public void setServiceSubType(String serviceSubType) {
		this.serviceSubType = serviceSubType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}

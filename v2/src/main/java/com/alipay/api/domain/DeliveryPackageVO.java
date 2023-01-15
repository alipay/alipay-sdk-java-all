package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包裹信息
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:31
 */
public class DeliveryPackageVO extends AlipayObject {

	private static final long serialVersionUID = 2246131138611883839L;

	/**
	 * 通知单id
	 */
	@ApiField("delivery_order_code")
	private String deliveryOrderCode;

	/**
	 * 菜鸟单号
	 */
	@ApiField("delivery_order_id")
	private String deliveryOrderId;

	/**
	 * 包裹明细
	 */
	@ApiListField("delivery_package_detail_list")
	@ApiField("delivery_package_detail")
	private List<DeliveryPackageDetail> deliveryPackageDetailList;

	/**
	 * 货运单号
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 包裹编码
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业id
	 */
	@ApiField("work_order_id")
	private String workOrderId;

	public String getDeliveryOrderCode() {
		return this.deliveryOrderCode;
	}
	public void setDeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}

	public String getDeliveryOrderId() {
		return this.deliveryOrderId;
	}
	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

	public List<DeliveryPackageDetail> getDeliveryPackageDetailList() {
		return this.deliveryPackageDetailList;
	}
	public void setDeliveryPackageDetailList(List<DeliveryPackageDetail> deliveryPackageDetailList) {
		this.deliveryPackageDetailList = deliveryPackageDetailList;
	}

	public String getExpressCode() {
		return this.expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}
	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

}

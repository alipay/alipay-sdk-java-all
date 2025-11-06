package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:43
 */
public class SaleOrderOpenApiRes extends AlipayObject {

	private static final long serialVersionUID = 2834477291511752919L;

	/**
	 * 实际发货时间
	 */
	@ApiField("actual_delivery_time")
	private Date actualDeliveryTime;

	/**
	 * 履约单号，即AO单号
	 */
	@ApiField("combine_number")
	private String combineNumber;

	/**
	 * 收货地址
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 发货完成时间
	 */
	@ApiField("delivery_finish_time")
	private Date deliveryFinishTime;

	/**
	 * 已发货的物料数量
	 */
	@ApiField("delivery_materials_count")
	private Long deliveryMaterialsCount;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_attr_list")
	@ApiField("ext_attribute_info")
	private List<ExtAttributeInfo> extAttrList;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 物流信息
	 */
	@ApiListField("logistics_facade_responses")
	@ApiField("logistics_facade_response")
	private List<LogisticsFacadeResponse> logisticsFacadeResponses;

	/**
	 * 物料数量，单位个
	 */
	@ApiField("materials_total")
	private Long materialsTotal;

	/**
	 * 订单id，即SO号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 点位名称
	 */
	@ApiField("point_name")
	private String pointName;

	/**
	 * 生产完成时间
	 */
	@ApiField("produce_finish_time")
	private Date produceFinishTime;

	/**
	 * 已生产物料数量
	 */
	@ApiField("production_materials_count")
	private String productionMaterialsCount;

	/**
	 * 收货人
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	public Date getActualDeliveryTime() {
		return this.actualDeliveryTime;
	}
	public void setActualDeliveryTime(Date actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}

	public String getCombineNumber() {
		return this.combineNumber;
	}
	public void setCombineNumber(String combineNumber) {
		this.combineNumber = combineNumber;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Date getDeliveryFinishTime() {
		return this.deliveryFinishTime;
	}
	public void setDeliveryFinishTime(Date deliveryFinishTime) {
		this.deliveryFinishTime = deliveryFinishTime;
	}

	public Long getDeliveryMaterialsCount() {
		return this.deliveryMaterialsCount;
	}
	public void setDeliveryMaterialsCount(Long deliveryMaterialsCount) {
		this.deliveryMaterialsCount = deliveryMaterialsCount;
	}

	public List<ExtAttributeInfo> getExtAttrList() {
		return this.extAttrList;
	}
	public void setExtAttrList(List<ExtAttributeInfo> extAttrList) {
		this.extAttrList = extAttrList;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<LogisticsFacadeResponse> getLogisticsFacadeResponses() {
		return this.logisticsFacadeResponses;
	}
	public void setLogisticsFacadeResponses(List<LogisticsFacadeResponse> logisticsFacadeResponses) {
		this.logisticsFacadeResponses = logisticsFacadeResponses;
	}

	public Long getMaterialsTotal() {
		return this.materialsTotal;
	}
	public void setMaterialsTotal(Long materialsTotal) {
		this.materialsTotal = materialsTotal;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPointName() {
		return this.pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public Date getProduceFinishTime() {
		return this.produceFinishTime;
	}
	public void setProduceFinishTime(Date produceFinishTime) {
		this.produceFinishTime = produceFinishTime;
	}

	public String getProductionMaterialsCount() {
		return this.productionMaterialsCount;
	}
	public void setProductionMaterialsCount(String productionMaterialsCount) {
		this.productionMaterialsCount = productionMaterialsCount;
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

}

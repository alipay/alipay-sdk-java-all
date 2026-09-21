package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:08:48
 */
public class OrderDetailOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 8441971471416379837L;

	/**
	 * null
	 */
	@ApiListField("delivery_express_info")
	@ApiField("delivery_logistics")
	private List<DeliveryLogistics> deliveryExpressInfo;

	/**
	 * 预计最早发货时间
	 */
	@ApiField("estimated_delivery_earliest_time")
	private Date estimatedDeliveryEarliestTime;

	/**
	 * 预计最晚发货时间
	 */
	@ApiField("estimated_delivery_latest_time")
	private Date estimatedDeliveryLatestTime;

	/**
	 * 下单时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单描述
	 */
	@ApiField("order_desc")
	private String orderDesc;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务编号，调用方传入的业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务商pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 订单物料数量（个）
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 对客订单状态，枚举值：AUDITING（审核中）、AUDIT_REJECT（审核拒绝）、TO_BE_SHIPPED（待发货）、SHIPPING（运输中）、RECEIVED（已签收）、NOT_RECEIVED（未签收）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板编码，订单关联的商品模板标识
	 */
	@ApiField("template_code")
	private String templateCode;

	public List<DeliveryLogistics> getDeliveryExpressInfo() {
		return this.deliveryExpressInfo;
	}
	public void setDeliveryExpressInfo(List<DeliveryLogistics> deliveryExpressInfo) {
		this.deliveryExpressInfo = deliveryExpressInfo;
	}

	public Date getEstimatedDeliveryEarliestTime() {
		return this.estimatedDeliveryEarliestTime;
	}
	public void setEstimatedDeliveryEarliestTime(Date estimatedDeliveryEarliestTime) {
		this.estimatedDeliveryEarliestTime = estimatedDeliveryEarliestTime;
	}

	public Date getEstimatedDeliveryLatestTime() {
		return this.estimatedDeliveryLatestTime;
	}
	public void setEstimatedDeliveryLatestTime(Date estimatedDeliveryLatestTime) {
		this.estimatedDeliveryLatestTime = estimatedDeliveryLatestTime;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderDesc() {
		return this.orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}

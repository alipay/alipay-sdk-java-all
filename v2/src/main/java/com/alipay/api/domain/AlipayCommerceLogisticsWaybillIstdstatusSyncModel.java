package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时配送运单状态变更通知(配送公司to蚂蚁)
 *
 * @author auto create
 * @since 1.0, 2023-06-14 09:55:26
 */
public class AlipayCommerceLogisticsWaybillIstdstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6155755118814661339L;

	/**
	 * 事件发生时间点
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 骑手和消费者联系记录
	 */
	@ApiListField("contact_records")
	@ApiField("contact_record")
	private List<ContactRecord> contactRecords;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 运单状态变更扩展信息
	 */
	@ApiField("order_ext_istd")
	private OrderChangeInfoExtIstd orderExtIstd;

	/**
	 * 支付宝订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 预计还剩多久送达，单位：秒
	 */
	@ApiField("reach_duration")
	private Long reachDuration;

	/**
	 * 骑手电话
	 */
	@ApiField("rider_mobile_no")
	private String riderMobileNo;

	/**
	 * 骑手姓名
	 */
	@ApiField("rider_name")
	private String riderName;

	/**
	 * 商家门店编号
	 */
	@ApiField("shop_no")
	private String shopNo;

	/**
	 * 即时配送运单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public List<ContactRecord> getContactRecords() {
		return this.contactRecords;
	}
	public void setContactRecords(List<ContactRecord> contactRecords) {
		this.contactRecords = contactRecords;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public OrderChangeInfoExtIstd getOrderExtIstd() {
		return this.orderExtIstd;
	}
	public void setOrderExtIstd(OrderChangeInfoExtIstd orderExtIstd) {
		this.orderExtIstd = orderExtIstd;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getReachDuration() {
		return this.reachDuration;
	}
	public void setReachDuration(Long reachDuration) {
		this.reachDuration = reachDuration;
	}

	public String getRiderMobileNo() {
		return this.riderMobileNo;
	}
	public void setRiderMobileNo(String riderMobileNo) {
		this.riderMobileNo = riderMobileNo;
	}

	public String getRiderName() {
		return this.riderName;
	}
	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}

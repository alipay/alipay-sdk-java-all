package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2025-04-16 20:00:53
 */
public class OrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5151987442236894724L;

	/**
	 * 订单取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 商家接单时间
	 */
	@ApiField("confirm_time")
	private Date confirmTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 订单发货时间
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * 配送方式
	 */
	@ApiField("delivery_type")
	private Long deliveryType;

	/**
	 * 订单完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 1是自费订单，2是医保订单
	 */
	@ApiField("mi_type")
	private Long miType;

	/**
	 * 下单备注
	 */
	@ApiField("note")
	private String note;

	/**
	 * 订单的场景值   1:O2O订单，2:B2C订单
	 */
	@ApiField("order_scene")
	private Long orderScene;

	/**
	 * 当日订单顺序号
	 */
	@ApiField("order_seq")
	private String orderSeq;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付完成时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 取货类型
	 */
	@ApiField("pick_type")
	private Long pickType;

	/**
	 * 送达时间类型
	 */
	@ApiField("pre_order_type")
	private Long preOrderType;

	/**
	 * 预计最晚送达时间
	 */
	@ApiField("predict_delivery_end_time")
	private Date predictDeliveryEndTime;

	/**
	 * 预计最早送达时间
	 */
	@ApiField("predict_delivery_start_time")
	private Date predictDeliveryStartTime;

	/**
	 * 商品总数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 1-处方订单，2-非处方订单
	 */
	@ApiField("rx_type")
	private Long rxType;

	/**
	 * 订单更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 用户期望最晚送达时间 当前字段已废弃(该字段和预计最晚送达时间重复，后续取预计最晚送达时间即可)
	 */
	@ApiField("user_expect_end_time")
	@Deprecated
	private Date userExpectEndTime;

	/**
	 * 用户期望最早送达时间 当前字段已废弃(该字段和预计最早送达时间重复，后续取预计最早送达时间即可)
	 */
	@ApiField("user_expect_start_time")
	@Deprecated
	private Date userExpectStartTime;

	/**
	 * 商品总重量，保留小数点后3位 + 单位， 单位固定两种（g和ml） 当前字段已废弃(商品总重量由items-weight_item汇总计算即可)
	 */
	@ApiField("weight")
	@Deprecated
	private Long weight;

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Long getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(Long deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Long getMiType() {
		return this.miType;
	}
	public void setMiType(Long miType) {
		this.miType = miType;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public Long getOrderScene() {
		return this.orderScene;
	}
	public void setOrderScene(Long orderScene) {
		this.orderScene = orderScene;
	}

	public String getOrderSeq() {
		return this.orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Long getPickType() {
		return this.pickType;
	}
	public void setPickType(Long pickType) {
		this.pickType = pickType;
	}

	public Long getPreOrderType() {
		return this.preOrderType;
	}
	public void setPreOrderType(Long preOrderType) {
		this.preOrderType = preOrderType;
	}

	public Date getPredictDeliveryEndTime() {
		return this.predictDeliveryEndTime;
	}
	public void setPredictDeliveryEndTime(Date predictDeliveryEndTime) {
		this.predictDeliveryEndTime = predictDeliveryEndTime;
	}

	public Date getPredictDeliveryStartTime() {
		return this.predictDeliveryStartTime;
	}
	public void setPredictDeliveryStartTime(Date predictDeliveryStartTime) {
		this.predictDeliveryStartTime = predictDeliveryStartTime;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getRxType() {
		return this.rxType;
	}
	public void setRxType(Long rxType) {
		this.rxType = rxType;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUserExpectEndTime() {
		return this.userExpectEndTime;
	}
	public void setUserExpectEndTime(Date userExpectEndTime) {
		this.userExpectEndTime = userExpectEndTime;
	}

	public Date getUserExpectStartTime() {
		return this.userExpectStartTime;
	}
	public void setUserExpectStartTime(Date userExpectStartTime) {
		this.userExpectStartTime = userExpectStartTime;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}

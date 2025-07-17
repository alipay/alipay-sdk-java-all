package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单状态
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:06
 */
public class DeliveryOrderProcessVO extends AlipayObject {

	private static final long serialVersionUID = 4823356838443583489L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 操作内容
	 */
	@ApiField("operate_info")
	private String operateInfo;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 操作人编码
	 */
	@ApiField("operator_code")
	private String operatorCode;

	/**
	 * 操作人
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 通知单id
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 菜鸟订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型
CGRK=采购入库
JYCK＝交易出库
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 订单状态
发货物流状态：ACCEPT=仓库接单; PRINT = 打印;PICK=捡货;CHECK = 复核 ;PACKAGE= 打包;WEIGH= 称重;READY=待提货;DELIVERED=已发货;REFUSE=买家拒签;EXCEPTION =异常;CLOSED= 关闭;CANCELED= 取 消;REJECT=仓库拒单;SIGN=签收;TMSCANCELED=快递拦截;OTHER=其他;PARTDELIVERED=部分发货完成;TMSCANCELFAILED=快递拦截失败。
补货单物流状态：ACCEPT=仓库接单;PARTFULFILLED-部分收货完成;FULFILLED=收货完成; EXCEPTION =异常;CLOSED= 关闭;CANCELED= 取 消;REJECT=仓库拒单;
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOperateInfo() {
		return this.operateInfo;
	}
	public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperatorCode() {
		return this.operatorCode;
	}
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房过程信息同步
 *
 * @author auto create
 * @since 1.0, 2026-07-08 11:52:56
 */
public class AlipayCommerceRentHouseProcessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3867464391913129786L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 大订单ID，可关联多个小二订单
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 租房agent派单的id，来源于商户接单时的id，用于关于商家接单任务
	 */
	@ApiField("dispatch_id")
	private String dispatchId;

	/**
	 * 房源在平台的唯一标识，（租房系统）来自房源创建接口的返回值
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 外部业务单号，用于关联短租交易方案
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 前序过程记录ID，首次提报时为null
	 */
	@ApiField("prev_process_id")
	private String prevProcessId;

	/**
	 * 过程发生时间
	 */
	@ApiField("process_time")
	private Date processTime;

	/**
	 * 租住过程
	 */
	@ApiField("rental_process")
	private String rentalProcess;

	/**
	 * 服务推进补充信息
	 */
	@ApiField("service_detail")
	private ServiceDetailE serviceDetail;

	/**
	 * 交易补充信息
	 */
	@ApiField("trade_detail")
	private TradeDetailE tradeDetail;

	/**
	 * 租房订单类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getDispatchId() {
		return this.dispatchId;
	}
	public void setDispatchId(String dispatchId) {
		this.dispatchId = dispatchId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrevProcessId() {
		return this.prevProcessId;
	}
	public void setPrevProcessId(String prevProcessId) {
		this.prevProcessId = prevProcessId;
	}

	public Date getProcessTime() {
		return this.processTime;
	}
	public void setProcessTime(Date processTime) {
		this.processTime = processTime;
	}

	public String getRentalProcess() {
		return this.rentalProcess;
	}
	public void setRentalProcess(String rentalProcess) {
		this.rentalProcess = rentalProcess;
	}

	public ServiceDetailE getServiceDetail() {
		return this.serviceDetail;
	}
	public void setServiceDetail(ServiceDetailE serviceDetail) {
		this.serviceDetail = serviceDetail;
	}

	public TradeDetailE getTradeDetail() {
		return this.tradeDetail;
	}
	public void setTradeDetail(TradeDetailE tradeDetail) {
		this.tradeDetail = tradeDetail;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

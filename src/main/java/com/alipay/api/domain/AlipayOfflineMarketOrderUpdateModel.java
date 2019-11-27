package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息变更接口，第三方调用此接口修改手艺人或开始服务时间
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:52:45
 */
public class AlipayOfflineMarketOrderUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2334655324894364551L;

	/**
	 * 服务结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 第三方手艺人id
	 */
	@ApiField("external_sp_id")
	private String externalSpId;

	/**
	 * 修改订单信息的备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 开始服务时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExternalSpId() {
		return this.externalSpId;
	}
	public void setExternalSpId(String externalSpId) {
		this.externalSpId = externalSpId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

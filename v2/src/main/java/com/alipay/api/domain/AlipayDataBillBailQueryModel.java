package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户保证金查询
 *
 * @author auto create
 * @since 1.0, 2023-05-05 19:49:16
 */
public class AlipayDataBillBailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5759837257438414712L;

	/**
	 * 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金
	 */
	@ApiField("bail_type")
	private String bailType;

	/**
	 * 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录
	 */
	@ApiField("biz_orig_no")
	private String bizOrigNo;

	/**
	 * 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 保证金流水创建时间的起始范围
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录
	 */
	@ApiField("trans_log_id")
	private String transLogId;

	public String getBailType() {
		return this.bailType;
	}
	public void setBailType(String bailType) {
		this.bailType = bailType;
	}

	public String getBizOrigNo() {
		return this.bizOrigNo;
	}
	public void setBizOrigNo(String bizOrigNo) {
		this.bizOrigNo = bizOrigNo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTransLogId() {
		return this.transLogId;
	}
	public void setTransLogId(String transLogId) {
		this.transLogId = transLogId;
	}

}

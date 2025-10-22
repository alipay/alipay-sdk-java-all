package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注销结果
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:15
 */
public class HonorLogoffResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3142959752991525159L;

	/**
	 * 荣耀侧授信申请流水号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 注销失败描述
	 */
	@ApiField("logoff_err_desc")
	private String logoffErrDesc;

	/**
	 * 1-注销成功--处理完成的结果
0-注销失败（不允许出现）
	 */
	@ApiField("logoff_status")
	private Long logoffStatus;

	/**
	 * 渠道方授信流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getLogoffErrDesc() {
		return this.logoffErrDesc;
	}
	public void setLogoffErrDesc(String logoffErrDesc) {
		this.logoffErrDesc = logoffErrDesc;
	}

	public Long getLogoffStatus() {
		return this.logoffStatus;
	}
	public void setLogoffStatus(Long logoffStatus) {
		this.logoffStatus = logoffStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}

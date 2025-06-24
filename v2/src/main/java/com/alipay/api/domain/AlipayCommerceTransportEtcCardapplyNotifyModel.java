package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡办理状态通知
 *
 * @author auto create
 * @since 1.0, 2023-05-05 17:41:22
 */
public class AlipayCommerceTransportEtcCardapplyNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1545357331281872254L;

	/**
	 * 银行侧开卡回传状态。注意对同一个开卡申请单每个阶段的状态不可被相互覆盖。例如：申请提交成功了，不再接受申请提交失败；申请提交失败了也不再接受申请提交成功。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 业务状态变更发生的时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 对部分状态值的额外描述，例如：回传申请提交失败状态时，可以通过这个字段传入失败原因（已持卡客户，重复提交客户，其他）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * order_id是支付宝侧生成，在开卡申请的时候作为业务方流水号传给银行，银行侧需要记下这个order_id，在开卡申请状态变更这个接口中回传
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号，在该接口中为银行侧生成的申请流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

}

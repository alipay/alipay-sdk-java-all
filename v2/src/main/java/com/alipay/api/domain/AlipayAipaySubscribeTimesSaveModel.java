package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅用户计次接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 19:11:49
 */
public class AlipayAipaySubscribeTimesSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6547976513697528337L;

	/**
	 * 计次时的渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用来作为幂等值传入
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订购计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 消耗次数
	 */
	@ApiField("use_times")
	private Long useTimes;

	/**
	 * 客户id
	 */
	@ApiField("uuid")
	private String uuid;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Long getUseTimes() {
		return this.useTimes;
	}
	public void setUseTimes(Long useTimes) {
		this.useTimes = useTimes;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}

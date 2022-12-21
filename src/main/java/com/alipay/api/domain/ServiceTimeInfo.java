package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线下服务时间信息
 *
 * @author auto create
 * @since 1.0, 2020-02-29 10:44:15
 */
public class ServiceTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 4675125584154397693L;

	/**
	 * 提前预约时间，单位分钟，大于0
	 */
	@ApiField("advance_time")
	private Long advanceTime;

	/**
	 * 时间节点，精确到分，“-” 分隔符
	 */
	@ApiListField("time_nodes")
	@ApiField("string")
	private List<String> timeNodes;

	public Long getAdvanceTime() {
		return this.advanceTime;
	}
	public void setAdvanceTime(Long advanceTime) {
		this.advanceTime = advanceTime;
	}

	public List<String> getTimeNodes() {
		return this.timeNodes;
	}
	public void setTimeNodes(List<String> timeNodes) {
		this.timeNodes = timeNodes;
	}

}

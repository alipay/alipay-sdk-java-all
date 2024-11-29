package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益规则配置信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:39:35
 */
public class TaskRightsRuleDynamicAwardConfigDto extends AlipayObject {

	private static final long serialVersionUID = 3755892146428721436L;

	/**
	 * 动态配置列表
	 */
	@ApiListField("data_list")
	@ApiField("dynamic_award_config_data_dto")
	private List<DynamicAwardConfigDataDto> dataList;

	/**
	 * 封顶持续额外奖励值
	 */
	@ApiField("reach_always_award_count")
	private Long reachAlwaysAwardCount;

	/**
	 * 封顶计算类型
	 */
	@ApiField("reach_type")
	private String reachType;

	public List<DynamicAwardConfigDataDto> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<DynamicAwardConfigDataDto> dataList) {
		this.dataList = dataList;
	}

	public Long getReachAlwaysAwardCount() {
		return this.reachAlwaysAwardCount;
	}
	public void setReachAlwaysAwardCount(Long reachAlwaysAwardCount) {
		this.reachAlwaysAwardCount = reachAlwaysAwardCount;
	}

	public String getReachType() {
		return this.reachType;
	}
	public void setReachType(String reachType) {
		this.reachType = reachType;
	}

}

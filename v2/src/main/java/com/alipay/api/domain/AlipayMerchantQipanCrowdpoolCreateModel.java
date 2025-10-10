package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群池创建
 *
 * @author auto create
 * @since 1.0, 2024-05-28 11:14:21
 */
public class AlipayMerchantQipanCrowdpoolCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8456472729185853437L;

	/**
	 * 安全应用范围，参考文档<a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 需要求交的人群编号列表
	 */
	@ApiListField("crowd_code_list")
	@ApiField("string")
	private List<String> crowdCodeList;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 交并差操作，说明具体操作的动作
	 */
	@ApiField("operation_type")
	private String operationType;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public List<String> getCrowdCodeList() {
		return this.crowdCodeList;
	}
	public void setCrowdCodeList(List<String> crowdCodeList) {
		this.crowdCodeList = crowdCodeList;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}

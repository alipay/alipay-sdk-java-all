package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 图灵标签圈选创建人群
 *
 * @author auto create
 * @since 1.0, 2023-12-04 15:23:30
 */
public class AlipayMerchantQipanCrowdwithturingtagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6322161965241324816L;

	/**
	 * 安全应用范围
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群id，人群加工必选
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 圈选的标签集合
	 */
	@ApiListField("crowd_pool_list")
	@ApiField("crowd_operation_pool")
	private List<CrowdOperationPool> crowdPoolList;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public List<CrowdOperationPool> getCrowdPoolList() {
		return this.crowdPoolList;
	}
	public void setCrowdPoolList(List<CrowdOperationPool> crowdPoolList) {
		this.crowdPoolList = crowdPoolList;
	}

}

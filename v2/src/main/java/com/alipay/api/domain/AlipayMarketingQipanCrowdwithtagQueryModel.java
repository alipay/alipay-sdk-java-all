package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签圈选预估人群规模
 *
 * @author auto create
 * @since 1.0, 2023-11-30 16:20:53
 */
public class AlipayMarketingQipanCrowdwithtagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5432233476326695316L;

	/**
	 * 人群id，人群二次加工时必传
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 选择的标签列表信息
	 */
	@ApiListField("select_tag_list")
	@ApiField("crowd_select_tag_open_request")
	private List<CrowdSelectTagOpenRequest> selectTagList;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public List<CrowdSelectTagOpenRequest> getSelectTagList() {
		return this.selectTagList;
	}
	public void setSelectTagList(List<CrowdSelectTagOpenRequest> selectTagList) {
		this.selectTagList = selectTagList;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据棋盘标签创建人群
 *
 * @author auto create
 * @since 1.0, 2023-03-29 17:21:33
 */
public class AlipayMarketingQipanCrowdwithtagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4152477632672326311L;

	/**
	 * 安全应用范围，参考文档 <a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 棋盘商家人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群id，人群加工必选
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 商家棋盘人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群标签值列表
	 */
	@ApiListField("select_tag_list")
	@ApiField("crowd_select_tag_open_request")
	private List<CrowdSelectTagOpenRequest> selectTagList;

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

	public List<CrowdSelectTagOpenRequest> getSelectTagList() {
		return this.selectTagList;
	}
	public void setSelectTagList(List<CrowdSelectTagOpenRequest> selectTagList) {
		this.selectTagList = selectTagList;
	}

}

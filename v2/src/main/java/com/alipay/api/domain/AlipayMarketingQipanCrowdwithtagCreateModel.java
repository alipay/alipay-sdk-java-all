package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据棋盘标签创建人群
 *
 * @author auto create
 * @since 1.0, 2023-11-30 16:20:53
 */
public class AlipayMarketingQipanCrowdwithtagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7557427184895693165L;

	/**
	 * 安全应用范围，参考文档 <a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 支付宝人群描述
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
最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群在支付宝棋盘站点是否可见,取值如下：
<li>true-支付宝站点<b>不可见</b></li>
<li>false-支付宝站点<b>可见，默认值</b></li>
使用说明：创建的人群后续需使用标签进行二次圈选，且本人群对商户不可见时可设置为true。
	 */
	@ApiField("hidden")
	private Boolean hidden;

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

	public Boolean getHidden() {
		return this.hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public List<CrowdSelectTagOpenRequest> getSelectTagList() {
		return this.selectTagList;
	}
	public void setSelectTagList(List<CrowdSelectTagOpenRequest> selectTagList) {
		this.selectTagList = selectTagList;
	}

}

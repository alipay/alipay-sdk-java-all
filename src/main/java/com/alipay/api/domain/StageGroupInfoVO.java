package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学段分组信息
 *
 * @author auto create
 * @since 1.0, 2020-08-18 20:13:59
 */
public class StageGroupInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3419471115398154595L;

	/**
	 * 学段分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 学段类目信息列表
	 */
	@ApiListField("stage_cate_infos")
	@ApiField("stage_cate_info_v_o")
	private List<StageCateInfoVO> stageCateInfos;

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<StageCateInfoVO> getStageCateInfos() {
		return this.stageCateInfos;
	}
	public void setStageCateInfos(List<StageCateInfoVO> stageCateInfos) {
		this.stageCateInfos = stageCateInfos;
	}

}

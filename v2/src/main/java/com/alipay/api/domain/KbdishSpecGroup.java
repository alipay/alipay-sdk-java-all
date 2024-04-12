package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品规格标签定制
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:40
 */
public class KbdishSpecGroup extends AlipayObject {

	private static final long serialVersionUID = 3342367553479683795L;

	/**
	 * 规格标签明细
	 */
	@ApiListField("spec_detail_list")
	@ApiField("kbdish_spec_group_detail")
	private List<KbdishSpecGroupDetail> specDetailList;

	/**
	 * 规格组id, 热组 冷组 去冰组
	 */
	@ApiField("spec_id")
	private String specId;

	/**
	 * 规格组的名称
	 */
	@ApiField("spec_name")
	private String specName;

	public List<KbdishSpecGroupDetail> getSpecDetailList() {
		return this.specDetailList;
	}
	public void setSpecDetailList(List<KbdishSpecGroupDetail> specDetailList) {
		this.specDetailList = specDetailList;
	}

	public String getSpecId() {
		return this.specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品简化接口套餐组信息
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishGroupSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3243247275251595399L;

	/**
	 * 套餐组上的活动信息，属isv外部活动信息
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 套餐组明细
	 */
	@ApiListField("group_detail_list")
	@ApiField("kbdish_group_detail_simplify_info")
	private List<KbdishGroupDetailSimplifyInfo> groupDetailList;

	/**
	 * 套餐组规则，fix：是否固定套餐，true：是；false：不是。max_count：最大可选数量；min_count：最小可选数量。sort：套餐组排序值数字从小到大排
	 */
	@ApiField("group_rule")
	private String groupRule;

	/**
	 * 套餐组名称，固定组可不传
	 */
	@ApiField("name")
	private String name;

	public String getActivityInfo() {
		return this.activityInfo;
	}
	public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

	public List<KbdishGroupDetailSimplifyInfo> getGroupDetailList() {
		return this.groupDetailList;
	}
	public void setGroupDetailList(List<KbdishGroupDetailSimplifyInfo> groupDetailList) {
		this.groupDetailList = groupDetailList;
	}

	public String getGroupRule() {
		return this.groupRule;
	}
	public void setGroupRule(String groupRule) {
		this.groupRule = groupRule;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

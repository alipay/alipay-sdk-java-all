package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品估清数据同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:36:07
 */
public class KoubeiCateringDishEstimatedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7845769798312221281L;

	/**
	 * 菜品估清类型,estimated表示菜品估清
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 菜品估清对象列表
	 */
	@ApiListField("kbdish_estimated_list")
	@ApiField("kbdish_estimated_info")
	private List<KbdishEstimatedInfo> kbdishEstimatedList;

	/**
	 * 同步类型,update会覆盖更新，目前只支持update
	 */
	@ApiField("syn_type")
	private String synType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<KbdishEstimatedInfo> getKbdishEstimatedList() {
		return this.kbdishEstimatedList;
	}
	public void setKbdishEstimatedList(List<KbdishEstimatedInfo> kbdishEstimatedList) {
		this.kbdishEstimatedList = kbdishEstimatedList;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}

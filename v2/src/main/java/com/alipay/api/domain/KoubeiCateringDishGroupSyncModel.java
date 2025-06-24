package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品项目组数据同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:40:16
 */
public class KoubeiCateringDishGroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7123327693356675522L;

	/**
	 * 口碑菜品套餐项目组
	 */
	@ApiField("kb_dish_group")
	private KbdishGroupInfo kbDishGroup;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更,del 删除
	 */
	@ApiField("syn_type")
	private String synType;

	public KbdishGroupInfo getKbDishGroup() {
		return this.kbDishGroup;
	}
	public void setKbDishGroup(KbdishGroupInfo kbDishGroup) {
		this.kbDishGroup = kbDishGroup;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}

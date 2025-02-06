package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区餐台同步api
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:40:38
 */
public class KoubeiCateringDishAreaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4151688461633498246L;

	/**
	 * area:操作餐区模型 ;  tab:餐台列表; dish:操作开台菜列表    说明 修改全字段修改,设置为空则更新为空
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑餐区模型。包含了餐台以及开台菜
	 */
	@ApiField("kb_dish_area")
	private KbdishAreaInfo kbDishArea;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更,del 删除
	 */
	@ApiField("syn_type")
	private String synType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public KbdishAreaInfo getKbDishArea() {
		return this.kbDishArea;
	}
	public void setKbDishArea(KbdishAreaInfo kbDishArea) {
		this.kbDishArea = kbDishArea;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}

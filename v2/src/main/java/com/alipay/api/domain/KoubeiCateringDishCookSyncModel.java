package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品中心菜谱同步api
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:41:19
 */
public class KoubeiCateringDishCookSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7247158235251311481L;

	/**
	 * cook：操作菜谱信息 ; shop:全量覆盖门店; detail;操作菜谱明细以及价格
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑菜谱
	 */
	@ApiField("kb_dish_cook")
	private KbdishCookInfo kbDishCook;

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

	public KbdishCookInfo getKbDishCook() {
		return this.kbDishCook;
	}
	public void setKbDishCook(KbdishCookInfo kbDishCook) {
		this.kbDishCook = kbDishCook;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}

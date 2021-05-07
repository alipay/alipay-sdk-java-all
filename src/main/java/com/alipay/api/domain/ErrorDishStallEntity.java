package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 异常分配菜品集合模型
 *
 * @author auto create
 * @since 1.0, 2018-11-21 14:21:57
 */
public class ErrorDishStallEntity extends AlipayObject {

	private static final long serialVersionUID = 3761844789368171197L;

	/**
	 * 未关联档口菜品集合
	 */
	@ApiListField("no_set_stall")
	@ApiField("error_dish_entity")
	private List<ErrorDishEntity> noSetStall;

	/**
	 * 重复关联档口菜品集合
	 */
	@ApiListField("repeat_set_stall")
	@ApiField("error_dish_entity")
	private List<ErrorDishEntity> repeatSetStall;

	public List<ErrorDishEntity> getNoSetStall() {
		return this.noSetStall;
	}
	public void setNoSetStall(List<ErrorDishEntity> noSetStall) {
		this.noSetStall = noSetStall;
	}

	public List<ErrorDishEntity> getRepeatSetStall() {
		return this.repeatSetStall;
	}
	public void setRepeatSetStall(List<ErrorDishEntity> repeatSetStall) {
		this.repeatSetStall = repeatSetStall;
	}

}

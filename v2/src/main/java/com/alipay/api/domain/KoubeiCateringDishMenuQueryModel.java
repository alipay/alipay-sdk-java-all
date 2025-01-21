package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜谱查询简化接口
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:41:54
 */
public class KoubeiCateringDishMenuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3592272162963911135L;

	/**
	 * 菜谱名称
	 */
	@ApiField("cook_name")
	private String cookName;

	public String getCookName() {
		return this.cookName;
	}
	public void setCookName(String cookName) {
		this.cookName = cookName;
	}

}

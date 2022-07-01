package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量起售/停售菜品
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:19:10
 */
public class KoubeiCateringPosDishstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2837497612496843969L;

	/**
	 * 需要改售卖状态的菜品id集合
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * open:起售；stop:停售
	 */
	@ApiField("status")
	private String status;

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

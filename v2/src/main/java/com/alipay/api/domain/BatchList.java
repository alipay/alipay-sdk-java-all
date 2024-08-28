package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成组列表
 *
 * @author auto create
 * @since 1.0, 2024-07-23 16:01:39
 */
public class BatchList extends AlipayObject {

	private static final long serialVersionUID = 5255292374391645573L;

	/**
	 * 送礼后效果动作描述，最长3个字
	 */
	@ApiField("action")
	private String action;

	/**
	 * 批量数量，最大10000
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 送礼后效果描述，最长8个字
	 */
	@ApiField("object_being_acted")
	private String objectBeingActed;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getObjectBeingActed() {
		return this.objectBeingActed;
	}
	public void setObjectBeingActed(String objectBeingActed) {
		this.objectBeingActed = objectBeingActed;
	}

}

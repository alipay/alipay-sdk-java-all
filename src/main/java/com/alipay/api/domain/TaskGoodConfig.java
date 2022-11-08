package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务单品信息
 *
 * @author auto create
 * @since 1.0, 2022-06-24 14:33:50
 */
public class TaskGoodConfig extends AlipayObject {

	private static final long serialVersionUID = 3493723193255421547L;

	/**
	 * 商品id
	 */
	@ApiField("good_id")
	private String goodId;

	/**
	 * 商品名称
	 */
	@ApiField("good_name")
	private String goodName;

	public String getGoodId() {
		return this.goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodName() {
		return this.goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

}

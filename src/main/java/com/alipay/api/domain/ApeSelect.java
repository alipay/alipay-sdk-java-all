package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape选品模型
 *
 * @author auto create
 * @since 1.0, 2022-11-02 14:24:09
 */
public class ApeSelect extends AlipayObject {

	private static final long serialVersionUID = 2347523167885234279L;

	/**
	 * 物品的唯一id（允许存在英文）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 选品池id
	 */
	@ApiField("select_id")
	private String selectId;

	/**
	 * 只允许0或者1。0代表不可用，1代表可用。
	 */
	@ApiField("status")
	private Long status;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSelectId() {
		return this.selectId;
	}
	public void setSelectId(String selectId) {
		this.selectId = selectId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}

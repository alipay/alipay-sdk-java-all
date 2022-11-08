package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除人群
 *
 * @author auto create
 * @since 1.0, 2022-06-27 21:05:44
 */
public class DatadigitalFincloudFinsaasCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6276914747799722717L;

	/**
	 * 人群ID+唯一+删除人群
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 操作人ID+唯一+删除人群
	 */
	@ApiField("operator_id")
	private String operatorId;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}

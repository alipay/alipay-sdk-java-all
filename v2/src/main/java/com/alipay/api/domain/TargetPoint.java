package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 目标点
 *
 * @author auto create
 * @since 1.0, 2026-04-21 14:52:46
 */
public class TargetPoint extends AlipayObject {

	private static final long serialVersionUID = 5623846731757815179L;

	/**
	 * 目标点编号，如图层类型编号
	 */
	@ApiField("target_no")
	private String targetNo;

	/**
	 * null
	 */
	@ApiListField("target_no_attributes")
	@ApiField("target_key_value")
	private List<TargetKeyValue> targetNoAttributes;

	public String getTargetNo() {
		return this.targetNo;
	}
	public void setTargetNo(String targetNo) {
		this.targetNo = targetNo;
	}

	public List<TargetKeyValue> getTargetNoAttributes() {
		return this.targetNoAttributes;
	}
	public void setTargetNoAttributes(List<TargetKeyValue> targetNoAttributes) {
		this.targetNoAttributes = targetNoAttributes;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房业务主体特性同步接口
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class AlipayCommerceRentHouseBizentitySetModel extends AlipayObject {

	private static final long serialVersionUID = 6247945615415419987L;

	/**
	 * 房源item/小区community/商家merchant等
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * null
	 */
	@ApiListField("fields")
	@ApiField("field_value_pairs")
	private List<FieldValuePairs> fields;

	/**
	 * 房源id/小区id,从房源提报接口取值
	 */
	@ApiField("target_id")
	private String targetId;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public List<FieldValuePairs> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldValuePairs> fields) {
		this.fields = fields;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}

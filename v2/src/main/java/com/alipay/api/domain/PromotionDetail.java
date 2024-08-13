package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销明细
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:42:43
 */
public class PromotionDetail extends AlipayObject {

	private static final long serialVersionUID = 6282248175274893656L;

	/**
	 * 营销ID。若营销为平台红包时，由于平台红包聚合返回，则营销可能id为空
	 */
	@ApiField("id")
	private String id;

	/**
	 * 营销名称。若营销为平台红包时，该值返回，其他场景本接口不返回，以alipay.business.order.consult接口返回的营销名称为准
	 */
	@ApiField("name")
	private String name;

	/**
	 * 状态
VALID：可用
INVALID：不可用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 不可用原因
status=INVALID时不为空
	 */
	@ApiField("unavailable_reason")
	private String unavailableReason;

	/**
	 * 面值，根据券类型而定，比如满减：10，折扣：0.9(九折)
只有当status为INVALID时，才有可能券值为空
	 */
	@ApiField("value")
	private String value;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnavailableReason() {
		return this.unavailableReason;
	}
	public void setUnavailableReason(String unavailableReason) {
		this.unavailableReason = unavailableReason;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

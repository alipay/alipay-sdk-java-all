package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销标的对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InsMktObjectDTO extends AlipayObject {

	private static final long serialVersionUID = 5887253749183429851L;

	/**
	 * 活动标的id
	 */
	@ApiField("obj_id")
	private String objId;

	/**
	 * 标的类型
	 */
	@ApiField("type")
	private Long type;

	public String getObjId() {
		return this.objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑规格标签扩展
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:40
 */
public class KbdishSpecGroupDetail extends AlipayObject {

	private static final long serialVersionUID = 3649777893845155158L;

	/**
	 * 规格标签id
	 */
	@ApiField("spec_id")
	private String specId;

	/**
	 * 规格标签的名称
	 */
	@ApiField("spec_name")
	private String specName;

	public String getSpecId() {
		return this.specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据affairId查询案件状态
 *
 * @author auto create
 * @since 1.0, 2023-03-20 22:40:35
 */
public class AntLinkeAlcollectioncenterAffairQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8743142688652832246L;

	/**
	 * 案件id
	 */
	@ApiField("affair_id")
	private String affairId;

	public String getAffairId() {
		return this.affairId;
	}
	public void setAffairId(String affairId) {
		this.affairId = affairId;
	}

}

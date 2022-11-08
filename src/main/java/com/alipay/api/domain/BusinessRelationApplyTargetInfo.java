package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系申请目标信息
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:29:23
 */
public class BusinessRelationApplyTargetInfo extends AlipayObject {

	private static final long serialVersionUID = 1112159621976961764L;

	/**
	 * 申请的产品能力对应的目标id，当产品码为门店经营分析数据产品码时，填门店编号
	 */
	@ApiField("target_id")
	private String targetId;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}

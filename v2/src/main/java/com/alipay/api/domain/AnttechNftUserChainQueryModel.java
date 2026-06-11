package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户链上地址查询
 *
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:26
 */
public class AnttechNftUserChainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1278674163921883329L;

	/**
	 * 鲸探用户ID，可以为手机号、openUid
	 */
	@ApiField("fans_id")
	private String fansId;

	/**
	 * 鲸探用户ID类型
	 */
	@ApiField("fans_id_type")
	private String fansIdType;

	public String getFansId() {
		return this.fansId;
	}
	public void setFansId(String fansId) {
		this.fansId = fansId;
	}

	public String getFansIdType() {
		return this.fansIdType;
	}
	public void setFansIdType(String fansIdType) {
		this.fansIdType = fansIdType;
	}

}

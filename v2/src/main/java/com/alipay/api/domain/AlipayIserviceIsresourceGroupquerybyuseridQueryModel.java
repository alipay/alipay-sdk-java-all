package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过星云用户id查询技能组
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:04:27
 */
public class AlipayIserviceIsresourceGroupquerybyuseridQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2221922146815581764L;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 星云用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

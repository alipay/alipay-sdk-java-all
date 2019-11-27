package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息查询
 *
 * @author auto create
 * @since 1.0, 2015-11-18 20:10:08
 */
public class AlipayUserRoleAlipayUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4298212172331626535L;

	/**
	 * 时间
	 */
	@ApiField("req_time")
	private Date reqTime;

	public Date getReqTime() {
		return this.reqTime;
	}
	public void setReqTime(Date reqTime) {
		this.reqTime = reqTime;
	}

}

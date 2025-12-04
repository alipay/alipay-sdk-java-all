package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业添加代调用授权项
 *
 * @author auto create
 * @since 1.0, 2025-12-02 21:16:14
 */
public class AlipayOpenSpInteopAppauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4589858916928153311L;

	/**
	 * 业务开通主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 申请授权的三方应用appid
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

}

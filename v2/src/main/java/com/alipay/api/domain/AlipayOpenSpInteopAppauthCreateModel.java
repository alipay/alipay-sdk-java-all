package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业添加代调用授权项
 *
 * @author auto create
 * @since 1.0, 2025-12-16 10:12:42
 */
public class AlipayOpenSpInteopAppauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6198533595367385747L;

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

	/**
	 * 代调用授权成功之后会在授权通知里携带此值
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}

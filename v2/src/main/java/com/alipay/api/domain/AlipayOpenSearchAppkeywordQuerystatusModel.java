package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询审核状态
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:25:25
 */
public class AlipayOpenSearchAppkeywordQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 5321726632874842562L;

	/**
	 * 审核工单id，提报接口的返回值
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序服务关键词的审核工单的状态
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:19:15
 */
public class AlipayOpenSearchSubservicekeywordQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 6125786368465477419L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费异步签约结果查询
 *
 * @author auto create
 * @since 1.0, 2023-08-21 09:55:03
 */
public class AlipayEbppJfSignprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4833185257871436189L;

	/**
	 * 生活缴费代扣签约用户UID, 需要和异步签约的用户UID保持一致
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号, 必须和异步签约申请的外部流水号保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 异步签约流程ID
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 生活缴费代扣签约用户UID, 需要和异步签约的用户UID保持一致
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

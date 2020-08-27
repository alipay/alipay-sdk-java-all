package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.community.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-19 17:04:00
 */
public class AlipayEcoCplifeCommunityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879649824567776338L;

	/** 
	 * 小区变更成功后，若从当前状态到下一状态需要完成下一步条件代码。则返回该字段，否则不返回。
格式为“条件代码|操作主体”。
操作主体有：
INVOKER - 接口调用方
MERCHANT - 物业公司
AUDITOR - 平台审核方
条件代码包括但不限于：
WAIT_SERVICE_PROVISION - 等待基础服务初始化
WAIT_PROD_VERIFICATION - 等待在生产环境通过自测
WAIT_ONLINE_APPLICATION - 等待提起上线申请
WAIT_OFFLINE_APPLICATION - 等待提起下线申请
WAIT_CONFIRMATION - 等待相关方确认
WAIT_AUDITING - 等待审核
	 */
	@ApiField("next_action")
	private String nextAction;

	/** 
	 * 若小区信息变更成功，则返回当前状态。
	 */
	@ApiField("status")
	private String status;

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}
	public String getNextAction( ) {
		return this.nextAction;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.leads.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 10:43:45
 */
public class AntMerchantExpandLeadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1672257979587969223L;

	/** 
	 * 提报leads返回的错误,或者不通过的信息提示,根据提示信息可联系相关对接人员解决
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * leadsId信息,可以通过该ID查询相关信息,业务主键,如果失败则不一定有leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 是否需要通过风控审核leads信息,如果需要审核的话,则是异步等待消息通知
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * leads提报是否通过,未通过可以通过fail_reason查看具体失败原因,如果是repeat_leads_id有值,则代表leads_id重复
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 重复返回的leadsId信息
	 */
	@ApiField("repeat_leads_id")
	private String repeatLeadsId;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}
	public Boolean getNeedAudit( ) {
		return this.needAudit;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setRepeatLeadsId(String repeatLeadsId) {
		this.repeatLeadsId = repeatLeadsId;
	}
	public String getRepeatLeadsId( ) {
		return this.repeatLeadsId;
	}

}

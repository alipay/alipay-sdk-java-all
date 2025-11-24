package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bizinfo.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppIndustryBizinfoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2431872126579369618L;

	/** 
	 * 业务能力码，标识业务场景
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * 支付宝办理流水号，支持幂等
	 */
	@ApiField("apply_flow_no")
	private String applyFlowNo;

	/** 
	 * 业务账户号，例如水费单号，电费号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 机构结果码
	 */
	@ApiField("org_result_code")
	private String orgResultCode;

	/** 
	 * 外部申请流水号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果上下文，json格式
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 结果码描述文案
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 办理状态，SUCCESS：成功；FAILURE：失败；PROCESS：处理中
	 */
	@ApiField("status")
	private String status;

	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}
	public String getAbilityCode( ) {
		return this.abilityCode;
	}

	public void setApplyFlowNo(String applyFlowNo) {
		this.applyFlowNo = applyFlowNo;
	}
	public String getApplyFlowNo( ) {
		return this.applyFlowNo;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}
	public String getBizInst( ) {
		return this.bizInst;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setOrgResultCode(String orgResultCode) {
		this.orgResultCode = orgResultCode;
	}
	public String getOrgResultCode( ) {
		return this.orgResultCode;
	}

	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}
	public String getOutApplyNo( ) {
		return this.outApplyNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultContext(String resultContext) {
		this.resultContext = resultContext;
	}
	public String getResultContext( ) {
		return this.resultContext;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

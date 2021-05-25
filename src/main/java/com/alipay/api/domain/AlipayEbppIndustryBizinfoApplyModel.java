package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服行业通用业务办理
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:15:05
 */
public class AlipayEbppIndustryBizinfoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3164785887528446986L;

	/**
	 * 业务能力码，标识业务场景
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 业务账户号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/**
	 * 业务类型，公服业务：IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 外部申请流水号，支持幂等
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 请求上下文，json格式
	 */
	@ApiField("request_context")
	private String requestContext;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizInst() {
		return this.bizInst;
	}
	public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getRequestContext() {
		return this.requestContext;
	}
	public void setRequestContext(String requestContext) {
		this.requestContext = requestContext;
	}

}

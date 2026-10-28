package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业助手客户推荐
 *
 * @author auto create
 * @since 1.0, 2026-10-22 12:07:55
 */
public class ZhimaCreditEpAssistantCustomerRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 6581486523184971127L;

	/**
	 * 商家二级类目名称，最多30个Unicode码点。建议传入。推荐优先使用企信主营信息，缺失时使用该类目辅助推荐。
	 */
	@ApiField("category_lv_2_name")
	private String categoryLv2Name;

	/**
	 * 推荐渠道编码，必填。本次1688工作台场景固定传1688_workbench_preview。必须非空，服务端校验调用应用是否获准访问指定租户下的该渠道，不使用默认渠道兜底。
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 合作方用户标识，可选，传入时为1至64字符。本版本仅预留，不用于账户查询或建号，不影响推荐、快照隔离和会员权益判断。
	 */
	@ApiField("parterner_id")
	private String parternerId;

	/**
	 * 可选的预设推荐描述，最多200个Unicode码点，仅支持约定的预设模板语义；用户自由输入的检索需求由独立跳转链路承接。
	 */
	@ApiField("prompt")
	private String prompt;

	/**
	 * 调用追踪标识，必填，1至64字符。仅用于日志排查，不作为幂等键、推荐批次标识或授权凭证；相同值可用于重查，但不绑定原业务参数或原批次，不承诺请求级终态重放。每次调用按当前企业、渠道和北京时间自然日读取或触发推荐。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 可选的返回企业数量上限，默认5，范围1至5。结果不足时如实返回，不影响推荐快照隔离。
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 发起推荐的商家企业CRN，与返回的被推荐企业company_crn区分，不作为登录或授权凭证。示例为Mock占位值，不可用于真实请求。
	 */
	@ApiField("source_company_crn")
	private String sourceCompanyCrn;

	/**
	 * 商家企业名称，最多50个Unicode码点。建议传入，作为辅助信息，不覆盖CRN确定的企业身份。
	 */
	@ApiField("source_company_name")
	private String sourceCompanyName;

	/**
	 * 业务租户编码，必填。本次1688场景固定传1688。必须非空，服务端校验调用应用是否获准访问该租户，不使用默认租户兜底。
	 */
	@ApiField("tenant")
	private String tenant;

	public String getCategoryLv2Name() {
		return this.categoryLv2Name;
	}
	public void setCategoryLv2Name(String categoryLv2Name) {
		this.categoryLv2Name = categoryLv2Name;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getParternerId() {
		return this.parternerId;
	}
	public void setParternerId(String parternerId) {
		this.parternerId = parternerId;
	}

	public String getPrompt() {
		return this.prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getSourceCompanyCrn() {
		return this.sourceCompanyCrn;
	}
	public void setSourceCompanyCrn(String sourceCompanyCrn) {
		this.sourceCompanyCrn = sourceCompanyCrn;
	}

	public String getSourceCompanyName() {
		return this.sourceCompanyName;
	}
	public void setSourceCompanyName(String sourceCompanyName) {
		this.sourceCompanyName = sourceCompanyName;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}

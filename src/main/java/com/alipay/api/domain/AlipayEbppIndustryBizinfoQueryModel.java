package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服行业通用业务信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:08
 */
public class AlipayEbppIndustryBizinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1795741576568423452L;

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
	 * 业务数据码，标识业务场景
	 */
	@ApiField("data_code")
	private String dataCode;

	/**
	 * 请求上下文，json格式
	 */
	@ApiField("request_context")
	private String requestContext;

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

	public String getDataCode() {
		return this.dataCode;
	}
	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public String getRequestContext() {
		return this.requestContext;
	}
	public void setRequestContext(String requestContext) {
		this.requestContext = requestContext;
	}

}

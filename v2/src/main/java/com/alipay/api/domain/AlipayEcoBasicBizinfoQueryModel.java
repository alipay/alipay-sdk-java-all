package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询城市服务中心化业务相关信息
 *
 * @author auto create
 * @since 1.0, 2022-11-15 11:26:40
 */
public class AlipayEcoBasicBizinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6557289327778755427L;

	/**
	 * 表示提供目标业务的机构名称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务数据码，标识业务场景，一般映射业务方的具体业务api
	 */
	@ApiField("data_code")
	private String dataCode;

	/**
	 * 输入参数的额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 目前机构需要的请求上下文，json格式
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRequestContext() {
		return this.requestContext;
	}
	public void setRequestContext(String requestContext) {
		this.requestContext = requestContext;
	}

}

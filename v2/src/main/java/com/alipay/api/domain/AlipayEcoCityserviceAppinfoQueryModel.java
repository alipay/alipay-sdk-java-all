package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市服务查询服务信息接口
 *
 * @author auto create
 * @since 1.0, 2020-05-22 13:38:24
 */
public class AlipayEcoCityserviceAppinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5295816994597663487L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 输入参数的额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 目前服务业务请求的上下文
	 */
	@ApiField("request_context")
	private String requestContext;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

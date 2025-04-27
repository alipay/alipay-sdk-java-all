package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询城服用户展台服务信息
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:33:51
 */
public class AlipayEcoCityserviceUserAppinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1759844916357562599L;

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

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

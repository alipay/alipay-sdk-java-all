package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.businesslist.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 10:42:49
 */
public class AlipayCommerceRetailBusinesslistSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3671541435313218358L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 返回参数
	 */
	@ApiField("response_list")
	private String responseList;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
	}

	public void setResponseList(String responseList) {
		this.responseList = responseList;
	}
	public String getResponseList( ) {
		return this.responseList;
	}

}

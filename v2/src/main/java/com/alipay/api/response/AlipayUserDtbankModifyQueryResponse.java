package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.modify.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 17:22:30
 */
public class AlipayUserDtbankModifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4161629494775359267L;

	/** 
	 * 修改活动类型，APPEND表示追加预算，DELAY表示活动延期
	 */
	@ApiField("modify_type")
	private String modifyType;

	/** 
	 * 追加金额：单位分； 活动结束时间：精确到秒，格式为2020-01-01 00:00:00
	 */
	@ApiField("modify_value")
	private String modifyValue;

	/** 
	 * 活动修改的结果，INIT表示处理中，SUCCESS表示成功，FAILED表示失败
	 */
	@ApiField("status")
	private String status;

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}
	public String getModifyType( ) {
		return this.modifyType;
	}

	public void setModifyValue(String modifyValue) {
		this.modifyValue = modifyValue;
	}
	public String getModifyValue( ) {
		return this.modifyValue;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

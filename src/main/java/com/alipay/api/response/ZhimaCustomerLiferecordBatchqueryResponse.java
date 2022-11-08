package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromiseDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.liferecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 16:01:51
 */
public class ZhimaCustomerLiferecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2423435342383251178L;

	/** 
	 * 生活记录详情列表
	 */
	@ApiListField("promise_details")
	@ApiField("promise_detail")
	private List<PromiseDetail> promiseDetails;

	/** 
	 * 响应码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * 响应码编号
	 */
	@ApiField("sub_code_number")
	private Long subCodeNumber;

	/** 
	 * 响应说明
	 */
	@ApiField("sub_message")
	private String subMessage;

	/** 
	 * 调用是否成功
	 */
	@ApiField("sub_success")
	private Boolean subSuccess;

	public void setPromiseDetails(List<PromiseDetail> promiseDetails) {
		this.promiseDetails = promiseDetails;
	}
	public List<PromiseDetail> getPromiseDetails( ) {
		return this.promiseDetails;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResCode( ) {
		return this.resCode;
	}

	public void setSubCodeNumber(Long subCodeNumber) {
		this.subCodeNumber = subCodeNumber;
	}
	public Long getSubCodeNumber( ) {
		return this.subCodeNumber;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
	public String getSubMessage( ) {
		return this.subMessage;
	}

	public void setSubSuccess(Boolean subSuccess) {
		this.subSuccess = subSuccess;
	}
	public Boolean getSubSuccess( ) {
		return this.subSuccess;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WorkerGetDetailData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.work.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:06
 */
public class DatadigitalAicsDevinWorkGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8232542599963194113L;

	/** 
	 * 数字员工详情，variables 为该数字人话术中引用的模板变量Code列表
	 */
	@ApiField("data")
	private WorkerGetDetailData data;

	public void setData(WorkerGetDetailData data) {
		this.data = data;
	}
	public WorkerGetDetailData getData( ) {
		return this.data;
	}

}

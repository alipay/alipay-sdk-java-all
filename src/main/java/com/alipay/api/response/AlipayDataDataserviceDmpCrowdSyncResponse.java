package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.dmp.crowd.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceDmpCrowdSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2625151135795185822L;

	/** 
	 * 返回人群同步任务的id，可用来查询人群同步任务的状态
	 */
	@ApiField("dump_id")
	private String dumpId;

	public void setDumpId(String dumpId) {
		this.dumpId = dumpId;
	}
	public String getDumpId( ) {
		return this.dumpId;
	}

}

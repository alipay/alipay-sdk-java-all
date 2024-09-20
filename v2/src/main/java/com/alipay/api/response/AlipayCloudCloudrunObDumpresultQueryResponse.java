package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DumpPageRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.ob.dumpresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-28 16:22:07
 */
public class AlipayCloudCloudrunObDumpresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1134783759248629113L;

	/** 
	 * list为任务列表，totalCount为任务总数
	 */
	@ApiField("dump_page_res")
	private DumpPageRes dumpPageRes;

	public void setDumpPageRes(DumpPageRes dumpPageRes) {
		this.dumpPageRes = dumpPageRes;
	}
	public DumpPageRes getDumpPageRes( ) {
		return this.dumpPageRes;
	}

}

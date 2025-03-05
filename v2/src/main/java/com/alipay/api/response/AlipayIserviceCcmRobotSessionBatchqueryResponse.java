package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FcStarRobotSessionPage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.session.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 17:52:25
 */
public class AlipayIserviceCcmRobotSessionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5699358171194746497L;

	/** 
	 * 会话列表分页数据
	 */
	@ApiField("data")
	private FcStarRobotSessionPage data;

	public void setData(FcStarRobotSessionPage data) {
		this.data = data;
	}
	public FcStarRobotSessionPage getData( ) {
		return this.data;
	}

}

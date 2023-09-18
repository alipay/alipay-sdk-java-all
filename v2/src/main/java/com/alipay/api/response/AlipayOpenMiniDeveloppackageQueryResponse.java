package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SingleStartAppVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.developpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:10:10
 */
public class AlipayOpenMiniDeveloppackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5512472661149593443L;

	/** 
	 * 单个小程序的启动结果VO
	 */
	@ApiField("single_start_app_vo")
	private SingleStartAppVO singleStartAppVo;

	public void setSingleStartAppVo(SingleStartAppVO singleStartAppVo) {
		this.singleStartAppVo = singleStartAppVo;
	}
	public SingleStartAppVO getSingleStartAppVo( ) {
		return this.singleStartAppVo;
	}

}

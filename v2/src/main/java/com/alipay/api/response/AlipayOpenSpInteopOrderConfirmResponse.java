package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntegratedOpenCheckInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 15:12:38
 */
public class AlipayOpenSpInteopOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2768228446143732577L;

	/** 
	 * 一体化作业的校验结果
	 */
	@ApiListField("check_result")
	@ApiField("integrated_open_check_info_v_o")
	private List<IntegratedOpenCheckInfoVO> checkResult;

	public void setCheckResult(List<IntegratedOpenCheckInfoVO> checkResult) {
		this.checkResult = checkResult;
	}
	public List<IntegratedOpenCheckInfoVO> getCheckResult( ) {
		return this.checkResult;
	}

}

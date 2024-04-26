package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplaycenterrea.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 19:06:39
 */
public class AlipayDataMdaTorchreplaycenterreaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6234469885942366441L;

	/** 
	 * 亚运在中国
	 */
	@ApiField("internal_china_replay_cnt")
	private Long internalChinaReplayCnt;

	/** 
	 * 南亚&中亚累计传递人次
	 */
	@ApiField("south_and_central_asia_torch_replay_cnt")
	private Long southAndCentralAsiaTorchReplayCnt;

	/** 
	 * 西亚&东南亚&东亚累计传递人次
	 */
	@ApiField("west_and_southeast_asia_torch_replay_cnt")
	private Long westAndSoutheastAsiaTorchReplayCnt;

	public void setInternalChinaReplayCnt(Long internalChinaReplayCnt) {
		this.internalChinaReplayCnt = internalChinaReplayCnt;
	}
	public Long getInternalChinaReplayCnt( ) {
		return this.internalChinaReplayCnt;
	}

	public void setSouthAndCentralAsiaTorchReplayCnt(Long southAndCentralAsiaTorchReplayCnt) {
		this.southAndCentralAsiaTorchReplayCnt = southAndCentralAsiaTorchReplayCnt;
	}
	public Long getSouthAndCentralAsiaTorchReplayCnt( ) {
		return this.southAndCentralAsiaTorchReplayCnt;
	}

	public void setWestAndSoutheastAsiaTorchReplayCnt(Long westAndSoutheastAsiaTorchReplayCnt) {
		this.westAndSoutheastAsiaTorchReplayCnt = westAndSoutheastAsiaTorchReplayCnt;
	}
	public Long getWestAndSoutheastAsiaTorchReplayCnt( ) {
		return this.westAndSoutheastAsiaTorchReplayCnt;
	}

}

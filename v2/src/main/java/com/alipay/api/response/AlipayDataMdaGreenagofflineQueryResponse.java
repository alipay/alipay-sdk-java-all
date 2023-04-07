package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.greenagoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 16:46:45
 */
public class AlipayDataMdaGreenagofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6374859822621411481L;

	/** 
	 * 完成公益任务人数
	 */
	@ApiField("completed_cnt")
	private Long completedCnt;

	/** 
	 * 亚运贡献公益林能量
	 */
	@ApiField("energy")
	private Long energy;

	/** 
	 * 公益林参与人数
	 */
	@ApiField("total_uv")
	private Long totalUv;

	public void setCompletedCnt(Long completedCnt) {
		this.completedCnt = completedCnt;
	}
	public Long getCompletedCnt( ) {
		return this.completedCnt;
	}

	public void setEnergy(Long energy) {
		this.energy = energy;
	}
	public Long getEnergy( ) {
		return this.energy;
	}

	public void setTotalUv(Long totalUv) {
		this.totalUv = totalUv;
	}
	public Long getTotalUv( ) {
		return this.totalUv;
	}

}

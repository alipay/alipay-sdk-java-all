package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.asiangamesoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:07:37
 */
public class AlipayDataMdaAsiangamesofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4495623982957918752L;

	/** 
	 * 亚运路线完成人数
	 */
	@ApiField("complete_route_uv")
	private Long completeRouteUv;

	/** 
	 * 步数绕地球圈数
	 */
	@ApiField("ring_cnt")
	private String ringCnt;

	/** 
	 * 累计步数
	 */
	@ApiField("steps_cnt")
	private Long stepsCnt;

	/** 
	 * TOP5亚运路线
	 */
	@ApiField("top_5_route")
	private String top5Route;

	/** 
	 * 亚运路线参与人数
	 */
	@ApiField("total_uv")
	private Long totalUv;

	public void setCompleteRouteUv(Long completeRouteUv) {
		this.completeRouteUv = completeRouteUv;
	}
	public Long getCompleteRouteUv( ) {
		return this.completeRouteUv;
	}

	public void setRingCnt(String ringCnt) {
		this.ringCnt = ringCnt;
	}
	public String getRingCnt( ) {
		return this.ringCnt;
	}

	public void setStepsCnt(Long stepsCnt) {
		this.stepsCnt = stepsCnt;
	}
	public Long getStepsCnt( ) {
		return this.stepsCnt;
	}

	public void setTop5Route(String top5Route) {
		this.top5Route = top5Route;
	}
	public String getTop5Route( ) {
		return this.top5Route;
	}

	public void setTotalUv(Long totalUv) {
		this.totalUv = totalUv;
	}
	public Long getTotalUv( ) {
		return this.totalUv;
	}

}

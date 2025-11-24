package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BrandRankDTO;
import com.alipay.api.domain.PortraitInMallResDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.business.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-30 10:02:01
 */
public class AlipayDataDataserviceBusinessReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5247482117323153649L;

	/** 
	 * 商圈内品牌排行结果
	 */
	@ApiField("brand_rank_dto")
	private BrandRankDTO brandRankDto;

	/** 
	 * 商圈范围居住人口数量
	 */
	@ApiField("live_user_cnt_in_range_code")
	private Long liveUserCntInRangeCode;

	/** 
	 * 商圈内用户画像结果
	 */
	@ApiField("portrait_in_mall_dto")
	private PortraitInMallResDTO portraitInMallDto;

	/** 
	 * 商圈范围常驻人口数量
	 */
	@ApiField("settled_user_cnt_in_range_code")
	private Long settledUserCntInRangeCode;

	/** 
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 商圈范围工作人口数量
	 */
	@ApiField("work_user_cnt_in_range_code")
	private Long workUserCntInRangeCode;

	public void setBrandRankDto(BrandRankDTO brandRankDto) {
		this.brandRankDto = brandRankDto;
	}
	public BrandRankDTO getBrandRankDto( ) {
		return this.brandRankDto;
	}

	public void setLiveUserCntInRangeCode(Long liveUserCntInRangeCode) {
		this.liveUserCntInRangeCode = liveUserCntInRangeCode;
	}
	public Long getLiveUserCntInRangeCode( ) {
		return this.liveUserCntInRangeCode;
	}

	public void setPortraitInMallDto(PortraitInMallResDTO portraitInMallDto) {
		this.portraitInMallDto = portraitInMallDto;
	}
	public PortraitInMallResDTO getPortraitInMallDto( ) {
		return this.portraitInMallDto;
	}

	public void setSettledUserCntInRangeCode(Long settledUserCntInRangeCode) {
		this.settledUserCntInRangeCode = settledUserCntInRangeCode;
	}
	public Long getSettledUserCntInRangeCode( ) {
		return this.settledUserCntInRangeCode;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setWorkUserCntInRangeCode(Long workUserCntInRangeCode) {
		this.workUserCntInRangeCode = workUserCntInRangeCode;
	}
	public Long getWorkUserCntInRangeCode( ) {
		return this.workUserCntInRangeCode;
	}

}

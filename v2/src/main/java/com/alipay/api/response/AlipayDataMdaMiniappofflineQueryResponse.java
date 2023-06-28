package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniappoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-14 12:16:56
 */
public class AlipayDataMdaMiniappofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8891384834399135714L;

	/** 
	 * 累计行程规划人数
	 */
	@ApiField("journey_planning")
	private Long journeyPlanning;

	/** 
	 * 累计行程规划人数趋势
	 */
	@ApiField("journey_planning_trend")
	private String journeyPlanningTrend;

	/** 
	 * 赛事关注TOP5
	 */
	@ApiField("match_focus")
	private String matchFocus;

	/** 
	 * 票+服务
	 */
	@ApiField("ticket_service")
	private String ticketService;

	/** 
	 * 亚运PASS
	 */
	@ApiField("use_pass")
	private Long usePass;

	/** 
	 * 用户分布城市TOP5
	 */
	@ApiField("user_distribution")
	private String userDistribution;

	public void setJourneyPlanning(Long journeyPlanning) {
		this.journeyPlanning = journeyPlanning;
	}
	public Long getJourneyPlanning( ) {
		return this.journeyPlanning;
	}

	public void setJourneyPlanningTrend(String journeyPlanningTrend) {
		this.journeyPlanningTrend = journeyPlanningTrend;
	}
	public String getJourneyPlanningTrend( ) {
		return this.journeyPlanningTrend;
	}

	public void setMatchFocus(String matchFocus) {
		this.matchFocus = matchFocus;
	}
	public String getMatchFocus( ) {
		return this.matchFocus;
	}

	public void setTicketService(String ticketService) {
		this.ticketService = ticketService;
	}
	public String getTicketService( ) {
		return this.ticketService;
	}

	public void setUsePass(Long usePass) {
		this.usePass = usePass;
	}
	public Long getUsePass( ) {
		return this.usePass;
	}

	public void setUserDistribution(String userDistribution) {
		this.userDistribution = userDistribution;
	}
	public String getUserDistribution( ) {
		return this.userDistribution;
	}

}

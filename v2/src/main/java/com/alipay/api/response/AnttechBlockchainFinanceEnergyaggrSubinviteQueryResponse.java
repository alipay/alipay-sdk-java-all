package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoadInfoNode;
import com.alipay.api.domain.BidResult;
import com.alipay.api.domain.DeclareStrategy;
import com.alipay.api.domain.EvaluateResult;
import com.alipay.api.domain.ResponseDeclare;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.energyaggr.subinvite.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 15:27:21
 */
public class AnttechBlockchainFinanceEnergyaggrSubinviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4174512674749584972L;

	/** 
	 * 场站子邀约中的场站基准曲线
	 */
	@ApiListField("base_line")
	@ApiField("load_info_node")
	private List<LoadInfoNode> baseLine;

	/** 
	 * 申报响应
	 */
	@ApiField("bid_result")
	private BidResult bidResult;

	/** 
	 * 申报开始时间
	 */
	@ApiField("declare_start_time")
	private Date declareStartTime;

	/** 
	 * 建议策略
	 */
	@ApiField("declare_strategy")
	private DeclareStrategy declareStrategy;

	/** 
	 * 响应评价结果
	 */
	@ApiField("evaluate_result")
	private EvaluateResult evaluateResult;

	/** 
	 * 邀约ID
	 */
	@ApiField("invite_id")
	private String inviteId;

	/** 
	 * 能量交易邀约名称
	 */
	@ApiField("invite_name")
	private String inviteName;

	/** 
	 * 邀约发布时间
	 */
	@ApiField("invite_release_time")
	private Date inviteReleaseTime;

	/** 
	 * 邀约类型
	 */
	@ApiField("invite_type")
	private String inviteType;

	/** 
	 * 需求响应邀约中的市场需求曲线
	 */
	@ApiListField("market_demand")
	@ApiField("load_info_node")
	private List<LoadInfoNode> marketDemand;

	/** 
	 * 申报策略
	 */
	@ApiField("response_declare")
	private ResponseDeclare responseDeclare;

	/** 
	 * 响应结束时间
	 */
	@ApiField("response_end_time")
	private Date responseEndTime;

	/** 
	 * 响应开始时间
	 */
	@ApiField("response_start_time")
	private Date responseStartTime;

	/** 
	 * 南向申报截止时间
	 */
	@ApiField("south_declare_end_time")
	private Date southDeclareEndTime;

	/** 
	 * 子邀约状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子邀约ID
	 */
	@ApiField("sub_invite_id")
	private String subInviteId;

	public void setBaseLine(List<LoadInfoNode> baseLine) {
		this.baseLine = baseLine;
	}
	public List<LoadInfoNode> getBaseLine( ) {
		return this.baseLine;
	}

	public void setBidResult(BidResult bidResult) {
		this.bidResult = bidResult;
	}
	public BidResult getBidResult( ) {
		return this.bidResult;
	}

	public void setDeclareStartTime(Date declareStartTime) {
		this.declareStartTime = declareStartTime;
	}
	public Date getDeclareStartTime( ) {
		return this.declareStartTime;
	}

	public void setDeclareStrategy(DeclareStrategy declareStrategy) {
		this.declareStrategy = declareStrategy;
	}
	public DeclareStrategy getDeclareStrategy( ) {
		return this.declareStrategy;
	}

	public void setEvaluateResult(EvaluateResult evaluateResult) {
		this.evaluateResult = evaluateResult;
	}
	public EvaluateResult getEvaluateResult( ) {
		return this.evaluateResult;
	}

	public void setInviteId(String inviteId) {
		this.inviteId = inviteId;
	}
	public String getInviteId( ) {
		return this.inviteId;
	}

	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
	}
	public String getInviteName( ) {
		return this.inviteName;
	}

	public void setInviteReleaseTime(Date inviteReleaseTime) {
		this.inviteReleaseTime = inviteReleaseTime;
	}
	public Date getInviteReleaseTime( ) {
		return this.inviteReleaseTime;
	}

	public void setInviteType(String inviteType) {
		this.inviteType = inviteType;
	}
	public String getInviteType( ) {
		return this.inviteType;
	}

	public void setMarketDemand(List<LoadInfoNode> marketDemand) {
		this.marketDemand = marketDemand;
	}
	public List<LoadInfoNode> getMarketDemand( ) {
		return this.marketDemand;
	}

	public void setResponseDeclare(ResponseDeclare responseDeclare) {
		this.responseDeclare = responseDeclare;
	}
	public ResponseDeclare getResponseDeclare( ) {
		return this.responseDeclare;
	}

	public void setResponseEndTime(Date responseEndTime) {
		this.responseEndTime = responseEndTime;
	}
	public Date getResponseEndTime( ) {
		return this.responseEndTime;
	}

	public void setResponseStartTime(Date responseStartTime) {
		this.responseStartTime = responseStartTime;
	}
	public Date getResponseStartTime( ) {
		return this.responseStartTime;
	}

	public void setSouthDeclareEndTime(Date southDeclareEndTime) {
		this.southDeclareEndTime = southDeclareEndTime;
	}
	public Date getSouthDeclareEndTime( ) {
		return this.southDeclareEndTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubInviteId(String subInviteId) {
		this.subInviteId = subInviteId;
	}
	public String getSubInviteId( ) {
		return this.subInviteId;
	}

}

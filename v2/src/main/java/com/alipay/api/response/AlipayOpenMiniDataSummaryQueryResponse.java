package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.data.summary.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:46:57
 */
public class AlipayOpenMiniDataSummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412718819258639544L;

	/** 
	 * 页面访问次数
	 */
	@ApiField("app_pv")
	private Long appPv;

	/** 
	 * 当日使用人数
	 */
	@ApiField("app_uv")
	private Long appUv;

	/** 
	 * 人均停留时长
	 */
	@ApiField("avg_stay_time_per_user")
	private Long avgStayTimePerUser;

	/** 
	 * 次均停留时长
	 */
	@ApiField("avg_stay_time_per_visit")
	private Long avgStayTimePerVisit;

	/** 
	 * 累计使用次数
	 */
	@ApiField("launch_cnt")
	private Long launchCnt;

	/** 
	 * 累计使用次数
	 */
	@ApiField("launch_cnt_dst")
	private Long launchCntDst;

	/** 
	 * 新增用户数
	 */
	@ApiField("new_user_cnt")
	private Long newUserCnt;

	/** 
	 * 当日分享次数
	 */
	@ApiField("share_cnt")
	private Long shareCnt;

	/** 
	 * 累计分享次数
	 */
	@ApiField("share_cnt_dst")
	private Long shareCntDst;

	/** 
	 * 当日分享人数
	 */
	@ApiField("share_user_cnt")
	private Long shareUserCnt;

	/** 
	 * 累计分享人数
	 */
	@ApiField("share_user_cnt_dst")
	private Long shareUserCntDst;

	/** 
	 * 30日活跃人数
	 */
	@ApiField("user_cnt_30_d")
	private Long userCnt30D;

	/** 
	 * 7日活跃人数
	 */
	@ApiField("user_cnt_7_d")
	private Long userCnt7D;

	/** 
	 * 累计使用人数
	 */
	@ApiField("user_cnt_dst")
	private Long userCntDst;

	public void setAppPv(Long appPv) {
		this.appPv = appPv;
	}
	public Long getAppPv( ) {
		return this.appPv;
	}

	public void setAppUv(Long appUv) {
		this.appUv = appUv;
	}
	public Long getAppUv( ) {
		return this.appUv;
	}

	public void setAvgStayTimePerUser(Long avgStayTimePerUser) {
		this.avgStayTimePerUser = avgStayTimePerUser;
	}
	public Long getAvgStayTimePerUser( ) {
		return this.avgStayTimePerUser;
	}

	public void setAvgStayTimePerVisit(Long avgStayTimePerVisit) {
		this.avgStayTimePerVisit = avgStayTimePerVisit;
	}
	public Long getAvgStayTimePerVisit( ) {
		return this.avgStayTimePerVisit;
	}

	public void setLaunchCnt(Long launchCnt) {
		this.launchCnt = launchCnt;
	}
	public Long getLaunchCnt( ) {
		return this.launchCnt;
	}

	public void setLaunchCntDst(Long launchCntDst) {
		this.launchCntDst = launchCntDst;
	}
	public Long getLaunchCntDst( ) {
		return this.launchCntDst;
	}

	public void setNewUserCnt(Long newUserCnt) {
		this.newUserCnt = newUserCnt;
	}
	public Long getNewUserCnt( ) {
		return this.newUserCnt;
	}

	public void setShareCnt(Long shareCnt) {
		this.shareCnt = shareCnt;
	}
	public Long getShareCnt( ) {
		return this.shareCnt;
	}

	public void setShareCntDst(Long shareCntDst) {
		this.shareCntDst = shareCntDst;
	}
	public Long getShareCntDst( ) {
		return this.shareCntDst;
	}

	public void setShareUserCnt(Long shareUserCnt) {
		this.shareUserCnt = shareUserCnt;
	}
	public Long getShareUserCnt( ) {
		return this.shareUserCnt;
	}

	public void setShareUserCntDst(Long shareUserCntDst) {
		this.shareUserCntDst = shareUserCntDst;
	}
	public Long getShareUserCntDst( ) {
		return this.shareUserCntDst;
	}

	public void setUserCnt30D(Long userCnt30D) {
		this.userCnt30D = userCnt30D;
	}
	public Long getUserCnt30D( ) {
		return this.userCnt30D;
	}

	public void setUserCnt7D(Long userCnt7D) {
		this.userCnt7D = userCnt7D;
	}
	public Long getUserCnt7D( ) {
		return this.userCnt7D;
	}

	public void setUserCntDst(Long userCntDst) {
		this.userCntDst = userCntDst;
	}
	public Long getUserCntDst( ) {
		return this.userCntDst;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车之家线索入库状态模型
 *
 * @author auto create
 * @since 1.0, 2026-06-17 15:23:50
 */
public class AutohomeDistributeStatusModel extends AlipayObject {

	private static final long serialVersionUID = 8668378653337562846L;

	/**
	 * 1:成功
2:失败
3:预留
	 */
	@ApiField("clues_distribute_state")
	private Long cluesDistributeState;

	/**
	 * 线索上报线索平台时间
	 */
	@ApiField("clues_push_stime")
	private Date cluesPushStime;

	/**
	 * 成交车系ID
	 */
	@ApiField("deal_series_id")
	private String dealSeriesId;

	/**
	 * 0：否
1：是
	 */
	@ApiField("deal_status")
	private Long dealStatus;

	/**
	 * 成交时间
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 定向分发失败原因详情
	 */
	@ApiField("direct_distribute_fail_detail_reason")
	private String directDistributeFailDetailReason;

	/**
	 * 定向分发失败原因
	 */
	@ApiField("direct_distribute_fail_reason")
	private String directDistributeFailReason;

	/**
	 * 1:成功 / 2:失败 / 3:预留
	 */
	@ApiField("direct_distribute_state")
	private Long directDistributeState;

	/**
	 * 定向分发时间
	 */
	@ApiField("direct_distribute_time")
	private Date directDistributeTime;

	/**
	 * 最终分发成功时间
	 */
	@ApiField("dist_time")
	private Date distTime;

	/**
	 * 最终分发失败原因详情
	 */
	@ApiField("distribute_fail_detail_reason")
	private String distributeFailDetailReason;

	/**
	 * 最终分发失败原因
	 */
	@ApiField("distribute_fail_reason")
	private String distributeFailReason;

	/**
	 * 1：已确认首触
2：已确认非首触
	 */
	@ApiField("first_touch")
	private Long firstTouch;

	/**
	 * 线索最终分发的任务ID
	 */
	@ApiField("key_activity_id")
	private String keyActivityId;

	/**
	 * 各业务线上报的线索ID
	 */
	@ApiField("key_business_id")
	private String keyBusinessId;

	/**
	 * 原始定向任务ID
	 */
	@ApiField("key_car_age")
	private String keyCarAge;

	/**
	 * 产品分类ID
	 */
	@ApiField("key_car_all_case")
	private Long keyCarAllCase;

	/**
	 * 车系ID
	 */
	@ApiField("key_car_audi_id")
	private String keyCarAudiId;

	/**
	 * 线索定制经销商id
	 */
	@ApiField("key_car_img_url")
	private String keyCarImgUrl;

	/**
	 * 线索经销商id
	 */
	@ApiField("key_distributor_id")
	private String keyDistributorId;

	/**
	 * 原始定向子任务ID
	 */
	@ApiField("key_ext_1")
	private String keyExt1;

	/**
	 * 成功分发需求业务线名称
	 */
	@ApiField("key_need_business_name")
	private String keyNeedBusinessName;

	/**
	 * 手机号hashcode
	 */
	@ApiField("key_phone_hashcode")
	private String keyPhoneHashcode;

	/**
	 * 上报业务线id
	 */
	@ApiField("key_supply_business_id")
	private String keySupplyBusinessId;

	/**
	 * 同一个keySplitId/keyUniqueId根据这个时间更新线索最新状态
	 */
	@ApiField("last_modified_stime")
	private Date lastModifiedStime;

	/**
	 * 线索拆分条数
	 */
	@ApiField("split_count")
	private Long splitCount;

	public Long getCluesDistributeState() {
		return this.cluesDistributeState;
	}
	public void setCluesDistributeState(Long cluesDistributeState) {
		this.cluesDistributeState = cluesDistributeState;
	}

	public Date getCluesPushStime() {
		return this.cluesPushStime;
	}
	public void setCluesPushStime(Date cluesPushStime) {
		this.cluesPushStime = cluesPushStime;
	}

	public String getDealSeriesId() {
		return this.dealSeriesId;
	}
	public void setDealSeriesId(String dealSeriesId) {
		this.dealSeriesId = dealSeriesId;
	}

	public Long getDealStatus() {
		return this.dealStatus;
	}
	public void setDealStatus(Long dealStatus) {
		this.dealStatus = dealStatus;
	}

	public Date getDealTime() {
		return this.dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getDirectDistributeFailDetailReason() {
		return this.directDistributeFailDetailReason;
	}
	public void setDirectDistributeFailDetailReason(String directDistributeFailDetailReason) {
		this.directDistributeFailDetailReason = directDistributeFailDetailReason;
	}

	public String getDirectDistributeFailReason() {
		return this.directDistributeFailReason;
	}
	public void setDirectDistributeFailReason(String directDistributeFailReason) {
		this.directDistributeFailReason = directDistributeFailReason;
	}

	public Long getDirectDistributeState() {
		return this.directDistributeState;
	}
	public void setDirectDistributeState(Long directDistributeState) {
		this.directDistributeState = directDistributeState;
	}

	public Date getDirectDistributeTime() {
		return this.directDistributeTime;
	}
	public void setDirectDistributeTime(Date directDistributeTime) {
		this.directDistributeTime = directDistributeTime;
	}

	public Date getDistTime() {
		return this.distTime;
	}
	public void setDistTime(Date distTime) {
		this.distTime = distTime;
	}

	public String getDistributeFailDetailReason() {
		return this.distributeFailDetailReason;
	}
	public void setDistributeFailDetailReason(String distributeFailDetailReason) {
		this.distributeFailDetailReason = distributeFailDetailReason;
	}

	public String getDistributeFailReason() {
		return this.distributeFailReason;
	}
	public void setDistributeFailReason(String distributeFailReason) {
		this.distributeFailReason = distributeFailReason;
	}

	public Long getFirstTouch() {
		return this.firstTouch;
	}
	public void setFirstTouch(Long firstTouch) {
		this.firstTouch = firstTouch;
	}

	public String getKeyActivityId() {
		return this.keyActivityId;
	}
	public void setKeyActivityId(String keyActivityId) {
		this.keyActivityId = keyActivityId;
	}

	public String getKeyBusinessId() {
		return this.keyBusinessId;
	}
	public void setKeyBusinessId(String keyBusinessId) {
		this.keyBusinessId = keyBusinessId;
	}

	public String getKeyCarAge() {
		return this.keyCarAge;
	}
	public void setKeyCarAge(String keyCarAge) {
		this.keyCarAge = keyCarAge;
	}

	public Long getKeyCarAllCase() {
		return this.keyCarAllCase;
	}
	public void setKeyCarAllCase(Long keyCarAllCase) {
		this.keyCarAllCase = keyCarAllCase;
	}

	public String getKeyCarAudiId() {
		return this.keyCarAudiId;
	}
	public void setKeyCarAudiId(String keyCarAudiId) {
		this.keyCarAudiId = keyCarAudiId;
	}

	public String getKeyCarImgUrl() {
		return this.keyCarImgUrl;
	}
	public void setKeyCarImgUrl(String keyCarImgUrl) {
		this.keyCarImgUrl = keyCarImgUrl;
	}

	public String getKeyDistributorId() {
		return this.keyDistributorId;
	}
	public void setKeyDistributorId(String keyDistributorId) {
		this.keyDistributorId = keyDistributorId;
	}

	public String getKeyExt1() {
		return this.keyExt1;
	}
	public void setKeyExt1(String keyExt1) {
		this.keyExt1 = keyExt1;
	}

	public String getKeyNeedBusinessName() {
		return this.keyNeedBusinessName;
	}
	public void setKeyNeedBusinessName(String keyNeedBusinessName) {
		this.keyNeedBusinessName = keyNeedBusinessName;
	}

	public String getKeyPhoneHashcode() {
		return this.keyPhoneHashcode;
	}
	public void setKeyPhoneHashcode(String keyPhoneHashcode) {
		this.keyPhoneHashcode = keyPhoneHashcode;
	}

	public String getKeySupplyBusinessId() {
		return this.keySupplyBusinessId;
	}
	public void setKeySupplyBusinessId(String keySupplyBusinessId) {
		this.keySupplyBusinessId = keySupplyBusinessId;
	}

	public Date getLastModifiedStime() {
		return this.lastModifiedStime;
	}
	public void setLastModifiedStime(Date lastModifiedStime) {
		this.lastModifiedStime = lastModifiedStime;
	}

	public Long getSplitCount() {
		return this.splitCount;
	}
	public void setSplitCount(Long splitCount) {
		this.splitCount = splitCount;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryTargetRegion;
import com.alipay.api.domain.SearchBoxActivityVideoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-09 11:05:06
 */
public class AlipayOpenSearchBoxactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8753629169316227141L;

	/** 
	 * 搜索直达活动id
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	/** 
	 * 搜索直达id
	 */
	@ApiField("box_id")
	private String boxId;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * IMAGE-图片/VIDEO-视频
	 */
	@ApiField("material_type")
	private String materialType;

	/** 
	 * 当material_type="IMAGE"时，为图片url；当material_type="VIDEO"时，为视频url
	 */
	@ApiField("material_url")
	private String materialUrl;

	/** 
	 * 运行状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架
	 */
	@ApiField("run_status")
	private String runStatus;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 配置状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 跳转应用ID
	 */
	@ApiField("target_appid")
	private String targetAppid;

	/** 
	 * 目标小程序名
	 */
	@ApiField("target_appname")
	private String targetAppname;

	/** 
	 * 投放目标区域
	 */
	@ApiListField("target_regions")
	@ApiField("delivery_target_region")
	private List<DeliveryTargetRegion> targetRegions;

	/** 
	 * 活动标题
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 搜索直达活动视频信息
	 */
	@ApiField("video_info")
	private SearchBoxActivityVideoInfo videoInfo;

	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}
	public String getBoxActivityId( ) {
		return this.boxActivityId;
	}

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}
	public String getBoxId( ) {
		return this.boxId;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public String getMaterialType( ) {
		return this.materialType;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}
	public String getRunStatus( ) {
		return this.runStatus;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}
	public String getTargetAppid( ) {
		return this.targetAppid;
	}

	public void setTargetAppname(String targetAppname) {
		this.targetAppname = targetAppname;
	}
	public String getTargetAppname( ) {
		return this.targetAppname;
	}

	public void setTargetRegions(List<DeliveryTargetRegion> targetRegions) {
		this.targetRegions = targetRegions;
	}
	public List<DeliveryTargetRegion> getTargetRegions( ) {
		return this.targetRegions;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setVideoInfo(SearchBoxActivityVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}
	public SearchBoxActivityVideoInfo getVideoInfo( ) {
		return this.videoInfo;
	}

}

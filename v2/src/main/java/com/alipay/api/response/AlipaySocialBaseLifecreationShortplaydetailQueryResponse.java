package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShortPlayChannelInfo;
import com.alipay.api.domain.ShortPlayCopyrightMaterial;
import com.alipay.api.domain.ShortPlayEpisodeInfo;
import com.alipay.api.domain.ShortPlayRecordMaterial;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplaydetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 23:37:50
 */
public class AlipaySocialBaseLifecreationShortplaydetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6133161724461475883L;

	/** 
	 * 短剧唯一标识
	 */
	@ApiField("album_id")
	private String albumId;

	/** 
	 * 广电备案号
	 */
	@ApiField("broadcast_record_number")
	private String broadcastRecordNumber;

	/** 
	 * 渠道分发状态列表
	 */
	@ApiListField("channel_status")
	@ApiField("short_play_channel_info")
	private List<ShortPlayChannelInfo> channelStatus;

	/** 
	 * 版权材料
	 */
	@ApiField("copyright_material")
	private ShortPlayCopyrightMaterial copyrightMaterial;

	/** 
	 * 封面媒资 ID
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 创建时间，时间戳（秒）
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * 剧集列表
	 */
	@ApiListField("episode_info_list")
	@ApiField("short_play_episode_info")
	private List<ShortPlayEpisodeInfo> episodeInfoList;

	/** 
	 * 备案材料
	 */
	@ApiField("record_material")
	private ShortPlayRecordMaterial recordMaterial;

	/** 
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/** 
	 * 短剧名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumId( ) {
		return this.albumId;
	}

	public void setBroadcastRecordNumber(String broadcastRecordNumber) {
		this.broadcastRecordNumber = broadcastRecordNumber;
	}
	public String getBroadcastRecordNumber( ) {
		return this.broadcastRecordNumber;
	}

	public void setChannelStatus(List<ShortPlayChannelInfo> channelStatus) {
		this.channelStatus = channelStatus;
	}
	public List<ShortPlayChannelInfo> getChannelStatus( ) {
		return this.channelStatus;
	}

	public void setCopyrightMaterial(ShortPlayCopyrightMaterial copyrightMaterial) {
		this.copyrightMaterial = copyrightMaterial;
	}
	public ShortPlayCopyrightMaterial getCopyrightMaterial( ) {
		return this.copyrightMaterial;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCover( ) {
		return this.cover;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setEpisodeInfoList(List<ShortPlayEpisodeInfo> episodeInfoList) {
		this.episodeInfoList = episodeInfoList;
	}
	public List<ShortPlayEpisodeInfo> getEpisodeInfoList( ) {
		return this.episodeInfoList;
	}

	public void setRecordMaterial(ShortPlayRecordMaterial recordMaterial) {
		this.recordMaterial = recordMaterial;
	}
	public ShortPlayRecordMaterial getRecordMaterial( ) {
		return this.recordMaterial;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}
	public List<String> getTagList( ) {
		return this.tagList;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateTime( ) {
		return this.updateTime;
	}

}

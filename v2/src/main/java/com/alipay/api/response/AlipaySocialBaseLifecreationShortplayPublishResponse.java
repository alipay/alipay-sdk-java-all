package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShortPlayPublishChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplay.publish response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 23:37:49
 */
public class AlipaySocialBaseLifecreationShortplayPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353913149383435345L;

	/** 
	 * 短剧唯一标识（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/** 
	 * 短剧发布渠道信息
	 */
	@ApiListField("publish_channel_info_list")
	@ApiField("short_play_publish_channel_info")
	private List<ShortPlayPublishChannelInfo> publishChannelInfoList;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumId( ) {
		return this.albumId;
	}

	public void setPublishChannelInfoList(List<ShortPlayPublishChannelInfo> publishChannelInfoList) {
		this.publishChannelInfoList = publishChannelInfoList;
	}
	public List<ShortPlayPublishChannelInfo> getPublishChannelInfoList( ) {
		return this.publishChannelInfoList;
	}

}

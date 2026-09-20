package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShortPlayChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplaypublish.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 23:37:49
 */
public class AlipaySocialBaseLifecreationShortplaypublishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1811918959368422463L;

	/** 
	 * 短剧 ID（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/** 
	 * 渠道发布结果
	 */
	@ApiListField("publish_info_list")
	@ApiField("short_play_channel_info")
	private List<ShortPlayChannelInfo> publishInfoList;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumId( ) {
		return this.albumId;
	}

	public void setPublishInfoList(List<ShortPlayChannelInfo> publishInfoList) {
		this.publishInfoList = publishInfoList;
	}
	public List<ShortPlayChannelInfo> getPublishInfoList( ) {
		return this.publishInfoList;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧发布结果查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 11:04:01
 */
public class AlipaySocialBaseLifecreationShortplaypublishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4477194363289397889L;

	/**
	 * 短剧ID（剧库ID）。
	 */
	@ApiField("album_id")
	private String albumId;

	public String getAlbumId() {
		return this.albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

}

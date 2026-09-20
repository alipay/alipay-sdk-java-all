package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧详情查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 11:03:50
 */
public class AlipaySocialBaseLifecreationShortplaydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7829168243131124656L;

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

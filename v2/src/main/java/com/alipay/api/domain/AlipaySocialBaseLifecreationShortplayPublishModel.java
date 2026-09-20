package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧提审发布接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:04
 */
public class AlipaySocialBaseLifecreationShortplayPublishModel extends AlipayObject {

	private static final long serialVersionUID = 7583644353367576696L;

	/**
	 * 短剧唯一标识（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/**
	 * 广电备案号。三方渠道版审送审时必填
	 */
	@ApiField("broadcast_record_number")
	private String broadcastRecordNumber;

	/**
	 * 渠道：0 商家小程序；1 生活号；
必填，会同时发布所有已发布的渠道；
	 */
	@ApiListField("channels")
	@ApiField("string")
	private List<String> channels;

	/**
	 * 版权材料
	 */
	@ApiField("copyright_material")
	private ShortPlayCopyrightMaterial copyrightMaterial;

	/**
	 * 生活号id，渠道为生活号必填
	 */
	@ApiField("public_id")
	private String publicId;

	public String getAlbumId() {
		return this.albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getBroadcastRecordNumber() {
		return this.broadcastRecordNumber;
	}
	public void setBroadcastRecordNumber(String broadcastRecordNumber) {
		this.broadcastRecordNumber = broadcastRecordNumber;
	}

	public List<String> getChannels() {
		return this.channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public ShortPlayCopyrightMaterial getCopyrightMaterial() {
		return this.copyrightMaterial;
	}
	public void setCopyrightMaterial(ShortPlayCopyrightMaterial copyrightMaterial) {
		this.copyrightMaterial = copyrightMaterial;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态协同平台中，附件文件的信息格式
 *
 * @author auto create
 * @since 1.0, 2020-03-27 15:57:12
 */
public class FixFileInfo extends AlipayObject {

	private static final long serialVersionUID = 1888135689496864184L;

	/**
	 * 附件的下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 文件的id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 文件类型。枚举，image:图片;video:视频
	 */
	@ApiField("type")
	private String type;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

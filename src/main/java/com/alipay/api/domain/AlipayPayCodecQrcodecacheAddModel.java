package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码缓存录入缓存信息
 *
 * @author auto create
 * @since 1.0, 2019-12-24 16:56:29
 */
public class AlipayPayCodecQrcodecacheAddModel extends AlipayObject {

	private static final long serialVersionUID = 5445863459928641581L;

	/**
	 * 是否需要gzip压缩
	 */
	@ApiField("compress")
	private Boolean compress;

	/**
	 * bizType_gridId
	 */
	@ApiField("key")
	private String key;

	/**
	 * 缓存时长，单位是秒
	 */
	@ApiField("time")
	private Long time;

	/**
	 * 码地址静态信息分隔符码地址静态信息
	 */
	@ApiField("value")
	private String value;

	public Boolean getCompress() {
		return this.compress;
	}
	public void setCompress(Boolean compress) {
		this.compress = compress;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

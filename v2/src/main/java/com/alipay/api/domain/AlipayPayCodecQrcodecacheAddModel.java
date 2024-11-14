package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扫码缓存录入缓存信息
 *
 * @author auto create
 * @since 1.0, 2020-03-17 14:12:56
 */
public class AlipayPayCodecQrcodecacheAddModel extends AlipayObject {

	private static final long serialVersionUID = 1887756942454926843L;

	/**
	 * 是否需要gzip压缩
	 */
	@ApiField("compress")
	private Boolean compress;

	/**
	 * 批量json的键值对
	 */
	@ApiListField("json")
	@ApiField("string")
	private List<String> json;

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

	public List<String> getJson() {
		return this.json;
	}
	public void setJson(List<String> json) {
		this.json = json;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫app搜索省市回显
 *
 * @author auto create
 * @since 1.0, 2026-03-25 14:37:16
 */
public class AlipayCommerceMedicalSearchCityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7657833678663746231L;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 	
缓存key类型
	 */
	@ApiField("key_type")
	private String keyType;

	/**
	 * 缓存key信息
	 */
	@ApiField("page_key")
	private String pageKey;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getKeyType() {
		return this.keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	public String getPageKey() {
		return this.pageKey;
	}
	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}

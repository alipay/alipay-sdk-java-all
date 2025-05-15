package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除搜索关键词
 *
 * @author auto create
 * @since 1.0, 2023-06-28 15:03:17
 */
public class AlipayOpenSearchAppkeywordDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3881545265488935233L;

	/**
	 * 关键词配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 需要删除的生效关键词
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}

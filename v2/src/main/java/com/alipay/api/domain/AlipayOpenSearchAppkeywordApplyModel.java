package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提报搜索关键词
 *
 * @author auto create
 * @since 1.0, 2023-06-28 16:08:50
 */
public class AlipayOpenSearchAppkeywordApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5444783688977921896L;

	/**
	 * 关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 提报的关键词
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

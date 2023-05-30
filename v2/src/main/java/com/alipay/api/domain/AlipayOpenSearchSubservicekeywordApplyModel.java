package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提报服务关键词
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:03:56
 */
public class AlipayOpenSearchSubservicekeywordApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2393977942696983482L;

	/**
	 * 关键词id，（仅修改时传入，修改时仅能传一个关键词）
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 关键词，提报服务关键词，人工录入
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/**
	 * 子服务code，提报服务关键词，alipay.open.app.service.list.query(服务批量查询)这个接口可以获取
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

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

	public String getSubServiceCode() {
		return this.subServiceCode;
	}
	public void setSubServiceCode(String subServiceCode) {
		this.subServiceCode = subServiceCode;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提报服务关键词
 *
 * @author auto create
 * @since 1.0, 2025-05-23 15:12:27
 */
public class AlipayOpenSearchSubservicekeywordApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3371173926427411271L;

	/**
	 * 关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 服务关键词列表，每批最多传入30个，关键词长度小于12个汉字。 超过数量限制会申请失败，剩余关键词可通过 <a href="https://opendocs.alipay.com/mini/062ndt?pathHash=e3e78b68&ref=api&scene=common">alipay.open.search.appkeywordquota.query</a>查询
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

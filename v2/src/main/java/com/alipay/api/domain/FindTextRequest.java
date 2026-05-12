package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 请求对象
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:46
 */
public class FindTextRequest extends AlipayObject {

	private static final long serialVersionUID = 2567476835895179598L;

	/**
	 * null
	 */
	@ApiListField("key_list")
	@ApiField("string")
	private List<String> keyList;

	/**
	 * 语言代码
	 */
	@ApiField("language")
	private String language;

	public List<String> getKeyList() {
		return this.keyList;
	}
	public void setKeyList(List<String> keyList) {
		this.keyList = keyList;
	}

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}

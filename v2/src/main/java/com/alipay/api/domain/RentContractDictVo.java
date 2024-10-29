package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C租房智能体合同字典
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:40
 */
public class RentContractDictVo extends AlipayObject {

	private static final long serialVersionUID = 2196881335529547734L;

	/**
	 * 字典码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 字典内容
	 */
	@ApiField("dict_content")
	private String dictContent;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDictContent() {
		return this.dictContent;
	}
	public void setDictContent(String dictContent) {
		this.dictContent = dictContent;
	}

}

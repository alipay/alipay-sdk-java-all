package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Header参数列表
 *
 * @author auto create
 * @since 1.0, 2026-09-16 15:06:25
 */
public class HeaderParam extends AlipayObject {

	private static final long serialVersionUID = 5352374564258968756L;

	/**
	 * 参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否开启传输加密：不传=不处理；N=关闭；Y=打开（须配 encrypt_app_id）
	 */
	@ApiField("need_encrypt")
	private String needEncrypt;

	/**
	 * 参数类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 参数值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNeedEncrypt() {
		return this.needEncrypt;
	}
	public void setNeedEncrypt(String needEncrypt) {
		this.needEncrypt = needEncrypt;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

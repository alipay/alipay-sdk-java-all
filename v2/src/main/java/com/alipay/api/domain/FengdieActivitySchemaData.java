package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化凤蝶应用时传入的默认数据
 *
 * @author auto create
 * @since 1.0, 2019-01-02 11:20:19
 */
public class FengdieActivitySchemaData extends AlipayObject {

	private static final long serialVersionUID = 7285636269286956256L;

	/**
	 * 默认数据的内容，内容格式参考模板开发过程中自动生成的mock数据（与schema文件同名的json文件）。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 指定需要初始化的schema区域，与模板中schema文件路径对应
	 */
	@ApiField("name")
	private String name;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

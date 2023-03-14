package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备灰度分组信息
 *
 * @author auto create
 * @since 1.0, 2023-02-14 16:28:15
 */
public class MiniAppGrayGroupDto extends AlipayObject {

	private static final long serialVersionUID = 8414165216229823198L;

	/**
	 * 灰度分组code
	 */
	@ApiField("gray_code")
	private String grayCode;

	/**
	 * 分组名称
	 */
	@ApiField("name")
	private String name;

	public String getGrayCode() {
		return this.grayCode;
	}
	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

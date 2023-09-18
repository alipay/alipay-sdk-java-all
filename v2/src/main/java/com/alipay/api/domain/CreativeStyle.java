package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询出的风格数据列表
 *
 * @author auto create
 * @since 1.0, 2023-09-13 16:15:53
 */
public class CreativeStyle extends AlipayObject {

	private static final long serialVersionUID = 5286396428911541285L;

	/**
	 * 查询出的风格id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 查询出对应图片id的路径
	 */
	@ApiField("mock_img")
	private String mockImg;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMockImg() {
		return this.mockImg;
	}
	public void setMockImg(String mockImg) {
		this.mockImg = mockImg;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 该参数表示灯火开放平台人群包信息，包括人群包ID，名称，覆盖人数和有效期
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:28:14
 */
public class OpenXlightCrowd extends AlipayObject {

	private static final long serialVersionUID = 4615386144653627881L;

	/**
	 * 人群包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 人群包id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 人群包覆盖人群量级
	 */
	@ApiField("user_num")
	private String userNum;

	/**
	 * 该人群包的有效日期，如果该参数为空则表示该人群包无失效时间，永久有效
	 */
	@ApiField("valid_date")
	private String validDate;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getUserNum() {
		return this.userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}

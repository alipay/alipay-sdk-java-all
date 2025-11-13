package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火行为兴趣人群类目
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:29:01
 */
public class OpenXlightCrowdChildLevelThree extends AlipayObject {

	private static final long serialVersionUID = 7826225683676844415L;

	/**
	 * 该参数表示人群类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 行为兴趣人群包类目id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 该参数表示人群类目覆盖人群
	 */
	@ApiField("user_num")
	private String userNum;

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

}

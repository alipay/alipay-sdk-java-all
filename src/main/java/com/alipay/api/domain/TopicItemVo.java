package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 话题VO
 *
 * @author auto create
 * @since 1.0, 2018-12-18 10:49:09
 */
public class TopicItemVo extends AlipayObject {

	private static final long serialVersionUID = 3417431395485869449L;

	/**
	 * 话题描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 话题ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 0 正常状态，可使用; 
-1 下线，不可使用。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 话题标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部引入内容接口
 *
 * @author auto create
 * @since 1.0, 2021-03-11 15:55:20
 */
public class AntfortuneContentCommunityDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 4585562734478774354L;

	/**
	 * 内容流入格式。json格式 sourceId 数据id 、creator 创建者、gmtModified 修改时间、type类型、title标题
gmtCreate创建时间、url地址、operator操作者、duration时长、id 数据id、status 状态
	 */
	@ApiField("content")
	private String content;

	/**
	 * 来源id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 类型
	 */
	@ApiField("soure_type")
	private String soureType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSoureType() {
		return this.soureType;
	}
	public void setSoureType(String soureType) {
		this.soureType = soureType;
	}

}

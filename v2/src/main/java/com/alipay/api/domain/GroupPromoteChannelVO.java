package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群组推广渠道。包含渠道id、渠道名称、渠道描述、渠道参数等推广渠道信息。
 *
 * @author auto create
 * @since 1.0, 2024-09-30 16:40:24
 */
public class GroupPromoteChannelVO extends AlipayObject {

	private static final long serialVersionUID = 7862378624837737934L;

	/**
	 * true表达可以删除，false表达不可以删除，正常是官方定义的渠道不能删除，自定义渠道可以删除
	 */
	@ApiField("delete_tag")
	private Boolean deleteTag;

	/**
	 * 渠道说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 渠道id标识，唯一标识某个渠道
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 渠道参数（英文标识），允许数字字母和下划线
	 */
	@ApiField("key")
	private String key;

	/**
	 * 渠道名称，渠道中文描述
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户加入群聊的地址信息
	 */
	@ApiField("promote_link")
	private String promoteLink;

	public Boolean getDeleteTag() {
		return this.deleteTag;
	}
	public void setDeleteTag(Boolean deleteTag) {
		this.deleteTag = deleteTag;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPromoteLink() {
		return this.promoteLink;
	}
	public void setPromoteLink(String promoteLink) {
		this.promoteLink = promoteLink;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶模板详情模式
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:36
 */
public class FengdieTemplateDetailModel extends AlipayObject {

	private static final long serialVersionUID = 1445947962681565212L;

	/**
	 * 模板 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 模板包开发者，由开发者在package.json中指定
	 */
	@ApiListField("maintainer")
	@ApiField("string")
	private List<String> maintainer;

	/**
	 * 模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模板包拥有者
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 模板包预览图，开发者在模板根目录放置的一张命名为snapshot.png的图片
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 模板包描述，开发者在package.json里指定
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 模板标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 模板版本号
	 */
	@ApiField("ver")
	private String ver;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getMaintainer() {
		return this.maintainer;
	}
	public void setMaintainer(List<String> maintainer) {
		this.maintainer = maintainer;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}

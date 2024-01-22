package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过凤蝶开发者工具开发的模板
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:23
 */
public class FengdieTemplate extends AlipayObject {

	private static final long serialVersionUID = 3162139324417916314L;

	/**
	 * 模板包唯一id，上传模板时自动生成
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
	 * 模板包名称，开发模板时由开发者在package.json里指定
	 */
	@ApiField("name")
	private String name;

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
	 * 模板包中文标题，开发者在fengdie.config.js里指定
	 */
	@ApiField("title")
	private String title;

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

}

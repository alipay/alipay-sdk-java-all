package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 打标结果
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsConcerned extends AlipayObject {

	private static final long serialVersionUID = 6287732389483525275L;

	/**
	 * 是否有打标结果
	 */
	@ApiField("has_id")
	private Boolean hasId;

	/**
	 * 打标的企业crn
	 */
	@ApiField("id")
	private String id;

	/**
	 * 详细标签
	 */
	@ApiListField("label")
	@ApiField("news_concerned_label")
	private List<NewsConcernedLabel> label;

	/**
	 * 打标的企业名称
	 */
	@ApiField("name")
	private String name;

	public Boolean getHasId() {
		return this.hasId;
	}
	public void setHasId(Boolean hasId) {
		this.hasId = hasId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<NewsConcernedLabel> getLabel() {
		return this.label;
	}
	public void setLabel(List<NewsConcernedLabel> label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

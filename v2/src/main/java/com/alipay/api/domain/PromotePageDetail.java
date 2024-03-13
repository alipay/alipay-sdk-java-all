package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自建推广页信息详情列表
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:58:49
 */
public class PromotePageDetail extends AlipayObject {

	private static final long serialVersionUID = 5468692143339421137L;

	/**
	 * 推广页创建时间，格式：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 推广页id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 推广页名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 推广留资schema
	 */
	@ApiListField("property_list")
	@ApiField("promote_page_property")
	private List<PromotePageProperty> propertyList;

	/**
	 * 推广页类型：COLLECT_INFO -  普通留资；TRADE - 交易留资
	 */
	@ApiField("type")
	private String type;

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<PromotePageProperty> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<PromotePageProperty> propertyList) {
		this.propertyList = propertyList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

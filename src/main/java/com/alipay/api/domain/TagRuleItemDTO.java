package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签取值规则DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-20 16:41:54
 */
public class TagRuleItemDTO extends AlipayObject {

	private static final long serialVersionUID = 5561455424132689388L;

	/**
	 * 字段类型+不唯一
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 标签取值+不唯一
	 */
	@ApiListField("datas")
	@ApiField("tag_dist_d_t_o")
	private List<TagDistDTO> datas;

	/**
	 * 场景code+唯一
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 展示方式+不唯一
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 存储类型+不唯一
	 */
	@ApiField("store_type")
	private String storeType;

	/**
	 * 标签code+唯一
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签名称+不唯一
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 标签类型+不唯一
	 */
	@ApiField("tag_type")
	private String tagType;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<TagDistDTO> getDatas() {
		return this.datas;
	}
	public void setDatas(List<TagDistDTO> datas) {
		this.datas = datas;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getStoreType() {
		return this.storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

}

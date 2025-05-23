package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材库查询
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:34:22
 */
public class AlipayDataDataserviceAdMateriallibraryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7375954561271529648L;

	/**
	 * 分页参数
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 素材高度，单位px
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 素材类型，1图片2视频
	 */
	@ApiField("material_type")
	private Long materialType;

	/**
	 * 素材名称，用于模糊搜索
	 */
	@ApiField("name")
	private String name;

	/**
	 * 第几页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 素材库id值
	 */
	@ApiField("user_material_lib_id")
	private String userMaterialLibId;

	/**
	 * 素材宽
	 */
	@ApiField("width")
	private Long width;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getUserMaterialLibId() {
		return this.userMaterialLibId;
	}
	public void setUserMaterialLibId(String userMaterialLibId) {
		this.userMaterialLibId = userMaterialLibId;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}

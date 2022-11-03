package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目模型
 *
 * @author auto create
 * @since 1.0, 2020-11-03 15:23:28
 */
public class MiniAppCategory extends AlipayObject {

	private static final long serialVersionUID = 8866989774496333849L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 是否有子类目
	 */
	@ApiField("has_child")
	private Boolean hasChild;

	/**
	 * 是否需要营业执照
	 */
	@ApiField("need_license")
	private Boolean needLicense;

	/**
	 * 是否需要门头照
	 */
	@ApiField("need_out_door_pic")
	private Boolean needOutDoorPic;

	/**
	 * 是否需要特许营业执照
	 */
	@ApiField("need_special_license")
	private Boolean needSpecialLicense;

	/**
	 * 父类目id
	 */
	@ApiField("parent_category_id")
	private String parentCategoryId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Boolean getHasChild() {
		return this.hasChild;
	}
	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}

	public Boolean getNeedLicense() {
		return this.needLicense;
	}
	public void setNeedLicense(Boolean needLicense) {
		this.needLicense = needLicense;
	}

	public Boolean getNeedOutDoorPic() {
		return this.needOutDoorPic;
	}
	public void setNeedOutDoorPic(Boolean needOutDoorPic) {
		this.needOutDoorPic = needOutDoorPic;
	}

	public Boolean getNeedSpecialLicense() {
		return this.needSpecialLicense;
	}
	public void setNeedSpecialLicense(Boolean needSpecialLicense) {
		this.needSpecialLicense = needSpecialLicense;
	}

	public String getParentCategoryId() {
		return this.parentCategoryId;
	}
	public void setParentCategoryId(String parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

}

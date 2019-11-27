package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员等级
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:16:06
 */
public class MemberLevelModel extends AlipayObject {

	private static final long serialVersionUID = 8296764754621741158L;

	/**
	 * 模板会员下的等级编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("icon_img")
	private String iconImg;

	/**
	 * 必须从0开始有序
会员模板下的等级，比如会员模板下有普通会员，中级会员，高级会员三种等级，则分别对应0，1，2
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 会员模板下会员等级的展示名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 栏位信息
	 */
	@ApiListField("view_column_infos")
	@ApiField("view_column_info_model")
	private List<ViewColumnInfoModel> viewColumnInfos;

	/**
	 * 模板样式信息
	 */
	@ApiField("view_style_info")
	private ViewStyleInfoModel viewStyleInfo;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getIconImg() {
		return this.iconImg;
	}
	public void setIconImg(String iconImg) {
		this.iconImg = iconImg;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ViewColumnInfoModel> getViewColumnInfos() {
		return this.viewColumnInfos;
	}
	public void setViewColumnInfos(List<ViewColumnInfoModel> viewColumnInfos) {
		this.viewColumnInfos = viewColumnInfos;
	}

	public ViewStyleInfoModel getViewStyleInfo() {
		return this.viewStyleInfo;
	}
	public void setViewStyleInfo(ViewStyleInfoModel viewStyleInfo) {
		this.viewStyleInfo = viewStyleInfo;
	}

}

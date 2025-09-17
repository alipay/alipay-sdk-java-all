package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁森林公益林实体信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 15:27:14
 */
public class WelfareForestEntityDTO extends AlipayObject {

	private static final long serialVersionUID = 3525478935645159348L;

	/**
	 * 公益林描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 前端展示信息
	 */
	@ApiField("display_info")
	private String displayInfo;

	/**
	 * 公益林的icon信息，传递支付宝端使用的icon格式
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 单个公益林id。调浇水接口需要传过来
	 */
	@ApiField("id")
	private String id;

	/**
	 * 公益林名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 固定浇水66g，可为空，为空时表明改公益林浇水时需要上游传递浇水值
	 */
	@ApiField("solid_water_value")
	private String solidWaterValue;

	/**
	 * 公益林状态，未开始和已结束表明该公益林无法进行浇水行为
	 */
	@ApiField("status")
	private String status;

	/**
	 * 公益林标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用于表示该公益林会种植哪些树种
	 */
	@ApiField("tree_name")
	private String treeName;

	/**
	 * 公益林的类型信息，包含企业，综艺等类型
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSolidWaterValue() {
		return this.solidWaterValue;
	}
	public void setSolidWaterValue(String solidWaterValue) {
		this.solidWaterValue = solidWaterValue;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTreeName() {
		return this.treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

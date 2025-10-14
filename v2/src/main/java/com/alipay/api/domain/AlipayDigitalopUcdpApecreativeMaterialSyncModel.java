package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步素材信息接口
 *
 * @author auto create
 * @since 1.0, 2023-09-14 18:04:10
 */
public class AlipayDigitalopUcdpApecreativeMaterialSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5356215519789945838L;

	/**
	 * 创建类型，1为只要根据风格合图，2为根据风格和布局合图
	 */
	@ApiField("create_type")
	private Long createType;

	/**
	 * 创意组id,如果不填，重新创建一个创意组，如果填了 在原有的创意组中更新信息
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 创意组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 商品的素材信息
	 */
	@ApiListField("item_material_list")
	@ApiField("ape_item_material")
	private List<ApeItemMaterial> itemMaterialList;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	public Long getCreateType() {
		return this.createType;
	}
	public void setCreateType(Long createType) {
		this.createType = createType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<ApeItemMaterial> getItemMaterialList() {
		return this.itemMaterialList;
	}
	public void setItemMaterialList(List<ApeItemMaterial> itemMaterialList) {
		this.itemMaterialList = itemMaterialList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}

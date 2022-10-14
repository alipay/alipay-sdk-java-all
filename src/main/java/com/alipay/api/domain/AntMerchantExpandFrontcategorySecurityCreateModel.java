package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 前台类目创建
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:34:30
 */
public class AntMerchantExpandFrontcategorySecurityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1341597265742762644L;

	/**
	 * 前台类目描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 素材列表（最多3个）
	 */
	@ApiListField("material_list")
	@ApiField("material_create_info")
	private List<MaterialCreateInfo> materialList;

	/**
	 * 前台类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 场景码（具体值请参见产品文档）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 前台类目归属主体ID
例：前台类目归属主体类型为店铺，则前台类目归属主体ID为店铺ID；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 前台类目归属主体类型:
5（店铺）
	 */
	@ApiField("target_type")
	private String targetType;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<MaterialCreateInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialCreateInfo> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}

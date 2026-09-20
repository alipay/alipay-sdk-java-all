package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风控佐证材料
 *
 * @author auto create
 * @since 1.0, 2026-09-15 20:08:29
 */
public class CorroborationMaterials extends AlipayObject {

	private static final long serialVersionUID = 7628637355629377892L;

	/**
	 * 佐证材料文件列表
	 */
	@ApiListField("material_file_list")
	@ApiField("string")
	private List<String> materialFileList;

	/**
	 * 当前材料的类型
	 */
	@ApiField("material_type")
	private String materialType;

	public List<String> getMaterialFileList() {
		return this.materialFileList;
	}
	public void setMaterialFileList(List<String> materialFileList) {
		this.materialFileList = materialFileList;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

}

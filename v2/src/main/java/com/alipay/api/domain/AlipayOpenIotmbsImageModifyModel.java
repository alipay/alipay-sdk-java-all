package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iotmbs图片使用场景修改
 *
 * @author auto create
 * @since 1.0, 2023-05-23 10:11:22
 */
public class AlipayOpenIotmbsImageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6645956219642456119L;

	/**
	 * 配置的图片id列表
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * 图片配置类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 关联的项目id
	 */
	@ApiField("project_id")
	private String projectId;

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}

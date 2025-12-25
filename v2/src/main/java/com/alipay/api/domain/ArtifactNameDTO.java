package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 制品名称信息
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:26:57
 */
public class ArtifactNameDTO extends AlipayObject {

	private static final long serialVersionUID = 3131685522154442797L;

	/**
	 * 其他（用户自己输入的）
	 */
	@ApiListField("other")
	@ApiField("delivery_project_artifact_d_t_o")
	private List<DeliveryProjectArtifactDTO> other;

	/**
	 * 标准制品
	 */
	@ApiListField("standard")
	@ApiField("delivery_project_artifact_d_t_o")
	private List<DeliveryProjectArtifactDTO> standard;

	public List<DeliveryProjectArtifactDTO> getOther() {
		return this.other;
	}
	public void setOther(List<DeliveryProjectArtifactDTO> other) {
		this.other = other;
	}

	public List<DeliveryProjectArtifactDTO> getStandard() {
		return this.standard;
	}
	public void setStandard(List<DeliveryProjectArtifactDTO> standard) {
		this.standard = standard;
	}

}

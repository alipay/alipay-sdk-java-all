package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步ob制品数据
 *
 * @author auto create
 * @since 1.0, 2023-12-27 19:27:21
 */
public class AnttechOceanbaseObglobalObartifactSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5191787774839732256L;

	/**
	 * ob制品数据
	 */
	@ApiListField("ob_artifacts")
	@ApiField("ob_artifact_sync_d_t_o")
	private List<ObArtifactSyncDTO> obArtifacts;

	public List<ObArtifactSyncDTO> getObArtifacts() {
		return this.obArtifacts;
	}
	public void setObArtifacts(List<ObArtifactSyncDTO> obArtifacts) {
		this.obArtifacts = obArtifacts;
	}

}

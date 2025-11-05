package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步ob制品数据
 *
 * @author auto create
 * @since 1.0, 2025-06-19 15:34:52
 */
public class AnttechOceanbaseObglobalObartifactSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2243916112756857647L;

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

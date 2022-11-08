package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 算法档案检测
 *
 * @author auto create
 * @since 1.0, 2022-03-28 10:21:32
 */
public class AlipayFincoreComplianceApccenterAlgorithmarchiveDetectModel extends AlipayObject {

	private static final long serialVersionUID = 4582976586863351522L;

	/**
	 * 平台算法唯一编码
	 */
	@ApiField("platform_algorithm_code")
	private String platformAlgorithmCode;

	/**
	 * 平台算法最新迭代唯一编码
	 */
	@ApiField("platform_algorithm_last_iteration_code")
	private String platformAlgorithmLastIterationCode;

	/**
	 * 平台算法来源
	 */
	@ApiField("platform_algorithm_source")
	private String platformAlgorithmSource;

	public String getPlatformAlgorithmCode() {
		return this.platformAlgorithmCode;
	}
	public void setPlatformAlgorithmCode(String platformAlgorithmCode) {
		this.platformAlgorithmCode = platformAlgorithmCode;
	}

	public String getPlatformAlgorithmLastIterationCode() {
		return this.platformAlgorithmLastIterationCode;
	}
	public void setPlatformAlgorithmLastIterationCode(String platformAlgorithmLastIterationCode) {
		this.platformAlgorithmLastIterationCode = platformAlgorithmLastIterationCode;
	}

	public String getPlatformAlgorithmSource() {
		return this.platformAlgorithmSource;
	}
	public void setPlatformAlgorithmSource(String platformAlgorithmSource) {
		this.platformAlgorithmSource = platformAlgorithmSource;
	}

}

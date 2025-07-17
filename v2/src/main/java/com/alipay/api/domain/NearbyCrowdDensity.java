package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附近人流密度
 *
 * @author auto create
 * @since 1.0, 2021-02-26 14:09:33
 */
public class NearbyCrowdDensity extends AlipayObject {

	private static final long serialVersionUID = 4175759792484473154L;

	/**
	 * 人群密度，示例值：高、中、低
	 */
	@ApiField("crowd_density")
	private String crowdDensity;

	/**
	 * 网格计算模型
	 */
	@ApiField("geohash")
	private String geohash;

	public String getCrowdDensity() {
		return this.crowdDensity;
	}
	public void setCrowdDensity(String crowdDensity) {
		this.crowdDensity = crowdDensity;
	}

	public String getGeohash() {
		return this.geohash;
	}
	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

}

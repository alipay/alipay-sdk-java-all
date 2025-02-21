package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单元流量分配
 *
 * @author auto create
 * @since 1.0, 2024-09-14 17:37:37
 */
public class UnitTraffic extends AlipayObject {

	private static final long serialVersionUID = 4216621186963127941L;

	/**
	 * 灰度人群id，对应人群平台的id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 人群配比，单位是比例，比如1表示1%
	 */
	@ApiField("crowd_percent")
	private Long crowdPercent;

	/**
	 * 分表位起始，0-99表示 最小分表位为0，最大分表位是99，包含了100个分表位都在该分组
	 */
	@ApiField("id_range")
	private String idRange;

	/**
	 * 单元化标志，是单元的意思，不是单位
由三部分组成，dc1表示机房1，g1表示灰度，trade表示系统
	 */
	@ApiField("unit_key")
	private String unitKey;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public Long getCrowdPercent() {
		return this.crowdPercent;
	}
	public void setCrowdPercent(Long crowdPercent) {
		this.crowdPercent = crowdPercent;
	}

	public String getIdRange() {
		return this.idRange;
	}
	public void setIdRange(String idRange) {
		this.idRange = idRange;
	}

	public String getUnitKey() {
		return this.unitKey;
	}
	public void setUnitKey(String unitKey) {
		this.unitKey = unitKey;
	}

}

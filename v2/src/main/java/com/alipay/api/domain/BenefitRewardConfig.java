package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品配置
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRewardConfig extends AlipayObject {

	private static final long serialVersionUID = 3638116696579685515L;

	/**
	 * 权益展示信息
	 */
	@ApiField("display_info")
	private BenefitDisplayInfoResponse displayInfo;

	/**
	 * 编号
	 */
	@ApiField("id")
	private String id;

	/**
	 * 来源编号
	 */
	@ApiField("source_id")
	private String sourceId;

	public BenefitDisplayInfoResponse getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(BenefitDisplayInfoResponse displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}

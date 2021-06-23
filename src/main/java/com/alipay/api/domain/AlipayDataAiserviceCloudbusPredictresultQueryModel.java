package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交路线预测进度查询1
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:37:56
 */
public class AlipayDataAiserviceCloudbusPredictresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7838615838391751625L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 预测结果对最小影响客流数的过滤
	 */
	@ApiField("min_volume")
	private Long minVolume;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 线路结果类型： 枚举值    0： 单向线路，  1： 双向线路。
	 */
	@ApiField("type")
	private String type;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Long getMinVolume() {
		return this.minVolume;
	}
	public void setMinVolume(Long minVolume) {
		this.minVolume = minVolume;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管专户配置变更
 *
 * @author auto create
 * @since 1.0, 2019-07-31 15:42:11
 */
public class AlipayCommerceEducateSuperviseaccountConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8862348897282826129L;

	/**
	 * 配置类型，如WITHDRAWAL（大额提现通知）、MARGIN（最低保证金）
	 */
	@ApiField("config_type")
	private String configType;

	/**
	 * 扩展参数，config_type为：WITHDRAWAL，ext_param需包含：withdrawal_sum_threshold（大额提现汇总阀值，不修改不需要传，大于0才会更新，单位：分）、withdrawal_single_threshold（大额提现单笔阀值，不修改不需要传，大于0才会更新，单位：分）；config_type为：MARGIN，ext_param需包含：margin_threshold（保证金阀值，单位：分）
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getConfigType() {
		return this.configType;
	}
	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

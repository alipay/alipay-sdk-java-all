package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康险赠险险种是否已开通查询结果
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthGiftBatchAlreadyOpenedResult extends AlipayObject {

	private static final long serialVersionUID = 5546464947352232214L;

	/**
	 * 是否已开通。true为开通，false为未开通
	 */
	@ApiField("already_opened")
	private Boolean alreadyOpened;

	/**
	 * 业务类型。免费医疗金 HEALTH_BEAN_SIMPLE_UPGRADE、守护金 HEALTH_GUARDIAN_GOLD、多收多宝新门诊 HEALTH_DSDB_NEW_OUTPATIENT
	 */
	@ApiField("biz_type")
	private String bizType;

	public Boolean getAlreadyOpened() {
		return this.alreadyOpened;
	}
	public void setAlreadyOpened(Boolean alreadyOpened) {
		this.alreadyOpened = alreadyOpened;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}

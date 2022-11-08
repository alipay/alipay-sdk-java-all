package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 爱心捐赠代扣协议查询
 *
 * @author auto create
 * @since 1.0, 2022-06-30 20:02:29
 */
public class AlipayUserCharityAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5472435279595459515L;

	/**
	 * 业务场景，由爱心捐赠系统配置及分配
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 产品码，由爱心捐赠系统配置及分配
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 需要签约协议的用户PID
	 */
	@ApiField("withhold_pid")
	private String withholdPid;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getWithholdPid() {
		return this.withholdPid;
	}
	public void setWithholdPid(String withholdPid) {
		this.withholdPid = withholdPid;
	}

}

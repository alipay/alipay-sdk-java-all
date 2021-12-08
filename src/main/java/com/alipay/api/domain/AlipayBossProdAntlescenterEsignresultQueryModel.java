package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询蚂蚁法务中台电子用印结果信息
 *
 * @author auto create
 * @since 1.0, 2021-11-18 14:05:15
 */
public class AlipayBossProdAntlescenterEsignresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7271717135769329553L;

	/**
	 * 系统来源名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 唯一业务标识号
	 */
	@ApiField("business_unique_id")
	private String businessUniqueId;

	/**
	 * 发起电子签署成功后返回的流水号id
	 */
	@ApiField("seal_request_id")
	private String sealRequestId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBusinessUniqueId() {
		return this.businessUniqueId;
	}
	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}

	public String getSealRequestId() {
		return this.sealRequestId;
	}
	public void setSealRequestId(String sealRequestId) {
		this.sealRequestId = sealRequestId;
	}

}

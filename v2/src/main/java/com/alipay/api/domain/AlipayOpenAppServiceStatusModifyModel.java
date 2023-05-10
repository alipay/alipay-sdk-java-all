package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务状态更新
 *
 * @author auto create
 * @since 1.0, 2019-11-18 10:18:12
 */
public class AlipayOpenAppServiceStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5186568367165696498L;

	/**
	 * 目标动作 VALID：生效服务，INVALID：失效服务
	 */
	@ApiField("action")
	private String action;

	/**
	 * 业务来源视角的的服务唯一ID，比如口碑、饿了么的店铺ID或者淘票票的影片ID等
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 数据变更时间戳
	 */
	@ApiField("data_timestamp")
	private String dataTimestamp;

	/**
	 * 服务的业务规格（来源），比如：KOUEI_SERVICE-口碑服务；TPP_SERVICE-淘票票服务
	 */
	@ApiField("service_spec_code")
	private String serviceSpecCode;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDataTimestamp() {
		return this.dataTimestamp;
	}
	public void setDataTimestamp(String dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
	}

	public String getServiceSpecCode() {
		return this.serviceSpecCode;
	}
	public void setServiceSpecCode(String serviceSpecCode) {
		this.serviceSpecCode = serviceSpecCode;
	}

}

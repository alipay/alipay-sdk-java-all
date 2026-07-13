package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖查询接口
 *
 * @author auto create
 * @since 1.0, 2026-02-04 10:46:40
 */
public class AnttechMorseMarketingEquityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8637273516854988299L;

	/**
	 * 外部业务号，业务的标识由商户生成，可以设置成订单号,要保证幂等和唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商务项目ID，由摩斯配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 摩斯营销发奖类型
	 */
	@ApiField("send_type")
	private String sendType;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSendType() {
		return this.sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工打卡投保申请
 *
 * @author auto create
 * @since 1.0, 2023-11-24 13:47:06
 */
public class AlipayFundFlexiblestaffingInsureApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6425755675593765481L;

	/**
	 * 场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 保险渠道固定值
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 灵工保领域事件
	 */
	@ApiField("domain_event")
	private EmployeeInsureDomainEvent domainEvent;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 投保场景，打卡模式固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public EmployeeInsureDomainEvent getDomainEvent() {
		return this.domainEvent;
	}
	public void setDomainEvent(EmployeeInsureDomainEvent domainEvent) {
		this.domainEvent = domainEvent;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}

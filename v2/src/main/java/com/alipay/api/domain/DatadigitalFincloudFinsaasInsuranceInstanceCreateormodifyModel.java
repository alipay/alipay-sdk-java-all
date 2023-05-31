package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 双百平台实例状态配置
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:53:10
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 7158353941165536411L;

	/**
	 * 指令来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 服务指令，包括停服、恢复、释放等指令，每个渠道的指令标记不一样
	 */
	@ApiField("command")
	private String command;

	/**
	 * 开通产品的外部产品码
	 */
	@ApiField("outer_goods_id")
	private String outerGoodsId;

	/**
	 * 外部系统的实例id
	 */
	@ApiField("outer_instance_id")
	private String outerInstanceId;

	/**
	 * 外部系统租户信息
	 */
	@ApiField("outer_tenant")
	private String outerTenant;

	/**
	 * 外部系统的租户id
	 */
	@ApiField("outer_tenant_id")
	private String outerTenantId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public String getOuterGoodsId() {
		return this.outerGoodsId;
	}
	public void setOuterGoodsId(String outerGoodsId) {
		this.outerGoodsId = outerGoodsId;
	}

	public String getOuterInstanceId() {
		return this.outerInstanceId;
	}
	public void setOuterInstanceId(String outerInstanceId) {
		this.outerInstanceId = outerInstanceId;
	}

	public String getOuterTenant() {
		return this.outerTenant;
	}
	public void setOuterTenant(String outerTenant) {
		this.outerTenant = outerTenant;
	}

	public String getOuterTenantId() {
		return this.outerTenantId;
	}
	public void setOuterTenantId(String outerTenantId) {
		this.outerTenantId = outerTenantId;
	}

}

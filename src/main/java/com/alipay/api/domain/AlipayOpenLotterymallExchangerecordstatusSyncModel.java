package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖积分兑换商城兑换记录状态更新
 *
 * @author auto create
 * @since 1.0, 2020-01-15 09:35:26
 */
public class AlipayOpenLotterymallExchangerecordstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3487196376236766853L;

	/**
	 * 环境信息，PRE预发环境，PROD线上
	 */
	@ApiField("env")
	private String env;

	/**
	 * json格式的数据
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * 积分兑换商城的兑换记录id
	 */
	@ApiField("mallexchangerecordid")
	private String mallexchangerecordid;

	/**
	 * 该笔订单之前的状态
	 */
	@ApiField("now")
	private String now;

	/**
	 * 调用方自己创建的订单id，为抽奖调用业务方下单时业务方生成的业务id
	 */
	@ApiField("outbizid")
	private String outbizid;

	/**
	 * 兑换记录目标状态
	 */
	@ApiField("target")
	private String target;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getExtinfo() {
		return this.extinfo;
	}
	public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}

	public String getMallexchangerecordid() {
		return this.mallexchangerecordid;
	}
	public void setMallexchangerecordid(String mallexchangerecordid) {
		this.mallexchangerecordid = mallexchangerecordid;
	}

	public String getNow() {
		return this.now;
	}
	public void setNow(String now) {
		this.now = now;
	}

	public String getOutbizid() {
		return this.outbizid;
	}
	public void setOutbizid(String outbizid) {
		this.outbizid = outbizid;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

}

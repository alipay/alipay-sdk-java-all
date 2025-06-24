package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益发放接口
 *
 * @author auto create
 * @since 1.0, 2021-06-22 20:47:57
 */
public class AlipayInsSceneCouponSendModel extends AlipayObject {

	private static final long serialVersionUID = 4534578868817313378L;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 活动维度id;
商户PID值
	 */
	@ApiField("dimension_id")
	private String dimensionId;

	/**
	 * 活动维度;
GOODS:淘宝商品,ANT_PID:蚂蚁商户PID
	 */
	@ApiField("dimension_type")
	private String dimensionType;

	/**
	 * 市场类型;
TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

	public String getChannelUserId() {
		return this.channelUserId;
	}
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	public String getDimensionId() {
		return this.dimensionId;
	}
	public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}

	public String getDimensionType() {
		return this.dimensionType;
	}
	public void setDimensionType(String dimensionType) {
		this.dimensionType = dimensionType;
	}

	public String getMarketType() {
		return this.marketType;
	}
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getServiceScenario() {
		return this.serviceScenario;
	}
	public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}

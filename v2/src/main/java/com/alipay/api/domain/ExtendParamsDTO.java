package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-03-27 16:44:07
 */
public class ExtendParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 5177143554752957871L;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 使用花呗分期要进行的分期数
	 */
	@ApiField("hb_fq_num")
	private String hbFqNum;

	/**
	 * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
	 */
	@ApiField("hb_fq_seller_percent")
	private String hbFqSellerPercent;

	/**
	 * 行业数据回流信息, 详见：地铁支付接口参数补充说明
	 */
	@ApiField("industry_reflux_info")
	private String industryRefluxInfo;

	/**
	 * 特殊场景下，允许商户指定交易展示的卖家名称
	 */
	@ApiField("specified_seller_name")
	private String specifiedSellerName;

	/**
	 * 系统商编号 该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getHbFqNum() {
		return this.hbFqNum;
	}
	public void setHbFqNum(String hbFqNum) {
		this.hbFqNum = hbFqNum;
	}

	public String getHbFqSellerPercent() {
		return this.hbFqSellerPercent;
	}
	public void setHbFqSellerPercent(String hbFqSellerPercent) {
		this.hbFqSellerPercent = hbFqSellerPercent;
	}

	public String getIndustryRefluxInfo() {
		return this.industryRefluxInfo;
	}
	public void setIndustryRefluxInfo(String industryRefluxInfo) {
		this.industryRefluxInfo = industryRefluxInfo;
	}

	public String getSpecifiedSellerName() {
		return this.specifiedSellerName;
	}
	public void setSpecifiedSellerName(String specifiedSellerName) {
		this.specifiedSellerName = specifiedSellerName;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}

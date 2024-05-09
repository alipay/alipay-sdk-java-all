package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子借条合同详细信息
 *
 * @author auto create
 * @since 1.0, 2024-04-08 13:42:49
 */
public class EcoContractDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5125965283578865772L;

	/**
	 * 该电子借条是否使用了免费的份额，true代表该份使用了免费份额，false代表未使用免费份额
	 */
	@ApiField("is_free_portion")
	private Boolean isFreePortion;

	/**
	 * 跳转三方小程序详情页链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 电子借条详细信息扩展字段
	 */
	@ApiField("loan_info")
	private EcoDetailLoanInfo loanInfo;

	/**
	 * 阵地来源，ALIPAY代表来自于支付宝阵地
	 */
	@ApiField("source")
	private String source;

	public Boolean getIsFreePortion() {
		return this.isFreePortion;
	}
	public void setIsFreePortion(Boolean isFreePortion) {
		this.isFreePortion = isFreePortion;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public EcoDetailLoanInfo getLoanInfo() {
		return this.loanInfo;
	}
	public void setLoanInfo(EcoDetailLoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}

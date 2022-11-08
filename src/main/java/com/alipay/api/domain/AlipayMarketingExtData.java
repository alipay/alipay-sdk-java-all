package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码扩展模型
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingExtData extends AlipayObject {

	private static final long serialVersionUID = 5156847861911397915L;

	/**
	 * 复杂模型
	 */
	@ApiField("lbs_info")
	private AlipayMarketingIbsInfo lbsInfo;

	/**
	 * 外部uid
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public AlipayMarketingIbsInfo getLbsInfo() {
		return this.lbsInfo;
	}
	public void setLbsInfo(AlipayMarketingIbsInfo lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
